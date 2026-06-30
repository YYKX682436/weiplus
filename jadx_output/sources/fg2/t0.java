package fg2;

/* loaded from: classes10.dex */
public final class t0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f262315a;

    public t0(android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.LinearLayout linearLayout2) {
        this.f262315a = linearLayout;
    }

    public static fg2.t0 a(android.view.View view) {
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.rhb);
        if (textView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(com.tencent.mm.R.id.rhb)));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        return new fg2.t0(linearLayout, textView, linearLayout);
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262315a;
    }
}
