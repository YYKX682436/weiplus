package n3;

/* loaded from: classes14.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f334394a;

    /* renamed from: b, reason: collision with root package name */
    public float f334395b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.animation.Interpolator f334396c;

    /* renamed from: d, reason: collision with root package name */
    public final long f334397d;

    public r2(int i17, android.view.animation.Interpolator interpolator, long j17) {
        this.f334394a = i17;
        this.f334396c = interpolator;
        this.f334397d = j17;
    }

    public long a() {
        return this.f334397d;
    }

    public float b() {
        android.view.animation.Interpolator interpolator = this.f334396c;
        return interpolator != null ? interpolator.getInterpolation(this.f334395b) : this.f334395b;
    }

    public int c() {
        return this.f334394a;
    }

    public void d(float f17) {
        this.f334395b = f17;
    }
}
