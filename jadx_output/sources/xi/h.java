package xi;

/* loaded from: classes12.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xi.h f454655d = new xi.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ih.d d17 = ih.d.d();
        kotlin.jvm.internal.o.f(d17, "Matrix.with()");
        android.app.Application application = d17.f291471b;
        kotlin.jvm.internal.o.f(application, "Matrix.with().application");
        java.io.File cacheDir = application.getCacheDir();
        kotlin.jvm.internal.o.f(cacheDir, "Matrix.with().application.cacheDir");
        sb6.append(cacheDir.getAbsolutePath());
        sb6.append("/hprofs");
        return new java.io.File(sb6.toString());
    }
}
