package n3;

/* loaded from: classes14.dex */
public class q2 extends n3.r2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.view.WindowInsetsAnimation f334392e;

    public q2(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f334392e = windowInsetsAnimation;
    }

    @Override // n3.r2
    public long a() {
        return this.f334392e.getDurationMillis();
    }

    @Override // n3.r2
    public float b() {
        return this.f334392e.getInterpolatedFraction();
    }

    @Override // n3.r2
    public int c() {
        return this.f334392e.getTypeMask();
    }

    @Override // n3.r2
    public void d(float f17) {
        this.f334392e.setFraction(f17);
    }
}
