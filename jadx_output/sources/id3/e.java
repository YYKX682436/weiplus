package id3;

@fd3.a(name = com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.NAME)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid3/e;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends com.tencent.mm.plugin.magicbrush.jsapi.base.d {
    @Override // com.tencent.mm.plugin.magicbrush.jsapi.base.d
    public void c(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        long optLong = data.optLong("downloadId");
        vz.p1 p1Var = (vz.p1) i95.n0.c(vz.p1.class);
        id3.d dVar = new id3.d(this, f0Var, h0Var);
        ((uz.e2) p1Var).getClass();
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiGameDownloadManager", "fail, invalid downloadId = " + optLong);
            dVar.d(808, "invalid_downloadid");
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (com.tencent.mm.plugin.downloader.model.r0.i().t(optLong) > 0) {
            dVar.d(0, "cancel DownloadTask success");
        } else {
            dVar.d(809, "cancel DownloadTask fail");
        }
    }
}
