package com.tencent.thumbplayer.api.richmedia;

/* loaded from: classes16.dex */
public class TPRichMediaFeatureData {
    private final java.lang.String mEnv;
    private final java.util.List<com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData.TPRichMediaFeatureContent> mFeatureContentList = new java.util.ArrayList();
    private final java.lang.String mFeatureType;
    private final java.lang.String mVersion;

    /* loaded from: classes16.dex */
    public static class TPRichMediaFeatureContent {
        private java.lang.String mContent;
        private long mEndTimeMs;
        private long mStartTimeMs;

        public TPRichMediaFeatureContent(com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent tPNativeRichMediaFeatureContent) {
            this.mStartTimeMs = -1L;
            this.mEndTimeMs = -1L;
            this.mContent = "";
            this.mStartTimeMs = tPNativeRichMediaFeatureContent.getStartTimeMs();
            this.mEndTimeMs = tPNativeRichMediaFeatureContent.getEndTimeMs();
            this.mContent = tPNativeRichMediaFeatureContent.getContent();
        }

        public java.lang.String getContent() {
            return this.mContent;
        }

        public long getEndTimeMs() {
            return this.mEndTimeMs;
        }

        public long getStartTimeMs() {
            return this.mStartTimeMs;
        }
    }

    public TPRichMediaFeatureData(com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
        this.mFeatureType = tPNativeRichMediaFeatureData.getFeatureType();
        this.mEnv = tPNativeRichMediaFeatureData.getEnv();
        this.mVersion = tPNativeRichMediaFeatureData.getVersion();
        if (tPNativeRichMediaFeatureData.getFeatureContents() != null) {
            for (com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData.TPNativeRichMediaFeatureContent tPNativeRichMediaFeatureContent : tPNativeRichMediaFeatureData.getFeatureContents()) {
                this.mFeatureContentList.add(new com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData.TPRichMediaFeatureContent(tPNativeRichMediaFeatureContent));
            }
        }
    }

    public java.lang.String getEnv() {
        return this.mEnv;
    }

    public java.util.List<com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData.TPRichMediaFeatureContent> getFeatureContentList() {
        return this.mFeatureContentList;
    }

    public java.lang.String getFeatureType() {
        return this.mFeatureType;
    }

    public java.lang.String getVersion() {
        return this.mVersion;
    }
}
