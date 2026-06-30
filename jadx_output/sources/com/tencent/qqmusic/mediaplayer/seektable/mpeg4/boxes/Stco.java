package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public class Stco extends com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox {
    int[] chunkOffset;
    int entryCount;

    public int[] getChunkOffset() {
        return this.chunkOffset;
    }

    public int getEntryCount() {
        return this.entryCount;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box) {
        super.parse(parsable, box);
        int readInt = parsable.readInt();
        this.entryCount = readInt;
        this.chunkOffset = parsable.readIntArray(readInt);
    }
}
