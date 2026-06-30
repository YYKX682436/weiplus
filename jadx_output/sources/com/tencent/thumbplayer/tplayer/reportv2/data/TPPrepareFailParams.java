package com.tencent.thumbplayer.tplayer.reportv2.data;

/* loaded from: classes16.dex */
public class TPPrepareFailParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE)
    private int mErrorCode = -1;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public void setErrorCode(int i17) {
        this.mErrorCode = i17;
    }
}
