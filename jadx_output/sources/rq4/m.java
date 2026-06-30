package rq4;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final rq4.k f399016a;

    /* renamed from: b, reason: collision with root package name */
    public android.util.Size f399017b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.Size f399018c;

    /* renamed from: d, reason: collision with root package name */
    public int f399019d;

    /* renamed from: e, reason: collision with root package name */
    public int f399020e;

    /* renamed from: f, reason: collision with root package name */
    public long f399021f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f399022g;

    /* renamed from: h, reason: collision with root package name */
    public long f399023h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f399024i;

    /* renamed from: j, reason: collision with root package name */
    public long f399025j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f399026k;

    /* renamed from: l, reason: collision with root package name */
    public int f399027l;

    /* renamed from: m, reason: collision with root package name */
    public int f399028m;

    /* renamed from: n, reason: collision with root package name */
    public int f399029n;

    /* renamed from: o, reason: collision with root package name */
    public final int f399030o;

    public m() {
        rq4.k kVar = new rq4.k();
        this.f399016a = kVar;
        qq4.c.f365987a = new rq4.c();
        qq4.c.f365988b = new rq4.e();
        qq4.c.f365989c = new rq4.l();
        qq4.c.f365990d = new rq4.j();
        qq4.c.f365991e = new rq4.d();
        qq4.c.f365992f = new rq4.i();
        qq4.a.f365966a.add(kVar);
        vq4.b0 b0Var = vq4.b0.f439270a;
        this.f399030o = 5000;
    }

    public final void a(boolean z17) {
        rq4.i iVar = qq4.c.f365992f;
        if (iVar != null) {
            if (z17 && iVar.f398971e == 0) {
                long j17 = (wo.v1.f447822b.f447660e != 1 || gq4.v.wi().f365980n) ? gq4.v.wi().f365983q : gq4.v.wi().f365984r;
                if (j17 != 0) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    iVar.f398971e = java.lang.System.currentTimeMillis() - j17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "local first frame come cost " + iVar.f398971e);
                }
            } else if (!z17 && iVar.f398972f == 0 && gq4.v.wi().f365984r != 0) {
                long j18 = gq4.v.wi().f365984r;
                if (j18 != 0) {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    iVar.f398972f = java.lang.System.currentTimeMillis() - j18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "remote first frame come cost " + iVar.f398972f);
                }
            }
        }
        if (z17) {
            if (this.f399022g) {
                this.f399022g = false;
                rq4.j jVar = qq4.c.f365990d;
                if (jVar != null) {
                    long j19 = this.f399021f;
                    boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    jVar.m(true, java.lang.System.currentTimeMillis() - j19);
                }
            }
            this.f399027l++;
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f399021f = java.lang.System.currentTimeMillis();
        } else {
            if (this.f399024i) {
                this.f399024i = false;
                rq4.j jVar2 = qq4.c.f365990d;
                if (jVar2 != null) {
                    long j27 = this.f399023h;
                    boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    jVar2.m(false, java.lang.System.currentTimeMillis() - j27);
                }
            }
            this.f399028m++;
            boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f399023h = java.lang.System.currentTimeMillis();
        }
        rq4.j jVar3 = qq4.c.f365990d;
        if (jVar3 != null) {
            jVar3.j(z17);
        }
    }

    public final void b(boolean z17, int i17) {
        rq4.k kVar = this.f399016a;
        if (z17 && i17 != this.f399019d) {
            this.f399019d = i17;
            kVar.a(29);
        } else {
            if (z17 || this.f399020e == i17) {
                return;
            }
            this.f399020e = i17;
            kVar.a(32);
        }
    }

    public final void c(boolean z17, android.util.Size size) {
        kotlin.jvm.internal.o.g(size, "size");
        rq4.k kVar = this.f399016a;
        if (z17 && (!kotlin.jvm.internal.o.b(size, this.f399017b) || this.f399017b == null)) {
            this.f399017b = size;
            kVar.a(27);
        } else {
            if (z17) {
                return;
            }
            if (!kotlin.jvm.internal.o.b(size, this.f399018c) || this.f399018c == null) {
                this.f399018c = size;
                kVar.a(30);
            }
        }
    }

    public final void d() {
        sq4.b bVar;
        if (this.f399024i) {
            this.f399024i = false;
            rq4.j jVar = qq4.c.f365990d;
            if (jVar != null) {
                long j17 = this.f399023h;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                jVar.m(false, java.lang.System.currentTimeMillis() - j17);
            }
        }
        if (this.f399026k) {
            this.f399026k = false;
            rq4.d dVar = qq4.c.f365991e;
            if (dVar != null) {
                long j18 = this.f399025j;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                dVar.b(java.lang.System.currentTimeMillis() - j18);
            }
        }
        if (this.f399022g) {
            this.f399022g = false;
            rq4.j jVar2 = qq4.c.f365990d;
            if (jVar2 != null) {
                long j19 = this.f399021f;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                jVar2.m(true, java.lang.System.currentTimeMillis() - j19);
            }
        }
        rq4.j jVar3 = qq4.c.f365990d;
        if (jVar3 != null) {
            jVar3.j(false);
        }
        rq4.j jVar4 = qq4.c.f365990d;
        if (jVar4 != null) {
            jVar4.j(true);
        }
        rq4.e eVar = qq4.c.f365988b;
        if (eVar == null || (bVar = (sq4.b) eVar.f398961a.get(eVar.f398963c)) == null) {
            return;
        }
        bVar.b();
    }
}
