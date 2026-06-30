package ln1;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f319711d;

    /* renamed from: e, reason: collision with root package name */
    public final ln1.b0 f319712e;

    /* renamed from: f, reason: collision with root package name */
    public final long f319713f;

    /* renamed from: g, reason: collision with root package name */
    public final long f319714g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f319715h;

    /* renamed from: i, reason: collision with root package name */
    public final int f319716i;

    /* renamed from: m, reason: collision with root package name */
    public final ln1.s f319717m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f319718n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f319719o;

    public a0(java.lang.String str, ln1.s sVar, java.lang.String str2, int i17, long j17, long j18, java.lang.String str3, java.lang.String str4, ln1.b0 b0Var) {
        this.f319719o = "";
        this.f319711d = str3;
        this.f319712e = b0Var;
        this.f319713f = j17;
        this.f319714g = j18;
        this.f319715h = str4;
        this.f319716i = i17;
        this.f319717m = sVar;
        this.f319718n = str2;
        this.f319719o = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.s sVar = this.f319717m;
        int i17 = sVar.f319803d.e().f309611c - 1;
        final int i18 = this.f319716i;
        final boolean z17 = i18 == i17;
        final com.tencent.mm.sdk.platformtools.b3 b3Var = new com.tencent.mm.sdk.platformtools.b3(!z17);
        sn1.g0 g0Var = new sn1.g0(this.f319718n, this.f319713f, this.f319714g, this.f319711d, this.f319715h, new com.tencent.mm.modelbase.u0() { // from class: ln1.a0$$a
            @Override // com.tencent.mm.modelbase.u0
            public final void onSceneEnd(int i19, int i27, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
                com.tencent.mm.sdk.platformtools.b3 b3Var2 = b3Var;
                ln1.a0 a0Var = ln1.a0.this;
                a0Var.getClass();
                int i28 = kn1.f.f309601g;
                if (i28 == 1 || i28 == 21 || i28 == 22) {
                    ln1.s sVar2 = a0Var.f319717m;
                    int i29 = sVar2.f319803d.e().f309610b;
                    int i37 = i18 + 1;
                    if (i29 < i37) {
                        kn1.f fVar = sVar2.f319803d;
                        int i38 = fVar.e().f309611c;
                        kn1.g e17 = fVar.e();
                        if (i37 > i38) {
                            i37 = i38;
                        }
                        e17.f309610b = i37;
                        kn1.g e18 = fVar.e();
                        e18.getClass();
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        sVar2.f319802c.a(e18.f309609a);
                    }
                }
                java.lang.String str2 = ((sn1.g0) m1Var).f410009v.f447513g;
                boolean z19 = z17;
                com.tencent.mars.xlog.Log.i(a0Var.f319719o, "Send Tag finish last:%b  cv:%s [%d,%d,%s] tag[%s,%s]", java.lang.Boolean.valueOf(z19), b3Var2, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, a0Var.f319711d, str2);
                if (z19 && a0Var.f319711d.equals(str2)) {
                    b3Var2.c();
                }
                ln1.b0 b0Var = a0Var.f319712e;
                if (b0Var != null) {
                    ((ln1.f0$$a) b0Var).f319754a.f319753d.addAndGet(-1);
                }
            }
        });
        g0Var.K();
        java.lang.Object[] objArr = {this.f319718n, this.f319711d, java.lang.Integer.valueOf(g0Var.f410024d)};
        java.lang.String str = this.f319719o;
        com.tencent.mars.xlog.Log.i(str, "SendTagRunnable doScene talker:%s, tagTextClientId:%s, seq:%d", objArr);
        if (z17) {
            com.tencent.mars.xlog.Log.w(str, "sendTag last Session :[%d/%d] wait tag resp callback .", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(sVar.f319803d.e().f309611c - 1));
        }
    }

    public java.lang.String toString() {
        return this.f319719o + ".sendTag";
    }
}
