package wh1;

/* loaded from: classes7.dex */
public class a extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wh1.e f445917e;

    public a(wh1.e eVar) {
        this.f445917e = eVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "AppBrandNetworkUploadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        wh1.e eVar = this.f445917e;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", eVar.f445941w, java.lang.Integer.valueOf(eVar.f445937s), this.f445917e.f445931m);
        if (this.f445917e.f445929h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkUploadWorker", "call cronet time out already callback");
        } else {
            this.f445917e.f445929h = true;
            wh1.e eVar2 = this.f445917e;
            ((uh1.b0) eVar2.f445927f).a(eVar2.f445933o, eVar2.f445931m, "fail:time out", 5);
        }
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(1791L, 6L, 1L, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f445917e.f445943y)) {
            return;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f445917e.f445943y);
    }
}
