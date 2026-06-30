package com.tencent.thumbplayer.tplayer.reportv2.data.live;

/* loaded from: classes16.dex */
public class TPLivePeriodParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "bufferingdurationms")
    private long mBufferingDurationMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "bufferingcount")
    private int mBufferingCount = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "playeddurationms")
    private long mPlayedDurationMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "maxstreambitratekbps")
    private long mMaxStreamBitrateKbps = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "avgstreambitratekbps")
    private long mAvgStreamBitrateKbps = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "minstreambitratekbps")
    private long mMinStreamBitrateKbps = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "maxvideodecodecosttimems")
    private long mMaxVideoDecodeCostTimeMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "avgvideodecodecosttimems")
    private long mAvgVideoDecodeCostTimeMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "minvideodecodecosttimems")
    private long mMinVideoDecodeCostTimeMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "minvideogopsize")
    private int mMinVideoGopSize = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "avgvideogopsize")
    private int mAvgVideoGopSize = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "maxvideogopsize")
    private int mMaxVideoGopSize = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "videodecodeframecount")
    private int mVideoDecodeFrameCount = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "videorenderframecount")
    private int mVideoRenderFrameCount = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "videobuffereddurationms")
    private long mVideoBufferedDurationMs = -1;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "audiobuffereddurationms")
    private long mAudioBufferedDurationMs = -1;

    public long getAudioBufferedDurationMs() {
        return this.mAudioBufferedDurationMs;
    }

    public long getAvgStreamBitrateKbps() {
        return this.mAvgStreamBitrateKbps;
    }

    public long getAvgVideoDecodeCostTimeMs() {
        return this.mAvgVideoDecodeCostTimeMs;
    }

    public long getAvgVideoGopSize() {
        return this.mAvgVideoGopSize;
    }

    public int getBufferingCount() {
        return this.mBufferingCount;
    }

    public long getBufferingDurationMs() {
        return this.mBufferingDurationMs;
    }

    public long getMaxStreamBitrateKbps() {
        return this.mMaxStreamBitrateKbps;
    }

    public long getMaxVideoDecodeCostTimeMs() {
        return this.mMaxVideoDecodeCostTimeMs;
    }

    public long getMaxVideoGopSize() {
        return this.mMaxVideoGopSize;
    }

    public long getMinStreamBitrateKbps() {
        return this.mMinStreamBitrateKbps;
    }

    public long getMinVideoDecodeCostTimeMs() {
        return this.mMinVideoDecodeCostTimeMs;
    }

    public long getMinVideoGopSize() {
        return this.mMinVideoGopSize;
    }

    public long getPlayedDurationMs() {
        return this.mPlayedDurationMs;
    }

    public long getVideoBufferedDurationMs() {
        return this.mVideoBufferedDurationMs;
    }

    public long getVideoDecodeFrameCount() {
        return this.mVideoDecodeFrameCount;
    }

    public long getVideoRenderFrameCount() {
        return this.mVideoRenderFrameCount;
    }

    public void setAudioBufferedDurationMs(long j17) {
        this.mAudioBufferedDurationMs = j17;
    }

    public void setAvgStreamBitrate(long j17) {
        this.mAvgStreamBitrateKbps = j17;
    }

    public void setAvgVideoDecodeCostTimeMs(long j17) {
        this.mAvgVideoDecodeCostTimeMs = j17;
    }

    public void setAvgVideoGopSize(int i17) {
        this.mAvgVideoGopSize = i17;
    }

    public void setBufferingCount(int i17) {
        this.mBufferingCount = i17;
    }

    public void setBufferingDurationMs(long j17) {
        this.mBufferingDurationMs = j17;
    }

    public void setMaxStreamBitrate(long j17) {
        this.mMaxStreamBitrateKbps = j17;
    }

    public void setMaxVideoDecodeCostTimeMs(long j17) {
        this.mMaxVideoDecodeCostTimeMs = j17;
    }

    public void setMaxVideoGopSize(int i17) {
        this.mMaxVideoGopSize = i17;
    }

    public void setMinStreamBitrate(long j17) {
        this.mMinStreamBitrateKbps = j17;
    }

    public void setMinVideoDecodeCostTimeMs(long j17) {
        this.mMinVideoDecodeCostTimeMs = j17;
    }

    public void setMinVideoGopSize(int i17) {
        this.mMinVideoGopSize = i17;
    }

    public void setPlayedDurationMs(long j17) {
        this.mPlayedDurationMs = j17;
    }

    public void setVideoBufferedDurationMs(long j17) {
        this.mVideoBufferedDurationMs = j17;
    }

    public void setVideoDecodeFrameCount(int i17) {
        this.mVideoDecodeFrameCount = i17;
    }

    public void setVideoRenderFrameCount(int i17) {
        this.mVideoRenderFrameCount = i17;
    }
}
