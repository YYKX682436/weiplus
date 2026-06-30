package fa;

/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f260575a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public android.animation.ValueAnimator f260576b = null;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.Animator.AnimatorListener f260577c = new fa.y(this);

    public void a(int[] iArr, android.animation.ValueAnimator valueAnimator) {
        fa.z zVar = new fa.z(iArr, valueAnimator);
        valueAnimator.addListener(this.f260577c);
        this.f260575a.add(zVar);
    }
}
