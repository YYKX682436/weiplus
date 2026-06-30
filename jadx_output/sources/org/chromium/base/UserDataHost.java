package org.chromium.base;

/* loaded from: classes7.dex */
public final class UserDataHost {
    private final long mThreadId = android.os.Process.myTid();
    private java.util.HashMap<java.lang.Class<? extends org.chromium.base.UserData>, org.chromium.base.UserData> mUserDataMap = new java.util.HashMap<>();

    private static void checkArgument(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException("Neither key nor object of UserDataHost can be null.");
        }
    }

    private void checkThreadAndState() {
        if (this.mThreadId != android.os.Process.myTid()) {
            throw new java.lang.IllegalStateException("UserData must only be used on a single thread.");
        }
        if (this.mUserDataMap == null) {
            throw new java.lang.IllegalStateException("Operation is not allowed after destroy().");
        }
    }

    public void destroy() {
        checkThreadAndState();
        java.util.HashMap<java.lang.Class<? extends org.chromium.base.UserData>, org.chromium.base.UserData> hashMap = this.mUserDataMap;
        this.mUserDataMap = null;
        java.util.Iterator<org.chromium.base.UserData> it = hashMap.values().iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    public <T extends org.chromium.base.UserData> T getUserData(java.lang.Class<T> cls) {
        checkThreadAndState();
        checkArgument(cls != null);
        return cls.cast(this.mUserDataMap.get(cls));
    }

    public <T extends org.chromium.base.UserData> T removeUserData(java.lang.Class<T> cls) {
        checkThreadAndState();
        checkArgument(cls != null);
        if (this.mUserDataMap.containsKey(cls)) {
            return cls.cast(this.mUserDataMap.remove(cls));
        }
        throw new java.lang.IllegalStateException("UserData for the key is not present.");
    }

    public <T extends org.chromium.base.UserData> T setUserData(java.lang.Class<T> cls, T t17) {
        checkThreadAndState();
        checkArgument((cls == null || t17 == null) ? false : true);
        this.mUserDataMap.put(cls, t17);
        return (T) getUserData(cls);
    }
}
