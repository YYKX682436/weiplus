package ju2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton f301825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton) {
        super(0);
        this.f301824d = context;
        this.f301825e = finderThanksButton;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout thankIconLayout;
        com.tencent.mm.ui.widget.imageview.WeImageView thankStaticIcon;
        android.widget.FrameLayout thankIconLayout2;
        android.widget.TextView thankTextView;
        android.content.Context context = this.f301824d;
        android.content.res.Resources resources = context.getResources();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, (int) resources.getDimension(com.tencent.mm.R.dimen.f479706d1));
        layoutParams.f10893h = 0;
        layoutParams.f10899k = 0;
        layoutParams.f10885d = 0;
        layoutParams.setMarginStart((int) resources.getDimension(com.tencent.mm.R.dimen.f479672c9));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(16);
        linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.a_y);
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = this.f301825e;
        thankIconLayout = finderThanksButton.getThankIconLayout();
        thankStaticIcon = finderThanksButton.getThankStaticIcon();
        thankIconLayout.addView(thankStaticIcon);
        thankIconLayout2 = finderThanksButton.getThankIconLayout();
        linearLayout.addView(thankIconLayout2);
        thankTextView = finderThanksButton.getThankTextView();
        linearLayout.addView(thankTextView);
        return linearLayout;
    }
}
