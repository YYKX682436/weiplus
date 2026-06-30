package o45;

/* loaded from: classes12.dex */
public abstract class a {
    public static int a(android.content.Context context) {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (subtype == 13 || subtype == 15 || subtype == 14) {
                return 4;
            }
            int i17 = 3;
            if (subtype != 3 && subtype != 4 && subtype != 5 && subtype != 6 && subtype != 12) {
                i17 = 2;
                if (subtype != 1 && subtype != 2) {
                    return 0;
                }
            }
            return i17;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.BgFgBase", "getNetType: %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return 1;
        }
    }

    public static int b() {
        return z65.c.f470455a ? 1 : 2;
    }
}
