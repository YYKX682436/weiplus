package fg2;

/* loaded from: classes5.dex */
public final class v0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.LinearLayout f262382a;

    public v0(android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, com.tencent.mm.view.MMPAGView mMPAGView, android.widget.FrameLayout frameLayout) {
        this.f262382a = linearLayout;
    }

    public static fg2.v0 a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i17 = com.tencent.mm.R.id.evh;
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) x4.b.a(view, com.tencent.mm.R.id.evh);
        if (mMPAGView != null) {
            i17 = com.tencent.mm.R.id.qrq;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.tencent.mm.R.id.qrq);
            if (frameLayout != null) {
                return new fg2.v0(linearLayout, linearLayout, mMPAGView, frameLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262382a;
    }
}
