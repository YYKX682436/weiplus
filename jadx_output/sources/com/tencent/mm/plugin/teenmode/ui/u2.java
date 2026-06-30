package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public final class u2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.w2 f173153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f173154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f173155c;

    public u2(com.tencent.mm.plugin.teenmode.ui.w2 w2Var, kotlin.jvm.internal.g0 g0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f173153a = w2Var;
        this.f173154b = g0Var;
        this.f173155c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        long j17 = this.f173154b.f310121d;
        com.tencent.mm.plugin.teenmode.ui.w2 w2Var = this.f173153a;
        w2Var.f173172f = j17;
        w2Var.f173174h.set(3, java.lang.Long.valueOf(j17));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.r.f460525a.e(w2Var.f173170d, w2Var.f173171e, w2Var.f173172f);
        ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) pf5.u.f353936a.e(zy2.b6.class).c(iz2.c.class))).W6(w2Var.f173174h, "selectTeenModeContent");
        w2Var.O6();
        this.f173155c.B();
    }
}
