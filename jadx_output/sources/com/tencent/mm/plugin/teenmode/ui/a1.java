package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f172923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.BindGuardianUI f172924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f172925c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172926d;

    public a1(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI, java.lang.String str, int i17) {
        this.f172923a = u3Var;
        this.f172924b = bindGuardianUI;
        this.f172925c = str;
        this.f172926d = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f172923a.dismiss();
        int i17 = fVar.f70616b;
        com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI = this.f172924b;
        if (i17 == 0 && fVar.f70615a == 0) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI2 = this.f172924b;
            java.lang.String str = this.f172925c;
            java.lang.String str2 = bindGuardianUI.getString(com.tencent.mm.R.string.jqi) + bindGuardianUI.getString(com.tencent.mm.R.string.jra);
            java.lang.String string = bindGuardianUI.getString(com.tencent.mm.R.string.f490551ya);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ((c61.l7) b6Var).dl(bindGuardianUI2, str, str2, true, string, new com.tencent.mm.plugin.teenmode.ui.z0(bindGuardianUI, this.f172925c, this.f172926d, fVar), null);
        } else {
            com.tencent.mm.plugin.teenmode.ui.BindGuardianUI.T6(bindGuardianUI, fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
