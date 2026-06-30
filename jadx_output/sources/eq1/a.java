package eq1;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final eq1.a f255785a = new eq1.a();

    public final eq1.o0 a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            long V = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
            long V2 = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("idx"), 0L);
            byte[] decode = android.util.Base64.decode(parse.getQueryParameter("__biz"), 2);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            return new eq1.o0(V, V2, com.tencent.mm.sdk.platformtools.t8.V(new java.lang.String(decode, r26.c.f368865a), 0L));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizArticleHelper", e17, "getTripletInfo", new java.lang.Object[0]);
            return null;
        }
    }
}
