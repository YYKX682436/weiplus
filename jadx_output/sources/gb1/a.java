package gb1;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f269975a = new java.util.concurrent.ConcurrentHashMap(5);

    public com.tencent.mm.plugin.appbrand.jsruntime.c0 a(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.jsruntime.c0) this.f269975a.get(str);
    }

    public void b(java.lang.String str) {
        this.f269975a.remove(str);
    }
}
