package cr0;

/* loaded from: classes12.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f221778a;

    /* renamed from: b, reason: collision with root package name */
    public final long f221779b = java.lang.System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f221780c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public long f221781d;

    public v1(int i17) {
        this.f221778a = i17;
    }

    public final float a(long j17) {
        float f17 = ((float) (this.f221781d * 10)) * 100.0f;
        long j18 = j17 - this.f221779b;
        if (j18 < 1) {
            j18 = 1;
        }
        return f17 / ((float) j18);
    }
}
