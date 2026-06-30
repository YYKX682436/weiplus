package s10;

/* loaded from: classes7.dex */
public abstract class b {
    public static final java.lang.String a(bw5.z5 z5Var) {
        kotlin.jvm.internal.o.g(z5Var, "<this>");
        java.lang.String str = "brs_article_" + z5Var.getUrl();
        kotlin.jvm.internal.o.g(str, "<this>");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        kotlin.jvm.internal.o.d(digest);
        return kz5.z.a0(digest, "", null, null, 0, null, s10.a.f402099d, 30, null);
    }
}
