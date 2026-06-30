package com.tencent.thumbplayer.core.common;

/* loaded from: classes14.dex */
public class TPCodecUtils {
    public static final int CAP_AUDIO_AAC = 8;
    public static final int CAP_AUDIO_DD = 16;
    public static final int CAP_AUDIO_DDP = 32;
    public static final int CAP_AUDIO_DTS = 128;
    public static final int CAP_AUDIO_FLAC = 64;
    public static final int CAP_VIDEO_AVC = 1;
    public static final int CAP_VIDEO_HEVC = 2;
    public static final int CAP_VIDEO_VP8 = 256;
    public static final int CAP_VIDEO_VP9 = 4;
    public static final int PLAYER_LEVEL_0 = 0;
    public static final int PLAYER_LEVEL_1 = 1;
    public static final int PLAYER_LEVEL_11 = 11;
    public static final int PLAYER_LEVEL_16 = 16;
    public static final int PLAYER_LEVEL_21 = 21;
    public static final int PLAYER_LEVEL_26 = 26;
    public static final int PLAYER_LEVEL_28 = 28;
    public static final int PLAYER_LEVEL_33 = 33;
    public static final int PLAYER_LEVEL_6 = 6;
    public static final int PLAYER_LEVEL_UNKNOWN = -1;
    private static final java.lang.String TAG = "TPCodecUtils";
    private static final java.lang.String VVC_SHD_HISI_CPU_NAME = "Kirin9000E";
    private static final java.lang.String VVC_SHD_MTK_CPU_NAME = "MT6893";
    private static final java.lang.String VVC_SHD_QUALCOMMN_CPU_NAME = "SM8250";
    private static final java.lang.String VVC_SHD_SAMSUNG_CPU_NAME = "Exynos2100";
    private static int mAACMaxSupportedBitrate = 510000;
    private static int mAACMaxSupportedChannels = 8;
    private static int mAACMaxSupportedSamplerate = 96000;
    private static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability mAV1SWMaxCapability = null;
    private static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability mAVCSWMaxCapability = null;
    private static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability mAVS3WMaxCapability = null;
    private static int mAvs3DeviceLevel = -1;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> mCodecCapBlackList = null;
    private static java.util.HashMap<java.lang.String, java.lang.Integer> mCodecCapWhiteList = null;
    private static android.content.Context mContext = null;
    private static int mDDPMaxSupportedBitrate = 6144000;
    private static int mDDPMaxSupportedChannels = 8;
    private static int mDDPMaxSupportedSamplerate = 48000;
    private static int mFLACMaxSupportedBitrate = 21000000;
    private static int mFLACMaxSupportedChannels = 8;
    private static int mFLACMaxSupportedSamplerate = 192000;
    private static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability mHEVCSWMaxCapability = null;
    private static int mHevcDeviceLevel = -1;
    private static boolean mIsFFmpegCapGot = false;
    private static com.tencent.thumbplayer.core.thirdparties.LocalCache mLocalCache = null;
    private static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> mMaxACodecHwCapabilityMap = null;
    private static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> mMaxACodecSwCapabilityMap = null;
    private static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> mMaxVCodecHwCapabilityMap = null;
    private static java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> mMaxVCodecSwCapabilityMap = null;
    private static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability mVP8SWMaxCapability = null;
    private static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability mVP9SWMaxCapability = null;
    private static com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability mVVCSWMaxCapability = null;
    private static int mVvcDeviceLevel = -1;
    protected static java.util.ArrayList<java.lang.String> mVMediaCodecCapList = new java.util.ArrayList<>();
    protected static java.util.ArrayList<java.lang.String> mAMediaCodecCapList = new java.util.ArrayList<>();
    private static java.util.ArrayList<java.lang.String> mVMediaCodecBlackListModel = new java.util.ArrayList<>();
    private static java.util.ArrayList<java.lang.String> mAMediaCodecBlackListModel = new java.util.ArrayList<>();
    private static java.util.ArrayList<java.lang.String> mAMediaCodecBlackListInstance = new java.util.ArrayList<>();
    private static java.util.ArrayList<java.lang.String> mSupportedMediaCodec = new java.util.ArrayList<>();
    private static java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange>> mHdrWhiteMap = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange>> mHdrBlackMap = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> mHDRVividSupportVersionMap = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRSoftwareCodecWhiteListMap = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRHardwareCodecWhiteListMap = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.String, java.lang.String> mAudioMaxCapCodecInstance = new java.util.HashMap<>();
    private static java.util.ArrayList<java.lang.String> mWideVineBlackListModel = new java.util.ArrayList<>();
    private static java.util.HashMap<java.lang.Integer, java.util.ArrayList<java.lang.String>> mDrmL1BlackList = new java.util.HashMap<>();
    private static java.util.ArrayList<java.lang.String> mBlackListModel = new java.util.ArrayList<>();
    private static java.util.ArrayList<java.lang.String> mSupportedHWCodec = new java.util.ArrayList<>();
    private static boolean mIsInitDone = false;
    private static boolean mPreferredSoftwareComponent = false;
    private static int mShdHevcQualcommIndex = 32;
    private static int mHdHevcQualcommIndex = 20;
    private static int mShdHevcMtkIndex = 12;
    private static int mHdHevcMtkIndex = 8;
    private static int mShdHevcHisiIndex = 8;
    private static int mHdHevcHisiIndex = 3;
    private static int mShdHevcSamsungIndex = 8;
    private static int mHdHevcSamsungIndex = 5;
    private static int mFhdAvs3QualcommIndex = 58;
    private static int mShdAvs3QualcommIndex = 55;
    private static int mFhdAvs3HisiIndex = 14;
    private static android.util.SparseArray<com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel> mVideoCodecIdToSwCapabilityModel = new android.util.SparseArray<>();
    private static java.util.HashMap<com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName, java.lang.Integer> mDefinitionNameToDecodeLevelTable = new java.util.HashMap<>();

    /* loaded from: classes14.dex */
    public enum DefinitionName {
        DEFINITION_720P
    }

    /* loaded from: classes14.dex */
    public static class VideoSwCapabilityModel {
        android.util.SparseArray<java.util.HashMap<com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName, java.lang.String>> mCpuProducerToAllDefinitionDecTable;

        /* loaded from: classes14.dex */
        public static class Builder {
            private android.util.SparseArray<java.util.HashMap<com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName, java.lang.String>> mCpuProducerToAllDefinitionDecCapabilities = new android.util.SparseArray<>();

