package org.chromium.base;

/* loaded from: classes16.dex */
public final class UnownedUserDataKey<T extends org.chromium.base.UnownedUserData> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.lang.Class<T> mClazz;
    private final java.util.Set<org.chromium.base.UnownedUserDataHost> mWeakHostAttachments = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());

    public UnownedUserDataKey(java.lang.Class<T> cls) {
        this.mClazz = cls;
    }

    private void assertNoDestroyedAttachments() {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS) {
            java.util.Iterator<org.chromium.base.UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
            while (it.hasNext()) {
                if (it.next().isDestroyed()) {
                    throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private void removeHostAttachment(org.chromium.base.UnownedUserDataHost unownedUserDataHost) {
        unownedUserDataHost.remove(this);
        this.mWeakHostAttachments.remove(unownedUserDataHost);
    }

    public final void attachToHost(org.chromium.base.UnownedUserDataHost unownedUserDataHost, T t17) {
        java.util.Objects.requireNonNull(t17);
        unownedUserDataHost.set(this, t17);
        if (isAttachedToHost(unownedUserDataHost)) {
            return;
        }
        this.mWeakHostAttachments.add(unownedUserDataHost);
    }

    public final void detachFromAllHosts(T t17) {
        assertNoDestroyedAttachments();
        java.util.Iterator it = new java.util.ArrayList(this.mWeakHostAttachments).iterator();
        while (it.hasNext()) {
            org.chromium.base.UnownedUserDataHost unownedUserDataHost = (org.chromium.base.UnownedUserDataHost) it.next();
            if (t17.equals(unownedUserDataHost.get(this))) {
                removeHostAttachment(unownedUserDataHost);
            }
        }
    }

    public final void detachFromHost(org.chromium.base.UnownedUserDataHost unownedUserDataHost) {
        assertNoDestroyedAttachments();
        java.util.Iterator it = new java.util.ArrayList(this.mWeakHostAttachments).iterator();
        while (it.hasNext()) {
            org.chromium.base.UnownedUserDataHost unownedUserDataHost2 = (org.chromium.base.UnownedUserDataHost) it.next();
            if (unownedUserDataHost.equals(unownedUserDataHost2)) {
                removeHostAttachment(unownedUserDataHost2);
            }
        }
    }

    public int getHostAttachmentCount(T t17) {
        assertNoDestroyedAttachments();
        java.util.Iterator<org.chromium.base.UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (t17.equals(it.next().get(this))) {
                i17++;
            }
        }
        return i17;
    }

    public final java.lang.Class<T> getValueClass() {
        return this.mClazz;
    }

    public final boolean isAttachedToAnyHost(T t17) {
        return getHostAttachmentCount(t17) > 0;
    }

    public final boolean isAttachedToHost(org.chromium.base.UnownedUserDataHost unownedUserDataHost) {
        return retrieveDataFromHost(unownedUserDataHost) != null;
    }

    public final T retrieveDataFromHost(org.chromium.base.UnownedUserDataHost unownedUserDataHost) {
        assertNoDestroyedAttachments();
        java.util.Iterator<org.chromium.base.UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
        while (it.hasNext()) {
            if (unownedUserDataHost.equals(it.next())) {
                return (T) unownedUserDataHost.get(this);
            }
        }
        return null;
    }
}
