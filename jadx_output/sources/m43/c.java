package m43;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static m43.c f323455b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f323456a = new java.util.concurrent.ConcurrentHashMap();

    public static m43.c b() {
        if (f323455b == null) {
            f323455b = new m43.c();
        }
        return f323455b;
    }

    public void a(java.lang.String str, m43.b bVar) {
        synchronized (this) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            if (((java.util.concurrent.ConcurrentHashMap) this.f323456a).containsKey(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameAutoRunController", "taskId:%s exists in the queue", str);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameAutoRunController", "add taskId:%s to the queue", str);
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(str, (com.tencent.mm.sdk.platformtools.a4) new m43.a(this, str, bVar), false);
            b4Var.c(60000L, 60000L);
            ((java.util.concurrent.ConcurrentHashMap) this.f323456a).put(str, b4Var);
        }
    }
}
