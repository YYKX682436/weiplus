package org.chromium.base;

/* loaded from: classes16.dex */
public class LifetimeAssert {
    static org.chromium.base.LifetimeAssert.TestHook sTestHook;
    private final java.lang.Object mTarget;
    final org.chromium.base.LifetimeAssert.WrappedReference mWrapper;

    /* loaded from: classes16.dex */
    public static class CreationException extends java.lang.RuntimeException {
        public CreationException() {
            super("vvv This is where object was created. vvv");
        }
    }

    /* loaded from: classes16.dex */
    public static class LifetimeAssertException extends java.lang.RuntimeException {
        public LifetimeAssertException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    /* loaded from: classes16.dex */
    public interface TestHook {
        void onCleaned(org.chromium.base.LifetimeAssert.WrappedReference wrappedReference, java.lang.String str);
    }

    /* loaded from: classes16.dex */
    public static class WrappedReference extends java.lang.ref.PhantomReference<java.lang.Object> {
        final org.chromium.base.LifetimeAssert.CreationException mCreationException;
        boolean mSafeToGc;
        final java.lang.Class<?> mTargetClass;
        private static java.lang.ref.ReferenceQueue<java.lang.Object> sReferenceQueue = new java.lang.ref.ReferenceQueue<>();
        private static java.util.Set<org.chromium.base.LifetimeAssert.WrappedReference> sActiveWrappers = java.util.Collections.synchronizedSet(new java.util.HashSet());

        static {
            new java.lang.Thread("GcStateAssertQueue") { // from class: org.chromium.base.LifetimeAssert.WrappedReference.1
                {
                    setDaemon(true);
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    org.chromium.base.LifetimeAssert.WrappedReference wrappedReference;
                    java.lang.String format;
                    while (true) {
                        try {
                            wrappedReference = (org.chromium.base.LifetimeAssert.WrappedReference) org.chromium.base.LifetimeAssert.WrappedReference.sReferenceQueue.remove();
                            if (org.chromium.base.LifetimeAssert.WrappedReference.sActiveWrappers.remove(wrappedReference)) {
                                if (!wrappedReference.mSafeToGc) {
                                    format = java.lang.String.format("Object of type %s was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.", wrappedReference.mTargetClass.getName());
                                    org.chromium.base.LifetimeAssert.TestHook testHook = org.chromium.base.LifetimeAssert.sTestHook;
                                    if (testHook == null) {
                                        break;
                                    } else {
                                        testHook.onCleaned(wrappedReference, format);
                                    }
                                } else {
                                    org.chromium.base.LifetimeAssert.TestHook testHook2 = org.chromium.base.LifetimeAssert.sTestHook;
                                    if (testHook2 != null) {
                                        testHook2.onCleaned(wrappedReference, null);
                                    }
                                }
                            }
                        } catch (java.lang.InterruptedException e17) {
                            throw new java.lang.RuntimeException(e17);
                        }
                    }
                    throw new org.chromium.base.LifetimeAssert.LifetimeAssertException(format, wrappedReference.mCreationException);
                }
            };
        }

        public WrappedReference(java.lang.Object obj, org.chromium.base.LifetimeAssert.CreationException creationException, boolean z17) {
            super(obj, sReferenceQueue);
            this.mCreationException = creationException;
            this.mSafeToGc = z17;
            this.mTargetClass = obj.getClass();
            sActiveWrappers.add(this);
        }
    }

    private LifetimeAssert(org.chromium.base.LifetimeAssert.WrappedReference wrappedReference, java.lang.Object obj) {
        this.mWrapper = wrappedReference;
        this.mTarget = obj;
    }

    public static void assertAllInstancesDestroyedForTesting() {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
            synchronized (org.chromium.base.LifetimeAssert.WrappedReference.sActiveWrappers) {
                try {
                    for (org.chromium.base.LifetimeAssert.WrappedReference wrappedReference : org.chromium.base.LifetimeAssert.WrappedReference.sActiveWrappers) {
                        if (!wrappedReference.mSafeToGc) {
                            throw new org.chromium.base.LifetimeAssert.LifetimeAssertException(java.lang.String.format("Object of type %s was not destroyed after test completed. Refer to \"Caused by\" for where object was created.", wrappedReference.mTargetClass.getName()), wrappedReference.mCreationException);
                        }
                    }
                } finally {
                    org.chromium.base.LifetimeAssert.WrappedReference.sActiveWrappers.clear();
                }
            }
        }
    }

    public static org.chromium.base.LifetimeAssert create(java.lang.Object obj) {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
            return new org.chromium.base.LifetimeAssert(new org.chromium.base.LifetimeAssert.WrappedReference(obj, new org.chromium.base.LifetimeAssert.CreationException(), false), obj);
        }
        return null;
    }

    public static void resetForTesting() {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
            org.chromium.base.LifetimeAssert.WrappedReference.sActiveWrappers.clear();
        }
    }

    public static void setSafeToGc(org.chromium.base.LifetimeAssert lifetimeAssert, boolean z17) {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
            synchronized (lifetimeAssert.mTarget) {
                lifetimeAssert.mWrapper.mSafeToGc = z17;
            }
        }
    }

    public static org.chromium.base.LifetimeAssert create(java.lang.Object obj, boolean z17) {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
            return new org.chromium.base.LifetimeAssert(new org.chromium.base.LifetimeAssert.WrappedReference(obj, new org.chromium.base.LifetimeAssert.CreationException(), z17), obj);
        }
        return null;
    }
}
