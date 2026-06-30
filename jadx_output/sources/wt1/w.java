package wt1;

/* loaded from: classes13.dex */
public class w implements android.bluetooth.BluetoothAdapter.LeScanCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.t f449359d;

    public w(wt1.t tVar) {
        this.f449359d = tVar;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        if (bluetoothDevice == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardLbsOrBluetooth", "device is null, return");
            return;
        }
        wt1.t tVar = this.f449359d;
        r45.gn gnVar = tVar.f449352i.f449330r;
        if (gnVar == null || com.tencent.mm.sdk.platformtools.t8.K0(gnVar.f375367d)) {
            return;
        }
        java.lang.String name = bluetoothDevice.getName();
        if (name == null) {
            name = "";
        }
        java.lang.String address = bluetoothDevice.getAddress();
        if (name.equals(tVar.f449352i.f449330r.f375367d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardLbsOrBluetooth", "onLeScan for deviceId:%s, name:%s, rssi:%d", address, name, java.lang.Integer.valueOf(i17));
            tVar.getClass();
            byte[] bArr2 = null;
            if (bArr != null) {
                int i18 = 0;
                while (i18 < bArr.length) {
                    int i19 = i18 + 1;
                    int i27 = bArr[i18] & 255;
                    if (i27 == 0) {
                        break;
                    }
                    int i28 = i27 - 1;
                    int i29 = i19 + 1;
                    if ((bArr[i19] & 255) == 255) {
                        byte b17 = bArr[i29 + 1];
                        byte b18 = bArr[i29];
                        bArr2 = new byte[i28];
                        java.lang.System.arraycopy(bArr, i29, bArr2, 0, i28);
                    }
                    i18 = i28 + i29;
                }
            }
            ((java.util.concurrent.ConcurrentHashMap) tVar.f449347d).put(address, new wt1.x(address, i17, name, bArr2));
        }
    }
}
