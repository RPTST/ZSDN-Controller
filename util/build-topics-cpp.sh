echo "### Building C++ Topics ###"

ZDIR=$(<zsdn-dir.txt)

SRC_DIR="${ZDIR}/modules"
OUT_DIR="${ZDIR}/common/cpp/zsdn-commons/zsdn/topics"

echo "Topics Source Dir: ${SRC_DIR}"
echo "Topics Out Dir: ${OUT_DIR}"

java -jar ./hierarchy-builder/hierarchy-builder/target/hierarchy-builder-0.0.1-SNAPSHOT-jar-with-dependencies.jar --source ${SRC_DIR} -r --out ${OUT_DIR} --language cpp -c "zsdn::modules"

echo "### Finished Building C++ Topics ###"