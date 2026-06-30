package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

/* loaded from: classes16.dex */
public class TPVodBufferingParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "costtimems")
    private long mCostTimeMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "playspeed")
    private float mPlaySpeed = -1.0f;

    public long getCostTimeMs() {
        return this.mCostTimeMs;
    }

    public float getPlaySpeed() {
        return this.mPlaySpeed;
    }

    public void setCostTimeMs(long j17) {
        this.mCostTimeMs = j17;
    }

    public void setPlaySpeed(float f17) {
        this.mPlaySpeed = f17;
    }
}
