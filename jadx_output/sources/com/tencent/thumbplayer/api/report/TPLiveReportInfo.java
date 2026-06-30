package com.tencent.thumbplayer.api.report;

/* loaded from: classes16.dex */
public class TPLiveReportInfo extends com.tencent.thumbplayer.api.report.TPDefaultReportInfo {
    public int adPlayLength;
    public java.lang.String cdnServer;
    public int contentId;
    public boolean isLookBack;
    public boolean isUserPay;
    public int liveDelay;
    public int liveType;
    public int playTime;
    public int programId;
    public int streamId;

    @Override // com.tencent.thumbplayer.api.report.TPDefaultReportInfo
    public int getPlayType() {
        return 1;
    }
}
