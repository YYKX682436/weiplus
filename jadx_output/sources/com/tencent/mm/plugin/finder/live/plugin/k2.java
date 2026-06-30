package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113185b;

    public k2(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, java.lang.String str) {
        this.f113184a = v3Var;
        this.f113185b = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.u1 u1Var = ml2.u1.f328050h2;
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113184a;
            java.lang.String str = ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o;
            long j19 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("milestone", this.f113185b);
            r0Var.nk(u1Var, str, j19, hashMap);
        }
    }
}
