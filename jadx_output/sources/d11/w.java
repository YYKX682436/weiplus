package d11;

/* loaded from: classes10.dex */
public class w implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f225701d;

    /* renamed from: e, reason: collision with root package name */
    public final int f225702e;

    /* renamed from: f, reason: collision with root package name */
    public final int f225703f;

    /* renamed from: g, reason: collision with root package name */
    public final int f225704g;

    /* renamed from: h, reason: collision with root package name */
    public final int f225705h;

    /* renamed from: i, reason: collision with root package name */
    public int f225706i;

    /* renamed from: m, reason: collision with root package name */
    public final int f225707m;

    public w(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f225701d = i17;
        this.f225702e = i18;
        this.f225703f = i19;
        this.f225704g = i27;
        this.f225705h = i28;
        this.f225706i = i29;
        this.f225707m = i37;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj != null && (obj instanceof d11.w)) {
            return this.f225701d - ((d11.w) obj).f225701d;
        }
        return 0;
    }
}
