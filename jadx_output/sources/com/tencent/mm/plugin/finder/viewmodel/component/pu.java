package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pu implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f135626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ru f135627e;

    public pu(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.viewmodel.component.ru ruVar) {
        this.f135626d = c0Var;
        this.f135627e = ruVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MENU_ID_POST] red=");
        boolean z17 = false;
        sb6.append(z9Var != null && z9Var.f105327a);
        sb6.append("，hasShowQualityBottomSheet = ");
        kotlin.jvm.internal.c0 c0Var = this.f135626d;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i("Finder.PostQualityUIC", sb6.toString());
        if (z9Var != null && z9Var.f105327a) {
            z17 = true;
        }
        if (z17) {
            r45.f03 f03Var = z9Var.f105328b;
            if (kotlin.jvm.internal.o.b(f03Var != null ? f03Var.f373889f : null, "temp") || c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOWN_GET_POST_QUALITY_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.finder.viewmodel.component.ru ruVar = this.f135627e;
            ruVar.f135835d = new com.tencent.mm.plugin.finder.viewmodel.component.ou(ruVar);
        }
    }
}
