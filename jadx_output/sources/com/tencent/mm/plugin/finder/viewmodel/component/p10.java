package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f135502f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, zy2.gc gcVar) {
        super(0);
        this.f135500d = baseFinderFeed;
        this.f135501e = z17;
        this.f135502f = gcVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f280025e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f135500d;
        b0Var.r(baseFinderFeed.getItemId(), baseFinderFeed.getFeedObject().getObjectNonceId(), this.f135501e, this.f135502f);
        return jz5.f0.f302826a;
    }
}
