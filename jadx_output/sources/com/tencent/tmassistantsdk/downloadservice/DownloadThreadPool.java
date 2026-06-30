package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class DownloadThreadPool {
    public static final java.lang.String TAG = "DownloadThreadPool";
    protected static com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool mDownloadThreadPool;
    final java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TaskThread> mDownloadThreadList;
    final java.util.ArrayList<com.tencent.tmassistantsdk.downloadservice.DownloadTask> mExecList;
    protected final java.util.Comparator<com.tencent.tmassistantsdk.downloadservice.DownloadTask> mPriorityQueueComparator;
    final java.lang.Object mTaskLock;
    final java.lang.Object mThreadlock;
    final java.util.PriorityQueue<com.tencent.tmassistantsdk.downloadservice.DownloadTask> mWaitingList;

    /* loaded from: classes13.dex */
    public class TaskThread extends java.lang.Thread {
        private byte _hellAccFlag_;
        private int mIndex;

        public TaskThread(int i17) {
            this.mIndex = i17;
            setName("download_thread_" + this.mIndex);
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.tencent.tmassistantsdk.downloadservice.DownloadTask downloadTask;
            com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TAG, "Thread " + this.mIndex + " starts running...");
            while (true) {
                synchronized (com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mThreadlock) {
                    try {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TAG, "Thread " + this.mIndex + " is waitting...");
                        com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mThreadlock.wait();
                    } catch (java.lang.InterruptedException e17) {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TAG, "Thread " + this.mIndex + " is interrupted...");
                        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TAG, e17, "", new java.lang.Object[0]);
                        return;
                    }
                }
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TAG, "Thread " + this.mIndex + " is interrupted...");
                    return;
                }
                while (com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.hasWaitingTask()) {
                    synchronized (com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mTaskLock) {
                        if (com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mWaitingList.size() > 0) {
                            downloadTask = com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mWaitingList.remove();
                            com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mExecList.add(downloadTask);
                        } else {
                            downloadTask = null;
                        }
                    }
                    if (java.lang.Thread.currentThread().isInterrupted()) {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TAG, "Thread " + this.mIndex + " is interrupted...");
                        return;
                    }
                    if (downloadTask != null) {
                        com.tencent.tmassistantsdk.util.TMLog.i(com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TAG, "TaskThread::Run ThreadName: " + getName() + " url: " + downloadTask.getDownloadURI());
                        android.os.PowerManager.WakeLock wakeLock = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getWakeLock();
                        downloadTask.exec(getName());
                        if (wakeLock != null) {
                            yj0.a.c(wakeLock, "com/tencent/tmassistantsdk/downloadservice/DownloadThreadPool$TaskThread", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                            wakeLock.release();
                            yj0.a.f(wakeLock, "com/tencent/tmassistantsdk/downloadservice/DownloadThreadPool$TaskThread", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                        }
                    }
                    synchronized (com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mTaskLock) {
                        if (downloadTask != null) {
                            com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mExecList.remove(downloadTask);
                        }
                    }
                }
            }
        }
    }

    private DownloadThreadPool() {
        java.util.Comparator<com.tencent.tmassistantsdk.downloadservice.DownloadTask> comparator = new java.util.Comparator<com.tencent.tmassistantsdk.downloadservice.DownloadTask>() { // from class: com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.1
            @Override // java.util.Comparator
            public int compare(com.tencent.tmassistantsdk.downloadservice.DownloadTask downloadTask, com.tencent.tmassistantsdk.downloadservice.DownloadTask downloadTask2) {
                if (downloadTask.getPriority() > downloadTask2.getPriority()) {
                    return 1;
                }
                return downloadTask.getPriority() == downloadTask2.getPriority() ? 0 : -1;
            }
        };
        this.mPriorityQueueComparator = comparator;
        this.mWaitingList = new java.util.PriorityQueue<>(16, comparator);
        this.mExecList = new java.util.ArrayList<>();
        this.mDownloadThreadList = new java.util.ArrayList<>();
        this.mThreadlock = new java.lang.Object();
        this.mTaskLock = new java.lang.Object();
        int maxTaskNum = com.tencent.tmassistantsdk.downloadservice.DownloadSetting.getInstance().getMaxTaskNum();
        for (int i17 = 0; i17 < maxTaskNum; i17++) {
            this.mDownloadThreadList.add(new com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.TaskThread(i17));
        }
    }

    public static com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool getInstance() {
        if (mDownloadThreadPool == null) {
            mDownloadThreadPool = new com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool();
        }
        return mDownloadThreadPool;
    }

    public int addDownloadTask(com.tencent.tmassistantsdk.downloadservice.DownloadTask downloadTask) {
        int taskId;
        synchronized (this.mTaskLock) {
            this.mWaitingList.add(downloadTask);
            synchronized (this.mThreadlock) {
                this.mThreadlock.notifyAll();
            }
            taskId = downloadTask.getTaskId();
        }
        return taskId;
    }

    public void cancelDownloadTask(final int i17) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mTaskLock) {
                    java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.DownloadTask> it = com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mExecList.iterator();
                    while (it.hasNext()) {
                        com.tencent.tmassistantsdk.downloadservice.DownloadTask next = it.next();
                        if (next.getTaskId() == i17) {
                            next.cancel();
                            com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mExecList.remove(next);
                            return;
                        }
                    }
                    java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.DownloadTask> it6 = com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mWaitingList.iterator();
                    while (it6.hasNext()) {
                        com.tencent.tmassistantsdk.downloadservice.DownloadTask next2 = it6.next();
                        if (next2.getTaskId() == i17) {
                            next2.cancel();
                            com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.this.mWaitingList.remove(next2);
                            return;
                        }
                    }
                }
            }
        }).start();
    }

    public com.tencent.tmassistantsdk.downloadservice.DownloadTask getDownloadTask(java.lang.String str) {
        synchronized (this.mTaskLock) {
            java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.DownloadTask> it = this.mExecList.iterator();
            while (it.hasNext()) {
                com.tencent.tmassistantsdk.downloadservice.DownloadTask next = it.next();
                if (next.getDownloadURI().equals(str)) {
                    return next;
                }
            }
            java.util.Iterator<com.tencent.tmassistantsdk.downloadservice.DownloadTask> it6 = this.mWaitingList.iterator();
            while (it6.hasNext()) {
                com.tencent.tmassistantsdk.downloadservice.DownloadTask next2 = it6.next();
                if (next2.getDownloadURI().equals(str)) {
                    return next2;
                }
            }
            return null;
        }
    }

    public boolean hasWaitingTask() {
        boolean z17;
        synchronized (this.mTaskLock) {
            z17 = this.mWaitingList.size() > 0;
        }
        return z17;
    }
}
