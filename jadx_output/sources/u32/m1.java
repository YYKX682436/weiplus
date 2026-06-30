package u32;

/* loaded from: classes13.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f424327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u32.g0 f424328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.a2 f424329f;

    public m1(u32.a2 a2Var, int i17, u32.g0 g0Var) {
        this.f424329f = a2Var;
        this.f424327d = i17;
        this.f424328e = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        u32.a2 a2Var = this.f424329f;
        a2Var.getClass();
        u32.g0 g0Var = this.f424328e;
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
            throw new java.lang.IllegalArgumentException("scanImp: null == aCallback");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnscanCallback");
        android.os.RemoteCallbackList remoteCallbackList = a2Var.f424262h;
        boolean register = remoteCallbackList.register(g0Var);
        if (!register) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.register Failed!!!");
        }
        boolean z18 = false;
        if (register) {
            u32.i iVar = a2Var.f424259e;
            iVar.getClass();
            int i17 = this.f424327d;
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BTDeviceManager", "------scan------ bluetooth version = %d", java.lang.Integer.valueOf(i17));
            u32.p b17 = u32.p.b();
            boolean post = b17.f424344e.post(new u32.j(b17, i17, iVar, new int[0]));
            if (!post) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "scan: instance.mHandler.post failed!!!");
            }
            if (post) {
                z17 = true;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.scan Failed!!!");
                z17 = false;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.scan Failed!!!");
                try {
                    g0Var.N6(0, -1, "scanImp: mBTDeviceMrg.scan failed!!!", "", "", 0, null);
                } catch (android.os.RemoteException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", e17.getMessage());
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
                boolean unregister = remoteCallbackList.unregister(g0Var);
                if (!unregister) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
                }
                if (!unregister) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
                }
            }
            z18 = z17;
        } else {
            try {
                g0Var.N6(0, -1, "scanImp: registScanCallback failed!!!", "", "", 0, null);
            } catch (android.os.RemoteException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", e18.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e18, "", new java.lang.Object[0]);
            }
        }
        if (z18) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scanImp failed!!!");
    }
}
