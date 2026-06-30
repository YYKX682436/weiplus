package hk1;

/* loaded from: classes7.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk1.e f281867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f281868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f281869f;

    public a(hk1.e eVar, android.view.animation.Animation animation, android.animation.ValueAnimator valueAnimator) {
        this.f281867d = eVar;
        this.f281868e = animation;
        this.f281869f = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        hk1.e eVar = this.f281867d;
        android.view.ViewGroup viewGroup = eVar.f281876f;
        android.animation.ValueAnimator valueAnimator = this.f281869f;
        if (viewGroup == null) {
            valueAnimator.cancel();
            return;
        }
        android.view.animation.Transformation transformation = new android.view.animation.Transformation();
        if (!this.f281868e.getTransformation(android.os.SystemClock.uptimeMillis(), transformation)) {
            valueAnimator.cancel();
            return;
        }
        android.view.ViewGroup viewGroup2 = eVar.f281876f;
        kotlin.jvm.internal.o.d(viewGroup2);
        android.graphics.Matrix matrix = transformation.getMatrix();
        eVar.getClass();
        if (matrix == null || matrix.isIdentity()) {
            viewGroup2.setPivotX(viewGroup2.getWidth() / 2);
            viewGroup2.setPivotY(viewGroup2.getHeight() / 2);
            viewGroup2.setTranslationX(0.0f);
            viewGroup2.setTranslationY(0.0f);
            viewGroup2.setScaleX(1.0f);
            viewGroup2.setScaleY(1.0f);
            viewGroup2.setRotation(0.0f);
            return;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f17 = fArr[3];
        float sqrt = ((float) java.lang.Math.sqrt(1 - (f17 * f17))) * (fArr[0] < 0.0f ? -1 : 1);
        float degrees = (float) java.lang.Math.toDegrees(java.lang.Math.atan2(f17, sqrt));
        float f18 = fArr[0] / sqrt;
        float f19 = fArr[4] / sqrt;
        float f27 = fArr[2];
        float f28 = fArr[5];
        viewGroup2.setPivotX(0.0f);
        viewGroup2.setPivotY(0.0f);
        viewGroup2.setTranslationX(f27);
        viewGroup2.setTranslationY(f28);
        viewGroup2.setRotation(degrees);
        viewGroup2.setScaleX(f18);
        viewGroup2.setScaleY(f19);
    }
}
