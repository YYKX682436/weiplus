package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

/* loaded from: classes16.dex */
public class TPVodFirstLoadParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "costtimems")
    private long mCostTimeMs = -1;

    public long getCostTimeMs() {
        return this.mCostTimeMs;
    }

    public void setCostTimeMs(long j17) {
        this.mCostTimeMs = j17;
    }
}
