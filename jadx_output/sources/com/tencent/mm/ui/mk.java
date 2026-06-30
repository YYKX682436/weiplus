package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public class mk implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r.a f209148d;

    public mk(r.a aVar) {
        this.f209148d = aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f209148d.apply(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.tencent.mm.ui.qk qkVar;
        java.util.WeakHashMap weakHashMap = com.tencent.mm.ui.qk.f209574c;
        synchronized (weakHashMap) {
            qkVar = (com.tencent.mm.ui.qk) weakHashMap.remove(activity);
        }
        if (qkVar != null) {
            synchronized (qkVar.f209575a) {
                ((java.util.HashSet) qkVar.f209575a).clear();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        this.f209148d.apply(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
