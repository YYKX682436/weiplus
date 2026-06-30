package fg2;

/* loaded from: classes10.dex */
public final class x0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f262391a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.LinearLayout f262392b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderFixedTextView f262393c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f262394d;

    public x0(android.widget.RelativeLayout relativeLayout, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView, android.widget.LinearLayout linearLayout, android.widget.RelativeLayout relativeLayout2, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2, com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView3, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f262391a = relativeLayout;
        this.f262392b = linearLayout;
        this.f262393c = finderFixedTextView3;
        this.f262394d = imageView2;
    }

    public static fg2.x0 a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.fa7;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(view, com.tencent.mm.R.id.fa7);
        if (constraintLayout != null) {
            i17 = com.tencent.mm.R.id.fa8;
            com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.fa8);
            if (finderFixedTextView != null) {
                i17 = com.tencent.mm.R.id.fa9;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.fa9);
                if (linearLayout != null) {
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                    i17 = com.tencent.mm.R.id.fap;
                    com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.fap);
                    if (finderFixedTextView2 != null) {
                        i17 = com.tencent.mm.R.id.qrm;
                        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView3 = (com.tencent.mm.plugin.finder.live.view.FinderFixedTextView) x4.b.a(view, com.tencent.mm.R.id.qrm);
                        if (finderFixedTextView3 != null) {
                            i17 = com.tencent.mm.R.id.qag;
                            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.qag);
                            if (imageView != null) {
                                i17 = com.tencent.mm.R.id.qam;
                                android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.qam);
                                if (imageView2 != null) {
                                    return new fg2.x0(relativeLayout, constraintLayout, finderFixedTextView, linearLayout, relativeLayout, finderFixedTextView2, finderFixedTextView3, imageView, imageView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262391a;
    }
}
