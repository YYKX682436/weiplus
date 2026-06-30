package t41;

/* loaded from: classes8.dex */
public abstract class i {
    public static boolean a() {
        android.content.pm.PackageInfo packageInfo;
        try {
            packageInfo = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo("com.tencent.wework", 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PackageUtil", e17.getMessage());
            packageInfo = null;
        }
        return packageInfo != null;
    }
}
