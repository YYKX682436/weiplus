package s4;

/* loaded from: classes15.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s4.d f402847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s4.e f402848e;

    public b(s4.e eVar, s4.d dVar) {
        this.f402848e = eVar;
        this.f402847d = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        s4.e eVar = this.f402848e;
        s4.d dVar = this.f402847d;
        eVar.d(floatValue, dVar);
        eVar.a(floatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
