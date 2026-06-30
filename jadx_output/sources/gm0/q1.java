package gm0;

/* loaded from: classes12.dex */
public class q1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm0.z1 f273269a;

    public q1(gm0.z1 z1Var) {
        this.f273269a = z1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        i95.n0.b("calling preloadServicesWithOnSplashMode()");
        com.tencent.mm.app.u6 u6Var = com.tencent.mm.app.u6.INSTANCE;
        u6Var.h(com.tencent.mm.app.t6.UNTIL_PRELOAD_ON_SPLASH_BEGIN);
        i95.y yVar = i95.n0.f289818b;
        j95.a aVar = j95.a.ON_SPLASH;
        yVar.getClass();
        i95.n0.a(new fs.e(((fs.c) fs.g.f(i95.w.class)).all(), new com.tencent.mm.app.o0((com.tencent.mm.app.p0) yVar, aVar)), i95.r.INITIALIZED, true, false);
        u6Var.h(com.tencent.mm.app.t6.UNTIL_PRELOAD_ON_SPLASH_END);
        gm0.z1 z1Var = this.f273269a;
        gm0.v1 v1Var = z1Var.f273301f;
        if (v1Var != null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.legacy.app.b0((com.tencent.mm.legacy.app.l0) v1Var));
            z1Var.f273301f = null;
        }
        return null;
    }
}
