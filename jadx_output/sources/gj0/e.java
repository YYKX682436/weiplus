package gj0;

/* loaded from: classes7.dex */
public class e extends gj0.b {
    @Override // gj0.b
    public int b() {
        boolean z17;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 27 || i17 > 28 || !"vivo".equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
            return 0;
        }
        try {
            if (i17 >= 28) {
                z17 = android.os.Process.isIsolated();
            } else {
                int myUid = android.os.Process.myUid() % 100000;
                z17 = (myUid >= 99000 && myUid <= 99999) || (myUid >= 90000 && myUid <= 98999);
            }
            if (!z17) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("bs_probe", 0);
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof java.lang.RuntimeException) {
                throw th6;
            }
            throw new java.lang.IllegalStateException(th6);
        }
    }

    @Override // gj0.b
    public java.lang.String c() {
        return "blackscreen-avoidance";
    }
}
