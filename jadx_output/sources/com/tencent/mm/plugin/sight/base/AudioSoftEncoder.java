package com.tencent.mm.plugin.sight.base;

/* loaded from: classes14.dex */
public class AudioSoftEncoder {
    static {
        mq1.w0.wi();
    }

    public static native void nDestroy(int i17);

    public static native void nEndWriteAudioSample(int i17);

    public static native int nGetBufferSize(int i17);

    public static native int nGetErrCode(int i17);

    public static native byte[] nGetOutputBuffer(int i17, long[] jArr);

    public static native int nInit(long j17, int i17, int i18, int i19);

    public static native int nWriteAudioSample(int i17, java.nio.ByteBuffer byteBuffer, int i18, long j17);
}
