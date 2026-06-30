package ot0;

/* loaded from: classes9.dex */
public class j extends ot0.h {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f348529J;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f348530b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f348531c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348532d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f348533e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348534f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348535g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348536h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348537i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f348538j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f348539k;

    /* renamed from: l, reason: collision with root package name */
    public int f348540l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f348541m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f348542n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f348543o;

    /* renamed from: p, reason: collision with root package name */
    public int f348544p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f348545q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f348546r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f348547s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f348548t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f348549u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f348550v;

    /* renamed from: w, reason: collision with root package name */
    public int f348551w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f348552x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f348553y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f348554z;

    @Override // ot0.h
    public ot0.h a() {
        return new ot0.j();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.wcpayinfo.coverinfo");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        r45.jm5 jm5Var = new r45.jm5();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                jm5Var.parseFrom(android.util.Base64.decode(str, 0));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppContentRedPacketCoverInfoPiece", e17, "", new java.lang.Object[0]);
        }
        this.f348530b = jm5Var.f377935d;
        this.f348531c = jm5Var.f377936e;
        this.f348532d = jm5Var.f377937f;
        this.f348533e = jm5Var.f377938g;
        this.f348534f = jm5Var.f377939h;
        this.f348535g = jm5Var.f377940i;
        this.f348536h = jm5Var.f377941m;
        this.f348537i = jm5Var.f377942n;
        this.f348538j = jm5Var.f377943o;
        this.f348539k = jm5Var.f377944p;
        this.f348540l = jm5Var.f377945q;
        this.f348541m = jm5Var.f377946r;
        this.f348542n = jm5Var.f377947s;
        this.f348543o = jm5Var.f377948t;
        this.f348544p = jm5Var.f377949u;
        this.f348545q = jm5Var.f377950v;
        this.f348546r = jm5Var.f377951w;
        this.f348547s = jm5Var.f377952x;
        this.f348548t = jm5Var.f377953y;
        this.f348549u = jm5Var.f377954z;
        this.f348550v = jm5Var.A;
        this.f348551w = jm5Var.B;
        com.tencent.mm.protobuf.g gVar = jm5Var.C;
        if (gVar != null) {
            try {
                byte[] bArr = gVar.f192156a;
                if (bArr != null && bArr.length > 0) {
                    this.f348552x = android.util.Base64.encodeToString(bArr, 2);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppContentRedPacketCoverInfoPiece", th6, "[parseContent] Fail to encodeToString", new java.lang.Object[0]);
            }
        }
        this.f348553y = jm5Var.D;
        this.f348554z = jm5Var.M;
        this.A = jm5Var.E;
        this.B = jm5Var.H;
        this.C = jm5Var.I;
        this.D = jm5Var.L;
        this.E = jm5Var.f377934J;
        this.F = jm5Var.K;
        if (com.tencent.mm.sdk.platformtools.t8.K0(jm5Var.R)) {
            this.G = jm5Var.N;
        } else {
            this.G = jm5Var.R;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jm5Var.S)) {
            this.H = jm5Var.P;
        } else {
            this.H = jm5Var.S;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jm5Var.T)) {
            this.I = jm5Var.Q;
        } else {
            this.I = jm5Var.T;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jm5Var.X)) {
            this.f348529J = jm5Var.W;
        } else {
            this.f348529J = jm5Var.X;
        }
    }
}
