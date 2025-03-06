def call(String url, String branch){
  echo 'This is cloning code'
  git url: "https://github.com/LondheShubham153/django-notes-app.git", branch:"main"
  echo "Code Cloning successfully"
}

