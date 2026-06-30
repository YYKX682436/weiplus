package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class u4 implements com.tencent.mm.plugin.finder.report.k5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.u4 f125384a = new com.tencent.mm.plugin.finder.report.u4();

    @Override // com.tencent.mm.plugin.finder.report.k5
    public com.tencent.mm.plugin.finder.report.m5 a() {
        return com.tencent.mm.plugin.finder.report.t4.f125365a;
    }

    @Override // com.tencent.mm.plugin.finder.report.k5
    public com.tencent.mm.plugin.finder.report.l5 b() {
        return com.tencent.mm.plugin.finder.report.r4.f125334a;
    }

    @Override // com.tencent.mm.plugin.finder.report.k5
    public com.tencent.mm.plugin.finder.report.n5 c() {
        return com.tencent.mm.plugin.finder.report.s4.f125348a;
    }

    public final void d(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(j17, j18, j19);
        if (z17) {
            if ((j17 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(j17 == 1253 ? 1523L : 0L, j18, j19);
            }
        }
    }
}
