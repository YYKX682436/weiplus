package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class af implements com.tencent.mm.plugin.newtips.model.n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f197133a;

    public af(com.tencent.mm.ui.t1 t1Var) {
        this.f197133a = new java.lang.ref.WeakReference(t1Var);
    }

    @Override // com.tencent.mm.plugin.newtips.model.n
    public void a(com.tencent.mm.plugin.newtips.model.d dVar) {
        com.tencent.mm.ui.t1 t1Var;
        if (dVar == null || dVar.field_tipId != 1 || !rn3.i.Ai().e(1) || (t1Var = (com.tencent.mm.ui.t1) this.f197133a.get()) == null) {
            return;
        }
        ((com.tencent.mm.ui.LauncherUIBottomTabView) t1Var).h(true);
    }
}
