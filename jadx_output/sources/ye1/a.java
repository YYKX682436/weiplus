package ye1;

/* loaded from: classes15.dex */
public abstract class a implements ye1.r {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f461163b;

    /* renamed from: c, reason: collision with root package name */
    public ye1.l f461164c;

    /* renamed from: d, reason: collision with root package name */
    public ye1.j f461165d;

    /* renamed from: e, reason: collision with root package name */
    public ye1.m f461166e;

    /* renamed from: f, reason: collision with root package name */
    public ye1.g f461167f;

    /* renamed from: g, reason: collision with root package name */
    public ye1.n f461168g;

    /* renamed from: h, reason: collision with root package name */
    public ye1.f f461169h;

    /* renamed from: i, reason: collision with root package name */
    public ye1.q f461170i;

    /* renamed from: j, reason: collision with root package name */
    public ye1.p f461171j;

    /* renamed from: k, reason: collision with root package name */
    public ye1.i f461172k;

    /* renamed from: l, reason: collision with root package name */
    public ye1.k f461173l;

    /* renamed from: m, reason: collision with root package name */
    public ye1.o f461174m;

    /* renamed from: a, reason: collision with root package name */
    public int f461162a = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f461175n = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f461176o = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Set f461177p = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    @Override // ye1.r
    public void A(ye1.n nVar) {
        this.f461176o.add(nVar);
    }

    @Override // ye1.e
    public void B(ye1.m mVar) {
        this.f461166e = mVar;
    }

    @Override // ye1.s
    public void C(long j17) {
    }

    public void D(int i17) {
        synchronized (this) {
            if (this.f461163b) {
                return;
            }
            ye1.f fVar = this.f461169h;
            if (fVar != null) {
                fVar.a(this, i17);
            }
        }
    }

    public void E() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnCompletion");
        synchronized (this) {
            if (this.f461163b) {
                return;
            }
            ye1.g gVar = this.f461167f;
            if (gVar != null) {
                gVar.a(this);
            }
            java.util.Iterator it = this.f461177p.iterator();
            while (it.hasNext()) {
                ((ye1.g) it.next()).a(this);
            }
        }
    }

    public void F(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnDownStreamChanged, selectIndex:%s", str);
        synchronized (this) {
            if (this.f461163b) {
                return;
            }
            ye1.i iVar = this.f461172k;
            if (iVar != null) {
                ((dy4.h0) iVar).a(str);
            }
        }
    }

    public boolean G(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            if (this.f461163b) {
                return false;
            }
            ye1.j jVar = this.f461165d;
            return jVar != null && jVar.a(this, i17, i18);
        }
    }

    public void H(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnHitPreloadChange");
        synchronized (this) {
            if (this.f461163b) {
                return;
            }
            ye1.k kVar = this.f461173l;
            if (kVar != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                kotlin.jvm.internal.o.d(valueOf);
                boolean booleanValue = valueOf.booleanValue();
                dy4.f1 f1Var = ((dy4.i0) kVar).f244666a;
                java.lang.String x17 = f1Var.x();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHitPreload:");
                sb6.append(booleanValue);
                sb6.append("  fileId:");
                com.tencent.mm.plugin.appbrand.video.player.thumb.p pVar = com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a;
                sb6.append(pVar.a(f1Var.D));
                sb6.append("   preloadSize:");
                sb6.append(pVar.b(pVar.a(f1Var.D)));
                com.tencent.mars.xlog.Log.i(x17, sb6.toString());
                if (booleanValue) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 54L, 1L, false);
                    return;
                }
                if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 55L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 56L, 1L, false);
                }
                if (pVar.b(pVar.a(f1Var.D)) > 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 57L, 1L, false);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1379L, 58L, 1L, false);
                }
            }
        }
    }

    public boolean I(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnInfo, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            if (this.f461163b) {
                return false;
            }
            ye1.l lVar = this.f461164c;
            return lVar != null && lVar.a(this, i17, i18);
        }
    }

    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnPrepared");
        synchronized (this) {
            if (this.f461163b) {
                return;
            }
            ye1.m mVar = this.f461166e;
            if (mVar != null) {
                mVar.a(this);
            }
            java.util.Iterator it = this.f461175n.iterator();
            while (it.hasNext()) {
                ((ye1.m) it.next()).a(this);
            }
        }
    }

    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnSeekComplete");
        synchronized (this) {
            if (this.f461163b) {
                return;
            }
            ye1.n nVar = this.f461168g;
            if (nVar != null) {
                nVar.a(this);
            }
            java.util.Iterator it = this.f461176o.iterator();
            while (it.hasNext()) {
                ((ye1.n) it.next()).a(this);
            }
        }
    }

    public void L(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnVideoSizeChanged, width:%d, height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        synchronized (this) {
            if (this.f461163b) {
                return;
            }
            ye1.q qVar = this.f461170i;
            if (qVar != null) {
                qVar.a(this, i17, i18);
            }
        }
    }

    @Override // ye1.r
    public void a(ye1.m mVar) {
        this.f461175n.add(mVar);
    }

    @Override // ye1.e
    public void d(ye1.f fVar) {
        this.f461169h = fVar;
    }

    @Override // ye1.r
    public void e(ye1.g gVar) {
        this.f461177p.add(gVar);
    }

    @Override // ye1.e
    public void g(ye1.q qVar) {
        this.f461170i = qVar;
    }

    @Override // ye1.e
    public int getState() {
        return this.f461162a;
    }

    @Override // ye1.e
    public void h(ye1.n nVar) {
        this.f461168g = nVar;
    }

    @Override // ye1.e
    public void i(ye1.o oVar) {
        this.f461174m = oVar;
    }

    @Override // ye1.e
    public void j(boolean z17) {
        G(-1010, -1010);
    }

    @Override // ye1.e
    public void k(ye1.k kVar) {
        this.f461173l = kVar;
    }

    @Override // ye1.e
    public void n(double d17) {
        G(-1010, -1010);
    }

    @Override // ye1.s
    public void o(org.json.JSONObject jSONObject) {
    }

    @Override // ye1.e
    public void p(ye1.l lVar) {
        this.f461164c = lVar;
    }

    @Override // ye1.e
    public void q(ye1.i iVar) {
        this.f461172k = iVar;
    }

    @Override // ye1.e
    public void r(ye1.j jVar) {
        this.f461165d = jVar;
    }

    @Override // ye1.e
    public void s(ye1.p pVar) {
        this.f461171j = pVar;
    }

    @Override // ye1.s
    public void setAppId(java.lang.String str) {
    }

    @Override // ye1.e
    public void t(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        G(-1010, -1010);
    }

    @Override // ye1.e
    public void u(java.lang.String str, java.lang.String str2, ye1.h hVar) {
        m(str, str2);
        if (hVar != null) {
            ((ff1.i) hVar).a();
        }
    }

    @Override // ye1.s
    public void v(long j17) {
    }

    @Override // ye1.e
    public void w(java.lang.String str) {
        G(-1010, -1010);
    }

    @Override // ye1.e
    public void x(java.lang.String str, java.lang.String str2, int i17) {
        m(str, str2);
    }

    @Override // ye1.e
    public void z(ye1.g gVar) {
        this.f461167f = gVar;
    }
}
