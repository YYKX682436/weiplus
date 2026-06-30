package com.tencent.unit_rc.cleaner;

/* loaded from: classes16.dex */
public final class Cleaner {
    final com.tencent.unit_rc.cleaner.CleanerImpl impl = new com.tencent.unit_rc.cleaner.CleanerImpl();

    /* loaded from: classes16.dex */
    public interface Cleanable {
        void clean();
    }

    private Cleaner() {
    }

    public static com.tencent.unit_rc.cleaner.Cleaner create() {
        com.tencent.unit_rc.cleaner.Cleaner cleaner = new com.tencent.unit_rc.cleaner.Cleaner();
        cleaner.impl.start(cleaner);
        return cleaner;
    }

    public com.tencent.unit_rc.cleaner.Cleaner.Cleanable register(java.lang.Object obj, java.lang.Runnable runnable) {
        java.util.Objects.requireNonNull(obj, "obj");
        java.util.Objects.requireNonNull(runnable, "action");
        return new com.tencent.unit_rc.cleaner.CleanerImpl.PhantomCleanableRef(obj, this, runnable);
    }
}
