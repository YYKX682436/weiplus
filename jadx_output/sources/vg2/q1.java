package vg2;

/* loaded from: classes3.dex */
public final class q1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436557e;

    public q1(vg2.r1 r1Var, android.view.ViewGroup viewGroup) {
        this.f436556d = r1Var;
        this.f436557e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        vg2.r1 r1Var = this.f436556d;
        r1Var.f436564e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewGroup viewGroup = this.f436557e;
        if (viewGroup != null) {
            vg2.r1.a(r1Var, viewGroup);
        }
    }
}
