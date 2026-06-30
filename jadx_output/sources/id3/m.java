package id3;

@fd3.a(name = com.tencent.mm.plugin.appbrand.jsapi.pc.NAME)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid3/m;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m extends com.tencent.mm.plugin.magicbrush.jsapi.base.d {
    @Override // com.tencent.mm.plugin.magicbrush.jsapi.base.d
    public void c(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        long optLong = data.optLong("downloadId");
        vz.p1 p1Var = (vz.p1) i95.n0.c(vz.p1.class);
        id3.l lVar = new id3.l(this, f0Var, h0Var);
        ((uz.e2) p1Var).getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGameDownloadManager", "fail, invalid downloadId = " + optLong);
            lVar.d(808, "invalid_downloadid");
            return;
        }
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = data.optInt("uiarea");
        int optInt3 = data.optInt("noticeId");
        int optInt4 = data.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        int optInt5 = data.optInt("downloadType", 1);
        boolean z17 = data.optInt("ignoreNetwork", 0) == 1;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
        if (c17 == null) {
            lVar.d(805, "get DownloadInfo fail");
            return;
        }
        c17.field_scene = optInt;
        c17.field_uiarea = optInt2;
        c17.field_noticeId = optInt3;
        c17.field_ssid = optInt4;
        c17.field_downloadType = optInt5;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        g02.c cVar = new g02.c();
        cVar.a(c17);
        cVar.f267429j = 0L;
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(10, cVar);
        ik1.h0.b(new com.tencent.mm.plugin.downloader.model.o2(context, optLong, data.optBoolean("downloadInWifi", false), z17, lVar));
    }
}
