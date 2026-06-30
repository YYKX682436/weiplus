package vb2;

/* loaded from: classes2.dex */
public final class g0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f434610a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f434611b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f434612c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f434613d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f434614e;

    public g0(android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f434610a = frameLayout;
        this.f434611b = frameLayout2;
        this.f434612c = weImageView;
        this.f434613d = textView;
        this.f434614e = textView2;
    }

    public static vb2.g0 a(android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i17 = com.tencent.mm.R.id.fzh;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.fzh);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.fzi;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.fzi);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.q5x;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.q5x);
                if (textView2 != null) {
                    return new vb2.g0(frameLayout, frameLayout, weImageView, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f434610a;
    }
}
