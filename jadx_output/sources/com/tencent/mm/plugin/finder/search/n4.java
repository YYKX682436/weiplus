package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class n4 implements tj5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u4 f125792d;

    public n4(com.tencent.mm.plugin.finder.search.u4 u4Var) {
        this.f125792d = u4Var;
    }

    @Override // tj5.m
    public final void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "totalText :" + str + " inEditText:" + str2 + " tagList.size:" + list.size() + " textChangeStatus:" + oVar);
        com.tencent.mm.plugin.finder.search.u4 u4Var = this.f125792d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(u4Var.f125891l) && kotlin.jvm.internal.o.b(r26.n0.u0(u4Var.f125891l).toString(), str2)) {
            u4Var.b();
            return;
        }
        u4Var.f125890k = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            u4Var.f125889j = null;
            com.tencent.mm.plugin.finder.search.r4 r4Var = u4Var.f125888i;
            r4Var.f125839d = null;
            r4Var.notifyDataSetChanged();
            u4Var.a();
            return;
        }
        bq.t1 t1Var = u4Var.f125892m;
        if (t1Var != null) {
            t1Var.j();
        }
        kotlin.jvm.internal.o.d(str2);
        com.tencent.mm.protobuf.g gVar = u4Var.f125889j;
        com.tencent.mm.ui.MMActivity context = u4Var.f125880a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        bq.t1 t1Var2 = new bq.t1(str2, gVar, u4Var.f125882c, nyVar != null ? nyVar.V6() : null);
        u4Var.f125892m = t1Var2;
        pm0.v.T(t1Var2.l(), new com.tencent.mm.plugin.finder.search.m4(u4Var, str2));
    }
}
