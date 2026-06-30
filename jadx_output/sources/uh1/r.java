package uh1;

/* loaded from: classes7.dex */
public class r {
    public final boolean A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final int f427872a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f427873b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f427874c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f427875d;

    /* renamed from: e, reason: collision with root package name */
    public final uh1.n f427876e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f427877f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f427878g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f427880i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f427881j;

    /* renamed from: k, reason: collision with root package name */
    public java.net.HttpURLConnection f427882k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f427883l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f427885n;

    /* renamed from: q, reason: collision with root package name */
    public boolean f427888q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f427889r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f427890s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f427892u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f427894w;

    /* renamed from: x, reason: collision with root package name */
    public int f427895x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f427896y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f427897z;

    /* renamed from: h, reason: collision with root package name */
    public int f427879h = 15;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f427886o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f427887p = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f427891t = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f427893v = false;

    /* renamed from: m, reason: collision with root package name */
    public final long f427884m = java.lang.System.currentTimeMillis();

    public r(java.lang.String str, byte[] bArr, int i17, uh1.n nVar, java.lang.String str2, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str3, int i18, java.lang.String str4, boolean z28, boolean z29, boolean z37) {
        this.f427888q = false;
        this.f427889r = false;
        this.f427890s = false;
        this.f427892u = false;
        this.f427897z = false;
        this.B = false;
        this.f427874c = str;
        this.f427873b = bArr;
        this.f427876e = nVar;
        this.f427872a = i17;
        this.f427875d = str2;
        this.f427888q = z17;
        this.f427889r = z18;
        this.f427892u = z27;
        this.f427890s = z19;
        this.f427894w = str3;
        this.f427895x = i18;
        this.f427896y = str4;
        this.f427897z = z28;
        this.A = z29;
        this.B = z37;
    }

    public uh1.n a() {
        return this.f427876e;
    }

    public int b() {
        return this.f427879h;
    }

    public int c() {
        return (int) (java.lang.System.currentTimeMillis() - this.f427884m);
    }

    public long d() {
        if (this.f427873b != null) {
            return r0.length;
        }
        return 0L;
    }

    public java.util.ArrayList e() {
        return this.f427878g;
    }

    public java.lang.String f() {
        return this.f427885n;
    }

    public java.util.Map g() {
        return this.f427877f;
    }

    public java.lang.String h() {
        return this.f427875d;
    }

    public byte[] i() {
        return this.f427873b;
    }

    public java.lang.String j() {
        return this.f427880i;
    }

    public java.lang.String k() {
        return this.f427881j;
    }

    public int l() {
        return this.f427872a;
    }

    public java.lang.String m() {
        return this.f427874c;
    }

    public void n(int i17) {
        this.f427879h = i17;
    }

    public void o(java.net.HttpURLConnection httpURLConnection) {
        this.f427882k = httpURLConnection;
    }

    public void p(java.lang.String str) {
        this.f427874c = str;
    }
}
