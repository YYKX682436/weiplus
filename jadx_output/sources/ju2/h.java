package ju2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton f301817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton) {
        super(0);
        this.f301816d = context;
        this.f301817e = finderThanksButton;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f301816d;
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
        android.content.res.Resources resources = context.getResources();
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams((int) resources.getDimension(com.tencent.mm.R.dimen.f479649bo), (int) resources.getDimension(com.tencent.mm.R.dimen.f479706d1));
        layoutParams.f10893h = 0;
        layoutParams.f10899k = 0;
        layoutParams.f10885d = 0;
        mMPAGView.setLayoutParams(layoutParams);
        mMPAGView.setTranslationX(-i65.a.a(context, 0.5f));
        mMPAGView.setTranslationY(-i65.a.a(context, 0.5f));
        mMPAGView.setVisibility(8);
        mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
        mMPAGView.setScaleMode(3);
        this.f301817e.addView(mMPAGView);
        return mMPAGView;
    }
}
