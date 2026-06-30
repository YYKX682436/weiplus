package d85;

/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d85.i1 f227206a = new d85.i1();

    public final java.lang.String a(android.content.Context context, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open(fileName);
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                java.lang.String str = new java.lang.String(bArr, UTF_8);
                try {
                    inputStream.close();
                    return str;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("SensitiveUtils", e17, "close", new java.lang.Object[0]);
                    return str;
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("SensitiveUtils", e18, "getFromAssets", new java.lang.Object[0]);
                j85.g.f298251a.b("SensitiveUtils-getFromAssets", "[getFromAssets] catch: " + e18.getCause());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("SensitiveUtils", e19, "close", new java.lang.Object[0]);
                    }
                }
                return "";
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("SensitiveUtils", e27, "close", new java.lang.Object[0]);
                }
            }
            throw th6;
        }
    }
}
