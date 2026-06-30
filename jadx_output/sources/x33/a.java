package x33;

/* loaded from: classes15.dex */
public final class a implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f451609a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMDotView f451610b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMFlipper f451611c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f451612d;

    public a(android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, com.tencent.mm.ui.base.MMDotView mMDotView, com.tencent.mm.ui.base.MMFlipper mMFlipper, android.widget.ImageView imageView) {
        this.f451609a = linearLayout;
        this.f451610b = mMDotView;
        this.f451611c = mMFlipper;
        this.f451612d = imageView;
    }

    public static x33.a a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f488390s0, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.bh7;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.bh7);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.bh8;
            com.tencent.mm.ui.base.MMDotView mMDotView = (com.tencent.mm.ui.base.MMDotView) x4.b.a(inflate, com.tencent.mm.R.id.bh8);
            if (mMDotView != null) {
                i17 = com.tencent.mm.R.id.bh9;
                com.tencent.mm.ui.base.MMFlipper mMFlipper = (com.tencent.mm.ui.base.MMFlipper) x4.b.a(inflate, com.tencent.mm.R.id.bh9);
                if (mMFlipper != null) {
                    i17 = com.tencent.mm.R.id.p1b;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.p1b);
                    if (imageView != null) {
                        return new x33.a((android.widget.LinearLayout) inflate, linearLayout, mMDotView, mMFlipper, imageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f451609a;
    }
}
