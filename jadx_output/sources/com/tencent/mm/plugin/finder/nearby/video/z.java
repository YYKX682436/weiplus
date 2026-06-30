package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.d0 f122227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.nearby.video.d0 d0Var) {
        super(0);
        this.f122227d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.nearby.video.a aVar = this.f122227d.f122177f;
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter");
        ((com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter) aVar).getFeedLoader().requestRefresh();
        return jz5.f0.f302826a;
    }
}
