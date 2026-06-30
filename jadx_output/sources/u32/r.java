package u32;

/* loaded from: classes13.dex */
public class r implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public u32.q f424356d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f424357e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f424358f = new java.util.LinkedList();

    public void a(android.content.Context context) {
        if (!u32.s.a(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "ensureServiceInstance return false");
        } else if (l85.h1.a(new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.service.ExDeviceService.class), this, 1, "exdevice", true, j45.l.e("exdevice"))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice success");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceServiceConnection", "bind exdeviceservice failed");
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        u32.a0 yVar;
        boolean z17;
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceConnected");
        int i17 = u32.z.f424401d;
        if (iBinder == null) {
            yVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTDeviceManager_AIDL");
            yVar = (queryLocalInterface == null || !(queryLocalInterface instanceof u32.a0)) ? new u32.y(iBinder) : (u32.a0) queryLocalInterface;
        }
        u32.k1 k1Var = new u32.k1(yVar);
        u32.h1.c().f99006a = k1Var;
        com.tencent.mm.sdk.platformtools.x2.k();
        i32.b bVar = i32.b.f288118d;
        if (bVar == null) {
            bVar = new i32.b();
            i32.b.f288118d = bVar;
        }
        try {
            yVar.Di(bVar);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "registOnDeviceRequest failed!!! %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e17, "", new java.lang.Object[0]);
        }
        try {
            k1Var.f424318a.xc(com.tencent.mm.plugin.exdevice.model.a.f98842d);
        } catch (android.os.RemoteException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.registExDeviceInvokerHandler failed!!, %s", e18.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e18, "", new java.lang.Object[0]);
        }
        try {
            z17 = k1Var.f424318a.wi(com.tencent.mm.plugin.exdevice.model.l3.Ni());
        } catch (android.os.RemoteException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e19, "", new java.lang.Object[0]);
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceServiceConnection", "simpleBluetoothRegistOnRecv error");
        }
        u32.q qVar = this.f424356d;
        if (qVar != null) {
            qVar.a();
        }
        this.f424357e = true;
        synchronized (this.f424358f) {
            arrayList = new java.util.ArrayList(this.f424358f);
            ((java.util.LinkedList) this.f424358f).clear();
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            java.lang.Runnable runnable = (java.lang.Runnable) arrayList.get(i18);
            if (runnable != null) {
                runnable.run();
            }
        }
        arrayList.clear();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "onServiceDisconnected");
        this.f424357e = false;
        u32.h1.c().f99006a = null;
        com.tencent.mm.sdk.platformtools.x2.k();
        if (ob0.r3.b()) {
            if (!gm0.j1.b().n() || gm0.m.r()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceServiceConnection", "no user login, ignore this disconnection");
            } else {
                a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
        }
    }
}
