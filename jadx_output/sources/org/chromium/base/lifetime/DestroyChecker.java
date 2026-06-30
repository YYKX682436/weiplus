package org.chromium.base.lifetime;

/* loaded from: classes16.dex */
public class DestroyChecker implements org.chromium.base.lifetime.Destroyable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mIsDestroyed;

    public void checkNotDestroyed() {
    }

    @Override // org.chromium.base.lifetime.Destroyable
    public void destroy() {
        checkNotDestroyed();
        this.mIsDestroyed = true;
    }

    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }
}
