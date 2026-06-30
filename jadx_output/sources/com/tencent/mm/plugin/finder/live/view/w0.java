package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class w0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.v2 f116761a;

    public w0(so2.v2 v2Var) {
        this.f116761a = v2Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("liveid", pm0.v.u(this.f116761a.f410659n.getLong(0)));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.S2;
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            if (b17 == null) {
                b17 = "";
            }
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.I8(zbVar, u1Var, hashMap, b17, "temp_30", null, null, false, 112, null);
        }
    }
}
