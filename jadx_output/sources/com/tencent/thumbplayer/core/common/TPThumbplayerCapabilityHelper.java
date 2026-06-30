package com.tencent.thumbplayer.core.common;

/* loaded from: classes14.dex */
public class TPThumbplayerCapabilityHelper {
    public static boolean addACodecBlacklist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addACodecBlacklist(i17, i18, tPACodecPropertyRange);
    }

    public static boolean addACodecWhitelist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addACodecWhitelist(i17, i18, tPACodecPropertyRange);
    }

    public static boolean addDRMLevel1Blacklist(int i17) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addDRMLevel1Blacklist(i17);
    }

    public static boolean addHDRBlackList(int i17, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addHDRBlackList(i17, tPHdrSupportVersionRange);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addHDRVideoDecoderTypeWhiteList(i17, i18, tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(int i17, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addHDRWhiteList(i17, tPHdrSupportVersionRange);
    }

    public static boolean addVCodecBlacklist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addVCodecBlacklist(i17, i18, tPVCodecPropertyRange);
    }

    public static boolean addVCodecWhitelist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.addVCodecWhitelist(i17, i18, tPVCodecPropertyRange);
    }

    public static int[] getDRMCapabilities() {
        return com.tencent.thumbplayer.core.common.TPDrm.getDRMCapabilities();
    }

    public static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i17) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(i17);
    }

    public static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability getVCodecMaxCapability(int i17) {
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability;
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2;
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap = com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(102);
        java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap2 = com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(101);
        if (vCodecDecoderMaxCapabilityMap != null && (tPCodecMaxCapability2 = vCodecDecoderMaxCapabilityMap.get(java.lang.Integer.valueOf(i17))) != null) {
            tPCodecMaxCapability3 = tPCodecMaxCapability2;
        }
        return (vCodecDecoderMaxCapabilityMap2 == null || (tPCodecMaxCapability = vCodecDecoderMaxCapabilityMap2.get(java.lang.Integer.valueOf(i17))) == null || tPCodecMaxCapability.maxLumaSamples <= tPCodecMaxCapability3.maxLumaSamples) ? tPCodecMaxCapability3 : tPCodecMaxCapability;
    }

    public static synchronized void init(android.content.Context context, boolean z17) {
        synchronized (com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.class) {
            com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.init(context, z17);
        }
    }

    public static boolean isACodecCapabilityCanSupport(int i17, int i18, int i19, int i27, int i28, int i29) {
        if (isACodecCapabilitySupport(1, i17, i18, i19, i27, i28, i29)) {
            return true;
        }
        return isACodecCapabilitySupport(102, i17, i18, i19, i27, i28, i29);
    }

    public static boolean isACodecCapabilitySupport(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isACodecCapabilitySupport(i17, i18, i19, i27, i28, i29, i37);
    }

    public static boolean isDDPlusSupported() {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDDSupported() {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDRMsupport(int i17) {
        int[] dRMCapabilities = getDRMCapabilities();
        if (dRMCapabilities.length == 0) {
            return false;
        }
        for (int i18 : dRMCapabilities) {
            if (i17 == i18) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDolbyDSSupported() {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isDolbyDSSupported();
    }

    public static boolean isFeatureSupport(int i17) {
        return com.tencent.thumbplayer.core.common.TPFeatureCapability.isFeatureSupport(i17);
    }

    public static boolean isHDRsupport(int i17, int i18, int i19) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isHDRsupport(i17, i18, i19);
    }

    public static boolean isSupportMediaCodecRotateInternal() {
        return true;
    }

    public static boolean isSupportNativeMediaCodec() {
        return true;
    }

    public static boolean isSupportSetOutputSurfaceApi() {
        return true;
    }

    @java.lang.Deprecated
    public static boolean isVCodecCapabilityCanSupport(int i17, int i18, int i19, int i27, int i28) {
        return isVCodecCapabilityCanSupport(i17, i18, i19, i27, i28, 30);
    }

    @java.lang.Deprecated
    public static boolean isVCodecCapabilitySupport(int i17, int i18, int i19, int i27, int i28, int i29) {
        return isVCodecCapabilitySupport(i17, i18, i19, i27, i28, i29, 30);
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z17) {
        com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.setMediaCodecPreferredSoftwareComponent(z17);
    }

    public static boolean isVCodecCapabilityCanSupport(int i17, int i18, int i19, int i27, int i28, int i29) {
        if (isVCodecCapabilitySupport(101, i17, i18, i19, i27, i28, i29)) {
            return true;
        }
        return isVCodecCapabilitySupport(102, i17, i18, i19, i27, i28, i29);
    }

    public static boolean isVCodecCapabilitySupport(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        return com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.isVCodecCapabilitySupport(i17, i18, i19, i27, i28, i29, i37);
    }
}
