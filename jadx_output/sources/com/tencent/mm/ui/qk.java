package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public class qk {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f209573b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.WeakHashMap f209574c = new java.util.WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f209575a = new java.util.HashSet();

    public qk(android.app.Activity activity) {
        activity.runOnUiThread(new com.tencent.mm.ui.pk(this, activity));
    }

    public static android.view.WindowInsets b(android.app.Activity activity) {
        return activity.getWindow().getDecorView().getRootWindowInsets();
    }

    public static com.tencent.mm.ui.qk c(android.app.Activity activity, boolean z17) {
        com.tencent.mm.ui.qk qkVar;
        java.util.WeakHashMap weakHashMap = f209574c;
        synchronized (weakHashMap) {
            qkVar = (com.tencent.mm.ui.qk) weakHashMap.get(activity);
            if (qkVar == null && z17) {
                qkVar = new com.tencent.mm.ui.qk(activity);
                weakHashMap.put(activity, qkVar);
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f209573b;
                if (!atomicBoolean.get() && activity.getApplication() != null) {
                    activity.getApplication().registerActivityLifecycleCallbacks(new com.tencent.mm.ui.mk(new com.tencent.mm.ui.lk()));
                    atomicBoolean.set(true);
                }
            }
        }
        return qkVar;
    }

    public void a(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (onApplyWindowInsetsListener == null) {
            return;
        }
        synchronized (this.f209575a) {
            ((java.util.HashSet) this.f209575a).add(onApplyWindowInsetsListener);
        }
    }

    public void d(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (onApplyWindowInsetsListener == null) {
            return;
        }
        synchronized (this.f209575a) {
            ((java.util.HashSet) this.f209575a).remove(onApplyWindowInsetsListener);
        }
    }
}
