package x11;

/* loaded from: classes12.dex */
public final class w implements x11.a {

    /* renamed from: a, reason: collision with root package name */
    public final x11.f0 f451413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f451414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f451415c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f451416d;

    /* renamed from: e, reason: collision with root package name */
    public final w11.k0 f451417e;

    public w(x11.f0 reporter, int i17, int i18, java.lang.String str, w11.k0 initScene) {
        kotlin.jvm.internal.o.g(reporter, "reporter");
        kotlin.jvm.internal.o.g(initScene, "initScene");
        this.f451413a = reporter;
        this.f451414b = i17;
        this.f451415c = i18;
        this.f451416d = str;
        this.f451417e = initScene;
    }

    @Override // x11.a
    public x11.y a(x11.t initController) {
        kotlin.jvm.internal.o.g(initController, "initController");
        java.lang.Object l17 = gm0.j1.u().c().l(8198, null);
        w11.c2.f441991a.d(com.tencent.mm.sdk.platformtools.t8.h(l17 instanceof java.lang.String ? (java.lang.String) l17 : null), false);
        gm0.j1.u().c().w(8197, "");
        gm0.j1.u().c().w(8198, "");
        gm0.j1.u().c().w(15, 1);
        gm0.j1.u().c().i(true);
        p01.f fVar = p01.f.f350364a;
        boolean a17 = fVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "InitEnd isNetSceneOpt:%s", java.lang.Boolean.valueOf(a17));
        if (a17) {
            com.tencent.mm.modelbase.u0 u0Var = initController.f451394h;
            int i17 = this.f451415c;
            int i18 = this.f451414b;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i17, this.f451416d, this.f451417e);
            }
            this.f451413a.c(i18, i17, initController.f451397n, initController.f451391e);
            fVar.b();
            t4.a.b("NewInitAll", 10086);
        } else {
            gm0.j1.e().j(new x11.v(initController, this));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "removeBlockDetect");
        ((ku5.t0) ku5.t0.f312615d).A("initBlockDetector");
        initController.f451408y = true;
        return x11.y.f451420d;
    }

    @Override // x11.a
    public java.lang.String b() {
        return "InitTaskEnd@" + hashCode();
    }
}
