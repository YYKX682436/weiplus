package si1;

/* loaded from: classes7.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f408237a = java.util.Arrays.asList("scope.userLocation", "scope.camera");

    public static java.lang.String a(java.lang.String str, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        str.getClass();
        if (str.equals("scope.camera")) {
            return appBrandRuntime.f74795d.getString(com.tencent.mm.R.string.a0_);
        }
        k91.g gVar = (k91.g) ((java.util.HashMap) appBrandRuntime.m0().f305744n).get(str);
        if (gVar == null) {
            return null;
        }
        return gVar.f305584b;
    }

    public static boolean b(java.lang.String str, k91.z0 z0Var) {
        java.lang.String[] strArr;
        boolean z17;
        if (!f408237a.contains(str)) {
            if (!(z0Var instanceof com.tencent.luggage.sdk.config.AppBrandSysConfigLU) || (strArr = ((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) z0Var).Y.U) == null) {
                return false;
            }
            int length = strArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    z17 = false;
                    break;
                }
                if (java.util.Objects.equals(strArr[i17], str)) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                return false;
            }
        }
        str.getClass();
        if (str.equals("scope.userLocation")) {
            return z0Var.f305848n;
        }
        return true;
    }
}
