package mb1;

/* loaded from: classes7.dex */
public class g extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325307n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f325308o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f325309p;

    public g(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f325307n = str;
        this.f325308o = str2;
        this.f325309p = z17;
    }

    @Override // ob1.c, lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", this, ob1.h.a(i17));
        m();
    }

    @Override // ob1.c
    public void l() {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f343986a.f317717e;
        if (bluetoothGatt == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", this);
            p(ob1.m.f344025l);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f325307n));
        if (service == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f344023j);
            m();
            return;
        }
        if (!qb1.b.f(this.f325308o)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f344024k);
            m();
            return;
        }
        android.bluetooth.BluetoothGattCharacteristic characteristic = service.getCharacteristic(java.util.UUID.fromString(this.f325308o));
        if (characteristic == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", this);
            p(ob1.m.f344024k);
            m();
            return;
        }
        if (!((characteristic.getProperties() & 32) > 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, not support indicate", this);
            p(ob1.m.f344026m);
            m();
            return;
        }
        if (!bluetoothGatt.setCharacteristicNotification(characteristic, this.f325309p)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.setCharacteristicNotification fail", this);
            p(ob1.m.b("setCharacteristicNotification fail"));
            m();
            return;
        }
        android.bluetooth.BluetoothGattDescriptor descriptor = characteristic.getDescriptor(nb1.a.f336032a);
        if (descriptor == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s gattCharacteristic.getDescriptor fail", this);
            p(ob1.m.f344029p);
            m();
            return;
        }
        if (!descriptor.setValue(this.f325309p ? android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s gattDescriptor.setValue fail", this);
            p(ob1.m.f344030q);
            m();
        } else {
            if (bluetoothGatt.writeDescriptor(descriptor)) {
                p(ob1.m.f344018e);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeDescriptor fail", this);
            p(ob1.m.f344031r);
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "IndicateCharacteristicAction";
    }

    @Override // ob1.c
    public java.lang.String toString() {
        return "IndicateCharacteristicAction#" + this.f343998m + "{serviceId='" + this.f325307n + "', characteristicId='" + this.f325308o + "', enable=" + this.f325309p + ", debug=" + this.f343991f + ", mainThread=" + this.f343992g + ", serial=" + this.f343993h + '}';
    }
}
