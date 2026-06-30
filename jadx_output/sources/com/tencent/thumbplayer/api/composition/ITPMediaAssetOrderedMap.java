package com.tencent.thumbplayer.api.composition;

/* loaded from: classes13.dex */
public interface ITPMediaAssetOrderedMap extends com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam {
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_DASH_TRACK_BANDWIDTH = "dash_track_bandwidth";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_DASH_TRACK_FRAME_RATE = "dash_track_framerate";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_DASH_TRACK_LANGUAGE = "dash_track_language";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_DASH_TRACK_RESOLUTION = "dash_track_resolution";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_BANDWIDTH = "hls_track_bandwidth";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_CODECS = "hls_track_codecs";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_FRAME_RATE = "hls_track_framerate";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_GROUPID = "hls_track_groupid";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_LANGUAGE = "hls_track_language";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_NAME = "hls_track_name";
    public static final java.lang.String TP_PLAYER_EXTRA_PARAM_HLS_TRACK_RESOLUTION = "hls_track_resolution";

    void addKeyValue(java.lang.String str, java.lang.String str2);

    java.lang.String getKeyValueStr();
}
