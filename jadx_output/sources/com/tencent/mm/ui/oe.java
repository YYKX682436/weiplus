package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class oe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.pe f209473e;

    public oe(com.tencent.mm.ui.pe peVar, int i17) {
        this.f209473e = peVar;
        this.f209472d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.t1 t1Var = this.f209473e.f209504d.f208866g;
        if (t1Var != null) {
            ((com.tencent.mm.ui.LauncherUIBottomTabView) t1Var).i(this.f209472d);
        }
    }
}
