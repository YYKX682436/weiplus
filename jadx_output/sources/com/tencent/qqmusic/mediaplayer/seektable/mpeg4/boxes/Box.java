package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public abstract class Box implements com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box {
    private long largeSize;
    private int size;
    private byte[] type;
    private byte[] userType;

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public final long getSize() {
        long j17 = this.largeSize;
        return j17 != 0 ? j17 : this.size;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public final java.lang.String getType() {
        return new java.lang.String(this.type, java.nio.charset.Charset.defaultCharset());
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box) {
        if (box != null) {
            this.size = box.size;
            this.type = box.type;
            this.largeSize = box.largeSize;
            this.userType = box.userType;
            return;
        }
        this.size = parsable.readInt();
        byte[] bArr = new byte[4];
        this.type = bArr;
        parsable.readBytes(bArr, 0, bArr.length);
        int i17 = this.size;
        if (i17 == 1) {
            long readLong = parsable.readLong();
            this.largeSize = readLong;
            if (readLong == 0) {
                throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("invalid [" + getType() + "]: largeSize is 0!");
            }
        } else if (i17 == 0) {
            this.largeSize = parsable.available();
        } else if (i17 < 8) {
            throw new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException("invalid [" + getType() + "]: size is less than 8!");
        }
        if (java.util.Arrays.equals(this.type, "uuid".getBytes())) {
            byte[] bArr2 = new byte[16];
            this.userType = bArr2;
            parsable.readBytes(bArr2, 0, bArr2.length);
        }
    }
}
