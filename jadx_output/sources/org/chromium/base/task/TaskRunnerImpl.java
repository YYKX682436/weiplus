package org.chromium.base.task;

@org.chromium.base.annotations.JNINamespace(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE)
/* loaded from: classes13.dex */
public class TaskRunnerImpl implements org.chromium.base.task.TaskRunner {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mDidOneTimeInitialization;
    private volatile long mNativeTaskRunnerAndroid;
    private java.util.List<android.util.Pair<java.lang.Runnable, java.lang.Long>> mPreNativeDelayedTasks;
    private final java.lang.Object mPreNativeTaskLock;
    private java.util.LinkedList<java.lang.Runnable> mPreNativeTasks;
    protected final java.lang.Runnable mRunPreNativeTaskClosure;
    private final int mTaskRunnerType;
    private final int mTaskTraits;
    private final java.lang.String mTraceEvent;
    private static final java.lang.ref.ReferenceQueue<java.lang.Object> sQueue = new java.lang.ref.ReferenceQueue<>();
    private static final java.util.Set<org.chromium.base.task.TaskRunnerImpl.TaskRunnerCleaner> sCleaners = new java.util.HashSet();

    /* loaded from: classes13.dex */
    public interface Natives {
        boolean belongsToCurrentThread(long j17);

        void destroy(long j17);

        long init(int i17, int i18);

        void postDelayedTask(long j17, java.lang.Runnable runnable, long j18, java.lang.String str);
    }

    /* loaded from: classes13.dex */
    public static class TaskRunnerCleaner extends java.lang.ref.WeakReference<org.chromium.base.task.TaskRunnerImpl> {
        final long mNativePtr;

        public TaskRunnerCleaner(org.chromium.base.task.TaskRunnerImpl taskRunnerImpl) {
            super(taskRunnerImpl, org.chromium.base.task.TaskRunnerImpl.sQueue);
            this.mNativePtr = taskRunnerImpl.mNativeTaskRunnerAndroid;
        }

        public void destroy() {
            org.chromium.base.task.TaskRunnerImplJni.get().destroy(this.mNativePtr);
        }
    }

    public TaskRunnerImpl(int i17) {
        this(i17, "TaskRunnerImpl", 0);
        destroyGarbageCollectedTaskRunners();
    }

    private static void destroyGarbageCollectedTaskRunners() {
        while (true) {
            org.chromium.base.task.TaskRunnerImpl.TaskRunnerCleaner taskRunnerCleaner = (org.chromium.base.task.TaskRunnerImpl.TaskRunnerCleaner) sQueue.poll();
            if (taskRunnerCleaner == null) {
                return;
            }
            taskRunnerCleaner.destroy();
            java.util.Set<org.chromium.base.task.TaskRunnerImpl.TaskRunnerCleaner> set = sCleaners;
            synchronized (set) {
                set.remove(taskRunnerCleaner);
            }
        }
    }

    private void oneTimeInitialization() {
        if (this.mDidOneTimeInitialization) {
            return;
        }
        this.mDidOneTimeInitialization = true;
        if (!org.chromium.base.task.PostTask.registerPreNativeTaskRunner(this)) {
            initNativeTaskRunner();
        } else {
            this.mPreNativeTasks = new java.util.LinkedList<>();
            this.mPreNativeDelayedTasks = new java.util.ArrayList();
        }
    }

