package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class j implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.at.l f128885d;

    public j(com.tencent.mm.plugin.finder.ui.at.l lVar) {
        this.f128885d = lVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        com.tencent.mm.plugin.finder.ui.at.t data = (com.tencent.mm.plugin.finder.ui.at.t) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f128903f != 4) {
            com.tencent.mm.plugin.finder.ui.at.l lVar = this.f128885d;
            com.tencent.mm.storage.z3 z3Var = data.f128902e;
            java.lang.String L = lVar.L(z3Var);
            java.lang.String d17 = z3Var.d1();
            kotlin.jvm.internal.o.f(d17, "getUsername(...)");
            lVar.dismiss();
            lVar.f128888s.a(L, d17);
        }
    }
}
