package ju2;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton f301828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton) {
        super(0);
        this.f301827d = context;
        this.f301828e = finderThanksButton;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int imageWidth;
        int imageWidth2;
        android.content.Context context = this.f301827d;
        android.content.res.Resources resources = context.getResources();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = this.f301828e;
        imageWidth = finderThanksButton.getImageWidth();
        imageWidth2 = finderThanksButton.getImageWidth();
        weImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(imageWidth, imageWidth2));
        weImageView.setIconColor(resources.getColor(com.tencent.mm.R.color.FG_2));
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_finder_thanksful);
        return weImageView;
    }
}
