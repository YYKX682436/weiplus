package com.tencent.thumbplayer.tmediacodec.reuse;

/* loaded from: classes14.dex */
public final class ReuseHelper {
    public static final java.lang.String TAG = "ReuseHelper";

    /* loaded from: classes6.dex */
    public enum AdaptationWorkaroundMode {
        ADAPTATION_WORKAROUND_MODE_NEVER,
        ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION,
        ADAPTATION_WORKAROUND_MODE_ALWAYS
    }

    /* loaded from: classes14.dex */
    public enum ReuseType {
        KEEP_CODEC_RESULT_NO,
        KEEP_CODEC_RESULT_YES_WITH_FLUSH,
        KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION,
        KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION
    }

    private ReuseHelper() {
    }

    public static com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.AdaptationWorkaroundMode codecAdaptationWorkaroundMode(java.lang.String str) {
        return (android.os.Build.VERSION.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName().startsWith("SM-T585") || com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName().startsWith("SM-A510") || com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName().startsWith("SM-A520") || com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName().startsWith("SM-J700"))) ? com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.AdaptationWorkaroundMode.ADAPTATION_WORKAROUND_MODE_ALWAYS : com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.AdaptationWorkaroundMode.ADAPTATION_WORKAROUND_MODE_NEVER;
    }

    public static void initFormatWrapper(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper, android.media.MediaFormat mediaFormat) {
        com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy reusePolicy = com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().getReusePolicy();
        int max = java.lang.Math.max(reusePolicy.initWidth, formatWrapper.width);
        int max2 = java.lang.Math.max(reusePolicy.initHeight, formatWrapper.height);
        if (reusePolicy.reConfigByRealFormat) {
            reusePolicy.initWidth = max;
            reusePolicy.initHeight = max2;
        }
        int max3 = java.lang.Math.max(0, com.tencent.thumbplayer.tmediacodec.util.TUtils.getCodecMaxInputSize(formatWrapper.sampleMimeType, max, max2, false));
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(TAG, "initFormatWrapper initWidth:" + max + " initHeight:" + max2 + " initMaxInputSize:" + max3 + " reusePolicy:" + reusePolicy);
        }
        formatWrapper.maxWidth = max;
        formatWrapper.maxHeight = max2;
        formatWrapper.maxInputSize = max3;
        mediaFormat.setInteger("max-input-size", java.lang.Math.max(max3, 0));
        if (formatWrapper.isVideo()) {
            mediaFormat.setInteger("max-width", max);
            mediaFormat.setInteger("max-height", max2);
        }
    }

    public static boolean isSeamlessAdaptationSupported(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        return isSeamlessAdaptationSupported(reuseCodecWrapper, formatWrapper, false);
    }

    public static boolean isSeamlessAdaptationSupported(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper, boolean z17) {
        com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper2 = reuseCodecWrapper.mFormat;
        if (reuseCodecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper) {
            if (android.text.TextUtils.equals(formatWrapper2.sampleMimeType, formatWrapper.sampleMimeType) && formatWrapper2.rotationDegrees == formatWrapper.rotationDegrees) {
                return reuseCodecWrapper.mAdaptive || (formatWrapper2.width == formatWrapper.width && formatWrapper2.height == formatWrapper.height);
            }
            return false;
        }
        if (!(reuseCodecWrapper instanceof com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper)) {
            return true;
        }
        if (android.text.TextUtils.equals("audio/mp4a-latm", formatWrapper2.sampleMimeType)) {
            android.text.TextUtils.equals(formatWrapper2.sampleMimeType, formatWrapper.sampleMimeType);
        }
        return false;
    }
}
