package nz4;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f341602a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f341603b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f341604c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f341605d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f341606e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f341607f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f341608g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f341609h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f341610i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f341611j = -1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f341612k = -1;

    public int a() {
        boolean z17 = false;
        if (!(this.f341603b >= 0.0f && this.f341604c >= 0.0f && this.f341605d >= 0.0f && this.f341606e >= 0.0f && this.f341607f >= 0)) {
            return 0;
        }
        if (this.f341608g >= 0.0f && this.f341609h >= 0.0f && this.f341610i >= 0.0f && this.f341611j >= 0.0f && this.f341612k >= 0) {
            z17 = true;
        }
        if (z17) {
            return (java.lang.Math.abs((int) (this.f341605d - this.f341610i)) > 30 || java.lang.Math.abs((int) (this.f341606e - this.f341611j)) > 30 || this.f341607f != this.f341612k) ? 3 : 2;
        }
        return 1;
    }
}
