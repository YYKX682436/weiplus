package com.tencent.thumbplayer.tplayer.reportv2;

/* loaded from: classes16.dex */
public class TPVodReportParamRecord extends com.tencent.thumbplayer.tplayer.reportv2.TPBaseReportParamRecord {
    public long mBufferingStartOccurElapsedTimeMs;
    public int mBufferingTotalCount;
    public int mBufferingTotalDurationMs;
    public long mPauseStartOccurElapsedTimeMs;
    public long mPauseTotalDurationMs;
    public long mPlayerFirstStartOccurElapsedTimeMs;
    public long mPlayerStartOccurElapsedTimeMs;
    public long mPrepareEndOccurElapsedTimeMs;
    public long mRetentionDurationMs;
    public int mSeekBufferingTotalCount;
    public int mSeekBufferingTotalDurationMs;
    public long mSeekStartOccurElapsedTimeMs;
    public int mSeekTotalCount;
    public float mPlaySpeed = 1.0f;
    public java.util.Map<java.lang.Long, com.tencent.thumbplayer.tplayer.reportv2.TPVodReportParamRecord.TPSelectTrackInfo> mSelectTrackInfoList = new java.util.HashMap();

    /* loaded from: classes16.dex */
    public static class TPSelectTrackInfo {
        public int mSelectTrackId;
        public long mSelectTrackStartOccurElapsedTimeMs;
        public com.tencent.thumbplayer.api.TPTrackInfo mTrackInfo;
    }
}
