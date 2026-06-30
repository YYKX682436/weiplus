package u60;

/* loaded from: classes15.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f424868a;

    /* renamed from: b, reason: collision with root package name */
    public final double f424869b;

    /* renamed from: c, reason: collision with root package name */
    public int f424870c;

    /* renamed from: d, reason: collision with root package name */
    public int f424871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f424872e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f424873f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f424874g;

    public h(double d17, double d18) {
        this(d17, d18, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof u60.h)) {
            return false;
        }
        return ((u60.h) obj).toString().equals(toString());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((int) (this.f424868a * 1000000.0d));
        java.lang.String str = "";
        sb6.append("");
        sb6.append((int) (this.f424869b * 1000000.0d));
        java.lang.Object obj = this.f424873f;
        if (obj != null) {
            if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.String)) {
                str = this.f424873f + "";
            } else if (obj instanceof com.tencent.mm.storage.f9) {
                str = ((com.tencent.mm.storage.f9) this.f424873f).getMsgId() + "_" + ((com.tencent.mm.storage.f9) this.f424873f).Q0();
            } else {
                str = obj.toString();
            }
        }
        sb6.append(str);
        return sb6.toString();
    }

    public h(double d17, double d18, boolean z17) {
        this.f424873f = "";
        this.f424868a = d17;
        this.f424869b = d18;
        this.f424874g = z17;
    }

    public h(double d17, double d18, int i17, java.lang.Object obj, boolean z17) {
        this.f424868a = d17;
        this.f424869b = d18;
        this.f424873f = obj;
        this.f424870c = i17;
        this.f424874g = z17;
    }
}
