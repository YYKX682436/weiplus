package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class v implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f125386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.x f125387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dy1.r f125388c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f125389d;

    public v(in5.s0 s0Var, com.tencent.mm.plugin.finder.report.x xVar, dy1.r rVar, java.lang.String str) {
        this.f125386a = s0Var;
        this.f125387b = xVar;
        this.f125388c = rVar;
        this.f125389d = str;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var;
        so2.y0 y0Var = (so2.y0) this.f125386a.f293125i;
        boolean z17 = false;
        if (y0Var != null && (yj0Var = y0Var.f410703d) != null && yj0Var.i1()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.report.x xVar = this.f125387b;
            xVar.f125423d = j17;
            ((cy1.a) this.f125388c).Bj(xVar.f125424e, str, kz5.c1.k(new jz5.l("feed_id", this.f125389d), new jz5.l("promotion_buffer", xVar.f125425f)), 1, false);
        }
    }
}
