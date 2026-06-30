package rt2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt2.g f399503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rt2.g gVar) {
        super(1);
        this.f399503d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f399503d.getClass();
        java.lang.String stringExtra = intent.getStringExtra("action");
        boolean z17 = false;
        int intExtra = intent.getIntExtra("count", 0);
        int intExtra2 = intent.getIntExtra("enable", 0);
        if (stringExtra != null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -2120794458) {
                if (hashCode != -536639554) {
                    if (hashCode == 1474284576 && stringExtra.equals("dropFrameIncrease")) {
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = or2.u.f347681a;
                        com.tencent.mars.xlog.Log.i("Finder.PerformanceConfig", "configDropFramesIncreaseCount count:" + intExtra);
                        or2.u.f347682b = 0;
                        or2.u.f347683c = intExtra;
                        or2.u.f347684d = intExtra;
                    }
                } else if (stringExtra.equals("dropFrame")) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = or2.u.f347681a;
                    com.tencent.mars.xlog.Log.i("Finder.PerformanceConfig", "configDropFramesCount count:" + intExtra);
                    or2.u.f347683c = 0;
                    or2.u.f347682b = intExtra;
                }
            } else if (stringExtra.equals("enableLocalScrollFpsMonitor")) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = or2.u.f347681a;
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                boolean z18 = o45.wf.f343032j || z65.c.a();
                com.tencent.mars.xlog.Log.i("Finder.PerformanceConfig", "configEnableLocalScrollFpsMonitor enable:" + intExtra2 + " isDebug:" + z18);
                if (intExtra2 > 0 && z18) {
                    z17 = true;
                }
                or2.u.f347685e = z17;
            }
        }
        return jz5.f0.f302826a;
    }
}