            public com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel.Builder addVideoDecCap(int i17, com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName definitionName, java.lang.String str) {
                java.util.HashMap<com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName, java.lang.String> hashMap = this.mCpuProducerToAllDefinitionDecCapabilities.get(i17);
                if (hashMap == null) {
                    hashMap = new java.util.HashMap<>();
                    this.mCpuProducerToAllDefinitionDecCapabilities.put(i17, hashMap);
                }
                hashMap.put(definitionName, str);
                return this;
            }

            public com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel build() {
                com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel videoSwCapabilityModel = new com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel();
                videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable = this.mCpuProducerToAllDefinitionDecCapabilities;
                return videoSwCapabilityModel;
            }
        }

        private VideoSwCapabilityModel() {
            this.mCpuProducerToAllDefinitionDecTable = new android.util.SparseArray<>();
        }
    }

    static {
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = new java.util.HashMap<>();
        mCodecCapWhiteList = hashMap;
        hashMap.put("NX511J", 11);
        mCodecCapWhiteList.put("Hi3798MV100", 11);
        mCodecCapWhiteList.put("长虹智能电视", 11);
        mCodecCapWhiteList.put("Android TV on Tcl 901", 11);
        mCodecCapWhiteList.put("xt880b", 11);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "white list init");
        mSupportedMediaCodec.add("video/avc");
        mSupportedMediaCodec.add("video/hevc");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp8");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp9");
        mSupportedMediaCodec.add("video/av01");
        mSupportedMediaCodec.add("video/vvc");
        mSupportedMediaCodec.add("audio/mp4a-latm");
        mSupportedMediaCodec.add(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3);
        mSupportedMediaCodec.add(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3);
        mSupportedMediaCodec.add(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC);
        mSupportedMediaCodec.add(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC);
        mSupportedMediaCodec.add(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS);
        mAMediaCodecBlackListInstance.add("OMX.qti.audio.decoder.flac");
        mVMediaCodecBlackListModel.add("SM-J7008");
        mVMediaCodecBlackListModel.add("SM-J5008");
        mVMediaCodecBlackListModel.add("TCL i806");
        mVMediaCodecBlackListModel.add("NX511J");
        mVMediaCodecBlackListModel.add("vivo Y11i T");
        mVMediaCodecBlackListModel.add("长虹智能电视");
        mVMediaCodecBlackListModel.add("MI 1S");
        mVMediaCodecBlackListModel.add("SP9832A");
        mVMediaCodecBlackListModel.add("SP9830A");
        mVMediaCodecBlackListModel.add("VOTO GT17");
        mVMediaCodecBlackListModel.add("EVA-AL10");
        mHDRVividSupportVersionMap.put("TAS-AL00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-TL00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00P", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00m", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-TL00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AL00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-TN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-TN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN10", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100166, 99, 3));
        mHDRVividSupportVersionMap.put("BAL-AL60", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("CET-AL00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("DCO-AL00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("CET-AL60", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("MRX-AL09", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AL19", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W09", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W19", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AN19", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W29", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W39", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("OCE-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN10", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AL50", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN50", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-NX9", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN01", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AL00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOP-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN10", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL50", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL60", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N29", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N09", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550B", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550C", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550X", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550AX", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560B", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-570", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("PLAT-760", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200172, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350B", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350C", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350S", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360S", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370S", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-359", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-369", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-550", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-560", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-570", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-580", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("FREG-770", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-220", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SY", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250S", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SZ", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SY", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260S", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SZ", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-270", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200547, 99, 0));
        mHDRVividSupportVersionMap.put("SOKR-790A", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("VOLT-350S", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("SDY-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("HPB-AN00", new com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mWideVineBlackListModel.add("RVL-AL09");
        mWideVineBlackListModel.add("CLT-L29");
        mWideVineBlackListModel.add("ASUS_Z00AD");
        mWideVineBlackListModel.add(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
        mDrmL1BlackList.put(0, mWideVineBlackListModel);
        android.util.SparseArray<com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel> sparseArray = mVideoCodecIdToSwCapabilityModel;
        com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel.Builder builder = new com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel.Builder();
        com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName definitionName = com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName.DEFINITION_720P;
        sparseArray.put(193, builder.addVideoDecCap(0, definitionName, VVC_SHD_QUALCOMMN_CPU_NAME).addVideoDecCap(1, definitionName, VVC_SHD_MTK_CPU_NAME).addVideoDecCap(2, definitionName, VVC_SHD_HISI_CPU_NAME).addVideoDecCap(3, definitionName, VVC_SHD_SAMSUNG_CPU_NAME).build());
        mDefinitionNameToDecodeLevelTable.put(definitionName, 21);
        mIsFFmpegCapGot = false;
        mAVCSWMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mHEVCSWMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVP9SWMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mAVS3WMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mAV1SWMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVP8SWMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVVCSWMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mMaxVCodecHwCapabilityMap = new java.util.HashMap<>();
        mMaxVCodecSwCapabilityMap = new java.util.HashMap<>();
        mMaxACodecHwCapabilityMap = new java.util.HashMap<>();
        mMaxACodecSwCapabilityMap = new java.util.HashMap<>();
    }

    public static boolean addDRMLevel1Blacklist(int i17) {
        if (!mDrmL1BlackList.containsKey(java.lang.Integer.valueOf(i17))) {
            return true;
        }
        java.util.ArrayList<java.lang.String> arrayList = mDrmL1BlackList.get(java.lang.Integer.valueOf(i17));
        if (!arrayList.contains(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName())) {
            arrayList.add(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
        }
        mDrmL1BlackList.remove(java.lang.Integer.valueOf(i17));
        mDrmL1BlackList.put(java.lang.Integer.valueOf(i17), arrayList);
        return true;
    }

    public static boolean addHDRBlackList(int i17, java.lang.String str, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (!mHdrBlackMap.containsKey(java.lang.Integer.valueOf(i17))) {
            java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> hashMap = new java.util.HashMap<>();
            hashMap.put(str, tPHdrSupportVersionRange);
            mHdrBlackMap.put(java.lang.Integer.valueOf(i17), hashMap);
            return true;
        }
        java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> hashMap2 = mHdrBlackMap.get(java.lang.Integer.valueOf(i17));
        mHdrBlackMap.remove(java.lang.Integer.valueOf(i17));
        if (!hashMap2.containsKey(str)) {
            hashMap2.put(str, tPHdrSupportVersionRange);
        }
        hashMap2.remove(str);
        hashMap2.put(str, tPHdrSupportVersionRange);
        mHdrBlackMap.put(java.lang.Integer.valueOf(i17), hashMap2);
        return true;
    }

    private static void addHDRVersionRangeToWhiteList(int i17, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange>> hashMap) {
        java.util.ArrayList<com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> arrayList = hashMap.containsKey(java.lang.Integer.valueOf(i17)) ? hashMap.get(java.lang.Integer.valueOf(i17)) : new java.util.ArrayList<>();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (isTheSameVersionRange(tPHdrSupportVersionRange, arrayList.get(i18))) {
                return;
            }
        }
        arrayList.add(tPHdrSupportVersionRange);
        hashMap.put(java.lang.Integer.valueOf(i17), arrayList);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i17, int i18, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (i18 == 101) {
            addHDRVersionRangeToWhiteList(i17, tPHdrSupportVersionRange, mHDRTypeToHDRSoftwareCodecWhiteListMap);
        } else {
            if (i18 != 102) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "addHDRVideoDecoderTypeWhiteList, decoder not support.");
                return false;
            }
            addHDRVersionRangeToWhiteList(i17, tPHdrSupportVersionRange, mHDRTypeToHDRHardwareCodecWhiteListMap);
        }
        return true;
    }

    public static boolean addHDRWhiteList(int i17, java.lang.String str, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (!mHdrWhiteMap.containsKey(java.lang.Integer.valueOf(i17))) {
            java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> hashMap = new java.util.HashMap<>();
            hashMap.put(str, tPHdrSupportVersionRange);
            mHdrWhiteMap.put(java.lang.Integer.valueOf(i17), hashMap);
            return true;
        }
        java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> hashMap2 = mHdrWhiteMap.get(java.lang.Integer.valueOf(i17));
        mHdrWhiteMap.remove(java.lang.Integer.valueOf(i17));
        if (!hashMap2.containsKey(str)) {
            hashMap2.put(str, tPHdrSupportVersionRange);
        }
        hashMap2.remove(str);
        hashMap2.put(str, tPHdrSupportVersionRange);
        mHdrWhiteMap.put(java.lang.Integer.valueOf(i17), hashMap2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkHDRVividSupportByVersion(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.checkHDRVividSupportByVersion(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private static int convertDefinitionNameToDecodeLevel(com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName definitionName) {
        java.lang.Integer num = mDefinitionNameToDecodeLevelTable.get(definitionName);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static int convertDolbyVisionToOmxLevel(int i17) {
        int i18 = 1 << i17;
        if (i18 < 1 || i18 > 256) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel Unsupported level" + i17);
            return i17;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel dolbyVisionLevel:" + i17 + " omxLevel:" + i18);
        return i18;
    }

    public static int convertDolbyVisionToOmxProfile(int i17) {
        int i18 = 1 << i17;
        if (i17 < 1 || i17 > 512) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile Unsupported profile" + i17);
            return i17;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile dolbyVisionProfile:" + i17 + " omxProfile:" + i18);
        return i18;
    }

    public static synchronized java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> getACodecSWMaxCapabilityMap() {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getACodecSWMaxCapabilityMap func in");
            if (!mMaxACodecSwCapabilityMap.isEmpty()) {
                return mMaxACodecSwCapabilityMap;
            }
            try {
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, mAACMaxSupportedSamplerate, mAACMaxSupportedBitrate, mAACMaxSupportedChannels);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, mFLACMaxSupportedSamplerate, mFLACMaxSupportedBitrate, mFLACMaxSupportedChannels);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
                mMaxACodecSwCapabilityMap.put(5002, tPCodecMaxCapability);
                mMaxACodecSwCapabilityMap.put(5012, tPCodecMaxCapability2);
                mMaxACodecSwCapabilityMap.put(5003, tPCodecMaxCapability3);
                mMaxACodecSwCapabilityMap.put(5040, tPCodecMaxCapability4);
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getACodecSWMaxCapabilityMap success.");
                return mMaxACodecSwCapabilityMap;
            } catch (java.lang.Exception unused) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getACodecSWMaxCapabilityMap exception");
                return null;
            }
        }
    }

    public static synchronized java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> getAMediaCodecMaxCapabilityMap() {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getAMediaCodecMaxCapabilityMap func in");
            if (!mMaxACodecHwCapabilityMap.isEmpty()) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "return memory stored audio max cap map");
                return mMaxACodecHwCapabilityMap;
            }
            try {
                for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                    java.lang.String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                    if (tPMediaDecoderInfo.isAudio() && isSupportedMediaCodec(decoderMimeType) && !isInMediaCodecBlackList(decoderMimeType) && !isAMediaCodecBlackListInstance(tPMediaDecoderInfo.getDecoderName())) {
                        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "Audio MimeType: " + decoderMimeType + " codecName: " + tPMediaDecoderInfo.getDecoderName());
                        com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                        com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(maxProfileLevel.profile, maxProfileLevel.level, tPMediaDecoderInfo.getMaxAudioSampleRate(), tPMediaDecoderInfo.getMaxAudioBitRate(), tPMediaDecoderInfo.getMaxAudioChannels());
                        if (!mMaxACodecHwCapabilityMap.containsKey(java.lang.Integer.valueOf(getSupportedCodecId(decoderMimeType)))) {
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "audio codecName: " + tPMediaDecoderInfo.getDecoderName() + " maxSamplerate: " + tPMediaDecoderInfo.getMaxAudioSampleRate() + " maxChannels: " + tPMediaDecoderInfo.getMaxAudioChannels());
                            replace(java.lang.Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                            replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                            mAMediaCodecCapList.add(decoderMimeType);
                        } else if (tPMediaDecoderInfo.getMaxAudioSampleRate() > mMaxACodecHwCapabilityMap.get(java.lang.Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxSampleRate || android.text.TextUtils.equals(decoderMimeType, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC)) {
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "audio codecName: " + tPMediaDecoderInfo.getDecoderName() + " maxSamplerate: " + tPMediaDecoderInfo.getMaxAudioSampleRate() + " maxChannels: " + tPMediaDecoderInfo.getMaxAudioChannels());
                            replace(java.lang.Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                            replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getAMediaCodecMaxCapabilityMap failed:" + e17.getMessage());
            }
            return mMaxACodecHwCapabilityMap;
        }
    }

    public static int getAV1SWDecodeLevel() {
        return getDecodeLevelByCoresAndFreq();
    }

    public static boolean getAudioMediaCodecPassThroughCap(int i17, int i18, int i19) {
        if (i17 != 5004) {
            return false;
        }
        return com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.isAudioPassThroughSupport(i18 == 20 ? 7 : (i18 == 50 || i18 == 60) ? 8 : 1, i19);
    }

    public static int getAvs3SWDecodeLevel() {
        java.lang.String cpuHarewareName = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "[getAvs3SWDecodeLevel], mCpuHWProducter = " + cpuHWProducter + ", getMaxCpuFreq() = " + com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq() + ", numCores = " + com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores() + ", mCpuHWProductIdx=" + cpuHWProductIndex + ", hardware=" + cpuHarewareName);
        int i17 = mAvs3DeviceLevel;
        if (-1 != i17) {
            return i17;
        }
        mAvs3DeviceLevel = 0;
        if (-1 == cpuHWProducter) {
            mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
        } else if (cpuHWProducter != 0) {
            if (cpuHWProducter == 1) {
                mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
            } else if (cpuHWProducter != 2) {
                if (cpuHWProducter == 3) {
                    mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
                }
            } else if (cpuHWProductIndex >= mFhdAvs3HisiIndex) {
                mAvs3DeviceLevel = 26;
            } else {
                mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
            }
        } else if (cpuHWProductIndex >= mFhdAvs3QualcommIndex) {
            mAvs3DeviceLevel = 26;
        } else if (cpuHWProductIndex >= mShdAvs3QualcommIndex) {
            mAvs3DeviceLevel = 21;
        } else {
            mAvs3DeviceLevel = getDecodeLevelByCoresAndFreq();
        }
        return mAvs3DeviceLevel;
    }

    private static int getDecodeLevelByCoresAndFreq() {
        if (com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores() >= 8) {
            if (com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq() / 1000 >= 1200) {
                return 21;
            }
        } else if (com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores() >= 6) {
            if (com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq() / 1000 >= 1400) {
                return 21;
            }
        } else {
            if (com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores() < 4) {
                return 6;
            }
            if (com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq() / 1000 >= 1600) {
                return 21;
            }
        }
        return 16;
    }

    public static synchronized void getDecoderMaxCapabilityMapAsync() {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            if (mIsInitDone) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "decoder capability already init,return directly!");
                return;
            }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "decoder capability not init,acquire async with create thread!");
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.common.TPCodecUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.thumbplayer.core.common.TPCodecUtils.getVMediaCodecMaxCapabilityMap();
                    com.tencent.thumbplayer.core.common.TPCodecUtils.getAMediaCodecMaxCapabilityMap();
                    com.tencent.thumbplayer.core.common.TPCodecUtils.getVCodecSWMaxCapabilityMap();
                    com.tencent.thumbplayer.core.common.TPCodecUtils.getACodecSWMaxCapabilityMap();
                    boolean unused = com.tencent.thumbplayer.core.common.TPCodecUtils.mIsInitDone = true;
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPCodecUtils.TAG, "new thread getDecoderMaxCapabilityMap done");
                }
            });
            thread.setName("TP_codec_init_thread");
            thread.start();
        }
    }

    public static java.lang.String getDecoderName(java.lang.String str, boolean z17) {
        if (str.contains("audio")) {
            if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3) && mAudioMaxCapCodecInstance.containsKey(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC)) {
                return mAudioMaxCapCodecInstance.get(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC);
            }
            if (mAudioMaxCapCodecInstance.containsKey(str)) {
                return mAudioMaxCapCodecInstance.get(str);
            }
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            if (android.text.TextUtils.equals(str, tPMediaDecoderInfo.getDecoderMimeType()) && tPMediaDecoderInfo.isSecureDecoder() == z17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getDecoderName:" + tPMediaDecoderInfo.getDecoderName());
                arrayList.add(tPMediaDecoderInfo);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo2 = (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo) it.next();
            if ((tPMediaDecoderInfo2.isVideo() && tPMediaDecoderInfo2.isVideoSofwareDecoder() == mPreferredSoftwareComponent) || (tPMediaDecoderInfo2.isAudio() && tPMediaDecoderInfo2.isAudioSofwareDecoder() == mPreferredSoftwareComponent)) {
                return tPMediaDecoderInfo2.getDecoderName();
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((com.tencent.thumbplayer.core.common.TPMediaDecoderInfo) arrayList.get(0)).getDecoderName();
    }

    public static java.lang.String getDecoderNameWithoutCache(java.lang.String str, boolean z17) {
        if (!str.contains("audio")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(null)) {
                if (android.text.TextUtils.equals(str, tPMediaDecoderInfo.getDecoderMimeType()) && tPMediaDecoderInfo.isSecureDecoder() == z17) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getDecoderName:" + tPMediaDecoderInfo.getDecoderName());
                    arrayList.add(tPMediaDecoderInfo);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo2 = (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo) it.next();
                if ((tPMediaDecoderInfo2.isVideo() && tPMediaDecoderInfo2.isVideoSofwareDecoder() == mPreferredSoftwareComponent) || (tPMediaDecoderInfo2.isAudio() && tPMediaDecoderInfo2.isAudioSofwareDecoder() == mPreferredSoftwareComponent)) {
                    return tPMediaDecoderInfo2.getDecoderName();
                }
            }
            if (!arrayList.isEmpty()) {
                return ((com.tencent.thumbplayer.core.common.TPMediaDecoderInfo) arrayList.get(0)).getDecoderName();
            }
        } else {
            if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3) && mAudioMaxCapCodecInstance.containsKey(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC)) {
                return mAudioMaxCapCodecInstance.get(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC);
            }
            if (mAudioMaxCapCodecInstance.containsKey(str)) {
                return mAudioMaxCapCodecInstance.get(str);
            }
        }
        return null;
    }

    public static java.lang.String getDisplayVersion() {
        if (!android.text.TextUtils.equals(android.os.Build.BRAND, "HUAWEI") && !android.text.TextUtils.equals(android.os.Build.MANUFACTURER, "HONOR")) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, "ro.build.display.id");
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "get huawei display version failed:" + e17.getMessage());
            return null;
        }
    }

    public static java.lang.String getDolbyVisionDecoderName(java.lang.String str, int i17, int i18, boolean z17) {
        if (!android.text.TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        int convertDolbyVisionToOmxProfile = convertDolbyVisionToOmxProfile(i17);
        for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel[] profileLevels = tPMediaDecoderInfo.getProfileLevels();
            if (android.text.TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), str)) {
                for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : profileLevels) {
                    if (decoderProfileLevel.profile == convertDolbyVisionToOmxProfile) {
                        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getDolbyVisionDecoderName  profile:" + decoderProfileLevel.profile + " dvProfile:" + i17 + " bSecure:" + z17 + " name:" + tPMediaDecoderInfo.getDecoderName());
                        if (tPMediaDecoderInfo.isSecureDecoder() == z17) {
                            return tPMediaDecoderInfo.getDecoderName();
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getHevcSWDecodeLevel() {
        java.lang.String cpuHarewareName = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "[getHevcSWDecodeLevel], mCpuHWProducter = " + cpuHWProducter + ", getMaxCpuFreq() = " + com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq() + ", numCores = " + com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores() + ", mCpuHWProductIdx=" + cpuHWProductIndex + ", hardware=" + cpuHarewareName);
        int i17 = mHevcDeviceLevel;
        if (-1 != i17) {
            return i17;
        }
        mHevcDeviceLevel = 0;
        if (-1 == cpuHWProducter) {
            mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
        } else if (cpuHWProducter != 0) {
            if (cpuHWProducter != 1) {
                if (cpuHWProducter != 2) {
                    if (cpuHWProducter == 3) {
                        if (cpuHWProductIndex >= mShdHevcSamsungIndex) {
                            mHevcDeviceLevel = 21;
                        } else if (cpuHWProductIndex >= mHdHevcSamsungIndex) {
                            mHevcDeviceLevel = 16;
                        } else {
                            mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
                        }
                    }
                } else if (cpuHWProductIndex >= mShdHevcHisiIndex) {
                    mHevcDeviceLevel = 21;
                } else if (cpuHWProductIndex >= mHdHevcHisiIndex) {
                    mHevcDeviceLevel = 16;
                } else {
                    mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
                }
            } else if (cpuHWProductIndex >= mShdHevcMtkIndex) {
                mHevcDeviceLevel = 21;
            } else if (cpuHWProductIndex >= mHdHevcMtkIndex) {
                mHevcDeviceLevel = 16;
            } else {
                mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
            }
        } else if (cpuHWProductIndex >= mShdHevcQualcommIndex) {
            mHevcDeviceLevel = 21;
        } else if (cpuHWProductIndex >= mHdHevcQualcommIndex) {
            mHevcDeviceLevel = 16;
        } else {
            mHevcDeviceLevel = getDecodeLevelByCoresAndFreq();
        }
        return mHevcDeviceLevel;
    }

    public static int getMaxLumaSample(java.lang.String str, int i17) {
        if (android.text.TextUtils.equals(str, "video/avc")) {
            return com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.getAVCMaxLumaSample(i17);
        }
        if (android.text.TextUtils.equals(str, "video/hevc")) {
            return com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.getHEVCMaxLumaSample(i17);
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.getVP8MaxLumaSample(i17);
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.getVP9MaxLumaSample(i17);
        }
        if (android.text.TextUtils.equals(str, "video/av01")) {
            return com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.getAV1MaxLumaSample(i17);
        }
        if (android.text.TextUtils.equals(str, "video/vvc")) {
            for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (tPMediaDecoderInfo.getDecoderMimeType().equalsIgnoreCase("video/vvc")) {
                    return tPMediaDecoderInfo.getDecoderMaxWidth() * tPMediaDecoderInfo.getDecoderMaxHeight();
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r10 = r4.getDecoderMaxWidth();
        r1 = r4.getDecoderMaxHeight();
        r2 = r4.getDecoderLumaWidth();
        r11 = r4.getDecoderLumaHeight();
        r12 = r4.getDecoderMaxFrameRateForMaxLuma();
        r13 = r4.getDecoderMaxFrameRate();
        isLimitMaxWidthOrMaxHeight(r10, r1, r2, r11, r16, r17);
        r9 = java.lang.Integer.valueOf((int) java.lang.Math.min(r13, java.lang.Math.max(1.0f, (((r10 * r11) * 1.0f) / java.lang.Math.max((r16 * r17) * 1.0f, 1.0f)) * r12)));
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPCodecUtils.TAG, "getSupportedFrameRatesFor codecID:" + r15 + " max width:" + r10 + " max height:" + r11 + " max framerate for max resolution:" + r12 + " current width:" + r16 + " height:" + r17 + " max support framerate:" + r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int getMaxSupportedFrameRatesFor(int r14, int r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.getMaxSupportedFrameRatesFor(int, int, int, int):int");
    }

    private static int getSoftMaxSamples(int i17) {
        if (i17 == 1) {
            return 129600;
        }
        if (i17 == 6) {
            return 307200;
        }
        if (i17 == 11) {
            return 407040;
        }
        if (i17 == 16) {
            return 480000;
        }
        if (i17 == 21) {
            return com.tencent.tmassistantsdk.downloadservice.Downloads.SPLIT_RANGE_SIZE_NET;
        }
        if (i17 == 26) {
            return 2073600;
        }
        if (i17 != 28) {
            return i17 != 33 ? 0 : 8847360;
        }
        return 8294400;
    }

    private static int getSupportedCodecId(java.lang.String str) {
        if (android.text.TextUtils.equals(str, "video/avc")) {
            return 26;
        }
        if (android.text.TextUtils.equals(str, "video/hevc")) {
            return 172;
        }
        if (android.text.TextUtils.equals(str, "video/vvc")) {
            return 193;
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return 138;
        }
        if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return 166;
        }
        if (android.text.TextUtils.equals(str, "video/av01")) {
            return 1029;
        }
        if (android.text.TextUtils.equals(str, "audio/mp4a-latm")) {
            return 5002;
        }
        if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3)) {
            return 5003;
        }
        if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3) || android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC)) {
            return 5040;
        }
        if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC)) {
            return 5012;
        }
        return android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS) ? 5004 : -1;
    }

    private static java.lang.String getSupportedHWMimeType(int i17) {
        return i17 != 26 ? i17 != 138 ? i17 != 166 ? i17 != 172 ? i17 != 193 ? i17 != 1029 ? "" : "video/av01" : "video/vvc" : "video/hevc" : "video/x-vnd.on2.vp9" : "video/x-vnd.on2.vp8" : "video/avc";
    }

    public static java.lang.String getSystemPatchVersion() {
        if (!android.text.TextUtils.equals(android.os.Build.BRAND, "HUAWEI")) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            return (java.lang.String) cls.getDeclaredMethod("get", java.lang.String.class).invoke(cls, "hwouc.hwpatch.version");
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "get huawei system patch version failed:" + e17.getMessage());
            return null;
        }
    }

    public static synchronized java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> getVCodecSWMaxCapabilityMap() {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getVCodecSWMaxCapabilityMap func in");
            if (mIsFFmpegCapGot) {
                return mMaxVCodecSwCapabilityMap;
            }
            try {
                int hevcSWDecodeLevel = getHevcSWDecodeLevel();
                int softMaxSamples = getSoftMaxSamples(hevcSWDecodeLevel);
                int avs3SWDecodeLevel = getAvs3SWDecodeLevel();
                int aV1SWDecodeLevel = getAV1SWDecodeLevel();
                int vvcSWDecodeLevel = getVvcSWDecodeLevel();
                int softMaxSamples2 = getSoftMaxSamples(avs3SWDecodeLevel);
                int softMaxSamples3 = getSoftMaxSamples(aV1SWDecodeLevel);
                int softMaxSamples4 = getSoftMaxSamples(vvcSWDecodeLevel);
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap, hevcDecodeLevel:" + hevcSWDecodeLevel + ", avs3DecodeLevel:" + avs3SWDecodeLevel + ", AV1DecodeLevel:" + aV1SWDecodeLevel + ", vvcDecodeLevel:" + vvcSWDecodeLevel);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = mAVCSWMaxCapability;
                tPCodecMaxCapability.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability.maxProfile = 64;
                tPCodecMaxCapability.maxLevel = 65536;
                mMaxVCodecSwCapabilityMap.put(26, mAVCSWMaxCapability);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = mHEVCSWMaxCapability;
                tPCodecMaxCapability2.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability2.maxProfile = 2;
                tPCodecMaxCapability2.maxLevel = com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62;
                mMaxVCodecSwCapabilityMap.put(172, mHEVCSWMaxCapability);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = mVP9SWMaxCapability;
                tPCodecMaxCapability3.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability3.maxProfile = 8;
                tPCodecMaxCapability3.maxLevel = 8192;
                mMaxVCodecSwCapabilityMap.put(166, mVP9SWMaxCapability);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = mVP8SWMaxCapability;
                tPCodecMaxCapability4.maxLumaSamples = softMaxSamples;
                tPCodecMaxCapability4.maxProfile = 1;
                tPCodecMaxCapability4.maxLevel = 8;
                mMaxVCodecSwCapabilityMap.put(138, mVP8SWMaxCapability);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability5 = mAVS3WMaxCapability;
                tPCodecMaxCapability5.maxLumaSamples = softMaxSamples2;
                tPCodecMaxCapability5.maxProfile = 0;
                tPCodecMaxCapability5.maxLevel = 0;
                mMaxVCodecSwCapabilityMap.put(192, mAVS3WMaxCapability);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability6 = mAV1SWMaxCapability;
                tPCodecMaxCapability6.maxLumaSamples = softMaxSamples3;
                tPCodecMaxCapability6.maxProfile = 0;
                tPCodecMaxCapability6.maxLevel = 0;
                mMaxVCodecSwCapabilityMap.put(1029, mAV1SWMaxCapability);
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability7 = mVVCSWMaxCapability;
                tPCodecMaxCapability7.maxLumaSamples = softMaxSamples4;
                tPCodecMaxCapability7.maxProfile = 0;
                tPCodecMaxCapability7.maxLevel = 0;
                mMaxVCodecSwCapabilityMap.put(193, mVVCSWMaxCapability);
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap success, maxHevcLumaSamples:" + softMaxSamples + ", maxAvs3LumaSamples:" + softMaxSamples2 + ", maxAV1LumaSamples:" + softMaxSamples3 + ", maxVvcLumaSamples:" + softMaxSamples4);
                mIsFFmpegCapGot = true;
                return mMaxVCodecSwCapabilityMap;
            } catch (java.lang.Exception unused) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getVCodecSWMaxCapabilityMap exception");
                return null;
            }
        }
    }

    public static synchronized java.util.HashMap<java.lang.Integer, com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability> getVMediaCodecMaxCapabilityMap() {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getVMediaCodecMaxCapabilityMap func in");
            if (!mMaxVCodecHwCapabilityMap.isEmpty()) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "return memory stored video max cap map");
                return mMaxVCodecHwCapabilityMap;
            }
            try {
                for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                    java.lang.String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                    if (tPMediaDecoderInfo.isVideo()) {
                        mVMediaCodecCapList.add(decoderMimeType);
                        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "Video MimeType: " + decoderMimeType + " codecName: " + tPMediaDecoderInfo.getDecoderName());
                        if (isSupportedMediaCodec(decoderMimeType) && !tPMediaDecoderInfo.isSecureDecoder()) {
                            com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                            com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new com.tencent.thumbplayer.core.common.TPCodecCapability.TPCodecMaxCapability(getMaxLumaSample(decoderMimeType, maxProfileLevel.level), maxProfileLevel.profile, maxProfileLevel.level, (int) tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma());
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "video codecName: " + tPMediaDecoderInfo.getDecoderName() + " lumasample: " + getMaxLumaSample(decoderMimeType, maxProfileLevel.level) + " framerate: " + tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma());
                            if (!mMaxVCodecHwCapabilityMap.containsKey(java.lang.Integer.valueOf(getSupportedCodecId(decoderMimeType))) || maxProfileLevel.level > mMaxVCodecHwCapabilityMap.get(java.lang.Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxLevel) {
                                replace(java.lang.Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxVCodecHwCapabilityMap);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getVMediaCodecMaxCapabilityMap failed:" + android.util.Log.getStackTraceString(e17));
            }
            return mMaxVCodecHwCapabilityMap;
        }
    }

    private static int getValueFromSubstring(java.lang.String str, int i17, int i18) {
        if (i17 < 0) {
            i17 = 0;
        }
        if (i18 >= str.length()) {
            i18 = str.length() - 1;
        }
        if (i17 > i18) {
            i17 = i18;
        }
        return java.lang.Integer.parseInt(str.substring(i17, i18));
    }

    private static int getVvcSWDecodeLevel() {
        int i17 = mVvcDeviceLevel;
        if (i17 != -1) {
            return i17;
        }
        java.lang.String cpuHarewareName = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "[getVvcSWDecodeLevel], mCpuHWProducer = " + cpuHWProducter + ", getMaxCpuFreq() = " + com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq() + ", numCores = " + com.tencent.thumbplayer.core.common.TPSystemInfo.getNumCores() + ", mCpuHWProductIdx = " + cpuHWProductIndex + ", hardware = " + cpuHarewareName);
        if (cpuHWProducter == -1) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "current cpu manufacturer is not listed in the performance list, cpuHwProducer:" + cpuHWProducter);
            mVvcDeviceLevel = 0;
            return 0;
        }
        if (cpuHWProductIndex != -1) {
            int selectBestDecodeLevelFromCapabilityTable = selectBestDecodeLevelFromCapabilityTable(193, cpuHWProducter, cpuHWProductIndex);
            int i18 = selectBestDecodeLevelFromCapabilityTable != -1 ? selectBestDecodeLevelFromCapabilityTable : 0;
            mVvcDeviceLevel = i18;
            return i18;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "current cpu model is not listed in the performance list, cpuHwProductIdx:" + cpuHWProductIndex);
        mVvcDeviceLevel = 0;
        return 0;
    }

    public static synchronized void init(android.content.Context context, boolean z17) {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "is local cache enabled:" + z17);
            android.content.Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (z17) {
                mLocalCache = com.tencent.thumbplayer.core.thirdparties.LocalCache.get(applicationContext);
            }
            getDecoderMaxCapabilityMapAsync();
        }
    }

    public static boolean isAMediaCodecBlackListInstance(java.lang.String str) {
        return mAMediaCodecBlackListInstance.contains(str);
    }

    public static boolean isAMediaCodecBlackListModel() {
        return mAMediaCodecBlackListModel.contains(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
    }

    public static boolean isBlackListType(java.lang.String str) {
        return java.util.Arrays.asList("PRO 7 Plus", "PRO 7-H", "PRO+7+Plus").contains(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) && android.text.TextUtils.equals(str, "video/hevc");
    }

    private static synchronized boolean isHDR10Support(int i17) {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (android.text.TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/hevc")) {
                    for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                        if (decoderProfileLevel.profile == i17) {
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "support hdr10 " + i17);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    private static synchronized boolean isHDRDVSupport(int i17, int i18) {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            if (i17 == 0 && i18 == 0) {
                return mVMediaCodecCapList.contains("video/dolby-vision");
            }
            for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo : com.tencent.thumbplayer.core.common.TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (android.text.TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/dolby-vision")) {
                    for (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                        if (decoderProfileLevel.profile == i17 && decoderProfileLevel.level == i18) {
                            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "support dolbyvision");
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static boolean isHDRDecoderTypeSupport(int i17, int i18) {
        if (i18 != 102 && i18 != 101) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "isHDRDecodeTypeSupport, not support decoderType, decoderType = " + i18);
            return false;
        }
        java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange>> hashMap = i18 == 102 ? mHDRTypeToHDRHardwareCodecWhiteListMap : mHDRTypeToHDRSoftwareCodecWhiteListMap;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return isInHDRVersionRangeWhiteList(hashMap.get(java.lang.Integer.valueOf(i17)));
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "isHDRDecodeTypeSupport, not config hdrType whiteList, hdrType = " + i17);
        return false;
    }

    public static boolean isHDRsupport(int i17, int i18, int i19) {
        if (i17 == 2) {
            return isHDRDVSupport(i18, i19);
        }
        if (i17 == 0) {
            return isHDR10Support(4096);
        }
        if (i17 == 1) {
            return isHDR10Support(8192);
        }
        if (i17 != 4) {
            return false;
        }
        java.lang.String displayVersion = getDisplayVersion();
        java.lang.String systemPatchVersion = getSystemPatchVersion();
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):display version:" + displayVersion);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):patch version:" + systemPatchVersion);
        return checkHDRVividSupportByVersion(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName(), displayVersion, systemPatchVersion);
    }

    public static boolean isInDRMLevel1Blacklist(int i17) {
        if (mDrmL1BlackList.containsKey(java.lang.Integer.valueOf(i17))) {
            return mDrmL1BlackList.get(java.lang.Integer.valueOf(i17)).contains(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
        }
        return false;
    }

    private static boolean isInHDRVersionRangeWhiteList(java.util.ArrayList<com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> arrayList) {
        if (arrayList == null) {
            return false;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = arrayList.get(i17);
            int i18 = android.os.Build.VERSION.SDK_INT;
            if (i18 <= tPHdrSupportVersionRange.upperboundAndroidAPILevel && i18 >= tPHdrSupportVersionRange.lowerboundAndroidAPILevel) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "inHDRVersionRangeWhiteList!");
                return true;
            }
        }
        return false;
    }

    public static boolean isInHDRVividBlackList(java.lang.String str, int i17, int i18) {
        if (mHdrBlackMap.containsKey(4)) {
            java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> hashMap = mHdrBlackMap.get(4);
            if (hashMap.containsKey(str)) {
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = hashMap.get(str);
                if (i17 <= tPHdrSupportVersionRange.upperboundSystemVersion && i17 >= tPHdrSupportVersionRange.lowerboundSystemVersion && i18 <= tPHdrSupportVersionRange.upperboundPatchVersion && i18 >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isInHDRVividWhiteList(java.lang.String str, int i17, int i18) {
        if (mHdrWhiteMap.containsKey(4)) {
            java.util.HashMap<java.lang.String, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange> hashMap = mHdrWhiteMap.get(4);
            if (hashMap.containsKey(str)) {
                com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = hashMap.get(str);
                if (i17 <= tPHdrSupportVersionRange.upperboundSystemVersion && i17 >= tPHdrSupportVersionRange.lowerboundSystemVersion && i18 <= tPHdrSupportVersionRange.upperboundPatchVersion && i18 >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isInMediaCodecBlackList(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap;
        java.lang.String deviceName = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName();
        if (android.text.TextUtils.isEmpty(deviceName) || (hashMap = mCodecCapBlackList) == null || !hashMap.containsKey(deviceName)) {
            return false;
        }
        java.lang.Integer num = mCodecCapBlackList.get(deviceName);
        if (android.text.TextUtils.equals(str, "video/avc")) {
            if ((num.intValue() & 1) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/hevc")) {
            if ((num.intValue() & 2) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            if ((num.intValue() & 256) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            if ((num.intValue() & 4) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "audio/mp4a-latm")) {
            if ((num.intValue() & 8) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3)) {
            if ((num.intValue() & 16) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3)) {
            if ((num.intValue() & 32) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC)) {
            if ((num.intValue() & 64) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS)) {
            if ((num.intValue() & 128) == 0) {
                return false;
            }
        } else if (!android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC) || (num.intValue() & 32) == 0) {
            return false;
        }
        return true;
    }

    public static boolean isInMediaCodecWhiteList(java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Integer> hashMap;
        java.lang.String deviceName = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName();
        if (android.text.TextUtils.isEmpty(deviceName) || (hashMap = mCodecCapWhiteList) == null || !hashMap.containsKey(deviceName)) {
            return false;
        }
        java.lang.Integer num = mCodecCapWhiteList.get(deviceName);
        if (android.text.TextUtils.equals(str, "video/avc")) {
            if ((num.intValue() & 1) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/hevc")) {
            if ((num.intValue() & 2) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            if ((num.intValue() & 256) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            if ((num.intValue() & 4) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, "audio/mp4a-latm")) {
            if ((num.intValue() & 8) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3)) {
            if ((num.intValue() & 16) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3)) {
            if ((num.intValue() & 32) == 0) {
                return false;
            }
        } else if (android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC)) {
            if ((num.intValue() & 64) == 0) {
                return false;
            }
        } else if (!android.text.TextUtils.equals(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS) || (num.intValue() & 128) == 0) {
            return false;
        }
        return true;
    }

    private static boolean isLimitMaxWidthOrMaxHeight(int i17, int i18, int i19, int i27, int i28, int i29) {
        if ((i28 <= i29 || (i28 <= i17 && i29 <= i27)) && (i28 >= i29 || (i28 <= i19 && i29 <= i18))) {
            return false;
        }
        int i37 = i28 > i29 ? i27 * i17 : i19 * i18;
        if (i17 < i28 || i18 < i29 || i37 < i28 * i29) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getSupportedFrameRatesFor width:" + i28 + " height:" + i29 + " do not support! maxWidth:" + i17 + " maxHeight:" + i18);
            return true;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "getSupportedFrameRatesFor width:" + i28 + " height:" + i29 + " limit maxLumaWidth or maxLumaHeight, but not limit maxLumaSamples, do support! maxWidth:" + i17 + " maxHeight:" + i18 + " maxLumaSamples:" + i37);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (com.tencent.thumbplayer.core.common.TPCodecUtils.mAMediaCodecCapList.contains(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3_JOC) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean isMediaCodecDDPlusSupported() {
        /*
            java.lang.Class<com.tencent.thumbplayer.core.common.TPCodecUtils> r0 = com.tencent.thumbplayer.core.common.TPCodecUtils.class
            monitor-enter(r0)
            boolean r1 = isAMediaCodecBlackListModel()     // Catch: java.lang.Throwable -> L23
            r2 = 0
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return r2
        Lc:
            java.util.ArrayList<java.lang.String> r1 = com.tencent.thumbplayer.core.common.TPCodecUtils.mAMediaCodecCapList     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "audio/eac3"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L20
            java.util.ArrayList<java.lang.String> r1 = com.tencent.thumbplayer.core.common.TPCodecUtils.mAMediaCodecCapList     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "audio/eac3-joc"
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L21
        L20:
            r2 = 1
        L21:
            monitor-exit(r0)
            return r2
        L23:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPCodecUtils.isMediaCodecDDPlusSupported():boolean");
    }

    public static synchronized boolean isMediaCodecDolbyDSSupported() {
        synchronized (com.tencent.thumbplayer.core.common.TPCodecUtils.class) {
            if (isAMediaCodecBlackListModel()) {
                return false;
            }
            return mAMediaCodecCapList.contains(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3);
        }
    }

    private static boolean isSupportedMediaCodec(java.lang.String str) {
        return mSupportedMediaCodec.contains(str);
    }

    private static boolean isTheSameVersionRange(com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, com.tencent.thumbplayer.core.common.TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange2) {
        return tPHdrSupportVersionRange.lowerboundPatchVersion == tPHdrSupportVersionRange2.lowerboundPatchVersion && tPHdrSupportVersionRange.lowerboundSystemVersion == tPHdrSupportVersionRange2.lowerboundSystemVersion && tPHdrSupportVersionRange.upperboundPatchVersion == tPHdrSupportVersionRange2.upperboundPatchVersion && tPHdrSupportVersionRange.upperboundSystemVersion == tPHdrSupportVersionRange2.upperboundSystemVersion;
    }

    public static boolean isVMediaCodecBlackListModel() {
        return mVMediaCodecBlackListModel.contains(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
    }

    private static <K, T> void replace(K k17, T t17, java.util.HashMap<K, T> hashMap) {
        if (!hashMap.containsKey(k17)) {
            hashMap.put(k17, t17);
        } else {
            hashMap.remove(k17);
            hashMap.put(k17, t17);
        }
    }

    private static int selectBestDecodeLevelFromCapabilityTable(int i17, int i18, int i19) {
        com.tencent.thumbplayer.core.common.TPCodecUtils.VideoSwCapabilityModel videoSwCapabilityModel = mVideoCodecIdToSwCapabilityModel.get(i17);
        if (videoSwCapabilityModel == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "No corresponding codec id found, codecId:" + i17);
            return -1;
        }
        java.util.HashMap<com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName, java.lang.String> hashMap = videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable.get(i18);
        if (hashMap == null || hashMap.isEmpty()) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, TAG, "No corresponding cpu producer found, cpuHwProducer:" + i18);
            return -1;
        }
        for (com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName definitionName : com.tencent.thumbplayer.core.common.TPCodecUtils.DefinitionName.values()) {
            java.lang.String str = hashMap.get(definitionName);
            if (!android.text.TextUtils.isEmpty(str) && i19 >= com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuHWProductIndex(i18, str)) {
                return convertDefinitionNameToDecodeLevel(definitionName);
            }
        }
        return -1;
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z17) {
        mPreferredSoftwareComponent = z17;
    }
}
