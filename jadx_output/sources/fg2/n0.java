package fg2;

/* loaded from: classes3.dex */
public final class n0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262160a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f262161b;

    public n0(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.view.View view, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f262160a = constraintLayout;
        this.f262161b = view;
    }

    public static fg2.n0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.eao, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.h5x;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.h5x);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.f485288h62;
            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.f485288h62);
            if (a17 != null) {
                i17 = com.tencent.mm.R.id.o3b;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o3b);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.ve6;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.ve6);
                    if (textView2 != null) {
                        return new fg2.n0((androidx.constraintlayout.widget.ConstraintLayout) inflate, weImageView, a17, textView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262160a;
    }
}
