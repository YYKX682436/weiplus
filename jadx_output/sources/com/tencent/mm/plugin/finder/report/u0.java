package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f125376a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f125377b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125378c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125379d;

    /* renamed from: e, reason: collision with root package name */
    public so2.u1 f125380e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f125381f;

    public u0(kotlinx.coroutines.y0 scope, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f125376a = scope;
        this.f125377b = contextObj;
        this.f125378c = 80;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f125379d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Id).getValue()).r()).intValue() * 1000;
    }

    public final void a(so2.u1 feed, com.tencent.mm.plugin.finder.report.n4 n4Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (n4Var == null) {
            return;
        }
        so2.u1 u1Var = this.f125380e;
        if (u1Var != null && u1Var.getItemId() == feed.getItemId()) {
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.f125381f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f125381f = null;
        this.f125380e = null;
        com.tencent.mars.xlog.Log.i("FinderHeartBeatReporter", "startRecord: " + hc2.b0.f(feed, true));
        this.f125380e = feed;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = n4Var.f125186q0.get();
        this.f125381f = kotlinx.coroutines.l.d(this.f125376a, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.report.t0(f0Var, this, feed, n4Var, null), 2, null);
    }
}
