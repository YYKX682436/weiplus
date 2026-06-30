package hq1;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f283203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq1.a0 f283204e;

    public y(hq1.a0 a0Var, long j17) {
        this.f283204e = a0Var;
        this.f283203d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.a0 a0Var = this.f283204e;
        java.util.HashMap hashMap = a0Var.f283089i;
        long j17 = this.f283203d;
        hq1.h0 h0Var = (hq1.h0) hashMap.remove(java.lang.Long.valueOf(j17));
        if (h0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothLESimpleManager", "session not found! maybe ui don't handle session disconnect event correctly.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------close------, mac=%s, name=%s", a42.i.f(h0Var.f283110a), lq1.a.c(h0Var.f283111b));
        com.tencent.mm.sdk.platformtools.n3 n3Var = h0Var.f283116g;
        if (!n3Var.sendMessage(n3Var.obtainMessage(2))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 2);
        }
        a0Var.f283090j.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
    }
}
