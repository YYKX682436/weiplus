package com.tencent.unit_rc.cleaner;

/* loaded from: classes16.dex */
public final class CleanerImpl implements java.lang.Runnable {
    final com.tencent.unit_rc.cleaner.PhantomCleanable<?> phantomCleanableList = new com.tencent.unit_rc.cleaner.CleanerImpl.PhantomCleanableRef();
    final java.lang.ref.ReferenceQueue<java.lang.Object> queue = new java.lang.ref.ReferenceQueue<>();
    volatile java.util.concurrent.atomic.AtomicBoolean isRunning = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static com.tencent.unit_rc.cleaner.CleanerImpl getCleanerImpl(com.tencent.unit_rc.cleaner.Cleaner cleaner) {
        return cleaner.impl;
    }

    public void ensureStart(com.tencent.unit_rc.cleaner.Cleaner cleaner) {
        if (this.isRunning.get()) {
            return;
        }
        start(cleaner);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.isRunning.compareAndSet(false, true)) {
            com.tencent.unit_rc.UnitRCLog.info("Cleaner, break run");
            return;
        }
        while (!this.phantomCleanableList.isListEmpty()) {
            try {
                com.tencent.unit_rc.cleaner.Cleaner.Cleanable cleanable = (com.tencent.unit_rc.cleaner.Cleaner.Cleanable) this.queue.remove(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
                if (cleanable != null) {
                    cleanable.clean();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        this.isRunning.set(false);
    }

    public void start(com.tencent.unit_rc.cleaner.Cleaner cleaner) {
        if (getCleanerImpl(cleaner) != this) {
            throw new java.lang.AssertionError("wrong cleaner");
        }
        com.tencent.unit_rc.UnitRCLog.info("Cleaner, start");
        com.tencent.unit_rc.Executor.get().execute(this);
    }

    /* loaded from: classes16.dex */
    public static final class PhantomCleanableRef extends com.tencent.unit_rc.cleaner.PhantomCleanable<java.lang.Object> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.lang.Runnable action;

        public PhantomCleanableRef(java.lang.Object obj, com.tencent.unit_rc.cleaner.Cleaner cleaner, java.lang.Runnable runnable) {
            super(obj, cleaner);
            this.action = runnable;
            com.tencent.unit_rc.cleaner.CleanerImpl.getCleanerImpl(cleaner).ensureStart(cleaner);
        }

        @Override // com.tencent.unit_rc.cleaner.PhantomCleanable, java.lang.ref.Reference
        public void clear() {
            throw new java.lang.UnsupportedOperationException("clear");
        }

        @Override // java.lang.ref.PhantomReference, java.lang.ref.Reference
        public java.lang.Object get() {
            throw new java.lang.UnsupportedOperationException("get");
        }

        @Override // com.tencent.unit_rc.cleaner.PhantomCleanable
        public void performCleanup() {
            this.action.run();
        }

        public PhantomCleanableRef() {
            this.action = null;
        }
    }
}
