package hq1;

/* loaded from: classes13.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.t f283176d;

    public q(hq1.t tVar) {
        this.f283176d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "Write descriptor timeout!!!");
        hq1.t tVar = this.f283176d;
        if (3 == tVar.f283194p) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothLESession", "Bluetooth device is aready disconnet or close, just leave");
            return;
        }
        tVar.f283187i.removeCallbacks(tVar.f283190l);
        tVar.f283194p = 2;
        hq1.j jVar = tVar.f283183e;
        if (jVar != null) {
            jVar.f283135a.a(tVar.f283179a, false);
        }
    }
}
