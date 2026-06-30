package df2;

/* loaded from: classes3.dex */
public final class rv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sv f231271d;

    public rv(df2.sv svVar) {
        this.f231271d = svVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ta4 e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setPayBtnInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.A2, null, null, null, null, null, false, 126, null);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        df2.sv svVar = this.f231271d;
        long j17 = currentTimeMillis - svVar.f231375n;
        r0Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderBroadcastPageOutStruct.q(b17);
        finderBroadcastPageOutStruct.r("205");
        finderBroadcastPageOutStruct.p("205");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        im2.t6 a17 = ml2.s0.a();
        jSONObject.put("is_scan", (a17 == null || !a17.f292564q) ? 0 : 1);
        jSONObject.put("stayTime", java.lang.String.valueOf(j17));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderBroadcastPageOutStruct.s(r26.i0.t(jSONObject2, ",", ";", false));
        finderBroadcastPageOutStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22947, contextid = " + finderBroadcastPageOutStruct.f56570i + ", page_id = " + finderBroadcastPageOutStruct.f56566e + ", commentScene = " + finderBroadcastPageOutStruct.f56574m + ", pg_udf_kv = " + finderBroadcastPageOutStruct.f56573l);
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (e17 = nVar.e()) != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(e17.getInteger(14));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = (com.tencent.mm.plugin.finder.live.plugin.wg0) svVar.R6(com.tencent.mm.plugin.finder.live.plugin.wg0.class);
                if (wg0Var != null) {
                    wg0Var.u1(true);
                }
                new com.tencent.mm.autogen.events.FinderLiveNotifyPayVipEvent().e();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setPayBtnInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var2 = (com.tencent.mm.plugin.finder.live.plugin.wg0) svVar.R6(com.tencent.mm.plugin.finder.live.plugin.wg0.class);
        if (wg0Var2 != null) {
            wg0Var2.u1(true);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_inlet_source", 9);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String authorFinderUsername = ((mm2.c1) svVar.business(mm2.c1.class)).f328852o;
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Kk(context, intent, authorFinderUsername);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveVipPermissionController$setPayBtnInfo$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
