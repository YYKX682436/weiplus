package fg2;

/* loaded from: classes10.dex */
public final class m0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262134a;

    /* renamed from: b, reason: collision with root package name */
    public final fg2.h1 f262135b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262136c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f262137d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f262138e;

    public m0(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.h1 h1Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.view.View view, android.widget.TextView textView) {
        this.f262134a = constraintLayout;
        this.f262135b = h1Var;
        this.f262136c = weImageView;
        this.f262137d = view;
        this.f262138e = textView;
    }

    public static fg2.m0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.dru, viewGroup, false);
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
                        return new fg2.m0((androidx.constraintlayout.widget.ConstraintLayout) inflate, a18, weImageView, a19, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262134a;
    }
}
