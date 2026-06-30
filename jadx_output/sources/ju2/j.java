package ju2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton f301820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton) {
        super(0);
        this.f301819d = context;
        this.f301820e = finderThanksButton;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int imageWidth;
        int imageWidth2;
        android.widget.FrameLayout thankIconLayout;
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(this.f301819d);
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = this.f301820e;
        imageWidth = finderThanksButton.getImageWidth();
        imageWidth2 = finderThanksButton.getImageWidth();
        mMPAGView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(imageWidth, imageWidth2));
        mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
        thankIconLayout = finderThanksButton.getThankIconLayout();
        thankIconLayout.addView(mMPAGView);
        return mMPAGView;
    }
}
