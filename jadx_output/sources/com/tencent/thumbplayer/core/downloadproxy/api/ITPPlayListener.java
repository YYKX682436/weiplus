package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public interface ITPPlayListener {
    public static final int MESSAGE_FLV_PRELOAD_STATUS = 5;
    public static final int MESSAGE_HTTP_HEADER = 3;
    public static final int MESSAGE_MULTI_NETWORK_LOW_SPEED = 10;
    public static final int MESSAGE_MULTI_NETWORK_STATUS = 11;
    public static final int MESSAGE_NOTIFY_M3U8_CONTENT = 4;
    public static final int MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION = 2;
    public static final int MESSAGE_PLAY_VIDEO_NO_MORE_CACHE = 1;
    public static final int MESSAGE_QUIC_DOWNLOAD_STATUS = 6;
    public static final int MESSAGE_TAB_TESTID = 8;
    public static final int MSG_M3U8_REFRESH = 9;

    long getAdvRemainTime();

    java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2);

    int getCurrentPlayClipNo();

    long getCurrentPlayOffset();

    long getCurrentPosition();

    java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2);

    long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2);

    java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2);

    java.lang.Object getPlayInfo(long j17);

    java.lang.Object getPlayInfo(java.lang.String str);

    long getPlayerBufferLength();

    void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map);

    void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    void onDownloadCdnUrlUpdate(java.lang.String str);

    void onDownloadError(int i17, int i18, java.lang.String str);

    void onDownloadFinish();

    void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str);

    void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2);

    void onDownloadStatusUpdate(int i17);

    java.lang.Object onPlayCallback(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4);

    int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18);
}
