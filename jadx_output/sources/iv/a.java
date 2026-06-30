package iv;

@j95.b
/* loaded from: classes4.dex */
public class a extends i95.w implements jv.e {
    public boolean Ai() {
        d11.p.Ai().getClass();
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgPreLoadingAroundTimeLimit");
        com.tencent.mars.xlog.Log.i("MicroMsg.BusyTimeControlLogic", "SnsImgPreLoadingAroundTimeLimit value: " + d17);
        if (d11.b.a(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download SNS image.");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "it is not busy time, can auto download SNS image.");
        return true;
    }

    public boolean wi(com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        d11.p.Ai().getClass();
        pInt.value = 0;
        int P = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTAutoLoadNetwork"), 1);
        pInt2.value = P;
        if (P == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video[AD]");
            return false;
        }
        boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (P == 2 && !isWifi) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video[AD].");
            return false;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video[AD].");
            return false;
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdSightNotAutoDownloadTimeRange");
        com.tencent.mars.xlog.Log.i("MicroMsg.BusyTimeControlLogic", "isSnsAdSightNotAutoDownload value: " + d17);
        if (!d11.b.a(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download[AD].");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto(but need check again) download SNS short video[AD]");
        pInt.value = P == 2 ? 2 : 1;
        return false;
    }
}
