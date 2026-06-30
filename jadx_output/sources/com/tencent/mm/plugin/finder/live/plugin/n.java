package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f113573a;

    public n(java.lang.Object obj) {
        this.f113573a = obj;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.f4 f4Var = ml2.f4.f327431e;
            java.lang.Object obj = this.f113573a;
            java.lang.String u17 = pm0.v.u(((cm2.h0) obj).f43349w);
            r45.n3 n3Var = ((cm2.h0) obj).f43350x;
            if (n3Var == null || (str = n3Var.getString(3)) == null) {
                str = "";
            }
            java.lang.String u18 = pm0.v.u(((cm2.h0) obj).f43349w);
            java.lang.String str2 = ((cm2.h0) obj).C;
            if (str2 == null) {
                str2 = "";
            }
            ml2.r0.Dj(r0Var, f4Var, null, u17, str, u18, str2, ((cm2.h0) obj).D, ((cm2.h0) obj).E, null, null, null, null, false, null, 16128, null);
        }
    }
}
