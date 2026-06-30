package com.tencent.youtu.ytagreflectlivecheck.worker;

/* loaded from: classes14.dex */
public abstract class TimerWorker {
    private static final java.lang.String TAG = "CloudFaceCountDownTimer";
    private volatile boolean mCancelled = false;
    private final long mCountdownInterval;
    private final long mMillisInFuture;
    private long mStopTimeInFuture;
    private volatile java.util.Timer mTimer;
    private volatile java.util.TimerTask mTimerTask;

    public TimerWorker(long j17, long j18) {
        com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[TimerWorker.TimerWorker] mCountDownTimer");
        this.mMillisInFuture = j17;
        this.mCountdownInterval = j18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueTimerJudge() {
        if (this.mCancelled) {
            return;
        }
        long elapsedRealtime = this.mStopTimeInFuture - android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            cancel();
            onFinish();
        } else {
            if (elapsedRealtime < this.mCountdownInterval) {
                return;
            }
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            onTick(elapsedRealtime);
            long elapsedRealtime3 = (elapsedRealtime2 + this.mCountdownInterval) - android.os.SystemClock.elapsedRealtime();
            while (elapsedRealtime3 < 0) {
                elapsedRealtime3 += this.mCountdownInterval;
            }
        }
    }

    public final synchronized void cancel() {
        this.mCancelled = true;
        if (this.mTimer != null) {
            this.mTimer.cancel();
            this.mTimer = null;
        }
        if (this.mTimerTask != null) {
            this.mTimerTask.cancel();
            this.mTimerTask = null;
        }
    }

    public abstract void onFinish();

    public abstract void onTick(long j17);

    public final synchronized com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker start() {
        this.mCancelled = false;
        if (this.mMillisInFuture <= 0) {
            onFinish();
            return this;
        }
        this.mStopTimeInFuture = android.os.SystemClock.elapsedRealtime() + this.mMillisInFuture;
        this.mTimer = new java.util.Timer();
        this.mTimerTask = new java.util.TimerTask() { // from class: com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker.this.mCancelled) {
                    return;
                }
                com.tencent.youtu.ytagreflectlivecheck.worker.TimerWorker.this.continueTimerJudge();
            }
        };
        this.mTimer.schedule(this.mTimerTask, 0L, this.mCountdownInterval);
        return this;
    }
}
