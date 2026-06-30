package ef4;

/* loaded from: classes4.dex */
public final class v {
    public v(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        ye4.e eVar = (ye4.e) ((ze4.f) i95.n0.c(ze4.f.class));
        eVar.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath() + '/' + eVar.f461235d;
        kotlin.jvm.internal.o.f(str, "getAccStoryCachePath(...)");
        return str;
    }

    public final java.lang.String b() {
        java.lang.String wi6 = ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi();
        kotlin.jvm.internal.o.f(wi6, "getAccStoryPath(...)");
        return wi6;
    }

    public final ef4.w c() {
        ef4.w wVar = (ef4.w) i95.n0.c(ef4.w.class);
        kotlin.jvm.internal.o.d(wVar);
        return wVar;
    }

    public final d95.b0 d() {
        ef4.w c17 = c();
        d95.b0 b0Var = c17.f252483s;
        if (b0Var == null) {
            synchronized (this) {
                ef4.w.wi(c17);
                b0Var = c17.f252483s;
            }
        }
        kotlin.jvm.internal.o.d(b0Var);
        return b0Var;
    }

    public final java.lang.String e() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        if (str == null) {
            ef4.v vVar = ef4.w.f252468t;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error getSelfName ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryCore", sb6.toString());
        }
        return str == null ? "" : str;
    }

    public final nf4.a f() {
        gm0.j1.b().c();
        if (c().f252476i == null) {
            c().f252476i = new nf4.a(d());
        }
        nf4.a aVar = c().f252476i;
        kotlin.jvm.internal.o.d(aVar);
        return aVar;
    }

    public final nf4.g g() {
        gm0.j1.b().c();
        if (c().f252474g == null) {
            c().f252474g = new nf4.g(d());
        }
        nf4.g gVar = c().f252474g;
        kotlin.jvm.internal.o.d(gVar);
        return gVar;
    }

    public final nf4.i h() {
        gm0.j1.b().c();
        if (c().f252478n == null) {
            c().f252478n = new nf4.i(d());
        }
        nf4.i iVar = c().f252478n;
        kotlin.jvm.internal.o.d(iVar);
        return iVar;
    }

    public final nf4.l i() {
        gm0.j1.b().c();
        if (c().f252473f == null) {
            c().f252473f = new nf4.l(d());
        }
        nf4.l lVar = c().f252473f;
        kotlin.jvm.internal.o.d(lVar);
        return lVar;
    }

    public final ef4.f0 j() {
        gm0.j1.b().c();
        if (c().f252480p == null) {
            c().f252480p = new ef4.f0();
        }
        ef4.f0 f0Var = c().f252480p;
        kotlin.jvm.internal.o.d(f0Var);
        return f0Var;
    }

    public final nf4.p k() {
        gm0.j1.b().c();
        if (c().f252477m == null) {
            c().f252477m = new nf4.p(d());
        }
        nf4.p pVar = c().f252477m;
        kotlin.jvm.internal.o.d(pVar);
        return pVar;
    }

    public final com.tencent.mm.sdk.platformtools.n3 l() {
        com.tencent.mm.sdk.platformtools.n3 d17 = gm0.j1.e().d();
        kotlin.jvm.internal.o.f(d17, "getWorkerHandler(...)");
        return d17;
    }

    public final vo0.d m() {
        gm0.j1.b().c();
        if (c().f252479o == null) {
            c().f252479o = new hf4.f();
        }
        hf4.f fVar = c().f252479o;
        kotlin.jvm.internal.o.d(fVar);
        return fVar.f281227a;
    }
}
