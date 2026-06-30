package oa5;

/* loaded from: classes8.dex */
public class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa5.j f343881d;

    public i(oa5.j jVar) {
        this.f343881d = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f343881d.f343859e.a(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
