package wo;

/* loaded from: classes7.dex */
public abstract class p1 {
    public static int a() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return 0;
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        switch (subtype) {
            case 1:
            case 2:
            case 7:
            case 11:
                return 2;
            case 3:
            case 4:
            case 5:
            case 6:
            case 12:
            case 17:
                return 3;
            case 8:
            case 9:
            case 10:
            case 16:
            default:
                return subtype >= 20 ? 5 : 0;
            case 13:
            case 14:
            case 15:
                return 4;
        }
    }
}
