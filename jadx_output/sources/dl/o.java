package dl;

/* loaded from: classes10.dex */
public class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl.t f235115d;

    public o(dl.t tVar) {
        this.f235115d = tVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue("bg_alpha")).intValue();
        int intValue2 = ((java.lang.Integer) valueAnimator.getAnimatedValue("alpha")).intValue();
        dl.t tVar = this.f235115d;
        xk0.c cVar = tVar.D;
        cVar.getClass();
        xk0.c.f454929t.setAlpha(intValue2);
        xk0.c.f454925p.setAlpha(intValue2);
        int i17 = (int) (intValue2 * 0.7058824f);
        cVar.f454934g = i17;
        xk0.c.f454928s.setAlpha(i17);
        cVar.f454935h = cVar.f454934g;
        tVar.D.getClass();
        xk0.c.f454927r.setAlpha((int) (intValue * 0.9019608f));
        tVar.r();
    }
}
