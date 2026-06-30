package com.tencent.thumbplayer.core.common;

/* loaded from: classes16.dex */
public class TPMediaTrackInfo {
    public static final int TP_NATIVE_MEDIA_CONTAINER_TYPE_DASH = 2;
    public static final int TP_NATIVE_MEDIA_CONTAINER_TYPE_HLS = 1;
    public static final int TP_NATIVE_MEDIA_CONTAINER_TYPE_UNKNOWN = 0;
    public static final int TP_NATIVE_MEDIA_TRACK_TYPE_AUDIO = 2;
    public static final int TP_NATIVE_MEDIA_TRACK_TYPE_SUBTITLE = 3;
    public static final int TP_NATIVE_MEDIA_TRACK_TYPE_UNKNOW = 0;
    public static final int TP_NATIVE_MEDIA_TRACK_TYPE_VIDEO = 1;
    public java.lang.String trackName;
    public int trackType = 0;
    public int contianerType = 0;
    public boolean isSelected = false;
    public boolean isExclusive = true;
    public boolean isInternal = false;
    public com.tencent.thumbplayer.core.common.TPMediaTrackHlsTag hlsTag = new com.tencent.thumbplayer.core.common.TPMediaTrackHlsTag();
    public com.tencent.thumbplayer.core.common.TPMediaTrackDashFormat dashFormat = new com.tencent.thumbplayer.core.common.TPMediaTrackDashFormat();
}
