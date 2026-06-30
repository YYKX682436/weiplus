package hq1;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq1.m0 f283155e;

    public k0(hq1.m0 m0Var, int i17) {
        this.f283155e = m0Var;
        this.f283154d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            hq1.m0 m0Var = this.f283155e;
            if (i17 >= m0Var.f283162b.size()) {
                return;
            }
            hq1.g gVar = (hq1.g) ((hq1.l0) m0Var.f283162b.get(i17));
            gVar.getClass();
            int i18 = this.f283154d;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLEManager", "(API21)start ble scan failed, errorCode = %d", java.lang.Integer.valueOf(i18));
            if (i18 != 1) {
                gVar.f283107a.f283138d.post(new hq1.f(gVar));
            }
            i17++;
        }
    }
}
