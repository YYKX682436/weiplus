package com.tencent.thumbplayer.adapter.strategy.utils;

/* loaded from: classes16.dex */
public class TPStrategyUtils {
    private static final java.lang.String TAG = "TPStrategyUtils";

    public static boolean enablePlayBySystemPlayer(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        if (tPPlaybackInfo.getVideoCodedId() == 0) {
            return true;
        }
        return isSupportMediaCodec(tPPlaybackInfo);
    }

    public static boolean enablePlayByThumbPlayer(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        return tPPlaybackInfo == null || tPPlaybackInfo.getVideoCodedId() == 0 || isSupportFFmpegCodec(tPPlaybackInfo) || isSupportMediaCodec(tPPlaybackInfo);
    }

    public static boolean isSupportFFmpegCodec(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(101, com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapCodecType.class, tPPlaybackInfo.getVideoCodedId()), (int) tPPlaybackInfo.getWidth(), (int) tPPlaybackInfo.getHeight(), tPPlaybackInfo.getVideoProfile(), tPPlaybackInfo.getVideoLevel());
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return false;
        }
    }

    public static boolean isSupportMediaCodec(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(102, com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapCodecType.class, tPPlaybackInfo.getVideoCodedId()), (int) tPPlaybackInfo.getWidth(), (int) tPPlaybackInfo.getHeight(), tPPlaybackInfo.getVideoProfile(), tPPlaybackInfo.getVideoLevel());
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return false;
        }
    }

    public static boolean isSystemPlayerEnable() {
        return true;
    }

    public static boolean isTVPlatform() {
        return false;
    }

    public static boolean isThumbPlayerEnable() {
        return com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.isLibLoadedAndTryToLoad();
    }
}
