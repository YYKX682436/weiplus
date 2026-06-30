package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f135650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, zy2.gc gcVar) {
        super(0);
        this.f135648d = baseFinderFeed;
        this.f135649e = z17;
        this.f135650f = gcVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f280025e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135648d;
        b0Var.r(baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject().getObjectNonceId(), this.f135649e, this.f135650f);
        return jz5.f0.f302826a;
    }
}
