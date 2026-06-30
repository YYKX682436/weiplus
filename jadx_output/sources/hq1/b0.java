package hq1;

/* loaded from: classes13.dex */
public class b0 extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f283093a;

    public b0(hq1.h0 h0Var) {
        this.f283093a = h0Var;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataReceive------");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283093a.f283116g;
        if (n3Var.sendMessage(n3Var.obtainMessage(8, bluetoothGattCharacteristic))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 8);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onCharacteristicRead------ status = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283093a.f283116g;
            if (n3Var.sendMessage(n3Var.obtainMessage(8, bluetoothGattCharacteristic))) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataWriteCallback------ status = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283093a.f283116g;
        if (n3Var.sendMessage(n3Var.obtainMessage(7, i17, 0))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 7);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f283093a.f283123n));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283093a.f283116g;
        if (n3Var.sendMessage(n3Var.obtainMessage(4, i18, 0))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDescriptorWrite------ status = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283093a.f283116g;
        if (n3Var.sendMessage(n3Var.obtainMessage(6, i17, 0, bluetoothGatt))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 6);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onServicesDiscovered------ status = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f283093a.f283116g;
        if (n3Var.sendMessage(n3Var.obtainMessage(5, i17, 0, bluetoothGatt))) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 5);
    }
}
