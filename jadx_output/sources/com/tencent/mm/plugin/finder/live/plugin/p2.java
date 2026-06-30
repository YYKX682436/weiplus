package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113817d;

    public p2(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f113817d = v3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113817d;
        com.tencent.mm.plugin.finder.live.util.y.m(v3Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.y1(v3Var, v3Var.H1(), null), 3, null);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o;
        long j17 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0);
        r0Var.getClass();
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(j17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f327959k2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, t1Var, hashMap, b17, "1002", null, null, false, 112, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveCreateNextNoticeClick report23057, liveid = " + ((java.lang.String) hashMap.get("liveId")));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareNoticePanel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
