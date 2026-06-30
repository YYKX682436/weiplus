package z5;

/* loaded from: classes13.dex */
public final class a implements z5.b {
    @Override // z5.b
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        if (!kotlin.jvm.internal.o.b(data.getScheme(), "file")) {
            return false;
        }
        l36.i0 i0Var = h6.d.f279116a;
        java.util.List<java.lang.String> pathSegments = data.getPathSegments();
        kotlin.jvm.internal.o.f(pathSegments, "pathSegments");
        java.lang.String str = (java.lang.String) kz5.n0.Z(pathSegments);
        return str != null && !kotlin.jvm.internal.o.b(str, "android_asset");
    }

    @Override // z5.b
    public java.lang.Object d(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return i3.b.a(data);
    }
}
