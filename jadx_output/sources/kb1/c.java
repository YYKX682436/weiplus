package kb1;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final lb1.i f306222a;

    /* renamed from: b, reason: collision with root package name */
    public final pb1.i f306223b;

    public c(android.content.Context context) {
        this.f306222a = new lb1.i(context);
        this.f306223b = new pb1.i(context);
    }

    public void a() {
        lb1.i iVar = this.f306222a;
        synchronized (iVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleConnectMgr", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new java.lang.Object[0]);
            if (iVar.f317708b == null) {
                iVar.f317708b = new java.util.concurrent.ConcurrentHashMap();
            }
            iVar.f317708b.clear();
        }
        pb1.i iVar2 = this.f306223b;
        synchronized (iVar2) {
            com.tencent.mars.xlog.Log.i(iVar2.f353140a, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, new java.lang.Object[0]);
            iVar2.f353145f.set(true);
            iVar2.f353153n = new pb1.b(iVar2.f353140a);
            iVar2.f353143d = new java.util.HashMap();
            iVar2.f353147h = new java.util.ArrayList();
            iVar2.f353142c = new pb1.e(iVar2);
            iVar2.b();
        }
    }

    public void b() {
        android.content.Context context;
        lb1.i iVar = this.f306222a;
        synchronized (iVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.BleConnectMgr", "uninit", new java.lang.Object[0]);
            java.util.Map map = iVar.f317708b;
            if (map != null) {
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) map).values().iterator();
                while (it.hasNext()) {
                    ((lb1.k) it.next()).p();
                }
                ((java.util.concurrent.ConcurrentHashMap) iVar.f317708b).clear();
                iVar.f317708b = null;
            }
            iVar.f317709c = null;
            iVar.f317710d = null;
            iVar.f317711e = null;
        }
        pb1.i iVar2 = this.f306223b;
        synchronized (iVar2) {
            com.tencent.mars.xlog.Log.i(iVar2.f353140a, "uninit", new java.lang.Object[0]);
            iVar2.d();
            iVar2.f353145f.set(false);
            iVar2.f353153n = pb1.p.f353160a;
            java.util.Map map2 = iVar2.f353143d;
            if (map2 != null) {
                ((java.util.HashMap) map2).clear();
            }
            java.util.List list = iVar2.f353147h;
            if (list != null) {
                ((java.util.ArrayList) list).clear();
            }
            if ((android.os.Build.VERSION.SDK_INT < 31 || ((context = iVar2.f353141b) != null && nf.t.b(context, null, "android.permission.BLUETOOTH_SCAN"))) && qb1.b.d() != null && qb1.b.d().isDiscovering()) {
                qb1.b.d().cancelDiscovery();
            }
            synchronized (iVar2) {
                if (iVar2.f353149j != null && iVar2.f353141b != null) {
                    com.tencent.mars.xlog.Log.i(iVar2.f353140a, "bluetoothStateListener uninit");
                    iVar2.f353141b.unregisterReceiver(iVar2.f353149j);
                    iVar2.f353149j = null;
                }
            }
        }
        iVar2.f353142c = null;
    }
}
