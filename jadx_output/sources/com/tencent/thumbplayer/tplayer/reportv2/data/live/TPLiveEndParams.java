package com.tencent.thumbplayer.tplayer.reportv2.data.live;

/* loaded from: classes16.dex */
public class TPLiveEndParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "retentiondurationms")
    private long mRetentionDurationMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE)
    private int mErrorCode = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "videodecodertype")
    private int mVideoDecoderType = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "audiodecodertype")
    private int mAudioDecoderType = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "demuxertype")
    private int mDemuxerType = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "videorendertype")
    private int mVideoRenderType = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "audiorendertype")
    private int mAudioRenderType = -1;

    public int getAudioDecoderType() {
        return this.mAudioDecoderType;
    }

    public int getAudioRenderType() {
        return this.mAudioRenderType;
    }

    public int getDemuxerType() {
        return this.mDemuxerType;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public long getRetentionDurationMs() {
        return this.mRetentionDurationMs;
    }

    public int getVideoDecoderType() {
        return this.mVideoDecoderType;
    }

    public int getVideoRenderType() {
        return this.mVideoRenderType;
    }

    public void setAudioDecoderType(int i17) {
        this.mAudioDecoderType = i17;
    }

    public void setAudioRenderType(int i17) {
        this.mAudioRenderType = i17;
    }

    public void setDemuxerType(int i17) {
        this.mDemuxerType = i17;
    }

    public void setErrorCode(int i17) {
        this.mErrorCode = i17;
    }

    public void setRetentionDurationMs(long j17) {
        this.mRetentionDurationMs = j17;
    }

    public void setVideoDecoderType(int i17) {
        this.mVideoDecoderType = i17;
    }

    public void setVideoRenderType(int i17) {
        this.mVideoRenderType = i17;
    }
}
