package org.webrtc;

/* loaded from: classes15.dex */
public class BuiltinAudioEncoderFactoryFactory implements org.webrtc.AudioEncoderFactoryFactory {
    private static native long nativeCreateBuiltinAudioEncoderFactory();

    @Override // org.webrtc.AudioEncoderFactoryFactory
    public long createNativeAudioEncoderFactory() {
        return nativeCreateBuiltinAudioEncoderFactory();
    }
}
