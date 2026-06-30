package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader f122210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f122211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader nearbyVideoFeedLoader, ym5.s3 s3Var) {
        super(0);
        this.f122210d = nearbyVideoFeedLoader;
        this.f122211e = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f122210d.getDispatcher().g(this.f122211e);
        return jz5.f0.f302826a;
    }
}
