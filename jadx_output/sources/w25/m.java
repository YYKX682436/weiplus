package w25;

/* loaded from: classes12.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f442653a;

    /* renamed from: b, reason: collision with root package name */
    public final float f442654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442655c;

    /* renamed from: d, reason: collision with root package name */
    public final long f442656d;

    public m(long j17, float f17, float f18, int i17, int i18) {
        this.f442653a = f17;
        this.f442654b = f18;
        this.f442655c = i17;
        this.f442656d = j17;
    }

    public java.lang.String toString() {
        return java.lang.String.format("%d-%d-%d", java.lang.Integer.valueOf((int) (this.f442653a * 1000000.0f)), java.lang.Integer.valueOf((int) (this.f442654b * 1000000.0f)), java.lang.Integer.valueOf(this.f442655c));
    }
}
