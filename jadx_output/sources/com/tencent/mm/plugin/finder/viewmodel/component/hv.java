package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC f134672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f134673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f134674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC, long j17, int i17) {
        super(1);
        this.f134672d = finderProfileDrawerUIC;
        this.f134673e = j17;
        this.f134674f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f134672d.S6(this.f134673e, this.f134674f - 1, null);
        return jz5.f0.f302826a;
    }
}
