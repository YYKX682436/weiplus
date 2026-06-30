package hq1;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.a0 f283202d;

    public x(hq1.a0 a0Var) {
        this.f283202d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.a0 a0Var = this.f283202d;
        a0Var.f283081a.b(false, a0Var.f283087g);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleManager", "Time out for discovering. Stop it");
    }
}
