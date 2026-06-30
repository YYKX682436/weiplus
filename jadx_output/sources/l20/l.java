package l20;

/* loaded from: classes9.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView) {
        super(1);
        this.f315167d = str;
        this.f315168e = ecsFinderFeedProductCardView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.String url = this.f315167d;
        kotlin.jvm.internal.o.f(url, "$url");
        r00.b bVar = r00.b.f367997d;
        if (bitmap != null) {
            r00.g.a(url, bVar, bitmap, new l20.k(this.f315168e));
        }
        return jz5.f0.f302826a;
    }
}
