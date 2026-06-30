package hq1;

/* loaded from: classes13.dex */
public class o extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.t f283174a;

    public o(hq1.t tVar) {
        this.f283174a = tVar;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onDataReceive------");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283174a.f283187i;
        if (n3Var.sendMessage(n3Var.obtainMessage(8, bluetoothGattCharacteristic.getValue()))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 8);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onCharacteristicRead------ status = %d", java.lang.Integer.valueOf(i17));
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onDataWriteCallback------ status = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283174a.f283187i;
        if (n3Var.sendMessage(n3Var.obtainMessage(7, i17, 0))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 7);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        hq1.t tVar = this.f283174a;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", valueOf, valueOf2, java.lang.Integer.valueOf(tVar.f283194p));
        com.tencent.mm.sdk.platformtools.n3 n3Var = tVar.f283187i;
        if (n3Var.sendMessage(n3Var.obtainMessage(4, i18, 0))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onDescriptorWrite------ status = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283174a.f283187i;
        if (n3Var.sendMessage(n3Var.obtainMessage(6, i17, 0, bluetoothGatt))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 6);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onServicesDiscovered------ status = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283174a.f283187i;
        if (n3Var.sendMessage(n3Var.obtainMessage(5, i17, 0, bluetoothGatt))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 5);
    }
}
