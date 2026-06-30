package mf3;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f326113a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f326114b;

    public p(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f326113a = context;
        this.f326114b = new java.util.concurrent.ConcurrentHashMap();
    }

    public final mf3.j a(java.lang.Class apiClass) {
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        java.lang.Object obj = this.f326114b.get(apiClass.getName());
        if (obj == null) {
            com.tencent.mars.xlog.Log.w("LayerApiCenter", "layerApi not found: ".concat(apiClass.getSimpleName()));
        }
        if (obj instanceof mf3.j) {
            return (mf3.j) obj;
        }
        return null;
    }

    public final pf5.c b(f06.d apiKClass) {
        kotlin.jvm.internal.o.g(apiKClass, "apiKClass");
        com.tencent.mars.xlog.Log.w("LayerApiCenter", "pageApi not found: " + apiKClass.g());
        return c(xz5.a.b(apiKClass));
    }

    public final pf5.c c(java.lang.Class apiClass) {
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        android.content.Context context = this.f326113a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pf5.c d17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).d(apiClass);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("LayerApiCenter", "pageApi not found: ".concat(apiClass.getSimpleName()));
        }
        if (d17 == null) {
            return null;
        }
        return d17;
    }

    public final void d(java.lang.Class api, java.lang.Object impl) {
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(impl, "impl");
        this.f326114b.put(api.getName(), impl);
    }
}
