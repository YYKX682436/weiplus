package th5;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final th5.a1 f419340a = new th5.a1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f419341b = kz5.z.D0(new java.lang.String[]{"dis_k", "dis_t", "auth_key", "auth_info"});

    public final java.lang.String a(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String obj = r26.n0.u0(url).toString();
        boolean z17 = true;
        java.lang.String str = "";
        if (obj.length() == 0) {
            return "";
        }
        try {
            java.net.URL url2 = new java.net.URL(obj);
            java.lang.String host = url2.getHost();
            kotlin.jvm.internal.o.f(host, "getHost(...)");
            java.lang.String lowerCase = host.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            java.lang.String path = url2.getPath();
            if (path == null) {
                path = "";
            }
            if (!(lowerCase.length() == 0)) {
                if (!(path.length() == 0)) {
                    java.lang.String query = url2.getQuery();
                    if (query != null) {
                        str = query;
                    }
                    java.lang.String b17 = b(str);
                    if (b17.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        obj = lowerCase.concat(path);
                    } else {
                        obj = lowerCase + path + '?' + b17;
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return obj;
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2;
        if (str.length() == 0) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str3 : r26.n0.e0(str, new char[]{'&'}, false, 0, 6, null)) {
            if (!(str3.length() == 0)) {
                int K = r26.n0.K(str3, '=', 0, false, 6, null);
                if (K >= 0) {
                    str2 = str3.substring(0, K);
                    kotlin.jvm.internal.o.f(str2, "substring(...)");
                } else {
                    str2 = str3;
                }
                java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                if (!f419341b.contains(lowerCase)) {
                    arrayList.add(str3);
                }
            }
        }
        return kz5.n0.g0(arrayList, "&", null, null, 0, null, null, 62, null);
    }
}
