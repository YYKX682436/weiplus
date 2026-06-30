package fl4;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.media.TingMediaBrowserService f263934d;

    public h(com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService) {
        this.f263934d = tingMediaBrowserService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (android.os.Build.VERSION.SDK_INT == 26) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "api 26 disable notify");
            return;
        }
        fl4.e eVar = com.tencent.mm.plugin.ting.media.TingMediaBrowserService.I;
        com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService = this.f263934d;
        b66.n h17 = tingMediaBrowserService.h();
        if ((h17 != null ? ((b66.q) h17).n() : null) == bw5.pq0.Paused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMediaBrowserService", "real cancel pause notification");
            tingMediaBrowserService.e();
            tingMediaBrowserService.g();
        }
    }
}
