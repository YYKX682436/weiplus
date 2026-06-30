package x5;

/* loaded from: classes14.dex */
public final class m implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f451957a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.h f451958b;

    public m(android.content.Context context, v5.h drawableDecoder) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(drawableDecoder, "drawableDecoder");
        this.f451957a = context;
        this.f451958b = drawableDecoder;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        return kotlin.jvm.internal.o.b(data.getScheme(), "android.resource");
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        android.graphics.drawable.Drawable drawable;
        android.net.Uri uri = (android.net.Uri) obj;
        java.lang.String authority = uri.getAuthority();
        boolean z17 = true;
        if (authority == null || !(!r26.n0.N(authority))) {
            authority = null;
        }
        if (authority == null) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.o.m("Invalid android.resource URI: ", uri));
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        kotlin.jvm.internal.o.f(pathSegments, "data.pathSegments");
        java.lang.String str = (java.lang.String) kz5.n0.k0(pathSegments);
        java.lang.Integer h17 = str != null ? r26.h0.h(str) : null;
        if (h17 == null) {
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.o.m("Invalid android.resource URI: ", uri));
        }
        int intValue = h17.intValue();
        android.content.Context context = kVar.f433289a;
        android.content.res.Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
        kotlin.jvm.internal.o.f(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resourcesForApplication.getValue(intValue, typedValue, true);
        java.lang.CharSequence path = typedValue.string;
        kotlin.jvm.internal.o.f(path, "path");
        java.lang.String obj2 = path.subSequence(r26.n0.O(path, '/', 0, false, 6, null), path.length()).toString();
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        kotlin.jvm.internal.o.f(singleton, "getSingleton()");
        java.lang.String a17 = h6.d.a(singleton, obj2);
        boolean b17 = kotlin.jvm.internal.o.b(a17, "text/xml");
        v5.d dVar = v5.d.DISK;
        if (!b17) {
            java.io.InputStream openRawResource = resourcesForApplication.openRawResource(intValue);
            kotlin.jvm.internal.o.f(openRawResource, "resources.openRawResource(resId)");
            return new x5.n(x36.v.b(x36.v.f(openRawResource)), a17, dVar);
        }
        if (kotlin.jvm.internal.o.b(authority, context.getPackageName())) {
            drawable = h6.c.a(context, intValue);
        } else {
            android.content.res.XmlResourceParser xml = resourcesForApplication.getXml(intValue);
            kotlin.jvm.internal.o.f(xml, "resources.getXml(resId)");
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found.");
            }
            android.content.res.Resources.Theme theme = context.getTheme();
            java.lang.ThreadLocal threadLocal = d3.q.f226108a;
            android.graphics.drawable.Drawable a18 = d3.l.a(resourcesForApplication, intValue, theme);
            if (a18 == null) {
                throw new java.lang.IllegalStateException(kotlin.jvm.internal.o.m("Invalid resource ID: ", java.lang.Integer.valueOf(intValue)).toString());
            }
            drawable = a18;
        }
        if (!(drawable instanceof v4.d) && !(drawable instanceof android.graphics.drawable.VectorDrawable)) {
            z17 = false;
        }
        if (z17) {
            android.graphics.Bitmap a19 = this.f451958b.a(drawable, kVar.f433290b, size, kVar.f433292d, kVar.f433293e);
            android.content.res.Resources resources = context.getResources();
            kotlin.jvm.internal.o.f(resources, "context.resources");
            drawable = new android.graphics.drawable.BitmapDrawable(resources, a19);
        }
        return new x5.e(drawable, z17, dVar);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(data);
        sb6.append('-');
        android.content.res.Configuration configuration = this.f451957a.getResources().getConfiguration();
        kotlin.jvm.internal.o.f(configuration, "context.resources.configuration");
        l36.i0 i0Var = h6.d.f279116a;
        sb6.append(configuration.uiMode & 48);
        return sb6.toString();
    }
}
