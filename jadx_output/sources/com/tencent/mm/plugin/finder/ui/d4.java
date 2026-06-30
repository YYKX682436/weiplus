package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI) {
        super(1);
        this.f129047d = str;
        this.f129048e = str2;
        this.f129049f = finderCreateContactUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "click ".concat(it));
        java.lang.String str2 = this.f129047d;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129049f;
        if (str2 != null && (str = this.f129048e) != null) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7471f = finderCreateContactUI;
            nxVar.f7466a = str2;
            nxVar.f7467b = str;
            startAppBrandUIFromOuterEvent.e();
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        com.tencent.mm.plugin.finder.ui.a3 a3Var = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1;
        finderCreateContactUI.getClass();
        int i17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.O1;
        int i18 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.N1;
        int i19 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.M1;
        int i27 = finderCreateContactUI.V;
        boolean z17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.S1;
        java.lang.String str3 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.T1;
        android.widget.EditText editText = finderCreateContactUI.f128546w;
        if (editText == null) {
            kotlin.jvm.internal.o.o("nickEdt");
            throw null;
        }
        boolean z18 = !kotlin.jvm.internal.o.b(str3, editText.getText().toString());
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finderCreateContactUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        o3Var.mj(0, 2, i17, false, i18, i19, i27, z17, z18, nyVar != null ? nyVar.V6() : null);
        return jz5.f0.f302826a;
    }
}
