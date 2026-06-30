package com.tencent.thumbplayer.tplayer;

/* loaded from: classes6.dex */
class TPThreadSwitchCommons {

    /* loaded from: classes6.dex */
    public static class TPAudioTrackSourceParams {
        com.tencent.thumbplayer.api.proxy.TPDownloadParamData dlParamData;
        java.lang.String name;
        java.lang.String url;
    }

    /* loaded from: classes6.dex */
    public static class TPDataSourceParams {
        java.util.Map<java.lang.String, java.lang.String> httpHeader;
        com.tencent.thumbplayer.api.composition.ITPMediaAsset mediaAsset;
        android.os.ParcelFileDescriptor pfd;
        java.lang.String url;
    }

    /* loaded from: classes6.dex */
    public static class TPDrmPropertyParams {
        java.lang.String propertyName;
        java.lang.String value;
    }

    /* loaded from: classes6.dex */
    public static class TPLoopbackParams {
        boolean isLoopback;
        long loopStartPositionMs = 0;
        long loopEndPositionMs = -1;
    }

    /* loaded from: classes6.dex */
    public static class TPOnPlayCallBackParams {
        java.lang.Object ext1;
        java.lang.Object ext2;
        java.lang.Object ext3;
        java.lang.Object ext4;
        int messageType;
    }

    /* loaded from: classes6.dex */
    public static class TPOnReadDataParams {
        int fileId;
        java.lang.String fileKey;
        long length;
        long offset;
    }

    /* loaded from: classes6.dex */
    public static class TPOnStartReadDataParams {
        int fileId;
        java.lang.String fileKey;
        long requestEnd;
        long requestStart;
    }

    /* loaded from: classes6.dex */
    public static class TPProgramInfoResult {
        com.tencent.thumbplayer.api.TPProgramInfo[] programInfos;

        public void reset() {
            this.programInfos = null;
        }
    }

    /* loaded from: classes6.dex */
    public static class TPSubTitleParams {
        com.tencent.thumbplayer.api.proxy.TPDownloadParamData downloadParamData;
        java.lang.String mimeType;
        java.lang.String name;
        java.lang.String url;
    }

    /* loaded from: classes6.dex */
    public static class TPSwitchCommonParams {
        long arg1;
        long arg2;
        java.lang.Object extraObject;
    }

    /* loaded from: classes6.dex */
    public static class TPSwitchDefParams {
        long defID;
        com.tencent.thumbplayer.api.composition.ITPMediaAsset mediaAsset;
        int mode;
        java.lang.String url;
        com.tencent.thumbplayer.api.TPVideoInfo videoInfo;
    }

    /* loaded from: classes6.dex */
    public static class TPTrackInfoResult {
        com.tencent.thumbplayer.api.TPTrackInfo[] trackInfos;

        public void reset() {
            this.trackInfos = null;
        }
    }

    /* loaded from: classes6.dex */
    public static class TPVideoCaptureParams {
        com.tencent.thumbplayer.api.TPCaptureCallBack callBack;
        com.tencent.thumbplayer.api.TPCaptureParams params;
    }

    /* loaded from: classes6.dex */
    public static class TPVideoSizeResult {
        int height;
        int width;

        public void resetHeight() {
            this.height = 0;
        }

        public void resetWidth() {
            this.width = 0;
        }
    }
}
