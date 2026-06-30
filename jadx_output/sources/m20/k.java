package m20;

/* loaded from: classes9.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView f322982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView ecsFinderFeedProductFlutterView) {
        super(1);
        this.f322982d = ecsFinderFeedProductFlutterView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Rect rect = (android.graphics.Rect) obj;
        kotlin.jvm.internal.o.g(rect, "rect");
        com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView ecsFinderFeedProductFlutterView = this.f322982d;
        k20.g gVar = ecsFinderFeedProductFlutterView.f65911h;
        if (gVar != null) {
            ((com.tencent.mm.plugin.finder.convert.tj) gVar).a(ecsFinderFeedProductFlutterView);
        }
        return jz5.f0.f302826a;
    }
}
