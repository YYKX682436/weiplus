package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPTrackInfo {
    public static final int TP_MEDIA_CONTAINER_TYPE_DASH = 2;
    public static final int TP_MEDIA_CONTAINER_TYPE_HLS = 1;
    public static final int TP_MEDIA_CONTAINER_TYPE_UNKNOWN = 0;
    public static final int TP_MEDIA_TRACK_TYPE_AUDIO = 2;
    public static final int TP_MEDIA_TRACK_TYPE_SUBTITLE = 3;
    public static final int TP_MEDIA_TRACK_TYPE_UNKNOW = 0;
    public static final int TP_MEDIA_TRACK_TYPE_VIDEO = 1;
    public java.lang.String name;
    public int trackType = 0;
    public int containerType = 0;
    public boolean isSelected = false;
    public boolean isExclusive = true;
    public boolean isInternal = true;
    public com.tencent.thumbplayer.api.TPHlsTag hlsTag = new com.tencent.thumbplayer.api.TPHlsTag();
    public com.tencent.thumbplayer.api.TPDashFormat dashFormat = new com.tencent.thumbplayer.api.TPDashFormat();

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.tencent.thumbplayer.api.TPTrackInfo)) {
            com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = (com.tencent.thumbplayer.api.TPTrackInfo) obj;
            if (this.name.equals(tPTrackInfo.name) && this.trackType == tPTrackInfo.trackType) {
                return true;
            }
        }
        return false;
    }

    public com.tencent.thumbplayer.api.TPDashFormat getDashFormat() {
        return this.dashFormat;
    }

    public com.tencent.thumbplayer.api.TPHlsTag getHlsTag() {
        return this.hlsTag;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public int getTrackType() {
        return this.trackType;
    }
}
