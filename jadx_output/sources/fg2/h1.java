package fg2;

/* loaded from: classes10.dex */
public final class h1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout f262063a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f262064b;

    public h1(com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout, com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f262063a = roundCornerRelativeLayout;
        this.f262064b = textView2;
    }

    public static fg2.h1 a(android.view.View view) {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) view;
        int i17 = com.tencent.mm.R.id.in7;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.in7);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.rvx;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(view, com.tencent.mm.R.id.rvx);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.rvy;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.rvy);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.qx9;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.qx9);
                    if (textView2 != null) {
                        return new fg2.h1(roundCornerRelativeLayout, roundCornerRelativeLayout, weImageView, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262063a;
    }
}
