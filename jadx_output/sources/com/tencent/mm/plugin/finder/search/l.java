package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class l implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI f125750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.mu2 f125751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f125752c;

    public l(com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI, r45.mu2 mu2Var, int i17) {
        this.f125750a = finderContactSearchIncludeFollowUI;
        this.f125751b = mu2Var;
        this.f125752c = i17;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI.E;
        com.tencent.mars.xlog.Log.i("Finder.FinderContactSearchIncludeFollowUI", "privacy result " + bool);
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.finder.search.FinderContactSearchIncludeFollowUI finderContactSearchIncludeFollowUI = this.f125750a;
        if (booleanValue) {
            finderContactSearchIncludeFollowUI.X6(this.f125751b, this.f125752c);
        }
        if (finderContactSearchIncludeFollowUI.f125520t == 0) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = finderContactSearchIncludeFollowUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        androidx.appcompat.app.AppCompatActivity context2 = finderContactSearchIncludeFollowUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context2);
        r45.xw4 xw4Var = new r45.xw4();
        xw4Var.set(0, 1);
        r45.ny0 ny0Var = new r45.ny0();
        ny0Var.set(0, java.lang.Long.valueOf(finderContactSearchIncludeFollowUI.f125520t));
        xw4Var.set(1, hc2.b.a(ny0Var));
        cq.j1.d(kVar, V6, e17, xw4Var, new com.tencent.mm.plugin.finder.search.i(finderContactSearchIncludeFollowUI), new com.tencent.mm.plugin.finder.search.k(finderContactSearchIncludeFollowUI));
    }
}
