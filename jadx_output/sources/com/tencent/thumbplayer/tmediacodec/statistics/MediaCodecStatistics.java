package com.tencent.thumbplayer.tmediacodec.statistics;

/* loaded from: classes14.dex */
public class MediaCodecStatistics {
    private boolean mIsReuse;
    private boolean mIsReuseHasSet;
    private boolean mIsVideo;
    private long mLastTimeInMs;
    private boolean mReuseEnable;
    private final java.util.Map<java.lang.String, java.lang.Long> mStatisticsMap = new java.util.HashMap();
    private java.lang.String mCacheResultData = "";

    public MediaCodecStatistics(boolean z17) {
        this.mIsVideo = z17;
    }

    private final void setIsReuse(boolean z17) {
        this.mIsReuse = z17;
        this.mIsReuseHasSet = true;
    }

    private final void setReuseEnable(boolean z17) {
        this.mReuseEnable = z17;
    }

    public final void configCodecEnd(boolean z17) {
        setIsReuse(z17);
        this.mStatisticsMap.put("configCodec", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.mLastTimeInMs));
    }

    public final void configCodecStart(boolean z17) {
        setReuseEnable(z17);
        this.mLastTimeInMs = java.lang.System.currentTimeMillis();
    }

    public final void createByCodecEnd() {
        this.mStatisticsMap.put("createCodec", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.mLastTimeInMs));
    }

    public final void createByCodecStart() {
        this.mCacheResultData = "";
        this.mStatisticsMap.clear();
        this.mLastTimeInMs = java.lang.System.currentTimeMillis();
    }

    public final java.lang.String getData() {
        if (android.text.TextUtils.isEmpty(this.mCacheResultData)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"isVideo\":");
            sb6.append(this.mIsVideo + " ,");
            if (this.mIsReuseHasSet) {
                sb6.append("\"isReuse\":");
                sb6.append(this.mIsReuse + " ,");
            }
            sb6.append("\"reuseEnable\":");
            sb6.append(this.mReuseEnable + " ,");
            long j17 = 0;
            for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : this.mStatisticsMap.entrySet()) {
                if (entry != null) {
                    j17 += entry.getValue().longValue();
                }
                sb6.append("\"" + ((java.lang.Object) entry.getKey()) + "\":");
                sb6.append(entry.getValue().longValue() + " ,");
            }
            sb6.append("\"totalCodec\":");
            sb6.append(j17);
            sb6.append("}");
            this.mCacheResultData = sb6.toString();
        }
        return this.mCacheResultData;
    }

    public final void startCodecEnd() {
        this.mStatisticsMap.put("startCodec", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.mLastTimeInMs));
    }

    public final void startCodecStart() {
        this.mLastTimeInMs = java.lang.System.currentTimeMillis();
    }
}
