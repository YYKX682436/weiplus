package vb2;

/* loaded from: classes2.dex */
public final class a implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f434503a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f434504b;

    public a(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, android.widget.TextView textView, com.tencent.mm.plugin.finder.view.UnchangeTextView unchangeTextView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView2) {
        this.f434503a = constraintLayout;
        this.f434504b = textView;
    }

    public static vb2.a a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.e7u;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.e7u);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.fzb;
            com.tencent.mm.plugin.finder.view.UnchangeTextView unchangeTextView = (com.tencent.mm.plugin.finder.view.UnchangeTextView) x4.b.a(view, com.tencent.mm.R.id.fzb);
            if (unchangeTextView != null) {
                i17 = com.tencent.mm.R.id.h5n;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(view, com.tencent.mm.R.id.h5n);
                if (weImageView != null) {
                    i17 = com.tencent.mm.R.id.o3b;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.o3b);
                    if (textView2 != null) {
                        return new vb2.a((androidx.constraintlayout.widget.ConstraintLayout) view, textView, unchangeTextView, weImageView, textView2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f434503a;
    }
}
