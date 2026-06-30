package nj3;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final nj3.d f337897a;

    /* renamed from: b, reason: collision with root package name */
    public final nj3.d f337898b;

    /* renamed from: c, reason: collision with root package name */
    public final nj3.d f337899c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f337900d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f337901e;

    /* renamed from: f, reason: collision with root package name */
    public mj3.g f337902f;

    public e(nj3.j jVar, java.lang.String username, nj3.d yGLTextureObject, nj3.d uGLTextureObject, nj3.d vGLTextureObject) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(yGLTextureObject, "yGLTextureObject");
        kotlin.jvm.internal.o.g(uGLTextureObject, "uGLTextureObject");
        kotlin.jvm.internal.o.g(vGLTextureObject, "vGLTextureObject");
        this.f337897a = yGLTextureObject;
        this.f337898b = uGLTextureObject;
        this.f337899c = vGLTextureObject;
        this.f337900d = true;
        this.f337901e = new java.util.concurrent.locks.ReentrantLock();
    }
}
