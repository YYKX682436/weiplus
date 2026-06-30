package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class j1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianUI f173038a;

    public j1(com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI) {
        this.f173038a = bindGuardianUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI = this.f173038a;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(bindGuardianUI, "", bindGuardianUI.getContext().getString(com.tencent.mm.R.string.ggd), true, false, null);
            Q.show();
            ((android.widget.TextView) bindGuardianUI.findViewById(com.tencent.mm.R.id.dhj)).setVisibility(8);
            com.tencent.mm.storage.z3 z3Var = bindGuardianUI.f172831g;
            kotlin.jvm.internal.o.d(z3Var);
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            pq5.g l17 = new vh4.g1(d17).l();
            l17.f(bindGuardianUI);
            l17.h(new com.tencent.mm.plugin.teenmode.ui.f1(Q, bindGuardianUI));
        }
    }
}
