package x5;

/* loaded from: classes14.dex */
public final class a implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f451941a;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f451941a = context;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        if (kotlin.jvm.internal.o.b(data.getScheme(), "file")) {
            l36.i0 i0Var = h6.d.f279116a;
            java.util.List<java.lang.String> pathSegments = data.getPathSegments();
            kotlin.jvm.internal.o.f(pathSegments, "pathSegments");
            if (kotlin.jvm.internal.o.b((java.lang.String) kz5.n0.Z(pathSegments), "android_asset")) {
                return true;
            }
        }
        return false;
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        java.util.List<java.lang.String> pathSegments = ((android.net.Uri) obj).getPathSegments();
        kotlin.jvm.internal.o.f(pathSegments, "data.pathSegments");
        java.lang.String g07 = kz5.n0.g0(kz5.n0.R(pathSegments, 1), "/", null, null, 0, null, null, 62, null);
        java.io.InputStream open = this.f451941a.getAssets().open(g07);
        kotlin.jvm.internal.o.f(open, "context.assets.open(path)");
        x36.m b17 = x36.v.b(x36.v.f(open));
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        kotlin.jvm.internal.o.f(singleton, "getSingleton()");
        return new x5.n(b17, h6.d.a(singleton, g07), v5.d.DISK);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String uri = data.toString();
        kotlin.jvm.internal.o.f(uri, "data.toString()");
        return uri;
    }
}
