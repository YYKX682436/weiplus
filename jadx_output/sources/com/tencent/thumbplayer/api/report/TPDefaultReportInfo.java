package com.tencent.thumbplayer.api.report;

/* loaded from: classes16.dex */
public abstract class TPDefaultReportInfo {
    public java.lang.String appVersion;
    public int cdnId;
    public java.lang.String cdnIp;
    public java.lang.String cdnUip;
    public int cdnUrlIndex;
    public int dlType;
    public boolean enableP2p;
    public int freeType;
    public java.lang.String guid;
    public boolean isOnline;
    public int loginType;
    public float mediaDuration;
    public int mediaFormat;
    public int mediaRate;
    public java.lang.String mediaResolution;
    public long platform;
    public java.lang.String qqOpenId;
    public java.util.Properties reportInfoProperties;
    public int scenesId;
    public int subtitleCdnType;
    public int subtitleUrlIndex;
    public int testId;
    public java.lang.String uin;
    public java.lang.String uip;
    public java.lang.String vid;
    public java.lang.String wxOpenId;

    public abstract int getPlayType();
}
