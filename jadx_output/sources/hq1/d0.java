package hq1;

/* loaded from: classes13.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f283100d;

    public d0(hq1.h0 h0Var) {
        this.f283100d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Connected timeout!!!, mac=%s, name=%s", a42.i.f(this.f283100d.f283110a), lq1.a.c(this.f283100d.f283111b));
        if (3 == this.f283100d.f283123n) {
            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already disconnet or close, just leave");
        } else if (this.f283100d.f283123n == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "Bluetooth device is already connected, just leave.");
        } else {
            this.f283100d.c();
        }
    }
}
