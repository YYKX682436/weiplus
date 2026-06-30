package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes9.dex */
public enum n {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public boolean f181376d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181377e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f181378f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f181379g = new java.util.HashSet();

    n() {
    }

    public void a(java.lang.ref.WeakReference weakReference) {
        java.util.HashSet hashSet = this.f181379g;
        if (hashSet != null) {
            if (weakReference.get() != null) {
                ((android.app.Activity) weakReference.get()).getClass();
            }
            hashSet.add(weakReference);
        }
    }

    public void h() {
        java.util.Iterator it = this.f181379g.iterator();
        while (it.hasNext()) {
            android.app.Activity activity = (android.app.Activity) ((java.lang.ref.WeakReference) it.next()).get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
            it.remove();
        }
    }

    public void i() {
        synchronized (this.f181378f) {
            this.f181377e = true;
        }
    }

    public void j(boolean z17) {
        synchronized (this.f181378f) {
            this.f181376d = z17;
        }
    }

    public void k(boolean z17) {
        synchronized (this.f181378f) {
            this.f181377e = z17;
        }
    }
}
