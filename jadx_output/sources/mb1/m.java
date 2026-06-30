package mb1;

/* loaded from: classes7.dex */
public class m extends ob1.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f325328n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f325329o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f325330p;

    /* renamed from: q, reason: collision with root package name */
    public final int f325331q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f325332r;

    public m(java.lang.String str, java.lang.String str2, java.lang.Integer num, int i17, java.lang.String str3) {
        this.f325328n = str;
        this.f325329o = str2;
        this.f325330p = num;
        this.f325331q = i17;
        this.f325332r = str3;
    }

    @Override // ob1.c, lb1.l
    public void g(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        java.lang.String a17 = ob1.h.a(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "action:%s onCharacteristicWrite status:%s", this, a17);
        if (i17 == 0) {
            p(ob1.m.f344018e);
        } else {
            p(ob1.m.b("status: " + a17));
        }
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
        if (!qb1.b.f(this.f325328n)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", this);
            p(ob1.m.f344023j);
            m();
            return;
        }
        android.bluetooth.BluetoothGattService service = bluetoothGatt.getService(java.util.UUID.fromString(this.f325328n));
        if (service == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, gattService is null", this);
            p(ob1.m.f344023j);
            m();
            return;
        }
        if (!qb1.b.f(this.f325329o)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", this);
            p(ob1.m.f344024k);
            m();
            return;
        }
        java.util.UUID fromString = java.util.UUID.fromString(this.f325329o);
        java.lang.Integer num = this.f325330p;
        if (num != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "action:%s, handle: %d", this, num);
            java.util.Iterator<android.bluetooth.BluetoothGattCharacteristic> it = service.getCharacteristics().iterator();
            while (true) {
                if (!it.hasNext()) {
                    characteristic = null;
                    break;
                }
                characteristic = it.next();
                if (fromString.equals(characteristic.getUuid()) && this.f325330p.intValue() == characteristic.getInstanceId()) {
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
        boolean z17 = (characteristic.getProperties() & 8) > 0;
        boolean z18 = (characteristic.getProperties() & 4) > 0;
        com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s, writeType: %d, supportWrite: %b, supportWriteNoResponse: %b", this, java.lang.Integer.valueOf(this.f325331q), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (!z17 && !z18) {
            p(ob1.m.f344026m);
            m();
            return;
        }
        int i17 = this.f325331q;
        if ((1 == i17 && !z17) || (2 == i17 && !z18)) {
            p(ob1.m.f344037x);
            m();
            return;
        }
        int writeType = characteristic.getWriteType();
        int i18 = this.f325331q;
        if (i18 == 1) {
            characteristic.setWriteType(2);
        } else if (i18 == 2) {
            characteristic.setWriteType(1);
        }
        byte[] a17 = qb1.b.a(android.util.Base64.decode(this.f325332r, 2));
        characteristic.setValue(a17);
        com.tencent.mars.xlog.Log.w("MicroMsg.Ble.Action", "dataToWrite's length:%d", java.lang.Integer.valueOf(a17.length));
        if (this.f343991f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Ble.Action", "dataToWrite:%s", java.util.Arrays.toString(a17));
        }
        if (bluetoothGatt.writeCharacteristic(characteristic)) {
            characteristic.setWriteType(writeType);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeCharacteristic fail", this);
        characteristic.setWriteType(writeType);
        p(ob1.m.b("writeCharacteristic fail"));
        m();
    }

    @Override // ob1.c
    public java.lang.String n() {
        return "WriteCharacteristicAction";
    }

    @Override // ob1.c
    public java.lang.String toString() {
        return "WriteCharacteristicAction#" + this.f343998m + "{serviceId='" + this.f325328n + "', characteristicId='" + this.f325329o + "', value='" + this.f325332r + "', debug=" + this.f343991f + ", mainThread=" + this.f343992g + ", serial=" + this.f343993h + '}';
    }
}
