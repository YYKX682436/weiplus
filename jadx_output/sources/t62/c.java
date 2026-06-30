package t62;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExtGetWifiListEvent f415999d;

    public c(t62.d dVar, com.tencent.mm.autogen.events.ExtGetWifiListEvent extGetWifiListEvent) {
        this.f415999d = extGetWifiListEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.h8 h8Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderOpenApi", "getWifiList run");
        com.tencent.mm.autogen.events.ExtGetWifiListEvent extGetWifiListEvent = this.f415999d;
        if (extGetWifiListEvent == null || (h8Var = extGetWifiListEvent.f54199h) == null) {
            return;
        }
        h8Var.getClass();
    }
}
