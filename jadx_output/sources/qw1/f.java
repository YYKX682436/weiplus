package qw1;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f367089a;

    /* renamed from: b, reason: collision with root package name */
    public final qw1.d f367090b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f367091c;

    public f(qw1.j jVar, java.lang.String username, qw1.d textureWrapper) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(textureWrapper, "textureWrapper");
        this.f367089a = username;
        this.f367090b = textureWrapper;
        this.f367091c = textureWrapper.f367081b;
        new java.util.concurrent.locks.ReentrantReadWriteLock();
    }
}
