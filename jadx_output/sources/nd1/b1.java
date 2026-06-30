package nd1;

/* loaded from: classes7.dex */
public class b1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f336269d;

    public b1(nd1.c1 c1Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f336269d = v5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f336269d.c3(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
