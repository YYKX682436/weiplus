package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.storage.n2 f166079a = new com.tencent.mm.plugin.sns.storage.n2();

    public final void a(com.tencent.mm.plugin.sns.storage.SnsInfo info) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanLocalResource", "com.tencent.mm.plugin.sns.storage.SnsResourceManager");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String t07 = ca4.z0.t0(info.field_snsId);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = info.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        for (r45.jj4 jj4Var : qa4.f.a(timeLine)) {
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
            kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
            ot5.g.c("MicroMsg.SnsResourceManager", "snsIdStr:" + t07 + " clean media:" + jj4Var.f377855d);
            int i17 = jj4Var.f377856e;
            if (i17 == 2) {
                java.lang.String str = d17 + ca4.z0.U(jj4Var);
                java.lang.String str2 = d17 + ca4.z0.J(jj4Var);
                java.lang.String str3 = d17 + ca4.z0.W(jj4Var);
                java.lang.String str4 = d17 + ca4.z0.a0(jj4Var);
                dw3.c0 c0Var = dw3.c0.f244182a;
                c0Var.j(str);
                c0Var.j(str2);
                c0Var.j(str3);
                c0Var.j(str4);
            } else if (i17 == 4 || i17 == 6) {
                java.lang.String U = ca4.z0.U(jj4Var);
                dw3.c0.f244182a.j(d17 + U);
                java.util.Iterator it = t21.d3.o(jj4Var.f377855d).iterator();
                while (it.hasNext()) {
                    t21.v2 v2Var = (t21.v2) it.next();
                    dw3.c0.f244182a.j(v2Var.C);
                    t21.d3.e(v2Var.d());
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanLocalResource", "com.tencent.mm.plugin.sns.storage.SnsResourceManager");
    }
}
