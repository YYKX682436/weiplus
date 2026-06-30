package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget;

/* loaded from: classes2.dex */
public final class c extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g f122066a;

    public c(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar) {
        this.f122066a = gVar;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("LiveSquareShoppingWidget", "onExposeTimeRecorded: size = " + recordsSet.size());
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        in5.c cVar = item.f293070a;
        vp2.k0 k0Var = cVar instanceof vp2.k0 ? (vp2.k0) cVar : null;
        if (k0Var != null) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar = this.f122066a;
            long j17 = gVar.f122072c;
            long j18 = gVar.f122073d;
            java.lang.String str = gVar.f122074e;
            r45.qt2 qt2Var = gVar.f122077h;
            java.lang.String valueOf = java.lang.String.valueOf(qt2Var.getInteger(5));
            ml2.b4 b4Var = ml2.b4.f327224e;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("commerceAction", 1);
            gVar2.o("reason_type", 2);
            r45.y23 y23Var = k0Var.f438933e;
            gVar2.p("productid", y23Var.getLong(0));
            r0Var.ij(j17, j18, str, valueOf, 12, gVar2.toString(), "");
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            java.lang.String valueOf2 = java.lang.String.valueOf(qt2Var.getInteger(5));
            java.lang.String string = qt2Var.getString(1);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("liveid_id", java.lang.Long.valueOf(gVar.f122072c));
            jSONObject.putOpt("productid", java.lang.Long.valueOf(y23Var.getLong(0)));
            a4Var.a(valueOf2, "", string, "topic_page_single_commo_card", jSONObject.toString());
        }
    }
}
