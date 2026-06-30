package t62;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExtConnectWifiEvent f416000d;

    public e(t62.f fVar, com.tencent.mm.autogen.events.ExtConnectWifiEvent extConnectWifiEvent) {
        this.f416000d = extConnectWifiEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.b8 b8Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderOpenApi", "connectWifi run");
        com.tencent.mm.autogen.events.ExtConnectWifiEvent extConnectWifiEvent = this.f416000d;
        if (extConnectWifiEvent == null || (b8Var = extConnectWifiEvent.f54193h) == null) {
            return;
        }
        b8Var.getClass();
    }
}
