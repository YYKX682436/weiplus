package gl5;

/* loaded from: classes15.dex */
public class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.y f273108d;

    public x(gl5.y yVar) {
        this.f273108d = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        gl5.y yVar = this.f273108d;
        float f17 = yVar.f273113d;
        yVar.f273115f = f17 + ((yVar.f273117h - f17) * valueAnimator.getAnimatedFraction());
        float f18 = yVar.f273114e;
        yVar.f273116g = f18 + ((yVar.f273118i - f18) * valueAnimator.getAnimatedFraction());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            yVar.f273110a.show(yVar.f273115f, yVar.f273116g);
        }
    }
}
