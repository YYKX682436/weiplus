package hq1;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.j f283092d;

    public b(hq1.j jVar) {
        this.f283092d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f283092d.f283140f = false;
        this.f283092d.b(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEManager", "Time out for discovering. Stop it");
        this.f283092d.e();
        hq1.h hVar = this.f283092d.f283135a;
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onDiscoverFinished***");
            kq1.n nVar = ((kq1.e) hVar).f311240a;
            nVar.f311258e.clear();
            iz5.a.g(null, kq1.n.a(nVar, 2, 0, 0, null));
        }
    }
}
