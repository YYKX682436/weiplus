package r10;

/* loaded from: classes7.dex */
public abstract class a {
    public static final bw5.x7 a(bw5.x7 x7Var, java.lang.String base64Str) {
        kotlin.jvm.internal.o.g(x7Var, "<this>");
        kotlin.jvm.internal.o.g(base64Str, "base64Str");
        try {
            x7Var.parseFrom(android.util.Base64.decode(base64Str, 0));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsJumpInfo", e17, "parse bytes failed", new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsJumpInfo", e18, "invalid base64", new java.lang.Object[0]);
        }
        return x7Var;
    }
}
