package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class f1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f172990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianUI f172991b;

    public f1(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI) {
        this.f172990a = u3Var;
        this.f172991b = bindGuardianUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f172990a.dismiss();
        int i17 = fVar.f70616b;
        com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI = this.f172991b;
        if (i17 == 0 && fVar.f70615a == 0) {
            com.tencent.mm.storage.z3 z3Var = bindGuardianUI.f172831g;
            kotlin.jvm.internal.o.d(z3Var);
            com.tencent.mm.storage.z3 l17 = c01.e2.l(z3Var.d1());
            int type = l17.getType();
            l75.e0 e0Var = com.tencent.mm.contact.s.G2;
            l17.setType(type & (-1073741825));
            c01.e2.h0(l17);
            com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct teenModeBindStruct = new com.tencent.mm.autogen.mmdata.rpt.TeenModeBindStruct();
            teenModeBindStruct.f61079d = 2L;
            teenModeBindStruct.f61080e = 1L;
            teenModeBindStruct.f61081f = 1L;
            com.tencent.mm.storage.z3 z3Var2 = bindGuardianUI.f172831g;
            kotlin.jvm.internal.o.d(z3Var2);
            teenModeBindStruct.f61082g = teenModeBindStruct.b("targetUsername", z3Var2.d1(), true);
            teenModeBindStruct.k();
            pm0.v.V(200L, com.tencent.mm.plugin.teenmode.ui.e1.f172976d);
        } else {
            com.tencent.mm.plugin.teenmode.ui.BindGuardianUI.T6(bindGuardianUI, fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
