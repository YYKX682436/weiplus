package fl4;

/* loaded from: classes11.dex */
public final class k extends com.tencent.unit_rc.BaseObject implements b66.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.media.TingMediaBrowserService f263937d;

    public k(com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService) {
        this.f263937d = tingMediaBrowserService;
    }

    @Override // b66.t
    public void o(byte[] context, int i17, byte[] msg) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
    }

    @Override // b66.t
    public void x(long j17, long j18, long j19) {
        com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService = this.f263937d;
        if (java.lang.Math.abs(j17 - tingMediaBrowserService.f174703z) < 1000) {
            return;
        }
        tingMediaBrowserService.f174703z = j17;
        try {
            b66.n h17 = tingMediaBrowserService.h();
            if (h17 != null) {
                int a17 = com.tencent.mm.plugin.ting.media.TingMediaBrowserService.I.a(((b66.q) h17).n());
                com.tencent.mm.plugin.ting.media.TingMediaBrowserService tingMediaBrowserService2 = this.f263937d;
                tingMediaBrowserService2.l(a17, tingMediaBrowserService2.f174701x, j19, j17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingMediaBrowserService", "onProgressChanged Error:" + e17.getLocalizedMessage());
        }
    }
}
