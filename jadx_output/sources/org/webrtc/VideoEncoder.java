package org.webrtc;

/* loaded from: classes6.dex */
public interface VideoEncoder {

    /* loaded from: classes6.dex */
    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i17 = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i18 : iArr) {
                    i17 += i18;
                }
            }
            return i17;
        }
    }

    /* loaded from: classes6.dex */
    public interface Callback {
        void onEncodedFrame(org.webrtc.EncodedImage encodedImage, org.webrtc.VideoEncoder.CodecSpecificInfo codecSpecificInfo);
    }

    /* loaded from: classes6.dex */
    public static class Capabilities {
        public final boolean lossNotification;

        public Capabilities(boolean z17) {
            this.lossNotification = z17;
        }
    }

    /* loaded from: classes6.dex */
    public static class CodecSpecificInfo {
    }

    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoAV1 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
    }

    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoH264 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
    }

    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoVP8 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
    }

    /* loaded from: classes6.dex */
    public static class CodecSpecificInfoVP9 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
    }

    /* loaded from: classes6.dex */
    public static class EncodeInfo {
        public final org.webrtc.EncodedImage.FrameType[] frameTypes;

        public EncodeInfo(org.webrtc.EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    /* loaded from: classes6.dex */
    public static class RateControlParameters {
        public final org.webrtc.VideoEncoder.BitrateAllocation bitrate;
        public final double framerateFps;

        public RateControlParameters(org.webrtc.VideoEncoder.BitrateAllocation bitrateAllocation, double d17) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d17;
        }
    }

    /* loaded from: classes6.dex */
    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i17, int i18, int i19, int i27) {
            this.frameSizePixels = i17;
            this.minStartBitrateBps = i18;
            this.minBitrateBps = i19;
            this.maxBitrateBps = i27;
        }

        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    /* loaded from: classes6.dex */
    public static class Settings {
        public final boolean automaticResizeOn;
        public final org.webrtc.VideoEncoder.Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @java.lang.Deprecated
        public Settings(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17) {
            this(i17, i18, i19, i27, i28, i29, z17, new org.webrtc.VideoEncoder.Capabilities(false));
        }

        public Settings(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, org.webrtc.VideoEncoder.Capabilities capabilities) {
            this.numberOfCores = i17;
            this.width = i18;
            this.height = i19;
            this.startBitrate = i27;
            this.maxFramerate = i28;
            this.numberOfSimulcastStreams = i29;
            this.automaticResizeOn = z17;
            this.capabilities = capabilities;
        }
    }

    default long createNativeVideoEncoder() {
        return 0L;
    }

    org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame videoFrame, org.webrtc.VideoEncoder.EncodeInfo encodeInfo);

    java.lang.String getImplementationName();

    default org.webrtc.VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        return new org.webrtc.VideoEncoder.ResolutionBitrateLimits[0];
    }

    org.webrtc.VideoEncoder.ScalingSettings getScalingSettings();

    org.webrtc.VideoCodecStatus initEncode(org.webrtc.VideoEncoder.Settings settings, org.webrtc.VideoEncoder.Callback callback);

    default boolean isHardwareEncoder() {
        return true;
    }

    org.webrtc.VideoCodecStatus release();

    org.webrtc.VideoCodecStatus setRateAllocation(org.webrtc.VideoEncoder.BitrateAllocation bitrateAllocation, int i17);

    default org.webrtc.VideoCodecStatus setRates(org.webrtc.VideoEncoder.RateControlParameters rateControlParameters) {
        return setRateAllocation(rateControlParameters.bitrate, (int) java.lang.Math.ceil(rateControlParameters.framerateFps));
    }

    /* loaded from: classes13.dex */
    public static class ScalingSettings {
        public static final org.webrtc.VideoEncoder.ScalingSettings OFF = new org.webrtc.VideoEncoder.ScalingSettings();
        public final java.lang.Integer high;
        public final java.lang.Integer low;

        /* renamed from: on, reason: collision with root package name */
        public final boolean f347950on;

        public ScalingSettings(int i17, int i18) {
            this.f347950on = true;
            this.low = java.lang.Integer.valueOf(i17);
            this.high = java.lang.Integer.valueOf(i18);
        }

        public java.lang.String toString() {
            if (!this.f347950on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }

        private ScalingSettings() {
            this.f347950on = false;
            this.low = null;
            this.high = null;
        }

        @java.lang.Deprecated
        public ScalingSettings(boolean z17) {
            this.f347950on = z17;
            this.low = null;
            this.high = null;
        }

        @java.lang.Deprecated
        public ScalingSettings(boolean z17, int i17, int i18) {
            this.f347950on = z17;
            this.low = java.lang.Integer.valueOf(i17);
            this.high = java.lang.Integer.valueOf(i18);
        }
    }
}
