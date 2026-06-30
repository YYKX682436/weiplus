package w8;

/* loaded from: classes15.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f443641a;

    /* renamed from: b, reason: collision with root package name */
    public final int f443642b;

    /* renamed from: c, reason: collision with root package name */
    public final int f443643c;

    /* renamed from: d, reason: collision with root package name */
    public int f443644d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f443645e;

    public g0(int i17, int i18) {
        this(Integer.MIN_VALUE, i17, i18);
    }

    public void a() {
        int i17 = this.f443644d;
        this.f443644d = i17 == Integer.MIN_VALUE ? this.f443642b : i17 + this.f443643c;
        this.f443645e = this.f443641a + this.f443644d;
    }

    public final void b() {
        if (this.f443644d == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public g0(int i17, int i18, int i19) {
        java.lang.String str;
        if (i17 != Integer.MIN_VALUE) {
            str = i17 + "/";
        } else {
            str = "";
        }
        this.f443641a = str;
        this.f443642b = i18;
        this.f443643c = i19;
        this.f443644d = Integer.MIN_VALUE;
    }
}
