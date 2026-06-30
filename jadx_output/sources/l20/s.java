package l20;

/* loaded from: classes9.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView f315190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView) {
        super(0);
        this.f315190d = ecsFinderFeedProductCardView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String b17;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView ecsFinderFeedProductCardView = this.f315190d;
        java.lang.String str = ecsFinderFeedProductCardView.G;
        if (str != null) {
            if (str.length() > 0) {
                linkedHashMap.put("finder_card_info", str);
            }
        }
        bw5.qf qfVar = ecsFinderFeedProductCardView.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA java.lang.String();
        if (qfVar != null && (b17 = qfVar.b()) != null) {
            if (b17.length() > 0) {
                linkedHashMap.put("wxec_card_info", b17);
            }
        }
        return linkedHashMap;
    }
}
