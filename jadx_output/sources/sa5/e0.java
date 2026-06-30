package sa5;

/* loaded from: classes14.dex */
public final class e0 extends sa5.e {

    /* renamed from: f, reason: collision with root package name */
    public final sa5.r0 f405336f;

    public e0(sa5.r0 direction) {
        kotlin.jvm.internal.o.g(direction, "direction");
        this.f405336f = direction;
        this.f405350c = kotlin.jvm.internal.o.b(direction, sa5.x.f405373a) ? new sa5.w(sa5.y.f405374d, sa5.z.f405375d, null, 4, null) : new sa5.w(sa5.a0.f405319d, sa5.b0.f405326d, null, 4, null);
    }

    @Override // sa5.e, sa5.j
    public void d() {
        super.d();
        android.view.View view = this.f405351d;
        if (view != null) {
            view.setClipToOutline(true);
        }
        android.view.View view2 = this.f405351d;
        if (view2 == null) {
            return;
        }
        view2.setOutlineProvider(new sa5.c0());
    }

    @Override // sa5.e, sa5.j
    public boolean e() {
        android.view.View view = this.f405351d;
        return view != null && view.getVisibility() == 0;
    }

    @Override // sa5.j
    public void h(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean b17 = kotlin.jvm.internal.o.b(this.f405336f, sa5.x.f405373a);
        float animatedFraction = animation.getAnimatedFraction();
        android.view.View view = this.f405351d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new sa5.d0(b17, animatedFraction));
    }
}
