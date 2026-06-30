package cp5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final cp5.f f221134a;

    /* renamed from: b, reason: collision with root package name */
    public final cp5.f f221135b;

    /* renamed from: c, reason: collision with root package name */
    public final cp5.f f221136c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f221137d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f221138e;

    public e(cp5.j jVar, int i17, cp5.f yIGLTextureObject, cp5.f uIGLTextureObject, cp5.f vIGLTextureObject) {
        kotlin.jvm.internal.o.g(yIGLTextureObject, "yIGLTextureObject");
        kotlin.jvm.internal.o.g(uIGLTextureObject, "uIGLTextureObject");
        kotlin.jvm.internal.o.g(vIGLTextureObject, "vIGLTextureObject");
        this.f221134a = yIGLTextureObject;
        this.f221135b = uIGLTextureObject;
        this.f221136c = vIGLTextureObject;
        this.f221137d = true;
        this.f221138e = new java.util.concurrent.locks.ReentrantLock();
    }
}
