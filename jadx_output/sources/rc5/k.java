package rc5;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(rc5.m mVar) {
        super(1);
        this.f394166d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.ValueAnimator anim = (android.animation.ValueAnimator) obj;
        kotlin.jvm.internal.o.g(anim, "anim");
        android.view.Window window = this.f394166d.f394170f.getActivity().getWindow();
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((java.lang.Integer) animatedValue).intValue());
        return jz5.f0.f302826a;
    }
}
