package z5;

/* loaded from: classes12.dex */
public final class d implements z5.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f470161a;

    public d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f470161a = context;
    }

    @Override // z5.b
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        if (!kotlin.jvm.internal.o.b(data.getScheme(), "android.resource")) {
            return false;
        }
        java.lang.String authority = data.getAuthority();
        if (authority == null || r26.n0.N(authority)) {
            return false;
        }
        java.util.List<java.lang.String> pathSegments = data.getPathSegments();
        kotlin.jvm.internal.o.f(pathSegments, "data.pathSegments");
        return pathSegments.size() == 2;
    }

    @Override // z5.b
    public java.lang.Object d(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        android.content.res.Resources resourcesForApplication = this.f470161a.getPackageManager().getResourcesForApplication(authority);
        kotlin.jvm.internal.o.f(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        java.util.List<java.lang.String> pathSegments = data.getPathSegments();
        kotlin.jvm.internal.o.f(pathSegments, "pathSegments");
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.o.m("Invalid android.resource URI: ", data).toString());
        }
        android.net.Uri parse = android.net.Uri.parse("android.resource://" + authority + '/' + identifier);
        kotlin.jvm.internal.o.f(parse, "parse(this)");
        return parse;
    }
}
