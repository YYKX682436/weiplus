package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public abstract class ld {
    public static final void a(com.tencent.mm.plugin.finder.live.plugin.ad adVar, int i17) {
        long j17;
        if (adVar.f365323d.getContext() instanceof androidx.fragment.app.FragmentActivity) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && c1Var.f328801f2 == 2) {
                ct2.j jVar = (ct2.j) efVar.i(ct2.j.class);
                j17 = jVar != null ? jVar.f222266g : 0L;
            } else {
                j17 = ((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q;
            }
            sb6.append(j17);
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            java.lang.String sessionId = sb6.toString();
            android.content.Context context = adVar.f365323d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
            com.tencent.mm.plugin.finder.live.plugin.gd gdVar = new com.tencent.mm.plugin.finder.live.plugin.gd(adVar);
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", "showRechargeFoodsDialog sessionId:".concat(sessionId));
            js4.n nVar = new js4.n();
            nVar.f301543a = i17;
            nVar.f301545c = sessionId;
            nVar.f301555m = true;
            nVar.f301546d = new dk2.m4(fragmentActivity, gdVar);
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(fragmentActivity, nVar);
            if (i17 == 16) {
                boolean z17 = ((mm2.c1) adVar.P0(mm2.c1.class)).f328801f2 == 2;
                long j18 = ((mm2.e1) adVar.P0(mm2.e1.class)).f328983m;
                if (!z17) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f327280y1, 6, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q);
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("object_id", pm0.v.u(j18));
                ml2.z0.f328330a.a(jSONObject);
                zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                ml2.o3[] o3VarArr = ml2.o3.f327773d;
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                ((ml2.j0) zbVar).Wj("watch_live_pay", jSONObject2);
            }
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.live.plugin.ad adVar, boolean z17) {
        kotlin.jvm.internal.o.g(adVar, "<this>");
        com.tencent.mm.sdk.platformtools.Log.c("FinderLiveChargePayPluginEx", "payForLive fromClick:" + z17, new java.lang.Object[0]);
        if (z17) {
            ml2.z0.f328330a.c(false, ((mm2.c1) adVar.P0(mm2.c1.class)).f328801f2 == 2, ((mm2.e1) adVar.P0(mm2.e1.class)).f328983m);
        }
        com.tencent.mm.plugin.finder.live.util.y.e(adVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.dd(adVar, z17, null), 3, null);
    }

    public static final void c(com.tencent.mm.plugin.finder.live.plugin.ad adVar, long j17) {
        boolean z17;
        ne2.k kVar;
        kotlin.jvm.internal.o.g(adVar, "<this>");
        if (((mm2.d1) adVar.P0(mm2.d1.class)).N6()) {
            ((mm2.d1) adVar.P0(mm2.d1.class)).f328952g = true;
        }
        adVar.x1(false);
        mm2.g0 g0Var = (mm2.g0) adVar.P0(mm2.g0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before setPurchased true,");
        cm2.a aVar = cm2.a.f43328a;
        sb6.append(aVar.y(((mm2.e1) g0Var.business(mm2.e1.class)).f328988r));
        com.tencent.mars.xlog.Log.i("LiveChargeSlice", sb6.toString());
        r45.o52 P6 = g0Var.P6();
        if (P6 != null) {
            P6.set(1, java.lang.Boolean.TRUE);
        }
        com.tencent.mars.xlog.Log.i("LiveChargeSlice", "after setPurchased true," + aVar.y(((mm2.e1) g0Var.business(mm2.e1.class)).f328988r));
        db5.t7.i(adVar.f365323d.getContext(), adVar.f365323d.getContext().getString(com.tencent.mm.R.string.d_5), com.tencent.mm.R.raw.icons_outlined_done);
        df2.j0 j0Var = (df2.j0) adVar.U0(df2.j0.class);
        if (j0Var != null && (kVar = j0Var.f230441n) != null) {
            kVar.d(((mm2.e1) adVar.P0(mm2.e1.class)).f328988r.getLong(0), true, true);
        }
        rl2.d dVar = (rl2.d) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj();
        if (!dVar.f397190f) {
            dVar.z0();
        }
        rl2.c cVar = (rl2.c) dVar.f397191g.get(java.lang.Long.valueOf(j17));
        if (cVar != null) {
            cVar.f397187d = 1;
            cVar.f397188e = 0;
        }
        java.lang.Object obj = dVar.f397191g.get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dVar.P0(j17, (rl2.c) obj);
        com.tencent.mars.xlog.Log.i("FinderLiveChargeInfoStorage", "setPayForLive liveId:" + j17 + ",cache size:" + dVar.f397191g.size());
        qo0.c.a(adVar.f111860p, qo0.b.W4, null, 2, null);
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        if (e1Var != null) {
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            long j18 = e1Var.f328988r.getLong(0);
            am.ia iaVar = feedUpdateEvent.f54252g;
            iaVar.f6918a = j18;
            iaVar.f6919b = 21;
            z17 = true;
            iaVar.f6921d = 1;
            feedUpdateEvent.e();
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent2 = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            long j19 = e1Var.f328988r.getLong(0);
            am.ia iaVar2 = feedUpdateEvent2.f54252g;
            iaVar2.f6918a = j19;
            iaVar2.f6919b = 28;
            iaVar2.f6921d = 1;
            feedUpdateEvent2.e();
        } else {
            z17 = true;
        }
        adVar.K0(8);
        int i17 = adVar.A;
        boolean z18 = ((mm2.c1) adVar.P0(mm2.c1.class)).f328801f2 == 2 ? z17 : false;
        long j27 = ((mm2.e1) adVar.P0(mm2.e1.class)).f328983m;
        ct2.j jVar = (ct2.j) adVar.P0(ct2.j.class);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j28 = jVar.f222266g;
        long j29 = (j28 <= 0 || j28 >= elapsedRealtime) ? 0L : elapsedRealtime - j28;
        int i18 = ((ct2.j) adVar.P0(ct2.j.class)).f222273q;
        if (!z18) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f327280y1, 2, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(j27));
        jSONObject.put("amount", i17);
        jSONObject.put("duration", j29 <= 0 ? java.lang.Integer.valueOf(i18) : java.lang.Long.valueOf(j29));
        ml2.z0.f328330a.a(jSONObject);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr = ml2.o3.f327773d;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj("pay_live_record", jSONObject2);
    }
}
