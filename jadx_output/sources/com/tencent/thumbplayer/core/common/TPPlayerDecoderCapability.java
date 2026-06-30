package com.tencent.thumbplayer.core.common;

/* loaded from: classes14.dex */
public class TPPlayerDecoderCapability {
    private static java.lang.String TAG = "TPPlayerDecoderCapability";
    private static boolean mIsLibLoaded;
    private long mNativeContext = 0;

    static {
        try {
            com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.loadLibIfNeeded(null);
            mIsLibLoaded = true;
        } catch (java.lang.UnsupportedOperationException e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, e17.getMessage());
            mIsLibLoaded = false;
        }
    }

    private static native boolean _addACodecBlacklist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addACodecWhitelist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addVCodecBlacklist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native boolean _addVCodecWhitelist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> _getDecoderMaxCapabilityMap(int i17);

    private static native boolean _isACodecCapabilitySupport(int i17, int i18, int i19, int i27, int i28, int i29, int i37);

    private static native boolean _isVCodecCapabilitySupport(int i17, int i18, int i19, int i27, int i28, int i29, int i37);

    public static boolean addACodecBlacklist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("addACodecBlacklist: Failed to load native library.");
        }
        try {
            return _addACodecBlacklist(i17, i18, tPACodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _addACodecBlacklist.");
        }
    }

    public static boolean addACodecWhitelist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("addACodecWhitelist: Failed to load native library.");
        }
        try {
            return _addACodecWhitelist(i17, i18, tPACodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _addVCodecWhitelist.");
        }
    }

    public static boolean addDRMLevel1Blacklist(int i17) {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.addDRMLevel1Blacklist(i17);
    }

    public static boolean addHDRBlackList(int i17, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.addHDRBlackList(i17, com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName(), tPHdrSupportVersionRange);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.addHDRVideoDecoderTypeWhiteList(i17, i18, tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(int i17, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.addHDRWhiteList(i17, com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName(), tPHdrSupportVersionRange);
    }

    public static boolean addVCodecBlacklist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("addVCodecBlacklist: Failed to load native library.");
        }
        try {
            return _addVCodecBlacklist(i17, i18, tPVCodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _addVCodecBlacklist.");
        }
    }

    public static boolean addVCodecWhitelist(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("addVCodecWhitelist :Failed to load native library.");
        }
        try {
            return _addVCodecWhitelist(i17, i18, tPVCodecPropertyRange);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _addVCodecWhitelist.");
        }
    }

    public static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i17) {
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _getDecoderMaxCapabilityMap(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _getDecoderMaxCapabilityMap.");
        }
    }

    public static synchronized void init(android.content.Context context, boolean z17) {
        synchronized (com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability.class) {
            com.tencent.thumbplayer.core.common.TPCodecUtils.init(context, z17);
        }
    }

    public static boolean isACodecCapabilitySupport(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        java.lang.String str;
        if (2 == i17) {
            if (i18 == 5012) {
                str = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC;
            } else if (i18 != 5040) {
                switch (i18) {
                    case 5002:
                        str = "audio/aac";
                        break;
                    case 5003:
                        str = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3;
                        break;
                    case 5004:
                        str = "audio/dts";
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3;
            }
            if (com.tencent.thumbplayer.core.common.TPCodecUtils.isInMediaCodecWhiteList(str)) {
                return true;
            }
            if (com.tencent.thumbplayer.core.common.TPCodecUtils.isAMediaCodecBlackListModel() || com.tencent.thumbplayer.core.common.TPCodecUtils.isBlackListType(str)) {
                return false;
            }
        }
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _isACodecCapabilitySupport(i17, i18, i19, i27, i28, i29, i37);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _isACodecCapabilitySupport.");
        }
    }

    public static boolean isDDPlusSupported() {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.isMediaCodecDDPlusSupported();
    }

    public static boolean isDolbyDSSupported() {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.isMediaCodecDolbyDSSupported();
    }

    public static boolean isHDRsupport(int i17, int i18, int i19) {
        return com.tencent.thumbplayer.core.common.TPCodecUtils.isHDRsupport(i17, i18, i19);
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isVCodecCapabilitySupport(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        if (102 == i17) {
            java.lang.String str = i18 != 26 ? i18 != 138 ? i18 != 166 ? i18 != 172 ? i18 != 193 ? i18 != 1029 ? "" : "video/av01" : "video/vvc" : "video/hevc" : "video/x-vnd.on2.vp9" : "video/x-vnd.on2.vp8" : "video/avc";
            if (com.tencent.thumbplayer.core.common.TPCodecUtils.isInMediaCodecWhiteList(str)) {
                return true;
            }
            if (com.tencent.thumbplayer.core.common.TPCodecUtils.isVMediaCodecBlackListModel() || com.tencent.thumbplayer.core.common.TPCodecUtils.isBlackListType(str)) {
                return false;
            }
        }
        if (!isLibLoaded()) {
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _isVCodecCapabilitySupport(i17, i18, i19, i27, i28, i29, i37);
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            throw new com.tencent.thumbplayer.core.common.TPNativeLibraryException("Failed to call _isVCodecCapabilitySupport.");
        }
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z17) {
        com.tencent.thumbplayer.core.common.TPCodecUtils.setMediaCodecPreferredSoftwareComponent(z17);
    }
}
