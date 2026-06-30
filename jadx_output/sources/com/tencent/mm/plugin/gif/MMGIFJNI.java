package com.tencent.mm.plugin.gif;

/* loaded from: classes16.dex */
public class MMGIFJNI {
    public static native byte[] decFile(java.lang.String str, java.lang.String str2);

    public static native boolean drawFrameBitmap(long j17, android.graphics.Bitmap bitmap, int[] iArr);

    public static native boolean drawFramePixels(long j17, int[] iArr, int[] iArr2);

    public static native void encFile(java.lang.String str, java.lang.String str2);

    public static native java.lang.String encodeString(java.lang.String str);

    public static native int getCurrentFrameDuration(long j17);

    public static native int getCurrentFrameIndex(long j17);

    public static native int getHeight(long j17);

    public static native int getTotalFrameCount(long j17);

    public static native int getWidth(long j17);

    public static native void isEncFile(java.lang.String str);

    public static native boolean isGif(long j17);

    public static native void lockBitmap(android.graphics.Bitmap bitmap);

    public static native long openByByteArray(byte[] bArr, int[] iArr);

    public static native long openByFileDescroptor(java.io.FileDescriptor fileDescriptor, long j17, int[] iArr);

    public static native long openByFilePath(java.lang.String str, int[] iArr);

    public static native long openByInputStrem(java.io.InputStream inputStream, int[] iArr);

    public static native void recycle(long j17);

    public static native void reset(long j17);

    public static native void restoreRemainder(long j17);

    public static native void saveRemainder(long j17);
}
