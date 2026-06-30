package u32;

/* loaded from: classes13.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f424332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u32.g0 f424333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.a2 f424334f;

    public n1(u32.a2 a2Var, int i17, u32.g0 g0Var) {
        this.f424334f = a2Var;
        this.f424332d = i17;
        this.f424333e = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        u32.a2 a2Var = this.f424334f;
        u32.g0 g0Var = this.f424333e;
        boolean z18 = false;
        if (g0Var == null) {
            a2Var.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
        } else {
            a2Var.f424259e.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "------stopScan------");
            int i17 = this.f424332d;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---stopScan--- aBluetoothVersion = %d", java.lang.Integer.valueOf(i17));
            u32.p b17 = u32.p.b();
            boolean post = b17.f424344e.post(new u32.k(b17, i17));
            if (!post) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "stopScan: instance.mHandler.post failed!!!");
            }
            if (post) {
                z17 = true;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.stopScan Failed!!!");
                z17 = false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
                try {
                    g0Var.N6(0, -1, "stopScanImp: mBTDeviceMrg.stopScan failed!!!", "", "", 0, null);
                } catch (android.os.RemoteException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp: aCallback.onScanCallback failed!!!, %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
            boolean unregister = a2Var.f424262h.unregister(g0Var);
            if (!unregister) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
            }
            if (!unregister) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
            }
            z18 = z17;
        }
        if (z18) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp failed!!!");
    }
}
