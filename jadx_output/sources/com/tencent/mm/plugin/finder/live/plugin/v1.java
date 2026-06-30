package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f114634b;

    public v1(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, int i17) {
        this.f114633a = v3Var;
        this.f114634b = i17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114633a;
            java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o;
            long j19 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0);
            r0Var.getClass();
            kotlin.jvm.internal.o.g(username, "username");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", username);
            hashMap.put("liveId", java.lang.String.valueOf(j19));
            int i17 = this.f114634b;
            hashMap.put("analysis_type", java.lang.String.valueOf(i17));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f328074p2;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            zy2.zb.I8(zbVar, u1Var, hashMap, b17, "1002", null, null, false, 112, null);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndThankGuideItemExpose report23057, liveid = " + j19 + ", analysisType=" + i17);
        }
    }
}
