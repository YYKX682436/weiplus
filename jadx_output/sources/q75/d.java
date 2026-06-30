package q75;

/* loaded from: classes7.dex */
public abstract class d {
    public static boolean a() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 > 33) {
            return true;
        }
        if (i17 >= 30) {
            return "UpsideDownCake".equals(android.os.Build.VERSION.RELEASE_OR_CODENAME) || "14".equals(android.os.Build.VERSION.RELEASE_OR_CODENAME);
        }
        return false;
    }
}
