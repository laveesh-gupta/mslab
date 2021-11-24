var express = require('express');
var app = express();

app.get('/index.html', function (req, res) {
    res.sendFile( __dirname + "/" + "index.html" );
})

app.get('/process_get', function (req, res) {
    var fullname=req.query.first_name + req.query.last_name;
    res.send(fullname);
})

var server = app.listen(8080, function () {
console.log("Example app listening at 8080")
})
