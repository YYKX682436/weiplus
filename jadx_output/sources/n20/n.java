package n20;

/* loaded from: classes9.dex */
public final class n implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public long f334229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductViewV3 f334230b;

    public n(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductViewV3 ecsFinderFeedProductViewV3) {
        this.f334230b = ecsFinderFeedProductViewV3;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        boolean b17 = kotlin.jvm.internal.o.b(str, "view_exp");
        com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductViewV3 ecsFinderFeedProductViewV3 = this.f334230b;
        if (b17) {
            this.f334229a = java.lang.System.currentTimeMillis();
            return kz5.c1.s(ecsFinderFeedProductViewV3.getParams());
        }
        if (!kotlin.jvm.internal.o.b(str, "view_unexp")) {
            return null;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("stay_duration", java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f334229a) / 1000)));
        return kz5.c1.m(kz5.c1.s(ecsFinderFeedProductViewV3.getParams()), kz5.b1.e(new jz5.l("element_info", e17.isEmpty() ? null : kz5.n0.g0(e17.entrySet(), ";", "{", "}", 0, null, b30.d.f17560d, 24, null))));
    }
}
