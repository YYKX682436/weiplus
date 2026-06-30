package com.tencent.thumbplayer.core.richmedia;

/* loaded from: classes16.dex */
public class TPNativeRichMediaFeatureData {
    private java.lang.String mEnv;
    private com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent[] mFeatureContents = new com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent[0];
    private java.lang.String mFeatureType;
    private java.lang.String mVersion;

    /* loaded from: classes16.dex */
    public static class TPNativeRichMediaFeatureContent {
        private long mStartTimeMs = -1;
        private long mEndTimeMs = -1;
        private java.lang.String mContent = "";

        public java.lang.String getContent() {
            return this.mContent;
        }

        public long getEndTimeMs() {
            return this.mEndTimeMs;
        }

        public long getStartTimeMs() {
            return this.mStartTimeMs;
        }

        public void setContent(java.lang.String str) {
            this.mContent = str;
        }

        public void setEndTimeMs(long j17) {
            this.mEndTimeMs = j17;
        }

        public void setStartTimeMs(long j17) {
            this.mStartTimeMs = j17;
        }
    }

    public java.lang.String getEnv() {
        return this.mEnv;
    }

    public com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent[] getFeatureContents() {
        return this.mFeatureContents;
    }

    public java.lang.String getFeatureType() {
        return this.mFeatureType;
    }

    public java.lang.String getVersion() {
        return this.mVersion;
    }

    public void setEnv(java.lang.String str) {
        this.mEnv = str;
    }

    public void setFeatureContents(com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent[] tPNativeRichMediaFeatureContentArr) {
        this.mFeatureContents = tPNativeRichMediaFeatureContentArr;
    }

    public void setFeatureType(java.lang.String str) {
        this.mFeatureType = str;
    }

    public void setVersion(java.lang.String str) {
        this.mVersion = str;
    }
}
