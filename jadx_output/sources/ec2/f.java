package ec2;

/* loaded from: classes2.dex */
public final class f extends fc2.a {
    public int A;
    public boolean B;
    public int C;
    public android.util.Size D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public final int f250959d;

    /* renamed from: e, reason: collision with root package name */
    public cw2.wa f250960e;

    /* renamed from: f, reason: collision with root package name */
    public r45.mb4 f250961f;

    /* renamed from: g, reason: collision with root package name */
    public mn2.j4 f250962g;

    /* renamed from: h, reason: collision with root package name */
    public int f250963h;

    /* renamed from: i, reason: collision with root package name */
    public int f250964i;

    /* renamed from: j, reason: collision with root package name */
    public long f250965j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f250966k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f250967l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f250968m;

    /* renamed from: n, reason: collision with root package name */
    public int f250969n;

    /* renamed from: o, reason: collision with root package name */
    public int f250970o;

    /* renamed from: p, reason: collision with root package name */
    public int f250971p;

    /* renamed from: q, reason: collision with root package name */
    public dn.o f250972q;

    /* renamed from: r, reason: collision with root package name */
    public dn.h f250973r;

    /* renamed from: s, reason: collision with root package name */
    public int f250974s;

    /* renamed from: t, reason: collision with root package name */
    public int f250975t;

    /* renamed from: u, reason: collision with root package name */
    public long f250976u;

    /* renamed from: v, reason: collision with root package name */
    public nk4.t f250977v;

    /* renamed from: w, reason: collision with root package name */
    public nk4.a f250978w;

    /* renamed from: x, reason: collision with root package name */
    public kz2.a f250979x;

    /* renamed from: y, reason: collision with root package name */
    public int f250980y;

    /* renamed from: z, reason: collision with root package name */
    public int f250981z;

    public f(int i17) {
        this.f250959d = i17;
    }

    public final int b() {
        return this.f250970o;
    }

    public final java.lang.String c() {
        return this.f250966k;
    }

    public final long d() {
        return this.f250965j;
    }

    public final r45.mb4 e() {
        return this.f250961f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec2.f) && this.f250959d == ((ec2.f) obj).f250959d;
    }

    public final int f() {
        return this.f250963h;
    }

    public final int g() {
        return this.f250971p;
    }

    public final int h() {
        return this.f250964i;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f250959d);
    }

    public final int i() {
        return this.f250959d;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(type=");
        sb6.append(this.f250959d);
        sb6.append(", mediaObject=");
        sb6.append(this.f250961f);
        sb6.append(", mediaId=");
        r45.mb4 mb4Var = this.f250961f;
        if (mb4Var == null || (str = mb4Var.getString(9)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", offset=");
        sb6.append(this.f250963h);
        sb6.append(", total=");
        sb6.append(this.f250964i);
        sb6.append(", feedId=");
        sb6.append(this.f250965j);
        sb6.append(", objectNonceId='");
        sb6.append(this.f250967l);
        sb6.append("' mediaListSize=");
        java.util.LinkedList linkedList = this.f250968m;
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(')');
        return sb6.toString();
    }
}
