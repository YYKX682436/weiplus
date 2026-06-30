package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPHlsTag {
    public java.lang.String codecs;
    public java.lang.String groupId;
    public java.lang.String language;
    public java.lang.String name;
    public java.lang.String resolution;
    public long bandwidth = -1;
    public float framerate = -1.0f;

    public long getBandwidth() {
        return this.bandwidth;
    }

    public java.lang.String getCodecs() {
        return this.codecs;
    }

    public float getFramerate() {
        return this.framerate;
    }

    public java.lang.String getGroupId() {
        return this.groupId;
    }

    public java.lang.String getLanguage() {
        return this.language;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getResolution() {
        return this.resolution;
    }
}
