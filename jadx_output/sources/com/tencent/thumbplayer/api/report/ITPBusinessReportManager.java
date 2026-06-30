package com.tencent.thumbplayer.api.report;

/* loaded from: classes15.dex */
public interface ITPBusinessReportManager {
    public static final int EVENT_ID_302_REDIRECT = 1001;
    public static final int EVENT_ID_EARLY_ERROR = 1100;
    public static final int EVENT_ID_GET_CDN_URL = 1000;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface EventId {
    }

    @java.lang.Deprecated
    void reportEvent(int i17, java.util.Map<java.lang.String, java.lang.Object> map);

    void setReportInfoGetter(com.tencent.thumbplayer.api.report.TPDefaultReportInfo tPDefaultReportInfo);

    void setReportSamplingRate(double d17);
}
