package ox1;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f349581a = 0;

    /* renamed from: b, reason: collision with root package name */
    public float f349582b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f349583c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f349584d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f349585e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f349586f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f349587g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f349588h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f349589i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f349590j = -1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f349591k = -1;

    public int a() {
        boolean z17 = false;
        if (!(this.f349582b >= 0.0f && this.f349583c >= 0.0f && this.f349584d >= 0.0f && this.f349585e >= 0.0f && this.f349586f >= 0)) {
            return 0;
        }
        if (this.f349587g >= 0.0f && this.f349588h >= 0.0f && this.f349589i >= 0.0f && this.f349590j >= 0.0f && this.f349591k >= 0) {
            z17 = true;
        }
        if (z17) {
            return (java.lang.Math.abs((int) (this.f349584d - this.f349589i)) > 30 || java.lang.Math.abs((int) (this.f349585e - this.f349590j)) > 30 || this.f349586f != this.f349591k) ? 3 : 2;
        }
        return 1;
    }
}
