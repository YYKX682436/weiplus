package d11;

/* loaded from: classes4.dex */
public abstract class b {
    public static boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        try {
            int b17 = b();
            for (java.lang.String str2 : str.split(";")) {
                java.lang.String[] split = str2.split("-");
                java.lang.String[] split2 = split[0].split(":");
                int D1 = (com.tencent.mm.sdk.platformtools.t8.D1(split2[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split2[1], 0);
                java.lang.String[] split3 = split[1].split(":");
                int D12 = (com.tencent.mm.sdk.platformtools.t8.D1(split3[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split3[1], 0);
                if (D1 >= D12 ? !((b17 > 1440 || b17 < D1) && (b17 >= D12 || b17 < 0)) : !(b17 >= D12 || b17 < D1)) {
                    return true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusyTimeControlLogic", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.BusyTimeControlLogic", "checkNeedToControl error : " + e17.toString());
        }
        return false;
    }

    public static int b() {
        java.lang.String[] split = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()).split(":");
        int D1 = ((com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0)) - ((((int) (((int) (java.util.TimeZone.getDefault().getRawOffset() / 60000)) / 60)) - 8) * 60);
        return D1 < 0 ? D1 + 1440 : D1 >= 1440 ? D1 - 1440 : D1;
    }

    public static boolean c() {
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("C2CImgNotAutoDownloadTimeRange");
        com.tencent.mars.xlog.Log.i("MicroMsg.BusyTimeControlLogic", "C2CImgNotAutoDownloadTimeRange value: " + d17);
        return a(d17);
    }
}
