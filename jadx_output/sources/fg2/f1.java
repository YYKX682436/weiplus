package fg2;

/* loaded from: classes3.dex */
public final class f1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f262030a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f262031b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f262032c;

    public f1(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView) {
        this.f262030a = constraintLayout;
        this.f262031b = weImageView;
        this.f262032c = textView;
    }

    public static fg2.f1 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.dkw, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.h5x;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(inflate, com.tencent.mm.R.id.h5x);
        if (weImageView != null) {
            i17 = com.tencent.mm.R.id.o3b;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.o3b);
            if (textView != null) {
                return new fg2.f1((androidx.constraintlayout.widget.ConstraintLayout) inflate, weImageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262030a;
    }
}
