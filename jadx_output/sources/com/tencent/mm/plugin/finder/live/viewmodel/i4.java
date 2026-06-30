package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.k4 f117142d;

    public i4(com.tencent.mm.plugin.finder.live.viewmodel.k4 k4Var) {
        this.f117142d = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGiftWallTopFirstDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.Z1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 7);
        com.tencent.mm.plugin.finder.live.viewmodel.k4 k4Var = this.f117142d;
        r45.kv1 kv1Var = k4Var.f117189h;
        if (kv1Var == null || (str = kv1Var.getString(0)) == null) {
            str = "";
        }
        jSONObject.put("gift_id", str);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        com.tencent.mars.xlog.Log.i(k4Var.f117190i, "[modSwitch]");
        r45.hx0 e17 = ek2.r1.f253524u.e(true);
        gk2.e eVar = dk2.ef.I;
        long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        gk2.e eVar2 = dk2.ef.I;
        ek2.r1 r1Var = new ek2.r1(j17, eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f328983m : 0L, 1, e17);
        az2.j.u(r1Var, k4Var.f118381d, null, 0L, 6, null);
        r1Var.l().K(new com.tencent.mm.plugin.finder.live.viewmodel.j4(k4Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGiftWallTopFirstDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
