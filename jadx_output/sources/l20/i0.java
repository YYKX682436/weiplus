package l20;

/* loaded from: classes9.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewBuyerView f315156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context, com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewBuyerView ecsFinderFeedProductNewBuyerView) {
        super(0);
        this.f315155d = context;
        this.f315156e = ecsFinderFeedProductNewBuyerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvMoreProduct;
        com.tencent.mm.ui.widget.imageview.WeImageView arrowIcon;
        android.content.Context context = this.f315155d;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewBuyerView ecsFinderFeedProductNewBuyerView = this.f315156e;
        tvMoreProduct = ecsFinderFeedProductNewBuyerView.getTvMoreProduct();
        linearLayout.addView(tvMoreProduct);
        arrowIcon = ecsFinderFeedProductNewBuyerView.getArrowIcon();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(i65.a.f(context, com.tencent.mm.R.dimen.f479646bl));
        linearLayout.addView(arrowIcon, marginLayoutParams);
        return linearLayout;
    }
}
