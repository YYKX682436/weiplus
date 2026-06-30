package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class xb implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.ac f130014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f130015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f130016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostAtUI f130017d;

    public xb(com.tencent.mm.plugin.finder.ui.ac acVar, androidx.recyclerview.widget.k3 k3Var, int i17, com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI) {
        this.f130014a = acVar;
        this.f130015b = k3Var;
        this.f130016c = i17;
        this.f130017d = finderPostAtUI;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.tencent.mm.plugin.finder.ui.FinderPostAtUI.D;
        com.tencent.mars.xlog.Log.i("Finder.FinderPostAtUI", "privacy result " + bool);
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            this.f130014a.x(this.f130015b, this.f130016c);
            com.tencent.mm.plugin.finder.ui.FinderPostAtUI finderPostAtUI = this.f130017d;
            if (finderPostAtUI.f128650z == 0) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity context = finderPostAtUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            cq.k kVar = (cq.k) c17;
            androidx.appcompat.app.AppCompatActivity context2 = finderPostAtUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            java.lang.String e17 = xy2.c.e(context2);
            r45.xw4 xw4Var = new r45.xw4();
            xw4Var.set(0, 1);
            r45.ny0 ny0Var = new r45.ny0();
            ny0Var.set(0, java.lang.Long.valueOf(finderPostAtUI.f128650z));
            xw4Var.set(1, hc2.b.a(ny0Var));
            cq.j1.d(kVar, V6, e17, xw4Var, new com.tencent.mm.plugin.finder.ui.ub(finderPostAtUI), new com.tencent.mm.plugin.finder.ui.wb(finderPostAtUI));
        }
    }
}
