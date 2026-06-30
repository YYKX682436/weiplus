package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public class Stsc extends com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox {
    int entryCount;
    int[] firstChunk;
    int[] sampleDescIndex;
    int[] samplesPerChunk;

    public int getEntryCount() {
        return this.entryCount;
    }

    public int[] getFirstChunk() {
        return this.firstChunk;
    }

    public int[] getSampleDescIndex() {
        return this.sampleDescIndex;
    }

    public int[] getSamplesPerChunk() {
        return this.samplesPerChunk;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box) {
        super.parse(parsable, box);
        int readInt = parsable.readInt();
        this.entryCount = readInt;
        int[] iArr = new int[readInt];
        this.firstChunk = iArr;
        int[] iArr2 = new int[readInt];
        this.samplesPerChunk = iArr2;
        int[] iArr3 = new int[readInt];
        this.sampleDescIndex = iArr3;
        parsable.readIntArrayInterleaved(readInt, iArr, iArr2, iArr3);
    }
}
