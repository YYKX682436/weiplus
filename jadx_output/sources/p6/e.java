package p6;

/* loaded from: classes15.dex */
public interface e {
    static boolean a(int i17) {
        boolean z17 = true;
        if (i17 == 0) {
            return true;
        }
        if (i17 == 1) {
            try {
                return android.os.HapticPlayer.isAvailable();
            } catch (java.lang.Throwable unused) {
                return false;
            }
        }
        if (i17 != 2) {
            return false;
        }
        try {
            if (2 == ((java.lang.Integer) java.lang.Class.forName("android.os.RichTapVibrationEffect").getMethod("checkIfRichTapSupport", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).intValue()) {
                return false;
            }
        } catch (java.lang.Exception unused2) {
            z17 = false;
        }
        return z17;
    }
}
