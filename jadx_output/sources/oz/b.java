package oz;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350142a;

    /* renamed from: b, reason: collision with root package name */
    public final oz.a f350143b;

    /* renamed from: c, reason: collision with root package name */
    public final oz.v f350144c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f350145d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f350146e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f350147f;

    public b(java.lang.String name, oz.a config) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(config, "config");
        this.f350142a = name;
        this.f350143b = config;
        this.f350144c = new oz.v();
        this.f350145d = new java.util.LinkedHashSet();
        this.f350146e = new java.util.LinkedHashSet();
        this.f350147f = new java.util.LinkedHashSet();
    }

    public final void a() {
        java.lang.String sceneName = this.f350143b.f350141d;
        oz.v vVar = this.f350144c;
        vVar.getClass();
        kotlin.jvm.internal.o.g(sceneName, "sceneName");
        vVar.f350196c = com.tencent.mm.sdk.platformtools.o4.J("auto_download_task_queue", gm0.j1.b().h(), 2);
        vVar.f350197d = sceneName.length() == 0 ? "tasks" : "tasks_".concat(sceneName);
        vVar.f350194a = new com.tencent.mm.storage.x9();
        com.tencent.mm.sdk.platformtools.o4 o4Var = vVar.f350196c;
        byte[] j17 = o4Var != null ? o4Var.j(vVar.f350197d) : null;
        if (com.tencent.mm.sdk.platformtools.t8.M0(j17)) {
            return;
        }
        try {
            vVar.f350194a.parseFrom(j17);
            vVar.f350194a.f196336d.size();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AutoDownloadTaskQueue", "load: parseFailed, key=" + vVar.f350197d + ", error=" + e17);
        }
    }

    public final void b() {
        this.f350145d.clear();
        this.f350146e.clear();
        this.f350147f.clear();
        java.util.LinkedHashMap linkedHashMap = this.f350144c.f350195b;
        int size = linkedHashMap.size();
        linkedHashMap.clear();
        if (size > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoDownloadTaskQueue", "clearNonPersistent: cleared " + size + " tasks");
        }
    }
}
