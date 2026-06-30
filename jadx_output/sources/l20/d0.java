package l20;

/* loaded from: classes9.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView f315142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView ecsFinderFeedProductNewAndBulkBuyerView) {
        super(1);
        this.f315141d = str;
        this.f315142e = ecsFinderFeedProductNewAndBulkBuyerView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.String url = this.f315141d;
        kotlin.jvm.internal.o.f(url, "$url");
        r00.b bVar = r00.b.f367997d;
        if (bitmap != null) {
            r00.g.a(url, bVar, bitmap, new l20.c0(this.f315142e));
        }
        return jz5.f0.f302826a;
    }
}
