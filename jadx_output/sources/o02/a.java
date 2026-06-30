package o02;

/* loaded from: classes8.dex */
public abstract class a {
    public static int a(int i17) {
        if (i17 == 2) {
            return 1002;
        }
        if (i17 != 4) {
            return i17 != 6 ? 0 : 1004;
        }
        return 1003;
    }

    public static void b(int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 0 : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 4 : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 3 : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 2 : 1);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i19);
        objArr[4] = java.lang.Integer.valueOf(i27);
        objArr[5] = str;
        objArr[6] = str2;
        objArr[7] = str3;
        g0Var.d(16099, objArr);
    }
}
