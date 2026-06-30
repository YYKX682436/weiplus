package hq1;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.t f283175d;

    public p(hq1.t tVar) {
        this.f283175d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "Write data timeout");
        hq1.t tVar = this.f283175d;
        hq1.j jVar = tVar.f283183e;
        if (jVar != null) {
            jVar.f283135a.b(tVar.f283179a, false);
        }
        tVar.c();
    }
}
