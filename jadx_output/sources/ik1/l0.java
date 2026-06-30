package ik1;

/* loaded from: classes7.dex */
public abstract class l0 {
    public static java.lang.String a(android.content.Context context, java.lang.String str, ik1.k0 k0Var) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Luggage.UserAgentUtil, appendUserAgent fail, context is null, stack = ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        boolean z18 = false;
        iz5.a.g(sb6.toString(), context != null);
        if (k0Var != null) {
            if (str == null) {
                str2 = k0Var.identity();
            } else {
                str2 = str + k0Var.identity();
            }
            str = str2 + k0Var.version();
        }
        java.lang.String str3 = (str + " NetType/" + com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a)) + " Language/" + com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str3);
        sb7.append(" ABI/");
        java.lang.String[] strArr = android.os.Build.SUPPORTED_64_BIT_ABIS;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if ("arm64-v8a".equalsIgnoreCase(strArr[i17])) {
                z18 = true;
                break;
            }
            i17++;
        }
        sb7.append(z18 ? "arm64" : "arm32");
        java.lang.String sb8 = sb7.toString();
        com.tencent.mars.xlog.Log.i("Luggage.UserAgentUtil", "appendUserAgent, uaStr = " + sb8);
        return sb8.replace('\n', ' ');
    }
}
