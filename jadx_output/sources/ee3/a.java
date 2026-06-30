package ee3;

/* loaded from: classes7.dex */
public class a extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.d f251584e;

    public a(ee3.d dVar) {
        this.f251584e = dVar;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "MagicBrushDownloadWorker#TimerTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        ee3.d dVar = this.f251584e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "call cdndownload time out taskid:%s,timeout:%d,uri:%s", dVar.f251600s, java.lang.Integer.valueOf(dVar.f251598q), this.f251584e.f251592h);
        if (this.f251584e.f251590f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushCDNDownloadWorker", "call cdndownload time out already callback");
        } else {
            this.f251584e.f251590f = true;
            ee3.d dVar2 = this.f251584e;
            dVar2.f251588d.d(dVar2.f251595n, dVar2.f251592h, "fail:time out", 5);
        }
        ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskTimeout.name(), 1, null, 0.01f);
        c(true);
    }
}
