package u4;

/* loaded from: classes3.dex */
public class o1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f424522d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f424523e;

    /* renamed from: f, reason: collision with root package name */
    public final int f424524f;

    /* renamed from: g, reason: collision with root package name */
    public final int f424525g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f424526h;

    /* renamed from: i, reason: collision with root package name */
    public float f424527i;

    /* renamed from: m, reason: collision with root package name */
    public float f424528m;

    /* renamed from: n, reason: collision with root package name */
    public final float f424529n;

    /* renamed from: o, reason: collision with root package name */
    public final float f424530o;

    public o1(android.view.View view, android.view.View view2, int i17, int i18, float f17, float f18) {
        this.f424523e = view;
        this.f424522d = view2;
        this.f424524f = i17 - java.lang.Math.round(view.getTranslationX());
        this.f424525g = i18 - java.lang.Math.round(view.getTranslationY());
        this.f424529n = f17;
        this.f424530o = f18;
        int[] iArr = (int[]) view2.getTag(com.tencent.mm.R.id.oj7);
        this.f424526h = iArr;
        if (iArr != null) {
            view2.setTag(com.tencent.mm.R.id.oj7, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        if (this.f424526h == null) {
            this.f424526h = new int[2];
        }
        int[] iArr = this.f424526h;
        float f17 = this.f424524f;
        android.view.View view = this.f424523e;
        iArr[0] = java.lang.Math.round(f17 + view.getTranslationX());
        this.f424526h[1] = java.lang.Math.round(this.f424525g + view.getTranslationY());
        this.f424522d.setTag(com.tencent.mm.R.id.oj7, this.f424526h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        float f17 = this.f424529n;
        android.view.View view = this.f424523e;
        view.setTranslationX(f17);
        view.setTranslationY(this.f424530o);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(android.animation.Animator animator) {
        android.view.View view = this.f424523e;
        this.f424527i = view.getTranslationX();
        this.f424528m = view.getTranslationY();
        view.setTranslationX(this.f424529n);
        view.setTranslationY(this.f424530o);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(android.animation.Animator animator) {
        float f17 = this.f424527i;
        android.view.View view = this.f424523e;
        view.setTranslationX(f17);
        view.setTranslationY(this.f424528m);
    }
}
