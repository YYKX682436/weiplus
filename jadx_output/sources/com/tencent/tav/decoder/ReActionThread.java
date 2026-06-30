package com.tencent.tav.decoder;

/* loaded from: classes10.dex */
public abstract class ReActionThread extends java.lang.Thread {
    private static final java.lang.String TAG = "ReActionThread";
    private boolean hasAction;
    private boolean release;

    public ReActionThread(java.lang.String str) {
        super(str);
        this.release = false;
        this.hasAction = false;
    }

    public void action() {
        this.hasAction = true;
        synchronized (this) {
            notifyAll();
        }
        com.tencent.tav.decoder.logger.Logger.v(TAG, "action: " + this + " " + hashCode());
    }

    public abstract void doAction();

    public synchronized void release() {
        if (!this.release) {
            this.release = true;
            synchronized (this) {
                notifyAll();
                try {
                    synchronized (this) {
                        wait(20L);
                    }
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "run start: " + this + " " + hashCode());
        while (!this.release) {
            while (!this.hasAction && !this.release) {
                synchronized (this) {
                    try {
                        wait(10L);
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            this.hasAction = false;
            if (!this.release) {
                doAction();
            }
            synchronized (this) {
                notifyAll();
            }
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "run finish: " + this + " " + hashCode());
    }
}
