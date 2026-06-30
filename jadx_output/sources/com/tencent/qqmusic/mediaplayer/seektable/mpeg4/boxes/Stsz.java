package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public class Stsz extends com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox {
    int[] entrySize;
    int sampleCount;
    int sampleSize;

    public int[] getEntrySize() {
        return this.entrySize;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public int getSampleSize() {
        return this.sampleSize;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box) {
        super.parse(parsable, box);
        this.sampleSize = parsable.readInt();
        int readInt = parsable.readInt();
        this.sampleCount = readInt;
        if (this.sampleSize == 0) {
            this.entrySize = parsable.readIntArray(readInt);
        }
        if (this.sampleSize == 0 && this.sampleCount == 0) {
            throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("invalide stsz: both [sample_count] and [sample_size] is 0!");
        }
    }
}
