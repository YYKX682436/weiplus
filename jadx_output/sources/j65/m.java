package j65;

/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f297966a;

    public static boolean a() {
        java.lang.String str = android.os.Build.BRAND;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        return (lowerCase.contains("meizu") || lowerCase.contains("smartisan")) && android.os.Build.VERSION.SDK_INT <= 25;
    }

    public static void b(android.content.res.Configuration configuration, android.content.res.Resources resources) {
        boolean E = com.tencent.mm.ui.bk.E(resources);
        int i17 = configuration.uiMode;
        int i18 = i17 & (-49);
        configuration.uiMode = i18;
        configuration.uiMode = i18 | (E ? 32 : 16);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(E);
        objArr[1] = java.lang.Integer.valueOf(configuration.uiMode);
        objArr[2] = java.lang.Integer.valueOf(resources != null ? resources.getConfiguration().uiMode : 0);
        objArr[3] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMUIModeManager", "updateNightMode, isDarkMode:%s, uiMode:%s, resourcesMode:%s oldUiMode:%s", objArr);
    }

    public static void c(android.content.res.Configuration configuration, boolean z17) {
        int i17 = configuration.uiMode & (-49);
        configuration.uiMode = i17;
        configuration.uiMode = i17 | (z17 ? 32 : 16);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMUIModeManager", "updateNightMode, isDarkMode:%s, uiMode:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(configuration.uiMode));
    }
}
