package com.tencent.qqmusic.mediaplayer.seektable;

/* loaded from: classes16.dex */
public interface Parsable {
    long available();

    void readBytes(byte[] bArr, int i17, int i18);

    int readInt();

    int[] readIntArray(int i17);

    void readIntArrayInterleaved(int i17, int[]... iArr);

    long readLong();

    long[] readLongArray(int i17);

    void readLongArrayInterleaved(int i17, long[]... jArr);

    java.lang.String readString(int i17);

    long skip(long j17);

    long tell();
}
