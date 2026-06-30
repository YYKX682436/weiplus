package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.e5 f112228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y52 f112229e;

    public d5(com.tencent.mm.plugin.finder.live.plugin.e5 e5Var, r45.y52 y52Var) {
        this.f112228d = e5Var;
        this.f112229e = y52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCloseBannerAdapter$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.e5 e5Var = this.f112228d;
        java.lang.String str2 = e5Var.f112371e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" click, activityICon:");
        r45.y52 y52Var = this.f112229e;
        sb6.append(y52Var.getString(1));
        sb6.append(", action_url:");
        sb6.append(y52Var.getString(4));
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var == null || (str = c1Var.f328852o) == null) {
            str = "";
        }
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        long j17 = (e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0);
        java.lang.String string = y52Var.getString(0);
        if (string == null) {
            string = "";
        }
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", str);
        hashMap.put("liveId", java.lang.String.valueOf(j17));
        hashMap.put("bannerid", string);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f327962l2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        zy2.zb.T8(zbVar, t1Var, hashMap, b17 == null ? "" : b17, "1002", null, null, false, 112, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveHotBannerClick bannerid=".concat(string));
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Context context = e5Var.f112370d;
        java.lang.String string2 = y52Var.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Fk(context, null, 4, string2);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 4;
        objArr[1] = 2;
        objArr[2] = java.lang.Long.valueOf(c01.id.c());
        objArr[3] = xy2.c.e(e5Var.f112370d);
        objArr[4] = "";
        java.lang.String string3 = y52Var.getString(0);
        if (string3 == null) {
            string3 = "";
        }
        objArr[5] = string3;
        g0Var.d(22748, objArr);
        if (y52Var.getInteger(7) == 1) {
            r45.jn0 jn0Var = new r45.jn0();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 70);
            java.lang.String string4 = y52Var.getString(0);
            jSONObject.put(dm.i4.COL_ID, string4 != null ? string4 : "");
            jn0Var.set(3, jSONObject.toString());
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Kj(null, 18054, jn0Var);
        } else {
            java.lang.String string5 = y52Var.getString(0);
            if (string5 != null) {
                java.lang.String str3 = string5.length() > 0 ? string5 : null;
                if (str3 != null) {
                    new ke2.d(str3).l();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCloseBannerAdapter$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
