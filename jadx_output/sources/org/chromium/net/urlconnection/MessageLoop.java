package org.chromium.net.urlconnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class MessageLoop implements java.util.concurrent.Executor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long INVALID_THREAD_ID = -1;
    private boolean mLoopFailed;
    private boolean mLoopRunning;
    private java.io.InterruptedIOException mPriorInterruptedIOException;
    private java.lang.RuntimeException mPriorRuntimeException;
    private long mThreadId = -1;
    private final java.util.concurrent.BlockingQueue<java.lang.Runnable> mQueue = new java.util.concurrent.LinkedBlockingQueue();

    private boolean calledOnValidThread() {
        long j17 = this.mThreadId;
        if (j17 != -1) {
            return j17 == java.lang.Thread.currentThread().getId();
        }
        this.mThreadId = java.lang.Thread.currentThread().getId();
        return true;
    }

    private java.lang.Runnable take(boolean z17, long j17) {
        try {
            java.lang.Runnable take = !z17 ? this.mQueue.take() : this.mQueue.poll(j17, java.util.concurrent.TimeUnit.NANOSECONDS);
            if (take != null) {
                return take;
            }
            throw new java.net.SocketTimeoutException();
        } catch (java.lang.InterruptedException e17) {
            java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException();
            interruptedIOException.initCause(e17);
            throw interruptedIOException;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        if (runnable == null) {
            throw new java.lang.IllegalArgumentException();
        }
        try {
            this.mQueue.put(runnable);
        } catch (java.lang.InterruptedException e17) {
            throw new java.util.concurrent.RejectedExecutionException(e17);
        }
    }

    public boolean hasLoopFailed() {
        return this.mLoopFailed;
    }

    public boolean isRunning() {
        return this.mLoopRunning;
    }

    public void loop() {
        loop(0);
    }

    public void quit() {
        this.mLoopRunning = false;
    }

    public void loop(int i17) {
        long nanoTime = java.lang.System.nanoTime();
        long convert = java.util.concurrent.TimeUnit.NANOSECONDS.convert(i17, java.util.concurrent.TimeUnit.MILLISECONDS);
        if (this.mLoopFailed) {
            java.io.InterruptedIOException interruptedIOException = this.mPriorInterruptedIOException;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.mPriorRuntimeException;
        }
        if (!this.mLoopRunning) {
            this.mLoopRunning = true;
            while (this.mLoopRunning) {
                if (i17 == 0) {
                    try {
                        take(false, 0L).run();
                    } catch (java.io.InterruptedIOException e17) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        this.mPriorInterruptedIOException = e17;
                        throw e17;
                    } catch (java.lang.RuntimeException e18) {
                        this.mLoopRunning = false;
                        this.mLoopFailed = true;
                        this.mPriorRuntimeException = e18;
                        throw e18;
                    }
                } else {
                    take(true, (convert - java.lang.System.nanoTime()) + nanoTime).run();
                }
            }
            return;
        }
        throw new java.lang.IllegalStateException("Cannot run loop when it is already running.");
    }
}
