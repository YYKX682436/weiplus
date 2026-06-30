package yc1;

/* loaded from: classes15.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc1.w f460813d;

    public v(yc1.w wVar) {
        this.f460813d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f460813d.f460817g.f460823g) {
            yc1.w wVar = this.f460813d;
            yc1.z zVar = wVar.f460817g;
            if (!((java.util.concurrent.ConcurrentHashMap) zVar.f460823g).containsKey(zVar.C(wVar.f460814d, wVar.f460815e))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "scan task not exist, cancel auto stop");
                return;
            }
            uh1.o1.INSTANCE.a(this.f460813d.f460816f);
            yc1.w wVar2 = this.f460813d;
            yc1.z zVar2 = wVar2.f460817g;
            ((java.util.concurrent.ConcurrentHashMap) zVar2.f460823g).remove(zVar2.C(wVar2.f460814d, wVar2.f460815e));
            android.net.wifi.WifiManager.MulticastLock multicastLock = this.f460813d.f460817g.f460824h;
            if (multicastLock != null) {
                try {
                    if (multicastLock.isHeld()) {
                        multicastLock.release();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateLocalServicesScan", e17.getMessage());
                }
            }
        }
    }
}
