package ye1;

/* loaded from: classes8.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f461200a;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String str;
        android.content.pm.ApplicationInfo applicationInfo;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f461200a)) {
            return f461200a;
        }
        f461200a = context.getPackageName();
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f461200a, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && !com.tencent.mm.sdk.platformtools.t8.K0(applicationInfo.name)) {
                f461200a = packageInfo.applicationInfo.name;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Video.Utils", e17, "getUserAgent exception", new java.lang.Object[0]);
        }
        java.lang.String str2 = f461200a;
        int i17 = t9.d0.f416498a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        return str2 + "/" + str + " (Linux;Android " + android.os.Build.VERSION.RELEASE + ") ExoPlayerLib/2.5.4";
    }
}
