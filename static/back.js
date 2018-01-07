
var socket = new WebSocket('ws://' + window.location.host + '/my-websocket-endpoint');
 
// Add an event listener for when a connection is open
socket.onopen = function() {
  console.log('WebSocket connection opened. Ready to send messages.');
  // Send a message to the server
  socket.send('Hello, from WebSocket client!');
 
};
 
// Add an event listener for when a message is received from the server



socket.addEventListener("message", function(event) {
//	  var msg = JSON.parse(event.data);
	  console.log('Message received from server: ' + event.data);
	  // 处理数据
	});

console.log($);
$("#connectd").on("click", function(){
	console.log("hello");
	socket.send(JSON.stringify({"hello":"hello"}));
});

