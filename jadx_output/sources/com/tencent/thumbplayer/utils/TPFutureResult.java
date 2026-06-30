package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPFutureResult {
    private static final int INTERRUPTED_TIMES = 2;
    private static final java.lang.String TAG = "TPFutureResult";
    private java.lang.Object mRealResult = null;
    private boolean mIsReady = false;
    private java.lang.Throwable mException = null;

    private void waitAndDealInterrupted() {
        int i17 = 2;
        boolean z17 = false;
        while (true) {
            i17--;
            if (i17 < 0) {
                break;
            }
            try {
                wait();
                break;
            } catch (java.lang.InterruptedException unused) {
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "getResult wait has InterruptedException, interrupted:" + i17);
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public synchronized java.lang.Object getResult() {
        if (!this.mIsReady) {
            waitAndDealInterrupted();
        }
        java.lang.Throwable th6 = this.mException;
        if (th6 == null) {
        } else {
            throw th6;
        }
        return this.mRealResult;
    }

    public synchronized void setException(java.lang.Throwable th6) {
        if (th6 != null) {
            this.mException = th6;
            this.mIsReady = true;
            notifyAll();
        }
    }

    public synchronized void setResult(java.lang.Object obj) {
        if (this.mIsReady) {
            return;
        }
        this.mRealResult = obj;
        this.mIsReady = true;
        notifyAll();
    }

    private void waitAndDealInterrupted(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = false;
        while (j17 > 0) {
            try {
                wait(j17);
                break;
            } catch (java.lang.InterruptedException unused) {
                j17 -= java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "getResult wait has InterruptedException, remainTime:" + j17);
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public synchronized java.lang.Object getResult(long j17) {
        if (!this.mIsReady) {
            waitAndDealInterrupted(j17);
        }
        java.lang.Throwable th6 = this.mException;
        if (th6 == null) {
        } else {
            throw th6;
        }
        return this.mRealResult;
    }
}
