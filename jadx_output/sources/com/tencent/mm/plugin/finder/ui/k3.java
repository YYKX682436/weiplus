package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class k3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129411d;

    public k3(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI) {
        this.f129411d = finderCreateContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.report.p2.f125237a.C(5, null);
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        com.tencent.mm.plugin.finder.ui.a3 a3Var = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI context = this.f129411d;
        context.getClass();
        int i17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.O1;
        int i18 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.N1;
        int i19 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.M1;
        int i27 = context.V;
        com.tencent.mm.plugin.finder.ui.a3 a3Var2 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1;
        boolean z17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.S1;
        java.lang.String str = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.T1;
        android.widget.EditText editText = context.f128546w;
        if (editText == null) {
            kotlin.jvm.internal.o.o("nickEdt");
            throw null;
        }
        boolean z18 = !kotlin.jvm.internal.o.b(str, editText.getText().toString());
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        o3Var.mj(0, 0, i17, false, i18, i19, i27, z17, z18, nyVar != null ? nyVar.V6() : null);
        context.setResult(2);
        context.i7(2);
        context.finish();
        return true;
    }
}
