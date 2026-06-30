package nd1;

/* loaded from: classes7.dex */
public class a1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f336259d;

    public a1(nd1.c1 c1Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f336259d = v5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f336259d.Z2(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
