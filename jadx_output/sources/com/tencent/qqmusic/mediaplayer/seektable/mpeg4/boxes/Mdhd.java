package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public class Mdhd extends com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox {
    long creationTime;
    long duration;
    long modificationTime;
    byte[] remaining;
    int timeScale;

    public long getCreationTime() {
        return this.creationTime;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getModificationTime() {
        return this.modificationTime;
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.FullBox, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box) {
        super.parse(parsable, box);
        if (this.version == 1) {
            this.creationTime = parsable.readLong();
            this.modificationTime = parsable.readLong();
            this.timeScale = parsable.readInt();
            this.duration = parsable.readLong();
        } else {
            this.creationTime = parsable.readInt();
            this.modificationTime = parsable.readInt();
            this.timeScale = parsable.readInt();
            this.duration = parsable.readInt();
        }
        byte[] bArr = new byte[4];
        this.remaining = bArr;
        parsable.readBytes(bArr, 0, bArr.length);
    }
}
