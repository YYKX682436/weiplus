package vb2;

/* loaded from: classes2.dex */
public final class l implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f434645a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f434646b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f434647c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f434648d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f434649e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f434650f;

    public l(android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.LinearLayout linearLayout2, android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView2) {
        this.f434645a = linearLayout;
        this.f434646b = imageView;
        this.f434647c = imageView2;
        this.f434648d = textView;
        this.f434649e = weImageView;
        this.f434650f = textView2;
    }

    public static vb2.l a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.a9m;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.a9m);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.cki;
            android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.cki);
            if (imageView2 != null) {
                i17 = com.tencent.mm.R.id.eig;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.eig);
                if (linearLayout != null) {
                    i17 = com.tencent.mm.R.id.i1g;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.i1g);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.i1n;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.i1n);
                        if (weImageView != null) {
                            i17 = com.tencent.mm.R.id.kb7;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.kb7);
                            if (textView2 != null) {
                                return new vb2.l((android.widget.LinearLayout) view, imageView, imageView2, linearLayout, textView, weImageView, textView2);
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
        return this.f434645a;
    }
}
