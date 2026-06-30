package id3;

@fd3.a(name = com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.NAME)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid3/c;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends com.tencent.mm.plugin.magicbrush.jsapi.base.d {
    @Override // com.tencent.mm.plugin.magicbrush.jsapi.base.d
    public void c(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.HashMap hashMap = new java.util.HashMap();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        vz.p1 p1Var = (vz.p1) i95.n0.c(vz.p1.class);
        id3.b bVar = new id3.b(hashMap, this, f0Var, h0Var);
        ((uz.e2) p1Var).getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, false)))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiGameDownloadManager", "addDownloadTaskStraight isTeenMode and ignore");
            bVar.d(810, "fail:This content is not accessible in Teen Mode");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(data.optString("taskUrl"))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGameDownloadManager", "url is null");
            bVar.d(700, "url is null");
            return;
        }
        java.lang.String optString = data.optString("appId");
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        int optInt2 = data.optInt("downloadType", 1);
        int optInt3 = data.optInt(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        g02.c cVar = new g02.c(optString, optInt, data.optString("extInfo"), data.optInt("uiarea"), optInt3, data.optInt("noticeId"), optInt2);
        ((uz.r1) ((vz.t1) i95.n0.c(vz.t1.class))).getClass();
        g02.b.c(9, cVar);
        ik1.h0.b(new com.tencent.mm.plugin.downloader.model.m2(context, com.tencent.mm.plugin.downloader_app.model.a.a(data), bVar));
    }
}
