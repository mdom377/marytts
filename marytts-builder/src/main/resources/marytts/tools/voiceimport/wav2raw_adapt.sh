for f in `find $1/ -name *.wav | sed "s|$1/||g"`; do
	dir=$(dirname $f)
	filename=$(basename "$f")
	echo $filename
	mkdir -p $2/$dir
	sox $1/$f $2/$dir/${filename%.*}.raw
done


