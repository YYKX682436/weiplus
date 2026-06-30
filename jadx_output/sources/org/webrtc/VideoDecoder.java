package org.webrtc;

/* loaded from: classes6.dex */
public interface VideoDecoder {

    /* loaded from: classes6.dex */
    public interface Callback {
        void onDecodedFrame(org.webrtc.VideoFrame videoFrame, java.lang.Integer num, java.lang.Integer num2);
    }

    /* loaded from: classes6.dex */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z17, long j17) {
            this.isMissingFrames = z17;
            this.renderTimeMs = j17;
        }
    }

    /* loaded from: classes6.dex */
    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final int width;

        public Settings(int i17, int i18, int i19) {
            this.numberOfCores = i17;
            this.width = i18;
            this.height = i19;
        }
    }

    default long createNativeVideoDecoder() {
        return 0L;
    }

    org.webrtc.VideoCodecStatus decode(org.webrtc.EncodedImage encodedImage, org.webrtc.VideoDecoder.DecodeInfo decodeInfo);

    java.lang.String getImplementationName();

    org.webrtc.VideoCodecStatus initDecode(org.webrtc.VideoDecoder.Settings settings, org.webrtc.VideoDecoder.Callback callback);

    org.webrtc.VideoCodecStatus release();
}
