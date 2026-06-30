package dr4;

/* loaded from: classes14.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f242675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f242676b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f242677c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f242678d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f242679e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f242680f;

    /* renamed from: g, reason: collision with root package name */
    public dr4.q f242681g;

    /* renamed from: h, reason: collision with root package name */
    public dr4.q f242682h;

    /* renamed from: i, reason: collision with root package name */
    public dr4.q f242683i;

    /* renamed from: j, reason: collision with root package name */
    public dr4.q f242684j;

    /* renamed from: k, reason: collision with root package name */
    public rs0.h f242685k;

    /* renamed from: l, reason: collision with root package name */
    public dr4.r1 f242686l;

    /* renamed from: m, reason: collision with root package name */
    public is0.c f242687m;

    /* renamed from: n, reason: collision with root package name */
    public int f242688n;

    /* renamed from: o, reason: collision with root package name */
    public int f242689o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f242690p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.Surface f242691q;

    /* renamed from: r, reason: collision with root package name */
    public final int f242692r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.q f242693s;

    public o(boolean z17, int i17, yz5.p queueScope) {
        kotlin.jvm.internal.o.g(queueScope, "queueScope");
        this.f242675a = z17;
        this.f242676b = i17;
        this.f242677c = queueScope;
        this.f242678d = "MicroMsg.WindowSurfaceRenderer@" + hashCode();
        this.f242680f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f242679e = false;
        this.f242692r = !z17 ? 1 : 0;
    }

    public static /* synthetic */ void c(dr4.o oVar, yz5.l lVar, dr4.c0 c0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkInit");
        }
        if ((i17 & 1) != 0) {
            lVar = null;
        }
        if ((i17 & 2) != 0) {
            c0Var = null;
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        oVar.b(lVar, c0Var, z17);
    }

    public static void k(dr4.o oVar, dr4.q qVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRender");
        }
        if ((i17 & 1) != 0) {
            qVar = null;
        }
        oVar.getClass();
        com.tencent.mm.sdk.platformtools.Log.c(oVar.f242678d, "stopRender, surface:" + qVar, new java.lang.Object[0]);
        if (kotlin.jvm.internal.o.b(qVar, oVar.f242681g) || kotlin.jvm.internal.o.b(qVar, oVar.f242682h) || qVar == null) {
            oVar.d(new dr4.n(oVar));
        }
    }

    public final void a(dr4.q qVar, int i17) {
        java.lang.String str = this.f242678d;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e(str, "add a null surface");
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c(str, "add render surface renderSide " + i17 + " and :" + qVar, new java.lang.Object[0]);
        if (i17 == 0) {
            this.f242681g = qVar;
        } else {
            this.f242682h = qVar;
        }
    }

    public abstract void b(yz5.l lVar, dr4.c0 c0Var, boolean z17);

    public abstract void d(yz5.a aVar);

    public void e() {
        java.lang.String str = this.f242678d;
        com.tencent.mars.xlog.Log.i(str, "onSurfaceTextureDestroyed");
        if (!this.f242680f.compareAndSet(false, true)) {
            com.tencent.mars.xlog.Log.e(str, "release already release");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "continue release " + this.f242676b);
        d(new dr4.j(this));
    }

    public void f() {
    }

    public final void g(dr4.q qVar, int i17) {
        com.tencent.mm.sdk.platformtools.Log.c(this.f242678d, "remove render surface :" + qVar, new java.lang.Object[0]);
        this.f242677c.invoke(this.f242675a ? "CAMERA" : "DECODE", new dr4.k(new dr4.l(qVar, this, i17)));
    }

    public abstract void h();

    public final void i(is0.c texture) {
        kotlin.jvm.internal.o.g(texture, "texture");
        if (this.f242679e) {
            dr4.r1 r1Var = this.f242686l;
            if (r1Var != null) {
                r1Var.D = texture;
                r1Var.C = texture.f294395e;
            }
            h();
        }
    }

    public final void j() {
        com.tencent.mm.sdk.platformtools.Log.c(this.f242678d, "startRender", new java.lang.Object[0]);
        this.f242679e = true;
    }

    public void l(android.util.Size renderSize) {
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        this.f242688n = renderSize.getWidth();
        this.f242689o = renderSize.getHeight();
        dr4.r1 r1Var = this.f242686l;
        if (r1Var != null) {
            r1Var.w(renderSize.getWidth(), renderSize.getHeight());
        }
    }
}
