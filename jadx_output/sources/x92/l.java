package x92;

/* loaded from: classes3.dex */
public class l extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f452703g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f452704h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f452705i;

    /* renamed from: m, reason: collision with root package name */
    public int f452706m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f452707n;

    /* renamed from: o, reason: collision with root package name */
    public wu5.c f452708o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f452709p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        wu5.c cVar = this.f452708o;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    @Override // x92.r
    public void Q6() {
        super.Q6();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type android.app.Activity");
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f452706m = displayMetrics.widthPixels;
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        this.f452703g = (android.widget.ImageView) getActivity().findViewById(com.tencent.mm.R.id.f482584ih);
        this.f452704h = (android.widget.ImageView) getActivity().findViewById(com.tencent.mm.R.id.f482587ik);
        this.f452705i = (android.view.ViewGroup) getActivity().findViewById(com.tencent.mm.R.id.f482586ij);
        V6();
        int i17 = (int) (this.f452706m * 1.3333334f);
        android.widget.ImageView imageView = this.f452704h;
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = i17;
        android.widget.ImageView imageView2 = this.f452704h;
        if (imageView2 == null) {
            return;
        }
        imageView2.setLayoutParams(layoutParams);
    }

    @Override // x92.r
    public void T6(com.tencent.mm.protobuf.f fVar) {
        if (this.f452707n) {
            return;
        }
        super.T6(fVar);
        if (a2()) {
            Z6(d2());
        } else {
            Y6(false);
        }
        this.f452707n = true;
    }

    public void V6() {
        android.widget.ImageView imageView = this.f452703g;
        if (imageView != null) {
            imageView.post(new x92.g(imageView, this));
        }
    }

    public void W6(boolean z17) {
        android.view.ViewGroup viewGroup;
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicCoverUIC", "adjustView : ignoreCover " + z17);
        if (a2() && (viewGroup = this.f452705i) != null) {
            viewGroup.setVisibility(0);
        }
        if (!z17 && a2()) {
            Z6(d2());
        }
        this.f452709p = true;
    }

    public int X6(int i17) {
        return (int) (i17 * 1.3333334f);
    }

    public final void Y6(boolean z17) {
        if (this.f452709p) {
            W6(z17);
            return;
        }
        android.widget.FrameLayout frameLayout = this.f452720e;
        if (frameLayout != null) {
            frameLayout.post(new x92.i(this, z17));
        }
    }

    public final void Z6(java.lang.String str) {
        android.widget.ImageView imageView = this.f452703g;
        if (imageView != null) {
            mn2.j0 j0Var = new mn2.j0(str);
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c a17 = g1Var.e().a(j0Var);
            a17.g(g1Var.h(mn2.f1.f329966t));
            a17.f447873d = new x92.k(str, this, imageView);
            a17.c(imageView);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicCoverUIC", "forceCampaignVisible: ");
        wu5.c cVar = this.f452708o;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        x92.h hVar = new x92.h(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f452708o = t0Var.z(hVar, 2000L, false);
    }

    @Override // x92.r, x92.q
    public void b2() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(true);
        android.view.ViewGroup viewGroup = this.f452705i;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.widget.ImageView imageView = this.f452704h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f452703g;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    @Override // x92.r, x92.q
    public void setNormalStyle() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(com.tencent.mm.ui.bk.C());
        android.view.ViewGroup viewGroup = this.f452705i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
