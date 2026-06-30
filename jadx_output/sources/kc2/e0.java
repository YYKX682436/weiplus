package kc2;

/* loaded from: classes15.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f306358d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f306359e;

    public e0(java.lang.ref.WeakReference rManager, java.lang.String key) {
        kotlin.jvm.internal.o.g(rManager, "rManager");
        kotlin.jvm.internal.o.g(key, "key");
        this.f306358d = rManager;
        this.f306359e = key;
    }

    @Override // java.lang.Runnable
    public void run() {
        kc2.g1 g1Var = (kc2.g1) this.f306358d.get();
        jz5.f0 f0Var = null;
        if (g1Var != null) {
            g1Var.q(kc2.w1.f306514e, this.f306359e);
            g1Var.A = null;
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderKaraInfoManager", "ClickWatchTask run but manager is null!");
        }
    }
}
