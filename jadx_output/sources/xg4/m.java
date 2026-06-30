package xg4;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static xg4.p f454447b;

    /* renamed from: e, reason: collision with root package name */
    public static final yz5.a f454450e;

    /* renamed from: a, reason: collision with root package name */
    public static final xg4.m f454446a = new xg4.m();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f454448c = jz5.h.b(xg4.i.f454443d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f454449d = jz5.h.b(xg4.j.f454444d);

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        f454450e = xg4.g.f454441d;
    }

    public final synchronized void a(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup");
        if (f454447b != null && c()) {
            jz5.g gVar = f454448c;
            com.tencent.mm.sdk.platformtools.n3 n3Var = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue();
            yz5.a aVar = f454450e;
            n3Var.removeCallbacks(new xg4.l(aVar));
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar).getValue()).postUIDelayed(new xg4.l(aVar), j17);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup not registered or not open");
    }

    public final synchronized void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "destroy");
        xg4.p pVar = f454447b;
        if (pVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f283001p;
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((hq0.e0) ((java.util.Map.Entry) it.next()).getValue()).c();
            }
            concurrentHashMap.clear();
        }
        a(0L);
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) f454449d).getValue()).booleanValue();
    }
}
