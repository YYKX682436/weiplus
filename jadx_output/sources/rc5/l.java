package rc5;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(rc5.m mVar) {
        super(1);
        this.f394167d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.animation.ValueAnimator anim = (android.animation.ValueAnimator) obj;
        kotlin.jvm.internal.o.g(anim, "anim");
        rc5.m mVar = this.f394167d;
        android.view.ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((java.lang.Integer) animatedValue).intValue();
        mVar.setLayoutParams(mVar.getLayoutParams());
        return jz5.f0.f302826a;
    }
}
