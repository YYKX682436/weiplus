package com.tencent.tmassistantsdk.downloadservice.taskmanager;

/* loaded from: classes13.dex */
public class ServiceDownloadTask {
    public java.lang.String mClientKey;
    public java.lang.String mUrl;
    public int mState = 0;
    public long mReceivedBytes = 0;
    public long mTotalBytes = 0;
    public long mProgressUpdateTimestamp = 0;

    public ServiceDownloadTask(java.lang.String str, java.lang.String str2) {
        this.mClientKey = str;
        this.mUrl = str2;
    }

    public boolean checkIsNeedUpdateProgress(long j17, long j18, long j19) {
        if (j17 == j18) {
            this.mReceivedBytes = j17;
            this.mTotalBytes = j18;
            this.mProgressUpdateTimestamp = j19;
            return true;
        }
        if (j19 - this.mProgressUpdateTimestamp >= 1000 && j17 != this.mReceivedBytes) {
            this.mReceivedBytes = j17;
            this.mTotalBytes = j18;
            this.mProgressUpdateTimestamp = j19;
            return true;
        }
        if (j18 <= 0 || (((((float) j17) * 1.0f) - (((float) this.mReceivedBytes) * 1.0f)) / ((float) j18)) * 1.0f <= 0.009999999776482582d) {
            return false;
        }
        this.mReceivedBytes = j17;
        this.mTotalBytes = j18;
        this.mProgressUpdateTimestamp = j19;
        return true;
    }
}
