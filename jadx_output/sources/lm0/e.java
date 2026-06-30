package lm0;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f319335a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public lm0.d f319336b = null;

    static {
        new lm0.e();
    }

    public void a(java.lang.Class cls, lm0.c cVar) {
        this.f319335a.put(cls, cVar);
        if (cVar instanceof lm0.b) {
            ((lm0.b) cVar).c();
        }
        lm0.d dVar = this.f319336b;
        if (dVar != null) {
            ((com.tencent.mm.plugin.appbrand.ga) dVar).f78195a.f78272c.add(cls);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ServiceHub", "register service %s %s", cls, cVar);
    }

    public lm0.a b(java.lang.Class cls) {
        boolean z17;
        lm0.a aVar;
        lm0.c cVar = (lm0.c) this.f319335a.get(cls);
        if (cls.isInterface() || !java.lang.reflect.Modifier.isAbstract(cls.getModifiers())) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ServiceHub", "Did you call service by using the service implementation class ?? Use interface class instead!! Carl is warning u!");
            z17 = true;
        }
        if (cVar != null) {
            aVar = ((lm0.f) cVar).f319337d;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceHub", "Service(%s) not found!!! ", cls);
            if (z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ServiceHub", "This error must cause by using implementation class to call service! Use interface instead! Understand?");
            }
            aVar = null;
        }
        lm0.d dVar = this.f319336b;
        if (dVar != null) {
            ((com.tencent.mm.plugin.appbrand.ga) dVar).f78195a.getClass();
        }
        return aVar;
    }

    public void c(java.lang.Class cls) {
        lm0.c cVar = (lm0.c) this.f319335a.remove(cls);
        if (cVar instanceof lm0.b) {
            ((lm0.b) cVar).b();
        }
        lm0.d dVar = this.f319336b;
        if (dVar != null) {
            ((com.tencent.mm.plugin.appbrand.ga) dVar).f78195a.getClass();
        }
    }
}
