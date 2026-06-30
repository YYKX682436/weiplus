package fg2;

/* loaded from: classes10.dex */
public final class f0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262025a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.h1 f262026b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262027c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f262028d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f262029e;

    public f0(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.h1 h1Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.view.View view, android.widget.TextView textView) {
        this.f262025a = constraintLayout;
        this.f262026b = h1Var;
        this.f262027c = weImageView;
        this.f262028d = view;
        this.f262029e = textView;
    }

    public static fg2.f0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.dkn, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.qrl;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
        if (a17 != null) {
            fg2.h1 a18 = fg2.h1.a(a17);
            i17 = com.tencent.mm.R.id.h5x;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.h5x);
            if (weImageView != null) {
                i17 = com.tencent.mm.R.id.f485288h62;
                android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f485288h62);
                if (a19 != null) {
                    i17 = com.tencent.mm.R.id.o3b;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o3b);
                    if (textView != null) {
                        return new fg2.f0((androidx.constraintlayout.widget.ConstraintLayout) inflate, a18, weImageView, a19, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262025a;
    }
}
