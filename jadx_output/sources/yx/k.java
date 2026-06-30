package yx;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity f467042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f467043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity, int i17) {
        super(0);
        this.f467042d = cBTBrandLiveActivity;
        this.f467043e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467042d;
        com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) cBTBrandLiveActivity.findViewById(com.tencent.mm.R.id.a9m);
        int a17 = ly.g.a(140, cBTBrandLiveActivity);
        int i17 = this.f467043e;
        if (i17 != 0) {
            a17 = (int) (a17 * 0.75f);
        }
        android.view.ViewGroup.LayoutParams layoutParams = mMImageView.getLayoutParams();
        layoutParams.height = a17;
        layoutParams.width = a17;
        mMImageView.setLayoutParams(layoutParams);
        com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout = (com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout) cBTBrandLiveActivity.findViewById(com.tencent.mm.R.id.uzk);
        android.view.ViewGroup.LayoutParams layoutParams2 = controlledRipplesLayout.getLayoutParams();
        layoutParams2.height = a17;
        layoutParams2.width = a17;
        controlledRipplesLayout.setLayoutParams(layoutParams2);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) cBTBrandLiveActivity.findViewById(com.tencent.mm.R.id.f485038ty0);
        android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams ? (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3 : null;
        if (i17 != 0) {
            if (layoutParams4 != null) {
                layoutParams4.setMarginStart(ly.g.a(12, cBTBrandLiveActivity));
            }
            if (layoutParams4 != null) {
                layoutParams4.setMarginEnd(ly.g.a(12, cBTBrandLiveActivity));
            }
            if (layoutParams4 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i17 + ly.g.a(10, cBTBrandLiveActivity);
            }
        } else {
            if (layoutParams4 != null) {
                layoutParams4.setMarginStart(ly.g.a(50, cBTBrandLiveActivity));
            }
            if (layoutParams4 != null) {
                layoutParams4.setMarginEnd(ly.g.a(50, cBTBrandLiveActivity));
            }
            if (layoutParams4 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = ly.g.a(50, cBTBrandLiveActivity);
            }
        }
        linearLayout.setLayoutParams(layoutParams4);
        return jz5.f0.f302826a;
    }
}
