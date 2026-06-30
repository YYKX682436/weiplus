package cp0;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final cp0.h f220755b = new cp0.h(null);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f220756c = jz5.h.b(cp0.g.f220746d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f220757d = "MicroMsg.Loader.TargetCenter";

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f220758a = new java.util.concurrent.ConcurrentHashMap();

    public l(kotlin.jvm.internal.i iVar) {
    }

    public final void a(ip0.a data, hp0.e result, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(result, "result");
        final cp0.j jVar = new cp0.j(this, data, result, w1Var);
        if (w1Var == null) {
            pm0.v.X(jVar);
        } else {
            ((com.tencent.mm.sdk.platformtools.c4) w1Var).a(new java.lang.Runnable(jVar) { // from class: cp0.k

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f220754d;

                {
                    kotlin.jvm.internal.o.g(jVar, "function");
                    this.f220754d = jVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f220754d.invoke();
                }
            });
        }
    }

    public final void b(cp0.f target, ip0.a data, java.lang.String reason) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(reason, "reason");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f220758a;
        jz5.l lVar = (jz5.l) concurrentHashMap.get(java.lang.Integer.valueOf(target.c()));
        if (lVar == null || !kotlin.jvm.internal.o.b(lVar.f302833d, data)) {
            return;
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(target.c()));
    }
}
