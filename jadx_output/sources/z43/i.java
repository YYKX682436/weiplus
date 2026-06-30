package z43;

/* loaded from: classes.dex */
public class i extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        long optLong = jSONObject.optLong("download_id");
        if (optLong <= 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiCancelDownloadTask", "fail, invalid downloadId = " + optLong);
            this.f143443f.a("invalid_downloadid");
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        if (com.tencent.mm.plugin.downloader.model.r0.i().t(optLong) > 0) {
            this.f143443f.d(false);
        } else {
            this.f143443f.a("fail");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
