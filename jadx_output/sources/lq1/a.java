package lq1;

/* loaded from: classes13.dex */
public abstract class a {
    public static boolean a() {
        if (fp.h.a(31)) {
            return true;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        return j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN");
    }

    public static boolean b() {
        if (fp.h.a(31)) {
            return true;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        return j35.u.h(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_CONNECT");
    }

    public static java.lang.String c(android.bluetooth.BluetoothDevice bluetoothDevice) {
        return b() ? bluetoothDevice.getName() : "";
    }

    public static boolean d(android.content.Context context) {
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKUtil", "isBLESupported, ret = %b", java.lang.Boolean.valueOf(hasSystemFeature));
        return hasSystemFeature;
    }

    public static boolean e() {
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        boolean isEnabled = defaultAdapter.isEnabled();
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.BluetoothSDKUtil", "isBluetoothOpen: %b", java.lang.Boolean.valueOf(isEnabled));
        return isEnabled;
    }
}
