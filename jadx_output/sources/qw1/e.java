package qw1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final qw1.d f367083a;

    /* renamed from: b, reason: collision with root package name */
    public final qw1.d f367084b;

    /* renamed from: c, reason: collision with root package name */
    public final qw1.d f367085c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f367086d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f367087e;

    /* renamed from: f, reason: collision with root package name */
    public pw1.g f367088f;

    public e(qw1.j jVar, java.lang.String username, qw1.d yGLTextureObject, qw1.d uGLTextureObject, qw1.d vGLTextureObject) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(yGLTextureObject, "yGLTextureObject");
        kotlin.jvm.internal.o.g(uGLTextureObject, "uGLTextureObject");
        kotlin.jvm.internal.o.g(vGLTextureObject, "vGLTextureObject");
        this.f367083a = yGLTextureObject;
        this.f367084b = uGLTextureObject;
        this.f367085c = vGLTextureObject;
        this.f367086d = true;
        this.f367087e = new java.util.concurrent.locks.ReentrantLock();
    }
}
