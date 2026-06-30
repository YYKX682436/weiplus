package org.chromium.base;

/* loaded from: classes16.dex */
public final class UnownedUserDataHost {
    private final org.chromium.base.lifetime.DestroyChecker mDestroyChecker;
    private android.os.Handler mHandler;
    private final org.chromium.base.ThreadUtils.ThreadChecker mThreadChecker;
    private java.util.HashMap<org.chromium.base.UnownedUserDataKey<?>, java.lang.ref.WeakReference<? extends org.chromium.base.UnownedUserData>> mUnownedUserDataMap;

    public UnownedUserDataHost() {
        this(new android.os.Handler(retrieveNonNullLooperOrThrow()));
    }

    private void checkState() {
        this.mThreadChecker.assertOnValidThread();
        this.mDestroyChecker.checkNotDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$remove$0(org.chromium.base.UnownedUserData unownedUserData) {
        unownedUserData.onDetachedFromHost(this);
    }

    private static android.os.Looper retrieveNonNullLooperOrThrow() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        throw new java.lang.IllegalStateException();
    }

    public void destroy() {
        this.mThreadChecker.assertOnValidThread();
        if (this.mDestroyChecker.isDestroyed()) {
            return;
        }
        java.util.Iterator it = new java.util.HashSet(this.mUnownedUserDataMap.keySet()).iterator();
        while (it.hasNext()) {
            ((org.chromium.base.UnownedUserDataKey) it.next()).detachFromHost(this);
        }
        this.mUnownedUserDataMap = null;
        this.mHandler = null;
        this.mDestroyChecker.destroy();
    }

    public <T extends org.chromium.base.UnownedUserData> T get(org.chromium.base.UnownedUserDataKey<T> unownedUserDataKey) {
        checkState();
        java.lang.ref.WeakReference<? extends org.chromium.base.UnownedUserData> weakReference = this.mUnownedUserDataMap.get(unownedUserDataKey);
        if (weakReference == null) {
            return null;
        }
        org.chromium.base.UnownedUserData unownedUserData = weakReference.get();
        if (unownedUserData != null) {
            return unownedUserDataKey.getValueClass().cast(unownedUserData);
        }
        unownedUserDataKey.detachFromHost(this);
        return null;
    }

    public int getMapSize() {
        checkState();
        return this.mUnownedUserDataMap.size();
    }

    public boolean isDestroyed() {
        return this.mDestroyChecker.isDestroyed();
    }

    public <T extends org.chromium.base.UnownedUserData> void remove(org.chromium.base.UnownedUserDataKey<T> unownedUserDataKey) {
        final org.chromium.base.UnownedUserData unownedUserData;
        checkState();
        java.lang.ref.WeakReference<? extends org.chromium.base.UnownedUserData> remove = this.mUnownedUserDataMap.remove(unownedUserDataKey);
        if (remove == null || (unownedUserData = remove.get()) == null || !unownedUserData.informOnDetachmentFromHost()) {
            return;
        }
        this.mHandler.post(new java.lang.Runnable() { // from class: org.chromium.base.UnownedUserDataHost$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.base.UnownedUserDataHost.this.lambda$remove$0(unownedUserData);
            }
        });
    }

    public <T extends org.chromium.base.UnownedUserData> void set(org.chromium.base.UnownedUserDataKey<T> unownedUserDataKey, T t17) {
        checkState();
        if (this.mUnownedUserDataMap.containsKey(unownedUserDataKey) && !t17.equals(get(unownedUserDataKey))) {
            unownedUserDataKey.detachFromHost(this);
        }
        this.mUnownedUserDataMap.put(unownedUserDataKey, new java.lang.ref.WeakReference<>(t17));
    }

    public UnownedUserDataHost(android.os.Handler handler) {
        this.mThreadChecker = new org.chromium.base.ThreadUtils.ThreadChecker();
        this.mDestroyChecker = new org.chromium.base.lifetime.DestroyChecker();
        this.mUnownedUserDataMap = new java.util.HashMap<>();
        this.mHandler = handler;
    }
}
