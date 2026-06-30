package com.tencent.thumbplayer.tplayer.reportv2.data.live;

/* loaded from: classes16.dex */
public class TPLivePlayFlowParams extends com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams {

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "audiodecoderopenedtimems")
    private long mAudioDecoderOpenedTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "convertdatasourceetimems")
    private long mConvertDataSourceETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "coreapipreparetimems")
    private long mCoreApiPrepareTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "coreschedulingthreadonpreparedtimems")
    private long mCoreSchedulingThreadOnPreparedTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "coreschedulingthreadpreparetimems")
    private long mCoreSchedulingThreadPrepareTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportcreatetasktimems")
    private long mDTCreateTaskTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportdataenoughtimems")
    private long mDTDataEnoughTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportdatarequesttimems")
    private long mDTDataRequestTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportdataresponsetimems")
    private long mDTDataResponseTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportgetclipurltimems")
    private long mDTGetClipUrlTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportm3u8requesttimems")
    private long mDTM3u8RequestTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportm3u8responsetimems")
    private long mDTM3u8ResponseTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "datatransportsetclipinfotimems")
    private long mDTSetClipInfoTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "demuxeropenfileetimems")
    private long mDemuxerOpenFileEtimems;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "demuxeropenfilestimems")
    private long mDemuxerOpenFileSTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "demuxerthreadonpreparedtimems")
    private long mDemuxerThreadOnPreparedTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "demuxerthreadpreparetimems")
    private long mDemuxerThreadPrepareTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "firstaudioframerenderetimems")
    private long mFirstAudioFrameRenderETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "firstaudiopacketreadetimems")
    private long mFirstAudioPacketReadETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "firstvideoframerenderetimems")
    private long mFirstVideoFrameRenderETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "firstvideopacketreadetimems")
    private long mFirstVideoPacketReadETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "initfirstclippositionetimems")
    private long mInitFirstClipPositionETimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tponpreparedtimems")
    private long mTPOnPreparedTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tppreparetimems")
    private long mTPPrepareTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "tpsetdatasourcetimems")
    private long mTPSetDataSourceTimeMs;

    @com.tencent.thumbplayer.tplayer.reportv2.data.TPCommonParams.TPReportParam(key = "videodecoderopenedtimems")
    private long mVideoDecoderOpenedTimeMs;

    public long getAudioDecoderOpenedTimeMs() {
        return this.mAudioDecoderOpenedTimeMs;
    }

    public long getConvertDataSourceETimeMs() {
        return this.mConvertDataSourceETimeMs;
    }

    public long getCoreApiPrepareTimeMs() {
        return this.mCoreApiPrepareTimeMs;
    }

    public long getCoreSchedulingThreadOnPreparedTimeMs() {
        return this.mCoreSchedulingThreadOnPreparedTimeMs;
    }

    public long getCoreSchedulingThreadPrepareTimeMs() {
        return this.mCoreSchedulingThreadPrepareTimeMs;
    }

    public long getDTCreateTaskTimeMs() {
        return this.mDTCreateTaskTimeMs;
    }

    public long getDTDataEnoughTimeMs() {
        return this.mDTDataEnoughTimeMs;
    }

    public long getDTDataRequestTimeMs() {
        return this.mDTDataRequestTimeMs;
    }

    public long getDTDataResponseTimeMs() {
        return this.mDTDataResponseTimeMs;
    }

    public long getDTGetClipUrlTimeMs() {
        return this.mDTGetClipUrlTimeMs;
    }

    public long getDTM3u8RequestTimeMs() {
        return this.mDTM3u8RequestTimeMs;
    }

    public long getDTM3u8ResponseTimeMs() {
        return this.mDTM3u8ResponseTimeMs;
    }

    public long getDTSetClipInfoTimeMs() {
        return this.mDTSetClipInfoTimeMs;
    }

    public long getDemuxerOpenFileEtimems() {
        return this.mDemuxerOpenFileEtimems;
    }

    public long getDemuxerOpenFileSTimeMs() {
        return this.mDemuxerOpenFileSTimeMs;
    }

    public long getDemuxerThreadOnpreparedTimeMs() {
        return this.mDemuxerThreadOnPreparedTimeMs;
    }

    public long getDemuxerThreadPrepareTimeMs() {
        return this.mDemuxerThreadPrepareTimeMs;
    }

    public long getFirstAudioFrameRenderETimeMs() {
        return this.mFirstAudioFrameRenderETimeMs;
    }

    public long getFirstAudioPacketReadETimeMs() {
        return this.mFirstAudioPacketReadETimeMs;
    }

    public long getFirstVideoFrameRenderETimeMs() {
        return this.mFirstVideoFrameRenderETimeMs;
    }

    public long getFirstVideoPacketReadETimeMs() {
        return this.mFirstVideoPacketReadETimeMs;
    }

    public long getInitFirstClipPositionETimeMs() {
        return this.mInitFirstClipPositionETimeMs;
    }

    public long getTPOnPreparedTimeMs() {
        return this.mTPOnPreparedTimeMs;
    }

    public long getTPPrepareTimeMs() {
        return this.mTPPrepareTimeMs;
    }

    public long getTPSetDataSourceTimeMs() {
        return this.mTPSetDataSourceTimeMs;
    }

    public long getVideoDecoderOpenedTimeMs() {
        return this.mVideoDecoderOpenedTimeMs;
    }

    public void setAudioDecoderOpenedTimeMs(long j17) {
        this.mAudioDecoderOpenedTimeMs = j17;
    }

    public void setConvertDataSourceETimeMs(long j17) {
        this.mConvertDataSourceETimeMs = j17;
    }

    public void setCoreApiPrepareTimeMs(long j17) {
        this.mCoreApiPrepareTimeMs = j17;
    }

    public void setCoreSchedulingThreadOnPreparedTimeMs(long j17) {
        this.mCoreSchedulingThreadOnPreparedTimeMs = j17;
    }

    public void setCoreSchedulingThreadPrepareTimeMs(long j17) {
        this.mCoreSchedulingThreadPrepareTimeMs = j17;
    }

    public void setDTCreateTaskTimeMs(long j17) {
        this.mDTCreateTaskTimeMs = j17;
    }

    public void setDTDataEnoughTimeMs(long j17) {
        this.mDTDataEnoughTimeMs = j17;
    }

    public void setDTDataRequestTimeMs(long j17) {
        this.mDTDataRequestTimeMs = j17;
    }

    public void setDTDataResponseTimeMs(long j17) {
        this.mDTDataResponseTimeMs = j17;
    }

    public void setDTGetClipUrlTimeMs(long j17) {
        this.mDTGetClipUrlTimeMs = j17;
    }

    public void setDTM3u8RequestTimeMs(long j17) {
        this.mDTM3u8RequestTimeMs = j17;
    }

    public void setDTM3u8ResponseTimeMs(long j17) {
        this.mDTM3u8ResponseTimeMs = j17;
    }

    public void setDTSetClipInfoTimeMs(long j17) {
        this.mDTSetClipInfoTimeMs = j17;
    }

    public void setDemuxerOpenFileEtimems(long j17) {
        this.mDemuxerOpenFileEtimems = j17;
    }

    public void setDemuxerOpenFileSTimeMs(long j17) {
        this.mDemuxerOpenFileSTimeMs = j17;
    }

    public void setDemuxerThreadOnPreparedTimeMs(long j17) {
        this.mDemuxerThreadOnPreparedTimeMs = j17;
    }

    public void setDemuxerThreadPrepareTimeMs(long j17) {
        this.mDemuxerThreadPrepareTimeMs = j17;
    }

    public void setFirstAudioFrameRenderETimeMs(long j17) {
        this.mFirstAudioFrameRenderETimeMs = j17;
    }

    public void setFirstAudioPacketReadETimeMs(long j17) {
        this.mFirstAudioPacketReadETimeMs = j17;
    }

    public void setFirstVideoFrameRenderETimeMs(long j17) {
        this.mFirstVideoFrameRenderETimeMs = j17;
    }

    public void setFirstVideoPacketReadETimeMs(long j17) {
        this.mFirstVideoPacketReadETimeMs = j17;
    }

    public void setInitFirstClipPositionETimeMs(long j17) {
        this.mInitFirstClipPositionETimeMs = j17;
    }

    public void setTPOnPreparedTimeMs(long j17) {
        this.mTPOnPreparedTimeMs = j17;
    }

    public void setTPPrepareTimeMs(long j17) {
        this.mTPPrepareTimeMs = j17;
    }

    public void setTPSetDataSourceTimeMs(long j17) {
        this.mTPSetDataSourceTimeMs = j17;
    }

    public void setVideoDecoderOpenedTimeMs(long j17) {
        this.mVideoDecoderOpenedTimeMs = j17;
    }
}
