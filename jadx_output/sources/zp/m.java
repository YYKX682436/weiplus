package zp;

/* loaded from: classes16.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f474922a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Point f474923b;

    /* renamed from: c, reason: collision with root package name */
    public final int f474924c;

    /* renamed from: d, reason: collision with root package name */
    public float f474925d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f474926e = 0.0f;

    public m(long j17, android.graphics.Point point, int i17) {
        this.f474922a = j17;
        this.f474923b = point;
        this.f474924c = i17;
    }

    public java.lang.String toString() {
        return "TouchPoint{mTime=" + this.f474922a + ", mTargetLeft=" + this.f474925d + ", mTargetTop=" + this.f474926e + ", mPoint=" + this.f474923b + ", mDistanceOfError=" + this.f474924c + '}';
    }
}
