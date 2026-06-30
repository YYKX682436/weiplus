package com.tencent.wcdb.support;

/* loaded from: classes12.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private boolean mIsCanceled;
    private com.tencent.wcdb.support.CancellationSignal.OnCancelListener mOnCancelListener;
    private com.tencent.wcdb.support.ICancellationSignal mRemote;

    /* loaded from: classes12.dex */
    public interface OnCancelListener {
        void onCancel();
    }

    /* loaded from: classes12.dex */
    public static final class Transport extends com.tencent.wcdb.support.ICancellationSignal.Stub {
        final com.tencent.wcdb.support.CancellationSignal mCancellationSignal;

        private Transport() {
            this.mCancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
        }

        @Override // com.tencent.wcdb.support.ICancellationSignal
        public void cancel() {
            this.mCancellationSignal.cancel();
        }
    }

    public static com.tencent.wcdb.support.ICancellationSignal createTransport() {
        return new com.tencent.wcdb.support.CancellationSignal.Transport();
    }

    public static com.tencent.wcdb.support.CancellationSignal fromTransport(com.tencent.wcdb.support.ICancellationSignal iCancellationSignal) {
        if (iCancellationSignal instanceof com.tencent.wcdb.support.CancellationSignal.Transport) {
            return ((com.tencent.wcdb.support.CancellationSignal.Transport) iCancellationSignal).mCancellationSignal;
        }
        return null;
    }

    private void waitForCancelFinishedLocked() {
        while (this.mCancelInProgress) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            if (this.mIsCanceled) {
                return;
            }
            this.mIsCanceled = true;
            this.mCancelInProgress = true;
            com.tencent.wcdb.support.CancellationSignal.OnCancelListener onCancelListener = this.mOnCancelListener;
            com.tencent.wcdb.support.ICancellationSignal iCancellationSignal = this.mRemote;
            if (onCancelListener != null) {
                try {
                    onCancelListener.onCancel();
                } catch (java.lang.Throwable th6) {
                    synchronized (this) {
                        this.mCancelInProgress = false;
                        notifyAll();
                        throw th6;
                    }
                }
            }
            if (iCancellationSignal != null) {
                try {
                    iCancellationSignal.cancel();
                } catch (android.os.RemoteException unused) {
                }
            }
            synchronized (this) {
                this.mCancelInProgress = false;
                notifyAll();
            }
        }
    }

    public boolean isCanceled() {
        boolean z17;
        synchronized (this) {
            z17 = this.mIsCanceled;
        }
        return z17;
    }

    public void setOnCancelListener(com.tencent.wcdb.support.CancellationSignal.OnCancelListener onCancelListener) {
        synchronized (this) {
            waitForCancelFinishedLocked();
            if (this.mOnCancelListener == onCancelListener) {
                return;
            }
            this.mOnCancelListener = onCancelListener;
            if (this.mIsCanceled && onCancelListener != null) {
                onCancelListener.onCancel();
            }
        }
    }

    public void setRemote(com.tencent.wcdb.support.ICancellationSignal iCancellationSignal) {
        synchronized (this) {
            waitForCancelFinishedLocked();
            if (this.mRemote == iCancellationSignal) {
                return;
            }
            this.mRemote = iCancellationSignal;
            if (this.mIsCanceled && iCancellationSignal != null) {
                try {
                    iCancellationSignal.cancel();
                } catch (android.os.RemoteException unused) {
                }
            }
        }
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new com.tencent.wcdb.support.OperationCanceledException();
        }
    }
}
