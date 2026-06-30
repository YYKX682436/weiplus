package lc5;

/* loaded from: classes3.dex */
public final class u extends dp1.a {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.k1 f318035m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MMViewPager f318036n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f318037o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f318038p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.app.Activity activity, com.tencent.mm.ui.chatting.gallery.k1 k1Var, com.tencent.mm.ui.base.MMViewPager mMViewPager, android.view.View view, android.view.View view2) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f318035m = k1Var;
        this.f318036n = mMViewPager;
        this.f318037o = view;
        this.f318038p = view2;
    }

    @Override // dp1.u, dp1.x
    public int o() {
        android.view.View z17 = z();
        return z17 != null ? z17.getHeight() : super.o();
    }

    @Override // dp1.u, dp1.x
    public android.view.View s() {
        return this.f318037o;
    }

    @Override // dp1.u, dp1.x
    public boolean t() {
        return false;
    }

    @Override // dp1.u, dp1.x
    public android.view.View u() {
        return z();
    }

    @Override // dp1.u, dp1.x
    public int v() {
        android.view.View z17 = z();
        return z17 != null ? z17.getWidth() : super.v();
    }

    public final android.view.View z() {
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.f318036n;
        if (mMViewPager != null) {
            return mMViewPager;
        }
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f318035m;
        android.view.View view = null;
        if (k1Var == null || mMViewPager == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageFloatBallPageAdapter", "%d get current view but adapter or gallery is null", java.lang.Integer.valueOf(hashCode()));
        } else if (k1Var.w() != null) {
            if (k1Var.w().J2() || k1Var.w().o2()) {
                view = k1Var.c(mMViewPager.getCurrentItem(), true);
                if (view == null) {
                    view = k1Var.f(mMViewPager.getCurrentItem(), true);
                }
            } else if (k1Var.w().isVideo() || k1Var.w().Y2() || k1Var.w().M2()) {
                view = k1Var.C(mMViewPager.getCurrentItem());
            }
        }
        return view;
    }
}
