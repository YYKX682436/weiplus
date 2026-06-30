package id3;

@fd3.a(name = com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid3/i;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends com.tencent.mm.plugin.magicbrush.jsapi.base.d {
    @Override // com.tencent.mm.plugin.magicbrush.jsapi.base.d
    public void c(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        long optLong = data.optLong("downloadId");
        java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
        vz.p1 p1Var = (vz.p1) i95.n0.c(vz.p1.class);
        android.app.Activity activity = j17 != null ? (android.app.Activity) j17.get() : null;
        id3.h hVar = new id3.h(this, f0Var, h0Var);
        ((uz.e2) p1Var).getClass();
        android.content.Context context = activity == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : activity;
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGameDownloadManager", "fail, invalid downloadId = " + optLong);
            hVar.d(808, "invalid_downloadid");
            return;
        }
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
        if (c17 == null) {
            hVar.d(805, "get DownloadInfo fail");
            return;
        }
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = data.optInt("uiarea");
        int optInt3 = data.optInt("noticeId");
        int optInt4 = data.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        boolean z17 = data.optInt("ignoreNetwork", 0) == 1;
        boolean z18 = data.optInt("showDialog", 0) == 1;
        c17.field_scene = optInt;
        c17.field_uiarea = optInt2;
        c17.field_noticeId = optInt3;
        c17.field_ssid = optInt4;
        c17.field_downloadInWifi = false;
        ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.m0.l(c17);
        ((uz.c2) ((vz.a2) i95.n0.c(vz.a2.class))).wi(context, optLong, z17, z18, new com.tencent.mm.plugin.downloader.model.p2(hVar));
    }
}
