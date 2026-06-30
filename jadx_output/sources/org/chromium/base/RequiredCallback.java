package org.chromium.base;

/* loaded from: classes16.dex */
public class RequiredCallback<T> implements org.chromium.base.Callback<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private org.chromium.base.Callback<T> mCallback;
    private final org.chromium.base.LifetimeAssert mLifetimeAssert = org.chromium.base.LifetimeAssert.create(this);

    public RequiredCallback(org.chromium.base.Callback<T> callback) {
        this.mCallback = callback;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public void lambda$bind$0(T t17) {
        this.mCallback.lambda$bind$0(t17);
        org.chromium.base.LifetimeAssert.setSafeToGc(this.mLifetimeAssert, true);
        this.mCallback = null;
    }
}
