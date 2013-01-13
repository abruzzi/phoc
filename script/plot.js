importPackage(Packages.javax.swing)
importPackage(java.awt)
importClass(org.math.array.DoubleArray)
importClass(org.math.plot.Plot2DPanel)
importClass(org.math.plot.Plot3DPanel)

/**
 * i.e.
 * plot(function(x){return Math.sin(x);}, {
 *     start : -3.0,
 *     step : 0.1,
 *     stop : 3.0
 * });
 */
function plot2d(func, range){
    var x = DoubleArray.increment(range.start, range.step, range.stop);
    var y = new Array(x.length);

    for(var i = 0, len = x.length; i < len; i++){
        y[i] = func(x[i]);
    }

    var plot = new Plot2DPanel();
    plot.addLegend("SOUTH");

    var name = func.toString();
    plot.addLinePlot(name, Color.GREEN, x, y);

    var frame = new JFrame("plot function : "+name);
    frame.setSize(600, 600);
    frame.setContentPane(plot);
    frame.setVisible(true);
}

function increment(start, step, stop){
    var x = [];
    for(start; start+step < stop; start += step){
        x.push(start);
    }
}

function plot3d(func, xrange, yrange){
    var x = DoubleArray.increment(xrange.start, xrange.step, xrange.stop);
    var y = DoubleArray.increment(yrange.start, yrange.step, yrange.stop);
    
    var name = func.toString();
    
    var z = (function(x, y){
        //matrix : y X x
        var r = [];
        for(var i = 0, len = x.length; i < len; i++){
            r[i] = [];
            for(var j = 0, len2 = y.length; j < len2; j++){
                r[i].push(func(x[i], y[j]));
            }
        }
        return r;
    })(x, y);

    var plot = new Plot3DPanel("SOUTH");

    plot.addGridPlot(name, x, y, z);

    var frame = new JFrame("plot function : "+name);
    frame.setSize(600, 600);
    frame.setContentPane(plot);
    frame.setVisible(true);
}

//z=cos(PI*x)*sin(PI*y)
function cs(x, y){
    return cos(PI*x) * sin(PI*y);
}

//plot3d(cs, {start:0.0, step:0.1, stop:1.0}, {start:0.0, step:0.05, stop:1.0});

/*
function increment(start, step, stop){
    var x = [];
    for(start; start+step < stop; start += step){
        x.push(start);
    }
    return x;
}

function cs(x, y){
    return cos(PI*x) * sin(PI*y);
}

function _plot3d_(func, xrange, yrange){
    var x = increment(xrange.start, xrange.step, xrange.stop);
    var y = increment(yrange.start, yrange.step, yrange.stop);

    var z = (function(x, y){
        var r = new Array(y.length);
        for(var i = 0, len = x.length; i < len; i++){
            r[i] = new Array(x.length);
            for(var j = 0, len2 = y.length; j < len2; j++){
                r[j][i] = func(x[i], y[j]);
            }
        }
        return r;
    })(x, y);

    print(x);
    print(y);
    print(z);
}

_plot3d_(cs, {start:0.0, step:0.1, stop:1.0}, {start:0.0, step:0.05, stop:1.0});
*/