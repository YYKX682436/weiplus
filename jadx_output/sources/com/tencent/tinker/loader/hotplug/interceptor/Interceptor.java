package com.tencent.tinker.loader.hotplug.interceptor;

/* loaded from: classes13.dex */
public abstract class Interceptor<T_TARGET> {
    private static final java.lang.String TAG = "Tinker.Interceptor";
    private T_TARGET mTarget = null;
    private volatile boolean mInstalled = false;

    /* loaded from: classes13.dex */
    public interface ITinkerHotplugProxy {
    }

    public T_TARGET decorate(T_TARGET t_target) {
        return t_target;
    }

    public abstract T_TARGET fetchTarget();

    public abstract void inject(T_TARGET t_target);

    public synchronized void install() {
        try {
            T_TARGET fetchTarget = fetchTarget();
            this.mTarget = fetchTarget;
            T_TARGET decorate = decorate(fetchTarget);
            if (decorate != fetchTarget) {
                inject(decorate);
            } else {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.w(TAG, "target: " + fetchTarget + " was already hooked.", new java.lang.Object[0]);
            }
            this.mInstalled = true;
        } catch (java.lang.Throwable th6) {
            this.mTarget = null;
            throw new com.tencent.tinker.loader.hotplug.interceptor.InterceptFailedException(th6);
        }
    }

    public synchronized void uninstall() {
        com.tencent.tinker.loader.hotplug.interceptor.InterceptFailedException interceptFailedException;
        if (this.mInstalled) {
            try {
                inject(this.mTarget);
                this.mTarget = null;
                this.mInstalled = false;
            } finally {
            }
        }
    }
}
