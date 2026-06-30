package fg2;

/* loaded from: classes10.dex */
public final class u implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f262342a;

    public u(android.widget.RelativeLayout relativeLayout, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.FrameLayout frameLayout2, android.widget.RelativeLayout relativeLayout2, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView) {
        this.f262342a = relativeLayout;
    }

    public static fg2.u a(android.view.View view) {
        int i17 = com.tencent.mm.R.id.f483046v5;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(view, com.tencent.mm.R.id.f483046v5);
        if (frameLayout != null) {
            i17 = com.tencent.mm.R.id.agx;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.tencent.mm.R.id.agx);
            if (imageView != null) {
                i17 = com.tencent.mm.R.id.cjn;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.tencent.mm.R.id.cjn);
                if (textView != null) {
                    i17 = com.tencent.mm.R.id.f484710f84;
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(view, com.tencent.mm.R.id.f484710f84);
                    if (frameLayout2 != null) {
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                        i17 = com.tencent.mm.R.id.f486442l75;
                        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(view, com.tencent.mm.R.id.f486442l75);
                        if (mMRoundCornerImageView != null) {
                            return new fg2.u(relativeLayout, frameLayout, imageView, textView, frameLayout2, relativeLayout, mMRoundCornerImageView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262342a;
    }
}
