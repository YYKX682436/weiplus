package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class DataRangeTracker {
    private static final long LOCK_INTERVAL = 1000;
    private static final java.lang.String TAG = "DataRangeTracker";
    private long waitingPosition;
    private int waitingSize;
    private final java.util.ArrayList<com.tencent.qqmusic.mediaplayer.DataRangeTracker.Range> mDownloadDataList = new java.util.ArrayList<>();
    private final java.util.concurrent.locks.ReentrantReadWriteLock lock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private long mFileTotalSize = 0;
    private boolean isUpstreamSizeSet = false;
    private java.util.Comparator<com.tencent.qqmusic.mediaplayer.DataRangeTracker.Range> mComparator = new java.util.Comparator<com.tencent.qqmusic.mediaplayer.DataRangeTracker.Range>() { // from class: com.tencent.qqmusic.mediaplayer.DataRangeTracker.1
        @Override // java.util.Comparator
        public int compare(com.tencent.qqmusic.mediaplayer.DataRangeTracker.Range range, com.tencent.qqmusic.mediaplayer.DataRangeTracker.Range range2) {
            return (int) (range.first - range2.first);
        }
    };

    /* loaded from: classes13.dex */
    public interface LockJudgerCallback {
        boolean isToAbandonLock();
    }

    /* loaded from: classes13.dex */
    public static class Range {
        private final long first;
        private final long second;

        public java.lang.String toString() {
            return "[" + this.first + ", " + this.second + ']';
        }

        private Range(long j17, long j18) {
            this.first = j17;
            this.second = j18;
        }
    }

    private void lockRead() {
        this.lock.readLock().lock();
    }

    private synchronized void unlock() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[unlock].");
        notifyAll();
    }

    private void unlockRead() {
        this.lock.readLock().unlock();
    }

    public void abandonLock() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[abandonLock]");
        unblock();
        unlock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (isCached(r6, r0) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addRange(long r22, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.DataRangeTracker.addRange(long, long, boolean):void");
    }

    public void block() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[block]");
    }

    public long findEnd(long j17) {
        int i17;
        lockRead();
        try {
            int size = this.mDownloadDataList.size();
            if (size == 0) {
                unlockRead();
                return -1L;
            }
            for (int i18 = 0; i18 < size; i18++) {
                if (j17 < this.mDownloadDataList.get(i18).first) {
                    return this.mDownloadDataList.get(i18).first - 1;
                }
                if (j17 <= this.mDownloadDataList.get(i18).second && (i17 = i18 + 1) < size) {
                    return this.mDownloadDataList.get(i17).first - 1;
                }
            }
            unlockRead();
            return 0L;
        } finally {
            unlockRead();
        }
    }

    public long findStart(long j17) {
        lockRead();
        try {
            int size = this.mDownloadDataList.size();
            if (size == 0) {
                unlockRead();
                return -1L;
            }
            long j18 = this.mDownloadDataList.get(0).second + 1;
            for (int i17 = 0; i17 < size; i17++) {
                if (j17 < this.mDownloadDataList.get(i17).first) {
                    return j18;
                }
                j18 = this.mDownloadDataList.get(i17).second + 1;
                if (j17 <= this.mDownloadDataList.get(i17).second) {
                    return this.mDownloadDataList.get(i17).second + 1;
                }
            }
            return this.mDownloadDataList.get(r10.size() - 1).second + 1;
        } finally {
            unlockRead();
        }
    }

    public long getContinuousEnd() {
        lockRead();
        try {
            if (this.mDownloadDataList.size() != 0) {
                return this.mDownloadDataList.get(0).second;
            }
            unlockRead();
            return -1L;
        } finally {
            unlockRead();
        }
    }

    public long getContinuousStart() {
        lockRead();
        try {
            if (this.mDownloadDataList.size() != 0) {
                return this.mDownloadDataList.get(0).first;
            }
            unlockRead();
            return -1L;
        } finally {
            unlockRead();
        }
    }

    public boolean isCached(long j17, int i17) {
        lockRead();
        try {
            long findStart = findStart(j17);
            long j18 = i17 + j17;
            long findStart2 = findStart(j18);
            long findEnd = findEnd(j17);
            long findEnd2 = findEnd(j18);
            if (findStart != findStart2 || findEnd != findEnd2) {
                return false;
            }
            if (findEnd == -1) {
                return false;
            }
            long j19 = this.mFileTotalSize;
            if (j19 > 0 && j18 > j19) {
                j18 = j19;
            }
            return j18 <= findStart;
        } finally {
            unlockRead();
        }
    }

    public synchronized boolean lock(long j17, int i17, long j18, com.tencent.qqmusic.mediaplayer.DataRangeTracker.LockJudgerCallback lockJudgerCallback) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[lock] position = [" + j17 + "]. size = [" + i17 + "]. timeout = [" + j18 + "].");
        this.waitingPosition = j17;
        this.waitingSize = i17;
        int i18 = (int) (j18 / 1000);
        if (i18 <= 0) {
            i18 = 1;
        }
        int i19 = 0;
        while (true) {
            if (i19 >= i18) {
                break;
            }
            wait(1000L);
            if (lockJudgerCallback != null && lockJudgerCallback.isToAbandonLock()) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "lockJudgerCallback.isToAbandonLock() is true, exit the wait loop");
                break;
            }
            if (isCached(this.waitingPosition, this.waitingSize)) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "isCached(waitingPosition, waitingSize) is true, exit the wait loop, wawaitingPosition = " + this.waitingPosition + ", waitingSize = " + this.waitingSize);
                break;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "continue [lock] position = [" + j17 + "]. size = [" + i17 + "]. totalSize = [" + this.mFileTotalSize + "]. findStart(position) = [" + findStart(j17) + "]. i = " + i19);
            i19++;
        }
        return true;
    }

    public void setFileTotalSize(long j17, boolean z17) {
        if (j17 <= 0 || this.mFileTotalSize == j17) {
            return;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "setFileTotalSize mFileTotalSize = " + this.mFileTotalSize + " isUpstreamSizeSet = " + this.isUpstreamSizeSet + " fileTotalSize = " + j17 + " isUpstreamSize = " + z17);
        if (!this.isUpstreamSizeSet) {
            this.mFileTotalSize = j17;
            this.isUpstreamSizeSet = z17;
        } else if (z17) {
            this.mFileTotalSize = j17;
        }
    }

    public void unblock() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[unblock]");
    }
}
