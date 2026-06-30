package mb1;

/* loaded from: classes7.dex */
public class h extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325310n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f325311o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f325312p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f325313q;

    public h(java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z17) {
        this.f325310n = str;
        this.f325311o = str2;
        this.f325312p = num;
        this.f325313q = z17;
    }

    @Override // ob1.c, lb1.l
    public void c(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", this, ob1.h.a(i17));
        m();
    }

    @Override // ob1.c
    public void l() {
        android.bluetooth.BluetoothGattCharacteristic characteristic;
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f343986a.f317717e;
        if (bluetoothGatt == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", this);
            p(ob1.m.f344025l);
            m();
            return;
        }
        if (!qb1.b.f(this.f325310n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            p(ob1.m.f344023j);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f325310n));
        if (service == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f344023j);
            m();
            return;
        }
        if (!qb1.b.f(this.f325311o)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f344024k);
            m();
            return;
        }
        java.util.UUID fromString = java.util.UUID.fromString(this.f325311o);
        java.lang.Integer num = this.f325312p;
        if (num != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
            java.util.Iterator<android.bluetooth.BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    characteristic = null;
                    break;
                }
                characteristic = it.next();
                if (fromString.equals(characteristic.getUuid()) && this.f325312p.intValue() == characteristic.getInstanceId()) {
                    break;
                }
            }
        } else {
            characteristic = service.getCharacteristic(fromString);
        }
        if (characteristic == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", this);
            p(ob1.m.f344024k);
            m();
            return;
        }
        if (!((characteristic.getProperties() & 16) > 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, not support notify", this);
            p(ob1.m.f344026m);
            m();
            return;
        }
        if (!bluetoothGatt.setCharacteristicNotification(characteristic, this.f325313q)) {
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
        if (!descriptor.setValue(this.f325313q ? android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
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
        return "NotifyCharacteristicAction";
    }

    @Override // ob1.c
    public java.lang.String toString() {
        return "NotifyCharacteristicAction#" + this.f343998m + "{serviceId='" + this.f325310n + "', characteristicId='" + this.f325311o + "', enable=" + this.f325313q + ", debug=" + this.f343991f + ", mainThread=" + this.f343992g + ", serial=" + this.f343993h + '}';
    }
}
