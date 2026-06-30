package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

/* loaded from: classes16.dex */
public class TPVodSelectTrackParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "costtimems")
    private long mCostTimeMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE)
    private int mErrorCode = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "mediatype")
    private int mMediaType = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "attachformat")
    private int mAttachFormat = -1;

    public int getAttachFormat() {
        return this.mAttachFormat;
    }

    public long getCostTimeMs() {
        return this.mCostTimeMs;
    }

    public long getErrorCode() {
        return this.mErrorCode;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public void setAttachFormat(int i17) {
        this.mAttachFormat = i17;
    }

    public void setCostTimeMs(long j17) {
        this.mCostTimeMs = j17;
    }

    public void setErrorCode(int i17) {
        this.mErrorCode = i17;
    }

    public void setMediaType(int i17) {
        this.mMediaType = i17;
    }
}
