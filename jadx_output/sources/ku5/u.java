package ku5;

/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.concurrent.Executor f312620a;

    public static void a(android.content.Context context, ku5.s sVar) {
        java.lang.Object a17;
        com.tencent.mm.booter.p3 p3Var = (com.tencent.mm.booter.p3) sVar;
        p3Var.getClass();
        ku5.o.f312599c = new com.tencent.mm.booter.i3(p3Var);
        ku5.o.f312598b = new com.tencent.mm.booter.j3(p3Var);
        ku5.o.f312597a = new com.tencent.mm.booter.k3(p3Var);
        ku5.b bVar = new ku5.b();
        ku5.c a18 = com.tencent.mm.sdk.platformtools.x2.n() ? com.tencent.mm.booter.o3.f63537e.a(bVar) : com.tencent.mm.sdk.platformtools.x2.s() ? com.tencent.mm.booter.o3.f63538f.a(bVar) : com.tencent.mm.booter.o3.f63539g.a(bVar);
        pu5.g.f358471a = new ou5.d(context, a18);
        int max = java.lang.Math.max(1, a18.f312554a / 2);
        int max2 = java.lang.Math.max(1, max / 3);
        int ordinal = a18.f312558e.ordinal();
        tu5.j.f422176a = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? new tu5.d() : new tu5.a(max2, max2) : new tu5.k(max) : new tu5.c(1000L, max, max2) : new tu5.f(1000L, 500.0f, max, max2) : new tu5.e(max, max2);
        synchronized (ku5.t0.class) {
            ku5.t0 t0Var = new ku5.t0(a18);
            ku5.t0.f312615d = t0Var;
            ku5.t0.f312616e = t0Var;
        }
        if (a18.f312559f) {
            try {
                zu5.a aVar = new zu5.a(android.os.AsyncTask.class, "THREAD_POOL_EXECUTOR");
                synchronized (aVar) {
                    a17 = aVar.a(false);
                }
                f312620a = (java.util.concurrent.Executor) a17;
                ku5.r rVar = new ku5.r();
                zu5.a aVar2 = new zu5.a(android.os.AsyncTask.class, "THREAD_POOL_EXECUTOR");
                synchronized (aVar2) {
                    aVar2.c(null, rVar, false);
                }
            } catch (java.lang.Exception e17) {
                ku5.o.f312599c.e("ThreadModuleBoot", e17.toString(), new java.lang.Object[0]);
            }
        }
        if (a18.f312560g) {
            try {
                com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer coroutineDispatchersHookInitializer = com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer.INSTANCE;
                com.tencent.threadpool.coroutines.hook.CoroutineDispatchersHookInitializer.class.getDeclaredMethod("setup", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            } catch (java.lang.ClassNotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Cannot enable hook coroutines dispatchers without depending threadpool-coroutines.");
            } catch (java.lang.NoSuchMethodException unused2) {
                throw new java.lang.IllegalStateException("ThreadPool internal error. Cannot find method setup in coroutines dispatchers hook initializer.");
            } catch (java.lang.Exception unused3) {
                throw new java.lang.IllegalStateException("ThreadPool internal error. Cannot call method setup in coroutines dispatchers hook initializer.");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadBootDelegate", "onBootDone: setup stub");
        yu5.g gVar = yu5.g.INSTANCE;
        yu5.a aVar3 = yu5.b.f465914a;
        yu5.b.f465914a = gVar;
    }
}
