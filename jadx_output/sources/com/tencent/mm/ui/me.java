package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class me implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ne f209123e;

    public me(com.tencent.mm.ui.ne neVar, int i17) {
        this.f209123e = neVar;
        this.f209122d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.he heVar = this.f209123e.f209416d;
        com.tencent.mm.ui.t1 t1Var = heVar.f208866g;
        if (t1Var != null) {
            ((com.tencent.mm.ui.LauncherUIBottomTabView) t1Var).k(this.f209122d);
            ((com.tencent.mm.ui.HomeUI) heVar.f208864e).w(false);
        }
    }
}
