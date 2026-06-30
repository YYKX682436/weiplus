package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class w implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f125409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.r f125410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.x f125411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f125412d;

    public w(in5.s0 s0Var, dy1.r rVar, com.tencent.mm.plugin.finder.report.x xVar, java.lang.String str) {
        this.f125409a = s0Var;
        this.f125410b = rVar;
        this.f125411c = xVar;
        this.f125412d = str;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var;
        so2.y0 y0Var = (so2.y0) this.f125409a.f293125i;
        boolean z17 = false;
        if (y0Var != null && (yj0Var = y0Var.f410703d) != null && yj0Var.i1()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.report.x xVar = this.f125411c;
            ((cy1.a) this.f125410b).Bj(xVar.f125424e, str, kz5.c1.k(new jz5.l("feed_id", this.f125412d), new jz5.l("expose_time_ms", java.lang.Long.valueOf(j17 - xVar.f125423d)), new jz5.l("promotion_buffer", xVar.f125425f)), 1, false);
        }
    }
}
