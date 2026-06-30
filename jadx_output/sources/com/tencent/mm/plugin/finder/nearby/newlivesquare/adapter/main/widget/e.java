package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget;

/* loaded from: classes2.dex */
public final class e implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g f122068d;

    public e(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar) {
        this.f122068d = gVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.util.List data;
        r45.y23 y23Var;
        r45.y23 y23Var2;
        java.lang.String str;
        java.lang.String str2;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.widget.g gVar = this.f122068d;
        androidx.recyclerview.widget.f2 adapter2 = gVar.f122079j.getAdapter();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter2 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter2 : null;
        if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null || i17 > data.size() - 1) {
            return;
        }
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        java.lang.String str3 = (nyVar == null || (str2 = nyVar.f135382p) == null) ? "" : str2;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        java.lang.String str4 = (nyVar2 == null || (str = nyVar2.f135386r) == null) ? "" : str;
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        long j17 = gVar.f122072c;
        long j18 = gVar.f122073d;
        java.lang.String str5 = gVar.f122074e;
        r45.qt2 qt2Var = gVar.f122077h;
        java.lang.String valueOf = java.lang.String.valueOf(qt2Var.getInteger(5));
        ml2.b4 b4Var = ml2.b4.f327224e;
        cl0.g gVar2 = new cl0.g();
        gVar2.o("commerceAction", 2);
        gVar2.o("reason_type", 2);
        vp2.k0 k0Var = (vp2.k0) kz5.n0.a0(data, i17);
        long j19 = 0;
        gVar2.p("productid", (k0Var == null || (y23Var2 = k0Var.f438933e) == null) ? 0L : y23Var2.getLong(0));
        r0Var.ij(j17, j18, str5, valueOf, 12, gVar2.toString(), "");
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String valueOf2 = java.lang.String.valueOf(qt2Var.getInteger(5));
        java.lang.String string = qt2Var.getString(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("liveid_id", java.lang.Long.valueOf(gVar.f122072c));
        vp2.k0 k0Var2 = (vp2.k0) kz5.n0.a0(data, i17);
        jSONObject.putOpt("productid", java.lang.Long.valueOf((k0Var2 == null || (y23Var = k0Var2.f438933e) == null) ? 0L : y23Var.getLong(0)));
        a4Var.b(valueOf2, string, "topic_page_single_commo_card", jSONObject.toString());
        wp2.b bVar = gVar.f122071b;
        if (bVar != null) {
            vp2.k0 k0Var3 = (vp2.k0) kz5.n0.a0(data, i17);
            if (k0Var3 != null && k0Var3.f438934f) {
                j19 = k0Var3.f438932d;
            }
            tp2.f fVar = gVar.f122078i;
            if (fVar != null) {
                tp2.f.b(fVar, i17, bVar, ((cr2.b) gVar.f122070a).f221852a.f221911q, view, str3, str4, false, 5, null, null, j19, null, android.os.SystemClock.elapsedRealtime(), null, null, 27392, null);
            }
        }
    }
}
