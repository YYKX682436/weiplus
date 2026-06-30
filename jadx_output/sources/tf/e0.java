package tf;

/* loaded from: classes7.dex */
public final class e0 implements tf.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418800a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.HandlerThread f418801b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f418802c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f418803d;

    public e0(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f418800a = name;
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(name, 5);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + name + " created");
        this.f418801b = a17;
        this.f418802c = jz5.h.b(new tf.d0(this));
        this.f418803d = jz5.h.b(new tf.c0(this));
    }

    @Override // tf.o
    public boolean a() {
        boolean quitSafely = this.f418801b.quitSafely();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f418800a + " quited");
        return quitSafely;
    }

    @Override // tf.o
    public android.os.Handler b() {
        return (android.os.Handler) ((jz5.n) this.f418803d).getValue();
    }

    @Override // tf.o
    public qu5.a getHandler() {
        return (qu5.a) ((jz5.n) this.f418802c).getValue();
    }

    @Override // tf.o
    public void start() {
        this.f418801b.start();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f418800a + " started");
    }
}
