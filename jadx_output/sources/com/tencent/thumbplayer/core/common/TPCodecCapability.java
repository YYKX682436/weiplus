package com.tencent.thumbplayer.core.common;

/* loaded from: classes14.dex */
public interface TPCodecCapability {
    public static final int DEFAULT_FRAMERATE = 30;
    public static final int DEFAULT_INVALID_PARAMETER = -1;

    /* loaded from: classes14.dex */
    public static class TPACodecPropertyRange implements java.io.Serializable {
        public int level;
        public int lowerboundBitRate;
        public int lowerboundChannels;
        public int lowerboundSampleRate;
        public int profile;
        public int upperboundBitRate;
        public int upperboundChannels;
        public int upperboundSampleRate;

        public void set(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
            this.upperboundSampleRate = i17;
            this.upperboundChannels = i18;
            this.upperboundBitRate = i19;
            this.lowerboundSampleRate = i27;
            this.lowerboundChannels = i28;
            this.lowerboundBitRate = i29;
            this.profile = i37;
            this.level = i38;
        }
    }

    /* loaded from: classes14.dex */
    public static class TPVCodecPropertyRange implements java.io.Serializable {
        public int level;
        public int lowerboundHeight;
        public int lowerboundWidth;
        public int profile;
        public int upperboundHeight;
        public int upperboundWidth;

        public void set(int i17, int i18, int i19, int i27, int i28, int i29) {
            this.upperboundWidth = i17;
            this.upperboundHeight = i18;
            this.lowerboundWidth = i19;
            this.lowerboundHeight = i27;
            this.profile = i28;
            this.level = i29;
        }
    }

    /* loaded from: classes14.dex */
    public static class TPHdrSupportVersionRange implements java.io.Serializable {
        public int lowerboundAndroidAPILevel;
        public int lowerboundPatchVersion;
        public int lowerboundSystemVersion;
        public int upperboundAndroidAPILevel;
        public int upperboundPatchVersion;
        public int upperboundSystemVersion;

        public TPHdrSupportVersionRange(int i17, int i18, int i19, int i27) {
            this.upperboundSystemVersion = i17;
            this.lowerboundSystemVersion = i18;
            this.upperboundPatchVersion = i19;
            this.lowerboundPatchVersion = i27;
        }

        public TPHdrSupportVersionRange(int i17, int i18) {
            this.upperboundAndroidAPILevel = i17;
            this.lowerboundAndroidAPILevel = i18;
        }
    }

    /* loaded from: classes14.dex */
    public static class TPCodecMaxCapability implements java.io.Serializable {
        public int maxBitRate;
        public int maxChannels;
        public int maxFramerateFormaxLumaSamples;
        public int maxLevel;
        public int maxLumaSamples;
        public int maxProfile;
        public int maxSampleRate;

        @java.lang.Deprecated
        public TPCodecMaxCapability(int i17, int i18, int i19) {
            this.maxLumaSamples = i17;
            this.maxProfile = i18;
            this.maxLevel = i19;
            this.maxFramerateFormaxLumaSamples = 30;
            this.maxBitRate = -1;
            this.maxSampleRate = -1;
            this.maxChannels = -1;
        }

        public TPCodecMaxCapability(int i17, int i18, int i19, int i27) {
            this.maxLumaSamples = i17;
            this.maxProfile = i18;
            this.maxLevel = i19;
            this.maxFramerateFormaxLumaSamples = i27;
            this.maxBitRate = -1;
            this.maxSampleRate = -1;
            this.maxChannels = -1;
        }

        public TPCodecMaxCapability(int i17, int i18, int i19, int i27, int i28) {
            this.maxProfile = i17;
            this.maxLevel = i18;
            this.maxBitRate = i27;
            this.maxSampleRate = i19;
            this.maxChannels = i28;
            this.maxLumaSamples = -1;
            this.maxFramerateFormaxLumaSamples = -1;
        }
    }
}
