package com.tencent.thumbplayer.api;

/* loaded from: classes15.dex */
public class TPVideoInfo {
    private com.tencent.thumbplayer.api.TPVideoInfo.Builder builder;
    private java.lang.String definition;
    private java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> downloadParamList;
    private java.lang.String fileID;
    private long height;

    @com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE
    private int videoCodecId;
    private long width;

    /* loaded from: classes15.dex */
    public static class Builder {
        private java.lang.String definition;
        private java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> downloadParamList;
        private java.lang.String fileID;
        private long height;

        @com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE
        private int videoCodecId;
        private long width;

        public com.tencent.thumbplayer.api.TPVideoInfo build() {
            return new com.tencent.thumbplayer.api.TPVideoInfo(this);
        }

        public com.tencent.thumbplayer.api.TPVideoInfo.Builder definition(java.lang.String str) {
            this.definition = str;
            return this;
        }

        public com.tencent.thumbplayer.api.TPVideoInfo.Builder downloadParam(com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData) {
            if (com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(this.downloadParamList)) {
                this.downloadParamList = new java.util.ArrayList<>();
            } else {
                this.downloadParamList.clear();
            }
            this.downloadParamList.add(tPDownloadParamData);
            return this;
        }

        public com.tencent.thumbplayer.api.TPVideoInfo.Builder downloadParamList(java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> arrayList) {
            this.downloadParamList = arrayList;
            return this;
        }

        public com.tencent.thumbplayer.api.TPVideoInfo.Builder fileId(java.lang.String str) {
            this.fileID = str;
            return this;
        }

        public com.tencent.thumbplayer.api.TPVideoInfo.Builder size(long j17, long j18) {
            this.width = j17;
            this.height = j18;
            return this;
        }

        public com.tencent.thumbplayer.api.TPVideoInfo.Builder videoCodecId(@com.tencent.thumbplayer.api.TPCommonEnum.TP_VIDEO_CODEC_TYPE int i17) {
            this.videoCodecId = i17;
            return this;
        }
    }

    public com.tencent.thumbplayer.api.TPVideoInfo.Builder getBuilder() {
        return this.builder;
    }

    public java.lang.String getDefinition() {
        return this.definition;
    }

    public java.util.ArrayList<com.tencent.thumbplayer.api.proxy.TPDownloadParamData> getDownloadPraramList() {
        return this.downloadParamList;
    }

    public long getHeight() {
        return this.height;
    }

    public java.lang.String getProxyFileID() {
        return this.fileID;
    }

    public int getVideoCodecId() {
        return this.videoCodecId;
    }

    public long getWidth() {
        return this.width;
    }

    private TPVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo.Builder builder) {
        this.downloadParamList = new java.util.ArrayList<>();
        this.width = builder.width;
        this.height = builder.height;
        this.videoCodecId = builder.videoCodecId;
        this.fileID = builder.fileID;
        this.definition = builder.definition;
        this.downloadParamList = builder.downloadParamList;
        this.builder = builder;
    }
}
