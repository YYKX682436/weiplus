package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class MP4MuxerJNI {
    public static final int SEGMENT_COLOR_FORMAT_YUV420P = 2;
    public static final int SEGMENT_COLOR_FORMAT_YUV420SP = 1;
    private static final java.lang.Object lock;

    static {
        mq1.w0.wi();
        lock = new java.lang.Object();
    }

    public static native boolean ffmpegCheckIfReachEndTimestamp();

    public static boolean ffmpegCheckIfReachEndTimestampLock() {
        boolean ffmpegCheckIfReachEndTimestamp;
        synchronized (lock) {
            ffmpegCheckIfReachEndTimestamp = ffmpegCheckIfReachEndTimestamp();
        }
        return ffmpegCheckIfReachEndTimestamp;
    }

    public static native byte[] ffmpegGetNextVideoFrameData(byte[] bArr);

    public static byte[] ffmpegGetNextVideoFrameDataLock(byte[] bArr) {
        byte[] ffmpegGetNextVideoFrameData;
        synchronized (lock) {
            ffmpegGetNextVideoFrameData = ffmpegGetNextVideoFrameData(bArr);
        }
        return ffmpegGetNextVideoFrameData;
    }

    public static native int ffmpegGetVideoHeight();

    public static int ffmpegGetVideoHeightLock() {
        int ffmpegGetVideoHeight;
        synchronized (lock) {
            ffmpegGetVideoHeight = ffmpegGetVideoHeight();
        }
        return ffmpegGetVideoHeight;
    }

    public static native int ffmpegGetVideoWidth();

    public static int ffmpegGetVideoWidthLock() {
        int ffmpegGetVideoWidth;
        synchronized (lock) {
            ffmpegGetVideoWidth = ffmpegGetVideoWidth();
        }
        return ffmpegGetVideoWidth;
    }

    private static native int ffmpegOpenAndSeekFile(java.lang.String str, double d17, double d18);

    public static int ffmpegOpenAndSeekFileLock(java.lang.String str, double d17, double d18) {
        int ffmpegOpenAndSeekFileVFS;
        synchronized (lock) {
            ffmpegOpenAndSeekFileVFS = ffmpegOpenAndSeekFileVFS(str, d17, d18);
        }
        return ffmpegOpenAndSeekFileVFS;
    }

    public static int ffmpegOpenAndSeekFileVFS(java.lang.String str, double d17, double d18) {
        return ffmpegOpenAndSeekFile(kk.w.a(str, false), d17, d18);
    }

    private static native byte[] getVideoThumb(java.lang.String str, int i17, int i18);

    public static byte[] getVideoThumbVFS(java.lang.String str, int i17, int i18) {
        return getVideoThumb(kk.w.a(str, false), i17, i18);
    }

    public static native int initDataBuf(int i17);

    public static int initDataBufLock(int i17) {
        int initDataBuf;
        synchronized (lock) {
            initDataBuf = initDataBuf(i17);
        }
        return initDataBuf;
    }

    public static native int initH264Encoder(int i17, int i18, float f17, int i19, int i27, int i28, int i29, float f18, int i37, int i38);

    public static int initH264EncoderLock(int i17, int i18, float f17, int i19, int i27, int i28, int i29, float f18, int i37, int i38) {
        int initH264Encoder;
        synchronized (lock) {
            initH264Encoder = initH264Encoder(i17, i18, f17, i19, i27, i28, i29, f18, i37, i38);
        }
        return initH264Encoder;
    }

    private static native int muxing(int i17, int i18, int i19, int i27, int i28, java.lang.String str, float f17, byte[] bArr, int i29);

    public static native int muxingForX264(int i17, int i18, int i19, int i27, java.lang.String str, float f17, int i28, byte[] bArr, int i29);

    public static int muxingForX264Lock(int i17, int i18, int i19, int i27, java.lang.String str, float f17, int i28, byte[] bArr, int i29) {
        int muxingForX264VFS;
        synchronized (lock) {
            muxingForX264VFS = muxingForX264VFS(i17, i18, i19, i27, str, f17, i28, bArr, i29);
        }
        return muxingForX264VFS;
    }

    public static int muxingForX264VFS(int i17, int i18, int i19, int i27, java.lang.String str, float f17, int i28, byte[] bArr, int i29) {
        return muxingForX264(i17, i18, i19, i27, kk.w.a(str, false), f17, i28, bArr, i29);
    }

    public static int muxingLock(int i17, int i18, int i19, int i27, int i28, java.lang.String str, float f17, byte[] bArr, int i29) {
        int muxingVFS;
        synchronized (lock) {
            muxingVFS = muxingVFS(i17, i18, i19, i27, i28, str, f17, bArr, i29);
        }
        return muxingVFS;
    }

    public static int muxingVFS(int i17, int i18, int i19, int i27, int i28, java.lang.String str, float f17, byte[] bArr, int i29) {
        return muxing(i17, i18, i19, i27, i28, kk.w.a(str, false), f17, bArr, i29);
    }

    public static native void releaseDataBuf(int i17);

    public static void releaseDataBufLock(int i17) {
        synchronized (lock) {
            releaseDataBuf(i17);
        }
    }

    public static native int triggerEncodeForSegment(int i17, boolean z17);

    public static int triggerEncodeForSegmentLock(int i17, boolean z17) {
        int triggerEncodeForSegment;
        synchronized (lock) {
            triggerEncodeForSegment = triggerEncodeForSegment(i17, z17);
        }
        return triggerEncodeForSegment;
    }

    public static native void writeAACData(int i17, java.nio.ByteBuffer byteBuffer, int i18);

    public static void writeAACDataLock(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        synchronized (lock) {
            writeAACData(i17, byteBuffer, i18);
        }
    }

    public static native void writeH264Data(int i17, java.nio.ByteBuffer byteBuffer, int i18);

    public static void writeH264DataLock(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        synchronized (lock) {
            writeH264Data(i17, byteBuffer, i18);
        }
    }

    public static native int writeYuvDataForSegment(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37);

    public static int writeYuvDataForSegmentLock(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        int writeYuvDataForSegment;
        synchronized (lock) {
            writeYuvDataForSegment = writeYuvDataForSegment(bArr, i17, i18, i19, i27, i28, i29, i37);
        }
        return writeYuvDataForSegment;
    }

    public static native void yuv420pTo420XXAndScale(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, int i27, int i28, int i29, int i37, int i38);

    public static void yuv420pTo420XXAndScaleLock(byte[] bArr, int i17, byte[] bArr2, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        synchronized (lock) {
            yuv420pTo420XXAndScale(bArr, i17, bArr2, i18, i19, i27, i28, i29, i37, i38);
        }
    }
}
