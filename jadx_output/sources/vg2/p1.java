package vg2;

/* loaded from: classes3.dex */
public final class p1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436553e;

    public p1(vg2.r1 r1Var, android.view.ViewGroup viewGroup) {
        this.f436552d = r1Var;
        this.f436553e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        vg2.r1 r1Var = this.f436552d;
        r1Var.f436564e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        vg2.r1.a(r1Var, this.f436553e);
    }
}
