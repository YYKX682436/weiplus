package fg2;

/* loaded from: classes3.dex */
public final class e1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262018a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.s0 f262019b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262020c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f262021d;

    public e1(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.s0 s0Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView) {
        this.f262018a = constraintLayout;
        this.f262019b = s0Var;
        this.f262020c = weImageView;
        this.f262021d = textView;
    }

    public static fg2.e1 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.dku, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.qrl;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
        if (a17 != null) {
            fg2.s0 a18 = fg2.s0.a(a17);
            int i18 = com.tencent.mm.R.id.h5x;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.h5x);
            if (weImageView != null) {
                i18 = com.tencent.mm.R.id.o3b;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o3b);
                if (textView != null) {
                    return new fg2.e1((androidx.constraintlayout.widget.ConstraintLayout) inflate, a18, weImageView, textView);
                }
            }
            i17 = i18;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262018a;
    }
}
