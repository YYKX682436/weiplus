package com.tencent.thumbplayer.api.capability;

/* loaded from: classes14.dex */
public class TPCapability {
    public static boolean addACodecBlacklist(@com.tencent.thumbplayer.api.TPCommonEnum.TP_AUDIO_DECODER_TYPE int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TP_AUDIO_CODEC_TYPE int i18, com.tencent.thumbplayer.api.capability.TPACodecCapabilityForSet tPACodecCapabilityForSet) {
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange();
        tPACodecPropertyRange.set(tPACodecCapabilityForSet.getUpperboundSamplerate(), tPACodecCapabilityForSet.getUpperboundChannels(), tPACodecCapabilityForSet.getUpperboundBitrate(), tPACodecCapabilityForSet.getLowerboundSamplerate(), tPACodecCapabilityForSet.getLowerboundChannels(), tPACodecCapabilityForSet.getLowerboundBitrate(), tPACodecCapabilityForSet.getProfileForSet(), tPACodecCapabilityForSet.getLevelForSet());
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addACodecBlacklist(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioDecoderType.class, i17), com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioCodecType.class, i18), tPACodecPropertyRange);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static boolean addACodecWhitelist(@com.tencent.thumbplayer.api.TPCommonEnum.TP_AUDIO_DECODER_TYPE int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TP_AUDIO_CODEC_TYPE int i18, com.tencent.thumbplayer.api.capability.TPACodecCapabilityForSet tPACodecCapabilityForSet) {
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPACodecPropertyRange();
        tPACodecPropertyRange.set(tPACodecCapabilityForSet.getUpperboundSamplerate(), tPACodecCapabilityForSet.getUpperboundChannels(), tPACodecCapabilityForSet.getUpperboundBitrate(), tPACodecCapabilityForSet.getLowerboundSamplerate(), tPACodecCapabilityForSet.getLowerboundChannels(), tPACodecCapabilityForSet.getLowerboundBitrate(), tPACodecCapabilityForSet.getProfileForSet(), tPACodecCapabilityForSet.getLevelForSet());
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addACodecWhitelist(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioDecoderType.class, i17), com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapAudioCodecType.class, i18), tPACodecPropertyRange);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static boolean addDRMLevel1Blacklist(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17) {
        return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addDRMLevel1Blacklist(i17);
    }

    public static boolean addHDRBlackList(@com.tencent.thumbplayer.api.TPCommonEnum.TP_HDR_TYPE int i17, com.tencent.thumbplayer.api.capability.TPHDRVersionRange tPHDRVersionRange) {
        return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addHDRBlackList(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapHdrType.class, i17), new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(tPHDRVersionRange.upperboundSystemVersion, tPHDRVersionRange.lowerboundSystemVersion, tPHDRVersionRange.upperboundPatchVersion, tPHDRVersionRange.lowerboundPatchVersion));
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(@com.tencent.thumbplayer.api.TPCommonEnum.TP_HDR_TYPE int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_DECODER_TYPE int i18, com.tencent.thumbplayer.api.capability.TPHDRVersionRange tPHDRVersionRange) {
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(tPHDRVersionRange.upperboundSystemVersion, tPHDRVersionRange.lowerboundSystemVersion, tPHDRVersionRange.upperboundPatchVersion, tPHDRVersionRange.lowerboundPatchVersion);
        tPHdrSupportVersionRange.lowerboundAndroidAPILevel = 0;
        tPHdrSupportVersionRange.upperboundAndroidAPILevel = 999;
        return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addHDRVideoDecoderTypeWhiteList(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapHdrType.class, i17), com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapVideoDecoderType.class, i18), tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(@com.tencent.thumbplayer.api.TPCommonEnum.TP_HDR_TYPE int i17, com.tencent.thumbplayer.api.capability.TPHDRVersionRange tPHDRVersionRange) {
        return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addHDRWhiteList(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapHdrType.class, i17), new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(tPHDRVersionRange.upperboundSystemVersion, tPHDRVersionRange.lowerboundSystemVersion, tPHDRVersionRange.upperboundPatchVersion, tPHDRVersionRange.lowerboundPatchVersion));
    }

    public static boolean addVCodecBlacklist(@com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_DECODER_TYPE int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE int i18, com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForSet tPVCodecCapabilityForSet) {
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange();
        tPVCodecPropertyRange.set(tPVCodecCapabilityForSet.getUpperboundWidth(), tPVCodecCapabilityForSet.getUpperboundHeight(), tPVCodecCapabilityForSet.getLowerboundWidth(), tPVCodecCapabilityForSet.getLowerboundHeight(), tPVCodecCapabilityForSet.getProfile(), tPVCodecCapabilityForSet.getLevel());
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addVCodecBlacklist(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapVideoDecoderType.class, i17), com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapCodecType.class, i18), tPVCodecPropertyRange);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static boolean addVCodecWhitelist(@com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_DECODER_TYPE int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE int i18, com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForSet tPVCodecCapabilityForSet) {
        com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPVCodecPropertyRange();
        tPVCodecPropertyRange.set(tPVCodecCapabilityForSet.getUpperboundWidth(), tPVCodecCapabilityForSet.getUpperboundHeight(), tPVCodecCapabilityForSet.getLowerboundWidth(), tPVCodecCapabilityForSet.getLowerboundHeight(), tPVCodecCapabilityForSet.getProfile(), tPVCodecCapabilityForSet.getLevel());
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.addVCodecWhitelist(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapVideoDecoderType.class, i17), com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapCodecType.class, i18), tPVCodecPropertyRange);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static int[] getDRMCapabilities() {
        return com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.getDRMCapabilities();
    }

    public static com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet getThumbPlayerVCodecMaxCapability(@com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE int i17) {
        if (!com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability;
        }
        try {
            com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability vCodecMaxCapability = com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.getVCodecMaxCapability(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapCodecType.class, i17));
            return vCodecMaxCapability == null ? com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability : new com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet(vCodecMaxCapability.maxLumaSamples, vCodecMaxCapability.maxProfile, vCodecMaxCapability.maxLevel, vCodecMaxCapability.maxFramerateFormaxLumaSamples);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet getThumbPlayerVCodecTypeMaxCapability(@com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_DECODER_TYPE int i18) {
        if (!com.tencent.thumbplayer.core.common.TPNativeLibraryLoader.isLibLoadedAndTryToLoad()) {
            return com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability;
        }
        try {
            java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap = com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.getVCodecDecoderMaxCapabilityMap(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapVideoDecoderType.class, i18));
            int nativeIntValue = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapCodecType.class, i17);
            if (vCodecDecoderMaxCapabilityMap == null || vCodecDecoderMaxCapabilityMap.isEmpty()) {
                return com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability;
            }
            com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = vCodecDecoderMaxCapabilityMap.get(java.lang.Integer.valueOf(nativeIntValue));
            return tPCodecMaxCapability == null ? com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet.mDefaultVCodecCapability : new com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet(tPCodecMaxCapability.maxLumaSamples, tPCodecMaxCapability.maxProfile, tPCodecMaxCapability.maxLevel, tPCodecMaxCapability.maxFramerateFormaxLumaSamples);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static boolean isACodecCapabilityCanSupport(@com.tencent.thumbplayer.api.TPCommonEnum.TP_AUDIO_CODEC_TYPE int i17, int i18, int i19, int i27, int i28, int i29) {
        if (!com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isACodecCapabilityCanSupport(i17, i18, i19, i27, i28, i29);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static boolean isDDPlusSupported() {
        if (com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isDDPlusSupported();
        }
        return false;
    }

    public static boolean isDDSupported() {
        if (com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isDDSupported();
        }
        return false;
    }

    public static boolean isDRMsupport(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17) {
        return com.tencent.thumbplayer.adapter.player.thumbplayer.TPDrmCapability.isDRMSupport(i17);
    }

    public static boolean isDolbyDSSupported() {
        if (com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isDolbyDSSupported();
        }
        return false;
    }

    public static boolean isDolbyVisionSupported() {
        return false;
    }

    public static boolean isFeatureSupport(@com.tencent.thumbplayer.api.TPCommonEnum.InnerFeatureType int i17) {
        if (!com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isFeatureSupport(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapFeatureType.class, i17));
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static boolean isHDRsupport(@com.tencent.thumbplayer.api.TPCommonEnum.TP_HDR_TYPE int i17, int i18, int i19) {
        if (com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isHDRsupport(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toNativeIntValue(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapHdrType.class, i17), i18, i19);
        }
        return false;
    }

    public static boolean isVCodecCapabilityCanSupport(@com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE int i17, int i18, int i19, int i27, int i28, int i29) {
        if (!com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isVCodecCapabilityCanSupport(i17, i18, i19, 0, 0, i29);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z17) {
        if (com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.setMediaCodecPreferredSoftwareComponent(z17);
        }
    }

    public static boolean isVCodecCapabilityCanSupport(@com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        if (!com.tencent.thumbplayer.api.TPPlayerMgr.isThumbPlayerEnable()) {
            return false;
        }
        try {
            return com.tencent.thumbplayer.core.common.TPThumbplayerCapabilityHelper.isVCodecCapabilitySupport(i18, i17, i19, i27, 0, 0, i37);
        } catch (com.tencent.thumbplayer.core.common.TPNativeLibraryException e17) {
            throw new com.tencent.thumbplayer.api.TPNativeException(e17);
        }
    }
}
