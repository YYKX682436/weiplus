package fd1;

/* loaded from: classes7.dex */
public abstract class d {
    public static boolean a() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
    }

    public static boolean b() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        return context.getPackageManager().hasSystemFeature("android.hardware.nfc") && android.nfc.NfcAdapter.getDefaultAdapter(context) != null;
    }

    public static boolean c() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (defaultAdapter != null) {
            return defaultAdapter.isEnabled();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HceUtils", "no nfc chip !");
        return false;
    }
}
