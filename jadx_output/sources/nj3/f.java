package nj3;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f337903a;

    /* renamed from: b, reason: collision with root package name */
    public final nj3.d f337904b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f337905c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f337906d;

    /* renamed from: e, reason: collision with root package name */
    public mj3.g f337907e;

    public f(nj3.j jVar, java.lang.String username, nj3.d textureWrapper) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(textureWrapper, "textureWrapper");
        this.f337903a = username;
        this.f337904b = textureWrapper;
        this.f337905c = textureWrapper.f337895b;
        this.f337906d = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }
}
