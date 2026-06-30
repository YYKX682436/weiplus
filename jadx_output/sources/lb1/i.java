package lb1;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f317707a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f317708b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ob1.k f317709c = null;

    /* renamed from: d, reason: collision with root package name */
    public volatile ob1.j f317710d = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile ob1.i f317711e = null;

    public i(android.content.Context context) {
        this.f317707a = context;
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = this.f317708b;
        if (map == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevices, connectWorkers is null", new java.lang.Object[0]);
            return arrayList;
        }
        for (lb1.k kVar : map.values()) {
            android.bluetooth.BluetoothGatt bluetoothGatt = kVar.f317717e;
            if (bluetoothGatt != null) {
                java.lang.String name = bluetoothGatt.getDevice().getName();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (name == null) {
                    name = "";
                }
                arrayList.add(new ob1.f(name, kVar.f317715c));
            }
        }
        return arrayList;
    }

    public final java.util.List b(java.util.List list) {
        boolean z17;
        if (list == null || list.isEmpty()) {
            return a();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = this.f317708b;
        if (map == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevices, connectWorkers is null", new java.lang.Object[0]);
            return arrayList;
        }
        for (lb1.k kVar : map.values()) {
            android.bluetooth.BluetoothGatt bluetoothGatt = kVar.f317717e;
            if (bluetoothGatt != null) {
                java.util.List m17 = kVar.m();
                if (m17 != null) {
                    java.util.ArrayList<ob1.g> arrayList2 = (java.util.ArrayList) m17;
                    if (!arrayList2.isEmpty()) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
                        for (ob1.g gVar : arrayList2) {
                            if (gVar.f344016b) {
                                arrayList3.add(gVar.f344015a);
                            }
                        }
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z17 = false;
                                break;
                            }
                            java.lang.String str = (java.lang.String) it.next();
                            java.util.Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                if (java.util.Objects.equals(str, (java.lang.String) it6.next())) {
                                    z17 = true;
                                    break;
                                }
                            }
                        }
                        if (z17) {
                            java.lang.String name = bluetoothGatt.getDevice().getName();
                            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            if (name == null) {
                                name = "";
                            }
                            arrayList.add(new ob1.f(name, kVar.f317715c));
                        }
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevices, services is empty", new java.lang.Object[0]);
            }
        }
        return arrayList;
    }

    public final java.util.List c(lb1.h hVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.bluetooth.BluetoothManager e17 = qb1.b.e();
        if (e17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevicesSysImpl, bluetoothManager is null", new java.lang.Object[0]);
            return arrayList;
        }
        for (android.bluetooth.BluetoothDevice bluetoothDevice : e17.getConnectedDevices(7)) {
            hVar.getClass();
            arrayList.add(new ob1.f(bluetoothDevice.getName(), bluetoothDevice.getAddress()));
        }
        return arrayList;
    }
}
