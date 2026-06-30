package com.tencent.thumbplayer.utils;

/* loaded from: classes13.dex */
public class TPReadWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock {
    private static final int INTERRUPTED_TIMES = 3;
    private static final java.lang.String TAG = "TPReadWriteLock";
    private java.util.concurrent.locks.Condition mWriteLockCond = writeLock().newCondition();

    public void read() {
        readLock().lock();
    }

    public boolean readTryLock(long j17) {
        int i17 = 3;
        while (true) {
            i17--;
            if (i17 < 0) {
                throw new java.lang.InterruptedException("tryLock interrupted.");
            }
            try {
                return readLock().tryLock(j17, java.util.concurrent.TimeUnit.MICROSECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    public void unReadLock() {
        readLock().unlock();
    }

    public void unWriteLock() {
        writeLock().unlock();
    }

    public void write() {
        writeLock().lock();
    }

    public void writeLockCondSignal() {
        this.mWriteLockCond.signal();
    }

    public void writeLockCondSignalAll() {
        this.mWriteLockCond.signalAll();
    }

    public boolean writeLockCondWait(long j17) {
        int i17 = 3;
        while (true) {
            i17--;
            if (i17 < 0) {
                return false;
            }
            try {
                return this.mWriteLockCond.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }

    public boolean writeTryLock(long j17) {
        int i17 = 3;
        while (true) {
            i17--;
            if (i17 < 0) {
                throw new java.lang.InterruptedException("tryLock interrupted.");
            }
            try {
                return writeLock().tryLock(j17, java.util.concurrent.TimeUnit.MICROSECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            }
        }
    }
}
