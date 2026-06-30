package gq1;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f274506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gq1.o f274507e;

    public k(gq1.o oVar, java.util.UUID uuid) {
        this.f274507e = oVar;
        this.f274506d = uuid;
    }

    @Override // java.lang.Runnable
    public void run() {
        gq1.o oVar = this.f274507e;
        java.util.UUID uuid = this.f274506d;
        oVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "startRanging");
        boolean z17 = false;
        if (uuid == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
        } else {
            if (!oVar.f274522f.contains(uuid)) {
                oVar.f274522f.add(uuid);
            }
            synchronized (oVar) {
                if (oVar.f274534u.e()) {
                    oVar.f274534u.c(2000L, 2000L);
                }
                if (gq1.o.f274519x && oVar.f274533t.e()) {
                    oVar.f274533t.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                }
                if (oVar.f274535v.e()) {
                    if (gq1.o.f274519x) {
                        oVar.f274535v.c(1800000L, 1800000L);
                    } else {
                        oVar.f274535v.c(u04.d.f423477c, u04.d.f423477c);
                    }
                }
                if (!gq1.o.f274518w) {
                    oVar.f274526m = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.IBeaconServer", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                    android.bluetooth.BluetoothAdapter bluetoothAdapter = oVar.f274524h;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(oVar);
                    java.util.Collections.reverse(arrayList);
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter, arrayList.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan", "()V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
                    if (valueOf.booleanValue() || gq1.o.f274518w) {
                        oVar.f274523g = true;
                        gq1.o.f274518w = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
                    } else {
                        int i17 = 0;
                        while (!valueOf.booleanValue() && i17 < 3 && !gq1.o.f274518w) {
                            i17++;
                            oVar.f274524h.stopLeScan(oVar);
                            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "start IBEACON BLE scan failed,retry no " + i17 + " time");
                            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.IBeaconServer", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                            android.bluetooth.BluetoothAdapter bluetoothAdapter2 = oVar.f274524h;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(oVar);
                            java.util.Collections.reverse(arrayList2);
                            valueOf = java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter2, arrayList2.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan", "()V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
                            if (valueOf.booleanValue()) {
                                gq1.o.f274518w = true;
                                oVar.f274523g = true;
                                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
                            }
                        }
                    }
                }
            }
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.IBeaconServer", "startRanging failed!!!");
    }
}
