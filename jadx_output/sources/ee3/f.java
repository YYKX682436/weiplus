package ee3;

/* loaded from: classes7.dex */
public class f extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.j f251603e;

    public f(ee3.j jVar) {
        this.f251603e = jVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MagicBrushDownloadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        ee3.j jVar = this.f251603e;
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "call cronet time out taskid:%s,timeout:%d,url:%s", jVar.f251624t, java.lang.Integer.valueOf(jVar.f251621q), this.f251603e.f251617m);
        if (this.f251603e.f251615h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushDownloadWorker", "call cronet time out already callback");
        } else {
            this.f251603e.f251615h = true;
            ee3.j jVar2 = this.f251603e;
            jVar2.f251613f.d(jVar2.f251618n, jVar2.f251617m, "fail:time out", 5);
        }
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkDownloadTaskTimeout.name(), 1, null, 0.01f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f251603e.f251625u)) {
            return;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f251603e.f251625u);
    }
}