    public java.lang.Boolean belongsToCurrentThreadInternal() {
        synchronized (this.mPreNativeTaskLock) {
            oneTimeInitialization();
        }
        if (this.mNativeTaskRunnerAndroid == 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(org.chromium.base.task.TaskRunnerImplJni.get().belongsToCurrentThread(this.mNativeTaskRunnerAndroid));
    }

    public int clearTaskQueueForTesting() {
        int i17;
        synchronized (this.mPreNativeTaskLock) {
            java.util.LinkedList<java.lang.Runnable> linkedList = this.mPreNativeTasks;
            if (linkedList != null) {
                i17 = linkedList.size() + this.mPreNativeDelayedTasks.size();
                this.mPreNativeTasks.clear();
                this.mPreNativeDelayedTasks.clear();
            } else {
                i17 = 0;
            }
        }
        return i17;
    }

    public void initNativeTaskRunner() {
        long init = org.chromium.base.task.TaskRunnerImplJni.get().init(this.mTaskRunnerType, this.mTaskTraits);
        synchronized (this.mPreNativeTaskLock) {
            java.util.LinkedList<java.lang.Runnable> linkedList = this.mPreNativeTasks;
            if (linkedList != null) {
                java.util.Iterator<java.lang.Runnable> it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.Runnable next = it.next();
                    org.chromium.base.task.TaskRunnerImplJni.get().postDelayedTask(init, next, 0L, next.getClass().getName());
                }
                this.mPreNativeTasks = null;
            }
            java.util.List<android.util.Pair<java.lang.Runnable, java.lang.Long>> list = this.mPreNativeDelayedTasks;
            if (list != null) {
                for (android.util.Pair<java.lang.Runnable, java.lang.Long> pair : list) {
                    org.chromium.base.task.TaskRunnerImplJni.get().postDelayedTask(init, (java.lang.Runnable) pair.first, ((java.lang.Long) pair.second).longValue(), pair.getClass().getName());
                }
                this.mPreNativeDelayedTasks = null;
            }
            this.mNativeTaskRunnerAndroid = init;
        }
        java.util.Set<org.chromium.base.task.TaskRunnerImpl.TaskRunnerCleaner> set = sCleaners;
        synchronized (set) {
            set.add(new org.chromium.base.task.TaskRunnerImpl.TaskRunnerCleaner(this));
        }
        destroyGarbageCollectedTaskRunners();
    }

    @Override // org.chromium.base.task.TaskRunner
    public void postDelayedTask(java.lang.Runnable runnable, long j17) {
        if (this.mNativeTaskRunnerAndroid != 0) {
            org.chromium.base.task.TaskRunnerImplJni.get().postDelayedTask(this.mNativeTaskRunnerAndroid, runnable, j17, runnable.getClass().getName());
            return;
        }
        synchronized (this.mPreNativeTaskLock) {
            oneTimeInitialization();
            if (this.mNativeTaskRunnerAndroid != 0) {
                org.chromium.base.task.TaskRunnerImplJni.get().postDelayedTask(this.mNativeTaskRunnerAndroid, runnable, j17, runnable.getClass().getName());
                return;
            }
            if (j17 == 0) {
                this.mPreNativeTasks.add(runnable);
                schedulePreNativeTask();
            } else if (!schedulePreNativeDelayedTask(runnable, j17)) {
                this.mPreNativeDelayedTasks.add(new android.util.Pair<>(runnable, java.lang.Long.valueOf(j17)));
            }
        }
    }

    @Override // org.chromium.base.task.TaskRunner
    public void postTask(java.lang.Runnable runnable) {
        postDelayedTask(runnable, 0L);
    }

    public void runPreNativeTask() {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped(this.mTraceEvent);
        try {
            synchronized (this.mPreNativeTaskLock) {
                java.util.LinkedList<java.lang.Runnable> linkedList = this.mPreNativeTasks;
                if (linkedList == null) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                java.lang.Runnable poll = linkedList.poll();
                int i17 = this.mTaskTraits;
                if (i17 == 0 || i17 == 1) {
                    android.os.Process.setThreadPriority(10);
                } else if (i17 == 2 || i17 == 3) {
                    android.os.Process.setThreadPriority(0);
                } else if (i17 == 4 || i17 == 5) {
                    android.os.Process.setThreadPriority(-1);
                }
                poll.run();
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public boolean schedulePreNativeDelayedTask(java.lang.Runnable runnable, long j17) {
        return false;
    }

    public void schedulePreNativeTask() {
        org.chromium.base.task.PostTask.getPrenativeThreadPoolExecutor().execute(this.mRunPreNativeTaskClosure);
    }

    public TaskRunnerImpl(int i17, java.lang.String str, int i18) {
        this.mRunPreNativeTaskClosure = new java.lang.Runnable() { // from class: org.chromium.base.task.TaskRunnerImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.base.task.TaskRunnerImpl.this.runPreNativeTask();
            }
        };
        this.mPreNativeTaskLock = new java.lang.Object();
        this.mTaskTraits = i17;
        this.mTraceEvent = str + ".PreNativeTask.run";
        this.mTaskRunnerType = i18;
    }
}
