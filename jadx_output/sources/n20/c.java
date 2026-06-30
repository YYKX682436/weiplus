package n20;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView f334217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kf f334218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView ecsFinderFeedHeadView, bw5.kf kfVar) {
        super(1);
        this.f334217d = ecsFinderFeedHeadView;
        this.f334218e = kfVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17 = this.f334218e.c().b();
        kotlin.jvm.internal.o.f(b17, "getImgUrl(...)");
        com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView.d(this.f334217d, b17, (android.graphics.Bitmap) obj);
        return jz5.f0.f302826a;
    }
}
