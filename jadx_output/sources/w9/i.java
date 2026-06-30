package w9;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f444047a;

    /* renamed from: b, reason: collision with root package name */
    public final long f444048b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.TimeInterpolator f444049c;

    /* renamed from: d, reason: collision with root package name */
    public int f444050d;

    /* renamed from: e, reason: collision with root package name */
    public int f444051e;

    public i(long j17, long j18) {
        this.f444047a = 0L;
        this.f444048b = 300L;
        this.f444049c = null;
        this.f444050d = 0;
        this.f444051e = 1;
        this.f444047a = j17;
        this.f444048b = j18;
    }

    public void a(android.animation.Animator animator) {
        animator.setStartDelay(this.f444047a);
        animator.setDuration(this.f444048b);
        animator.setInterpolator(b());
        if (animator instanceof android.animation.ValueAnimator) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f444050d);
            valueAnimator.setRepeatMode(this.f444051e);
        }
    }

    public android.animation.TimeInterpolator b() {
        android.animation.TimeInterpolator timeInterpolator = this.f444049c;
        return timeInterpolator != null ? timeInterpolator : w9.a.f444035b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w9.i.class != obj.getClass()) {
            return false;
        }
        w9.i iVar = (w9.i) obj;
        if (this.f444047a == iVar.f444047a && this.f444048b == iVar.f444048b && this.f444050d == iVar.f444050d && this.f444051e == iVar.f444051e) {
            return b().getClass().equals(iVar.b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j17 = this.f444047a;
        int i17 = ((int) (j17 ^ (j17 >>> 32))) * 31;
        long j18 = this.f444048b;
        return ((((((i17 + ((int) ((j18 >>> 32) ^ j18))) * 31) + b().getClass().hashCode()) * 31) + this.f444050d) * 31) + this.f444051e;
    }

    public java.lang.String toString() {
        return "\n" + w9.i.class.getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " delay: " + this.f444047a + " duration: " + this.f444048b + " interpolator: " + b().getClass() + " repeatCount: " + this.f444050d + " repeatMode: " + this.f444051e + "}\n";
    }

    public i(long j17, long j18, android.animation.TimeInterpolator timeInterpolator) {
        this.f444047a = 0L;
        this.f444048b = 300L;
        this.f444049c = null;
        this.f444050d = 0;
        this.f444051e = 1;
        this.f444047a = j17;
        this.f444048b = j18;
        this.f444049c = timeInterpolator;
    }
}
