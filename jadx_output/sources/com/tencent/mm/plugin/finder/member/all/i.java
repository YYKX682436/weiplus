package com.tencent.mm.plugin.finder.member.all;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.all.m f121079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f121082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.member.all.m mVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        super(0);
        this.f121079d = mVar;
        this.f121080e = s0Var;
        this.f121081f = baseFinderFeed;
        this.f121082g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f121080e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.member.all.m mVar = this.f121079d;
        mVar.c(context, this.f121081f, mVar.f121089e, this.f121082g);
        return jz5.f0.f302826a;
    }
}
