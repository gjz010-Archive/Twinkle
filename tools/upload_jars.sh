UPLOAD_TIME=`date +%Y%m%d-%H%M%S`
./dropbox_uploader.sh mkdir $UPLOAD_TIME
./dropbox_uploader.sh upload ../api/target/TwinkleAPI-1.0-SNAPSHOT.jar $UPLOAD_TIME/TwinkleAPI-1.0-SNAPSHOT.jar
./dropbox_uploader.sh upload ../se/target/TwinkleSE-1.0-SNAPSHOT.jar $UPLOAD_TIME/TwinkleSE-1.0-SNAPSHOT.jar
./dropbox_uploader.sh upload ../ce/target/TwinkleCE-1.0-SNAPSHOT.jar $UPLOAD_TIME/TwinkleCE-1.0-SNAPSHOT.jar
echo "Upload Done. $UPLOAD_TIME"
