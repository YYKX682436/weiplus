package up3;

/* loaded from: classes12.dex */
public class u extends up3.f0 {
    @Override // up3.f0
    public boolean a(java.lang.Object obj) {
        java.lang.String str = ((up3.c0) obj).f429822b;
        return str.startsWith(tp3.b.a("áµª¡±±\u0083")) && str.endsWith("$");
    }

    @Override // up3.f0
    public void b(java.lang.Object obj) {
        up3.c0 c0Var = (up3.c0) obj;
        try {
            java.lang.String[] f17 = up3.d0.f(c0Var.f429822b);
            if (f17 != null) {
                up3.b0.b(com.tencent.mm.sdk.platformtools.x2.f193071a, c0Var.f429821a, f17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(up3.d0.f429823d, th6, "explained by code.", new java.lang.Object[0]);
        }
    }
}
