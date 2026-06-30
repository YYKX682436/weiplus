package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.y f195131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f195133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f195134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f195135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f195136i;

    public n0(com.tencent.mm.storage.y yVar, int i17, int i18, int i19, int i27, int i28) {
        this.f195131d = yVar;
        this.f195132e = i17;
        this.f195133f = i18;
        this.f195134g = i19;
        this.f195135h = i27;
        this.f195136i = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.conversation.b2 b2Var = (com.tencent.mm.ui.conversation.b2) ((rv.c3) i95.n0.c(rv.c3.class));
        b2Var.getClass();
        com.tencent.mm.ui.conversation.ConvExposeHelper convExposeHelper = com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d;
        int size = convExposeHelper.j().size();
        boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
        int wi6 = b2Var.wi();
        int i17 = (wi6 < 0 || wi6 > size) ? 0 : 1;
        convExposeHelper.getClass();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.storage.m0(this.f195131d, this.f195132e, this.f195133f, this.f195134g, this.f195135h, this.f195136i, isForeground ? 1 : 0, i17, com.tencent.mm.ui.conversation.ConvExposeHelper.f207304r.get() ? 1 : 0, size), "BizNativeToCppThread");
    }
}
