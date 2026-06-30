package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f112683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        super(1);
        this.f112683d = adVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.plugin.ad adVar = this.f112683d;
            com.tencent.mm.plugin.finder.live.plugin.ld.b(adVar, false);
            boolean z17 = ((mm2.c1) adVar.P0(mm2.c1.class)).f328801f2 == 2;
            long j17 = ((mm2.e1) adVar.P0(mm2.e1.class)).f328983m;
            if (z17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("object_id", pm0.v.u(j17));
                ml2.z0.f328330a.a(jSONObject);
                zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                ml2.o3[] o3VarArr = ml2.o3.f327773d;
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                ((ml2.j0) zbVar).Wj("watch_live_pay_succ", jSONObject2);
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f327280y1, 7, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q);
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveChargePayPluginEx", "showWecoinInfo fail!");
        }
        return jz5.f0.f302826a;
    }
}
