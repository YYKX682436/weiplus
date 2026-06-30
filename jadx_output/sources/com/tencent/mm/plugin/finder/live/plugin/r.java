package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r implements com.tencent.mm.plugin.finder.live.plugin.ep0 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.m f114059n = new com.tencent.mm.plugin.finder.live.plugin.m(null);

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f114060d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f114061e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f114062f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f114063g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f114064h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f114065i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f114066m;

    public r(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114060d = context;
        this.f114061e = buContext;
        this.f114062f = statusMonitor;
        this.f114063g = lVar;
        this.f114064h = tVar;
        this.f114065i = "FinderLiveAdBubble";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488829al3, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f114066m = (android.view.ViewGroup) inflate;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public cm2.t A() {
        return this.f114064h;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void U() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(cm2.h0 r21) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.r.a(cm2.h0):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int e0() {
        return com.tencent.mm.R.id.eqy;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void f0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.h0) {
            a((cm2.h0) data);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public android.view.View getView() {
        android.view.ViewGroup viewGroup = this.f114066m;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("root");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (data instanceof cm2.h0) {
            cm2.h0 h0Var = (cm2.h0) data;
            a(h0Var);
            bf2.c.c(bf2.c.f19598a, this.f114061e, 1, 4, pm0.v.u(h0Var.f43349w), h0Var.D, null, 0, 0, null, 0, 992, null);
            android.view.ViewGroup viewGroup = this.f114066m;
            if (viewGroup != null) {
                ym5.a1.h(viewGroup, new com.tencent.mm.plugin.finder.live.plugin.n(data));
            } else {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public void l0() {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.ep0
    public int p0() {
        return com.tencent.mm.R.id.eiq;
    }
}
