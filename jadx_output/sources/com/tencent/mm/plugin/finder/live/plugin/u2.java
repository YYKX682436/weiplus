package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class u2 extends ym5.n0 {
    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        r45.nw1 nw1Var;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var == null || (str = c1Var.f328852o) == null) {
                str = "";
            }
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            long j19 = (e1Var == null || (nw1Var = e1Var.f328988r) == null) ? 0L : nw1Var.getLong(0);
            r0Var.getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", str);
            hashMap.put("liveId", java.lang.String.valueOf(j19));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f328041e2;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            zy2.zb.I8(zbVar, u1Var, hashMap, b17 == null ? "" : b17, "1002", null, null, false, 112, null);
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndLiveItemPlayBackBtnExposed");
        }
    }
}
