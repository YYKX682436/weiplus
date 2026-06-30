package gy3;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final gy3.j f277565a;

    /* renamed from: b, reason: collision with root package name */
    public final android.bluetooth.BluetoothDevice f277566b;

    /* renamed from: c, reason: collision with root package name */
    public android.bluetooth.BluetoothSocket f277567c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f277568d;

    public f(gy3.j mSession, android.bluetooth.BluetoothDevice mDevice) {
        kotlin.jvm.internal.o.g(mSession, "mSession");
        kotlin.jvm.internal.o.g(mDevice, "mDevice");
        this.f277565a = mSession;
        this.f277566b = mDevice;
        this.f277568d = new gy3.e("RtosBluetoothThreads_handlerThread", this);
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBluetoothThreads", "------disconnect------");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f277568d;
        if (!n3Var.sendMessage(n3Var.obtainMessage(1))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "sendMessage = %d failed!!!", 1);
        }
        n3Var.quitSafely();
    }

    public final void b(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "socket connect failed (" + e17 + ')');
        try {
            android.bluetooth.BluetoothSocket bluetoothSocket = this.f277567c;
            if (bluetoothSocket != null) {
                bluetoothSocket.close();
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket failed!!! (" + e18 + ')');
        } catch (java.lang.NullPointerException e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosBluetoothThreads", "Close socket null!!! (" + e19 + ')');
        }
        ((gy3.d) this.f277565a.f277581a).g();
    }
}
