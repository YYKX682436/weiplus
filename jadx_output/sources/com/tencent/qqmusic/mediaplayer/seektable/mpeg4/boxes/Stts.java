package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public class Stts extends com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox {
    int entryCount;
    int[] sampleCount;
    int[] sampleDelta;

    public int getEntryCount() {
        return this.entryCount;
    }

    public int[] getSampleCount() {
        return this.sampleCount;
    }

    public int[] getSampleDelta() {
        return this.sampleDelta;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box) {
        super.parse(parsable, box);
        int readInt = parsable.readInt();
        this.entryCount = readInt;
        int[] iArr = new int[readInt];
        this.sampleCount = iArr;
        int[] iArr2 = new int[readInt];
        this.sampleDelta = iArr2;
        parsable.readIntArrayInterleaved(readInt, iArr, iArr2);
    }
}
