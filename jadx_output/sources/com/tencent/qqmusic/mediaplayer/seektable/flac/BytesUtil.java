package com.tencent.qqmusic.mediaplayer.seektable.flac;

/* loaded from: classes15.dex */
public class BytesUtil {
    public static int from(byte[] bArr) {
        if (bArr.length > 4) {
            throw new java.lang.RuntimeException("bytes can't be greater than 32 bit!");
        }
        if (bArr.length == 3) {
            return (bArr[2] & 255) | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        if (bArr.length == 2) {
            return (bArr[1] & 15) | ((bArr[0] & 255) << 8);
        }
        if (bArr.length == 1) {
            return bArr[0] & 255;
        }
        throw new java.lang.RuntimeException("bytes must be greater than 8 bit!");
    }
}
