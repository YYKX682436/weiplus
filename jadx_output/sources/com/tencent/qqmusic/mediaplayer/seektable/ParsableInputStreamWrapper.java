package com.tencent.qqmusic.mediaplayer.seektable;

/* loaded from: classes13.dex */
public class ParsableInputStreamWrapper implements java.io.Closeable, com.tencent.qqmusic.mediaplayer.seektable.Parsable {
    private final com.tencent.qqmusic.mediaplayer.upstream.IDataSource dataSource;
    private final byte[] intBuffer = new byte[4];
    private final byte[] longBuffer = new byte[8];
    private long position = 0;

    public ParsableInputStreamWrapper(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        this.dataSource = iDataSource;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long available() {
        return this.dataSource.getSize() - this.position;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.dataSource.close();
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public void readBytes(byte[] bArr, int i17, int i18) {
        this.position = this.position + this.dataSource.readAt(r6, bArr, i17, i18);
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public int readInt() {
        com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.dataSource;
        long j17 = this.position;
        byte[] bArr = this.intBuffer;
        int readAt = iDataSource.readAt(j17, bArr, 0, bArr.length);
        this.position += readAt;
        byte[] bArr2 = this.intBuffer;
        if (readAt != bArr2.length) {
            return -1;
        }
        return ((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public int[] readIntArray(int i17) {
        int[] iArr = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i18] = readInt();
        }
        return iArr;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public void readIntArrayInterleaved(int i17, int[]... iArr) {
        for (int i18 = 0; i18 < i17; i18++) {
            for (int[] iArr2 : iArr) {
                iArr2[i18] = readInt();
            }
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long readLong() {
        com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.dataSource;
        long j17 = this.position;
        byte[] bArr = this.longBuffer;
        int readAt = iDataSource.readAt(j17, bArr, 0, bArr.length);
        this.position += readAt;
        if (readAt != this.longBuffer.length) {
            return -1L;
        }
        return (r1[7] & 255) | ((r1[0] & 255) << 56) | ((r1[1] & 255) << 48) | ((r1[2] & 255) << 40) | ((r1[3] & 255) << 32) | ((r1[4] & 255) << 24) | ((r1[5] & 255) << 16) | ((r1[6] & 255) << 8);
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long[] readLongArray(int i17) {
        long[] jArr = new long[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            jArr[i18] = readLong();
        }
        return jArr;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public void readLongArrayInterleaved(int i17, long[]... jArr) {
        for (int i18 = 0; i18 < i17; i18++) {
            for (long[] jArr2 : jArr) {
                jArr2[i18] = readLong();
            }
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public java.lang.String readString(int i17) {
        byte[] bArr = new byte[i17];
        readBytes(bArr, 0, i17);
        return new java.lang.String(bArr, java.nio.charset.Charset.defaultCharset());
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long skip(long j17) {
        long available = available();
        if (available > j17) {
            this.position += j17;
            return j17;
        }
        this.position += available;
        return available;
    }

    @Override // com.tencent.qqmusic.mediaplayer.seektable.Parsable
    public long tell() {
        return this.position;
    }
}
