package vz4;

@j95.b
/* loaded from: classes8.dex */
public class m extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f441737d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wepkg.utils.g f441738e;

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.WePkg.PluginWePkg", "onAccountInitialized");
        ku5.u0 u0Var = ku5.t0.f312615d;
        vz4.l lVar = new vz4.l(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f441737d = t0Var.z(lVar, 1000L, false);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.WePkg.PluginWePkg", "onAccountRelease");
        wu5.c cVar = this.f441737d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        com.tencent.mm.plugin.wepkg.utils.g gVar = this.f441738e;
        if (gVar != null) {
            gVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgListener", "wepkg stop listen");
            gVar.f188494c.dead();
            gVar.f188492a.dead();
            gVar.f188493b.dead();
            xz4.p pVar = xz4.q.f458295a;
            if (pVar != null) {
                try {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(pVar);
                } catch (java.lang.Exception unused) {
                }
            }
            xz4.q.f458295a = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader stopListen");
            if (com.tencent.mm.plugin.wepkg.utils.n.f188502b != null) {
                synchronized (com.tencent.mm.plugin.wepkg.utils.n.f188501a) {
                    if (com.tencent.mm.plugin.wepkg.utils.n.f188502b != null) {
                        com.tencent.mm.plugin.wepkg.utils.n.f188502b.quit();
                        com.tencent.mm.plugin.wepkg.utils.n.f188502b = null;
                    }
                }
            }
            this.f441738e = null;
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        if (com.tencent.mm.sdk.platformtools.x2.s()) {
            m43.c.b().a("preload_commlib", new vz4.k(this));
        }
        com.tencent.mm.sdk.platformtools.x2.n();
    }
}
