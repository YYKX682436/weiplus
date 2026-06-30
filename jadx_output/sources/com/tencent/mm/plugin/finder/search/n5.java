package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class n5 implements tj5.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.u5 f125793d;

    public n5(com.tencent.mm.plugin.finder.search.u5 u5Var) {
        this.f125793d = u5Var;
    }

    @Override // tj5.m
    public final void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        com.tencent.mars.xlog.Log.i("Finder.SearchSuggestion", "totalText :" + str + " inEditText:" + str2 + " tagList.size:" + list.size() + " textChangeStatus:" + oVar);
        com.tencent.mm.plugin.finder.search.u5 u5Var = this.f125793d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(u5Var.f125900m) && kotlin.jvm.internal.o.b(r26.n0.u0(u5Var.f125900m).toString(), str2)) {
            u5Var.b();
            return;
        }
        u5Var.f125899i = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.finder.search.r5 r5Var = u5Var.f125898h;
            r5Var.f125841d = null;
            r5Var.notifyDataSetChanged();
            u5Var.a();
            return;
        }
        gm0.j1.d().d(u5Var.f125901n);
        kotlin.jvm.internal.o.d(str2);
        u5Var.f125901n = new db2.j6(str2);
        gm0.j1.d().g(u5Var.f125901n);
    }
}
