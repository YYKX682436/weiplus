package com.tencent.thumbplayer.tplayer.reportv2.data.vod;

/* loaded from: classes16.dex */
public class TPVodEndParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "retentiondurationms")
    private long mRetentionDurationMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE)
    private int mErrorCode = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tseekcount")
    private int mTSeekCount = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tseekbufferingcount")
    private int mTSeekBufferingCount = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tseekbufferingdurationms")
    private long mTSeekBufferingDurationMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tsecondbufferingcount")
    private int mTSecondBufferingCount = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tsecondbufferingdurationms")
    private long mTSecondBufferingDurationMs = -1;

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

    public int getTSecondBufferingCount() {
        return this.mTSecondBufferingCount;
    }

    public long getTSecondBufferingDurationMs() {
        return this.mTSecondBufferingDurationMs;
    }

    public int getTSeekBufferingCount() {
        return this.mTSeekBufferingCount;
    }

    public long getTSeekBufferingDurationMs() {
        return this.mTSeekBufferingDurationMs;
    }

    public int getTSeekCount() {
        return this.mTSeekCount;
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

    public void setTSecondBufferingCount(int i17) {
        this.mTSecondBufferingCount = i17;
    }

    public void setTSecondBufferingDurationMs(long j17) {
        this.mTSecondBufferingDurationMs = j17;
    }

    public void setTSeekBufferingCount(int i17) {
        this.mTSeekBufferingCount = i17;
    }

    public void setTSeekBufferingDurationMs(long j17) {
        this.mTSeekBufferingDurationMs = j17;
    }

    public void setTSeekCount(int i17) {
        this.mTSeekCount = i17;
    }

    public void setVideoDecoderType(int i17) {
        this.mVideoDecoderType = i17;
    }

    public void setVideoRenderType(int i17) {
        this.mVideoRenderType = i17;
    }
}
