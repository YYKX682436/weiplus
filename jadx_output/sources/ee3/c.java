package ee3;

/* loaded from: classes7.dex */
public class c implements fe0.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wu5.b f251586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ee3.d f251587b;

    public c(ee3.d dVar, wu5.b bVar) {
        this.f251587b = dVar;
        this.f251586a = bVar;
    }

    @Override // fe0.o3
    public void a() {
        wu5.b bVar = this.f251586a;
        if (bVar != null) {
            bVar.b();
        }
        if (this.f251587b.f251590f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload onDownloadError already callback taskid:%s", this.f251587b.f251600s);
        } else {
            this.f251587b.f251590f = true;
            ee3.d dVar = this.f251587b;
            dVar.f251588d.d(dVar.f251595n, dVar.f251592h, "fail:cdn download fail", 303306);
            ee3.d dVar2 = this.f251587b;
            java.lang.String str = dVar2.f251591g;
            java.lang.String str2 = dVar2.f251602u;
            java.lang.String str3 = dVar2.f251592h;
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - dVar2.f251601t);
            ee3.d dVar3 = this.f251587b;
            je3.p.a(str, str2, "GET", str3, 0L, 0L, 0, 2, currentTimeMillis, dVar3.f251595n, dVar3.f251597p);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            ee3.d dVar4 = this.f251587b;
            int i17 = (int) (currentTimeMillis2 - dVar4.f251599r);
            java.lang.String str4 = dVar4.f251600s;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            ee3.d dVar5 = this.f251587b;
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushCDNDownloadWorker", "cdndownload file error taskid:%s,cost time:%d,filePath:%s,uri:%s", str4, valueOf, dVar5.f251595n, dVar5.f251592h);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskFail.name(), 1, null, 0.01f);
            ((je3.i) i95.n0.c(je3.i.class)).Sc(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key.MagicNetworkCDNDownloadTaskFailCost.name(), i17, null, 0.01f);
        }
        ee3.d dVar6 = this.f251587b;
        dVar6.b(dVar6.f251595n);
    }

    @Override // fe0.o3
    public void b() {
        wu5.b bVar = this.f251586a;
        if (bVar != null) {
            bVar.b();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new ee3.b(this));
    }
}
