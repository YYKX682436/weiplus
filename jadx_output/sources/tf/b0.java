package tf;

/* loaded from: classes7.dex */
public final class b0 implements tf.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418782a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f418783b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.HandlerThread f418784c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f418785d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f418786e;

    public b0(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f418782a = name;
        this.f418783b = jz5.h.b(new tf.a0(this));
        this.f418785d = jz5.h.b(new tf.z(this));
        this.f418786e = jz5.h.b(new tf.y(this));
    }

    @Override // tf.o
    public boolean a() {
        ((xu5.b) ((jz5.n) this.f418783b).getValue()).f457303b.g();
        android.os.HandlerThread handlerThread = this.f418784c;
        if (handlerThread == null) {
            return true;
        }
        boolean quitSafely = handlerThread.quitSafely();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + this.f418782a + " quited");
        return quitSafely;
    }

    @Override // tf.o
    public android.os.Handler b() {
        return (android.os.Handler) ((jz5.n) this.f418786e).getValue();
    }

    @Override // tf.o
    public qu5.a getHandler() {
        return (qu5.a) ((jz5.n) this.f418785d).getValue();
    }

    @Override // tf.o
    public void start() {
    }
}
