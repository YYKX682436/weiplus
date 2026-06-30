package kq1;

/* loaded from: classes13.dex */
public class a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kq1.c f311236a;

    public a(kq1.c cVar) {
        this.f311236a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("McroMsg.exdevice.BluetoohtStateMonitor", "null == intent");
            return;
        }
        if (!intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            return;
        }
        com.tencent.mars.xlog.Log.i("McroMsg.exdevice.BluetoohtStateMonitor", "onReceive, action = " + intent.getAction());
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (10 != intExtra && 12 != intExtra) {
            return;
        }
        u32.a2 a2Var = (u32.a2) this.f311236a.f311237a;
        a2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "OnBluetoothStateChange, state = %d", java.lang.Integer.valueOf(intExtra));
        android.os.RemoteCallbackList remoteCallbackList = a2Var.f424265n;
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                remoteCallbackList.finishBroadcast();
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_state", intExtra);
            try {
                ((u32.q0) remoteCallbackList.getBroadcastItem(beginBroadcast)).Rb(0, bundle);
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.getBroadcastItem(%d).onExdeviceInvoke failed!!!", java.lang.Integer.valueOf(beginBroadcast));
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
