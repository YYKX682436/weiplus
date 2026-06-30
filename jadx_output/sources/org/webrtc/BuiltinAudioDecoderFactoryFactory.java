package org.webrtc;

/* loaded from: classes15.dex */
public class BuiltinAudioDecoderFactoryFactory implements org.webrtc.AudioDecoderFactoryFactory {
    private static native long nativeCreateBuiltinAudioDecoderFactory();

    @Override // org.webrtc.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
        return nativeCreateBuiltinAudioDecoderFactory();
    }
}
