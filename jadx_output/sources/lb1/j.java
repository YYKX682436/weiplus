package lb1;

/* loaded from: classes7.dex */
public class j extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lb1.k f317712a;

    public j(lb1.k kVar) {
        this.f317712a = kVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (java.util.Objects.equals(action, "android.bluetooth.device.action.ACL_CONNECTED")) {
            if (bluetoothDevice != null) {
                bluetoothDevice.getAddress();
            }
        } else if (java.util.Objects.equals(action, "android.bluetooth.device.action.ACL_DISCONNECTED") && bluetoothDevice != null && java.util.Objects.equals(bluetoothDevice.getAddress(), this.f317712a.f317715c)) {
            lb1.k kVar = this.f317712a;
            kVar.i(kVar.f317717e, 0, 0);
        }
    }
}
