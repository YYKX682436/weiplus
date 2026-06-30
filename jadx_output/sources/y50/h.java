package y50;

/* loaded from: classes3.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f459449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f459450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y50.e f459451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f459452g;

    public h(int i17, int i18, y50.e eVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f459449d = i17;
        this.f459450e = i18;
        this.f459451f = eVar;
        this.f459452g = mMActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f459451f.f459446b.invoke(this.f459452g, java.lang.Integer.valueOf(e3.b.c(this.f459449d, this.f459450e, ((java.lang.Float) animatedValue).floatValue())));
    }
}
