package j02;

/* loaded from: classes8.dex */
public final class e implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI f296985a;

    public e(com.tencent.mm.plugin.downloader.ui.GameCloudAppDownloadUI gameCloudAppDownloadUI) {
        this.f296985a = gameCloudAppDownloadUI;
    }

    @Override // vz.z1
    public final void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f296985a.f97223f = jSONObject.optLong("download_id");
        }
        com.tencent.mars.xlog.Log.e("GameDetainManager.GameCloudAppDownloadUI", "gamelog.addDownloadTaskInWidget errMsg=" + str + "  value=" + jSONObject);
    }
}
