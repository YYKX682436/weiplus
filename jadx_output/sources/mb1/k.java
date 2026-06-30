package mb1;

/* loaded from: classes7.dex */
public class k extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325323n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f325324o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f325325p;

    public k(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        this.f325323n = str;
        this.f325324o = str2;
        this.f325325p = num;
    }

    @Override // ob1.c, lb1.l
    public void e(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "action:%s onCharacteristicRead status:%s", this, ob1.h.a(i17));
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
        if (!qb1.b.f(this.f325323n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            p(ob1.m.f344023j);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f325323n));
        if (service == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f344023j);
            m();
            return;
        }
        if (!qb1.b.f(this.f325324o)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f344024k);
            m();
            return;
        }
        java.util.UUID fromString = java.util.UUID.fromString(this.f325324o);
        java.lang.Integer num = this.f325325p;
        if (num != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
            java.util.Iterator<android.bluetooth.BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    characteristic = null;
                    break;
                }
                characteristic = it.next();
                if (fromString.equals(characteristic.getUuid()) && this.f325325p.intValue() == characteristic.getInstanceId()) {
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
        if (!((characteristic.getProperties() & 2) > 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, not support read", this);
            p(ob1.m.f344026m);
            m();
        } else {
            if (bluetoothGatt.readCharacteristic(characteristic)) {
                p(ob1.m.f344018e);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.readCharacteristic fail", this);
            p(ob1.m.b("readCharacteristic fail"));
            m();
        }
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "ReadCharacteristicAction";
    }

    @Override // ob1.c
    public java.lang.String toString() {
        return "ReadCharacteristicAction#" + this.f343998m + "{serviceId='" + this.f325323n + "', characteristicId='" + this.f325324o + "', debug=" + this.f343991f + ", mainThread=" + this.f343992g + ", serial=" + this.f343993h + '}';
    }
}
