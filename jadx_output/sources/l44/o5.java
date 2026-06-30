package l44;

/* loaded from: classes.dex */
public abstract class o5 {
    public static void a(android.content.Context context, com.tencent.mm.plugin.sns.storage.h hVar, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("ScanJumpHelper", "jumpScanUI, jumpInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("ScanJumpHelper", "jumpScanUI, desc=" + hVar.f166007a + ", gestureId=" + hVar.f166008b + ", uxinfo=" + str);
        b(hVar, "");
        com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest = new com.tencent.mm.plugin.scanner.api.ScanGoodsRequest();
        scanGoodsRequest.f158668m = 5;
        scanGoodsRequest.f158669n = 1;
        scanGoodsRequest.f158662d = true;
        scanGoodsRequest.f158663e = true;
        scanGoodsRequest.f158664f = true;
        scanGoodsRequest.f158665g = true;
        scanGoodsRequest.f158666h = true;
        scanGoodsRequest.f158676u = false;
        scanGoodsRequest.f158677v = true;
        scanGoodsRequest.f158675t = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 514);
        scanGoodsRequest.f158674s = hVar.f166007a;
        scanGoodsRequest.f158671p = za4.t0.k(hVar.bgImageUrl);
        scanGoodsRequest.f158673r = za4.t0.k(hVar.descIconUrl);
        scanGoodsRequest.f158672q = za4.t0.k(hVar.detectSucIconUrl);
        if (scanGoodsRequest.f158667i == null) {
            scanGoodsRequest.f158667i = new android.os.Bundle();
        }
        scanGoodsRequest.f158667i.putString("key_sns_ad_ux_info", str);
        java.lang.String valueOf = java.lang.String.valueOf(hVar.f166008b);
        if (scanGoodsRequest.f158667i == null) {
            scanGoodsRequest.f158667i = new android.os.Bundle();
        }
        scanGoodsRequest.f158667i.putString("key_gesture_id", valueOf);
        ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (i17 == 7) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 8);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1898, 9);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
    }

    public static void b(com.tencent.mm.plugin.sns.storage.h hVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadScanRes", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
        if (hVar != null) {
            n74.v1.i(hVar.bgImageUrl, str, "preloadScanRes bgImage");
            n74.v1.i(hVar.descIconUrl, str, "preloadScanRes descIcon");
            n74.v1.i(hVar.detectSucIconUrl, str, "preloadScanRes succIcon");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadScanRes", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
    }
}
