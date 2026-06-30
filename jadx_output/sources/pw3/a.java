package pw3;

/* loaded from: classes9.dex */
public abstract class a {
    public static double a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        try {
            return new java.math.BigDecimal(com.tencent.mm.sdk.platformtools.t8.F(str.trim(), 0.0d) == 0.0d ? "0" : str.trim()).divide(new java.math.BigDecimal(str2.trim()), i17, i18).doubleValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankRemitUtil", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }

    public static char b(java.lang.String str, char c17, boolean z17) {
        java.lang.String a17 = com.tencent.mm.platformtools.SpellMap.a(str.charAt(0));
        return !com.tencent.mm.sdk.platformtools.t8.K0(a17) ? z17 ? a17.toUpperCase().charAt(0) : a17.charAt(0) : c17;
    }

    public static double c(java.lang.String str, java.lang.String str2) {
        try {
            double F = com.tencent.mm.sdk.platformtools.t8.F(str, 0.0d);
            double F2 = com.tencent.mm.sdk.platformtools.t8.F(str2, 0.0d);
            if (F == 0.0d) {
                str = "0";
            }
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(str);
            if (F2 == 0.0d) {
                str2 = "0";
            }
            return bigDecimal.multiply(new java.math.BigDecimal(str2)).doubleValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankRemitUtil", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }
}
