package ri5;

/* loaded from: classes.dex */
public final class j extends xm3.a {
    public static final ri5.h I = new ri5.h(null);

    /* renamed from: J, reason: collision with root package name */
    public static final int f396105J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final int U;
    public static final int V;
    public static final int W;
    public static final int X;
    public static final int Y;
    public static final int Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f396106p0;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f396107x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final java.util.Set f396108y0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public java.lang.String E;
    public int F;
    public int G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f396109d;

    /* renamed from: e, reason: collision with root package name */
    public final int f396110e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f396111f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f396112g;

    /* renamed from: h, reason: collision with root package name */
    public final si5.c f396113h;

    /* renamed from: i, reason: collision with root package name */
    public final int f396114i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f396115l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f396116m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f396117n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396118o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f396119p;

    /* renamed from: q, reason: collision with root package name */
    public int f396120q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f396121r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f396122s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f396123t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f396124u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f396125v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f396126w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f396127x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f396128y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f396129z;

    static {
        ri5.i[] iVarArr = ri5.i.f396104d;
        f396105J = 18;
        ri5.i[] iVarArr2 = ri5.i.f396104d;
        K = 1;
        ri5.i[] iVarArr3 = ri5.i.f396104d;
        L = 2;
        ri5.i[] iVarArr4 = ri5.i.f396104d;
        M = 3;
        ri5.i[] iVarArr5 = ri5.i.f396104d;
        N = 4;
        ri5.i[] iVarArr6 = ri5.i.f396104d;
        P = 5;
        ri5.i[] iVarArr7 = ri5.i.f396104d;
        Q = 6;
        ri5.i[] iVarArr8 = ri5.i.f396104d;
        R = 7;
        ri5.i[] iVarArr9 = ri5.i.f396104d;
        S = 8;
        ri5.i[] iVarArr10 = ri5.i.f396104d;
        T = 9;
        ri5.i[] iVarArr11 = ri5.i.f396104d;
        U = 10;
        ri5.i[] iVarArr12 = ri5.i.f396104d;
        V = 11;
        ri5.i[] iVarArr13 = ri5.i.f396104d;
        W = 12;
        ri5.i[] iVarArr14 = ri5.i.f396104d;
        X = 13;
        ri5.i[] iVarArr15 = ri5.i.f396104d;
        Y = 14;
        ri5.i[] iVarArr16 = ri5.i.f396104d;
        Z = 15;
        ri5.i[] iVarArr17 = ri5.i.f396104d;
        f396106p0 = 16;
        ri5.i[] iVarArr18 = ri5.i.f396104d;
        f396107x0 = 17;
        f396108y0 = kz5.z.D0(new java.lang.Integer[]{1, 2, 3, 4});
    }

    public /* synthetic */ j(java.lang.String str, int i17, java.lang.String str2, java.lang.CharSequence charSequence, si5.c cVar, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, str2, charSequence, cVar, (i19 & 32) != 0 ? i17 : i18);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        ri5.j other = (ri5.j) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f396111f, other.f396111f) && this.f396118o == other.f396118o && kotlin.jvm.internal.o.b(this.f396119p, other.f396119p) && this.f396120q == other.f396120q && this.f396122s == other.f396122s && this.f396125v == other.f396125v && this.f396115l1 == other.f396115l1 && this.f396126w == other.f396126w && this.f396127x == other.f396127x && kotlin.jvm.internal.o.b(this.f396112g, other.f396112g) && kotlin.jvm.internal.o.b(this.f396116m, other.f396116m) && kotlin.jvm.internal.o.b(this.f396117n, other.f396117n) && this.f396118o == other.f396118o && this.f396128y == other.f396128y && this.f396113h.e(other.f396113h) && this.B == other.B;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ri5.j other = (ri5.j) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f396113h.b(this, other, other.f396113h);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f396110e;
    }

    public final void n(java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2 = this.f396117n;
        if ((charSequence2 == null || r26.n0.N(charSequence2)) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.chatting.RepairerConfigMvvmListDebug()) == 1) {
            charSequence = this.f396109d;
        }
        this.f396117n = charSequence;
    }

    public final void o(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f396119p = str;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f396109d;
    }

    public j(java.lang.String id6, int i17, java.lang.String username, java.lang.CharSequence title, si5.c extension, int i18) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(extension, "extension");
        this.f396109d = id6;
        this.f396110e = i17;
        this.f396111f = username;
        this.f396112g = title;
        this.f396113h = extension;
        this.f396114i = i18;
        this.f396116m = "";
        this.f396117n = "";
        this.f396119p = "";
        this.f396121r = true;
        this.f396122s = true;
        this.f396128y = true;
        this.E = "";
        this.G = -1;
        this.H = -1;
    }
}
