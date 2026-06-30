package io.clipworks.androidplus.media;

/* loaded from: classes14.dex */
public class NativeMediaCodecCallback extends android.media.MediaCodec.Callback {
    private final com.facebook.jni.HybridData mHybridData;

    private NativeMediaCodecCallback(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeOnError(android.media.MediaCodec.CodecException codecException);

    private native void nativeOnInputBufferAvailable(int i17);

    private native void nativeOnOutputBufferAvailable(int i17, android.media.MediaCodec.BufferInfo bufferInfo);

    private native void nativeOnOutputFormatChanged(android.media.MediaFormat mediaFormat);

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        nativeOnError(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i17) {
        nativeOnInputBufferAvailable(i17);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        nativeOnOutputBufferAvailable(i17, bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        nativeOnOutputFormatChanged(mediaFormat);
    }
}
