var picArray = ["Photos/Dog.jpg", "Photos/Home.jpg", "Photos/Shelookedolder.jpg", "Photos/View.jpg"];
var picCount = 0;

function nextPic() {
  picCount = (picCount + 1 < picArray.length)? picCount + 1 : 0;
  var build = '<img src="' + picArray[picCount] + '" width="100%" height="100%">';
  document.getElementById("wallpaper").innerHTML = build;
  setTimeout(nextPic, 5000); 
}

window.onload = function() {
  nextPic();
}