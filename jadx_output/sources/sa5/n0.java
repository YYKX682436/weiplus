package sa5;

/* loaded from: classes14.dex */
public final class n0 extends sa5.f {

    /* renamed from: f, reason: collision with root package name */
    public final sa5.r0 f405360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sa5.r0 direction) {
        super(0, 1, null);
        kotlin.jvm.internal.o.g(direction, "direction");
        this.f405360f = direction;
        this.f405350c = kotlin.jvm.internal.o.b(direction, sa5.x.f405373a) ? new sa5.w(sa5.i0.f405347d, sa5.j0.f405352d, null, 4, null) : new sa5.w(sa5.k0.f405355d, sa5.l0.f405356d, null, 4, null);
    }

    @Override // sa5.j
    public void h(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean b17 = kotlin.jvm.internal.o.b(this.f405360f, sa5.x.f405373a);
        float animatedFraction = animation.getAnimatedFraction();
        android.view.View view = this.f405351d;
        if (view == null) {
            return;
        }
        view.setOutlineProvider(new sa5.m0(b17, animatedFraction));
    }
}
