package rs0;

/* loaded from: classes13.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static int f399297b = -1;

    /* renamed from: a, reason: collision with root package name */
    public static final rs0.g f399296a = new rs0.g(null);

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f399298c = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f399299d = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f399300e = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f399301f = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f399302g = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};

    static {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            android.content.pm.ConfigurationInfo deviceConfigurationInfo = activityManager != null ? activityManager.getDeviceConfigurationInfo() : null;
            if (deviceConfigurationInfo != null) {
                int i17 = (deviceConfigurationInfo.reqGlEsVersion & (-65536)) >> 16;
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_gl_key");
                int o17 = M.o("support_egl_context_client_version", 3);
                com.tencent.mars.xlog.Log.i("MicroMsg.GLEnvironmentUtil", "egl support version " + deviceConfigurationInfo.getGlEsVersion() + "   configurationInfo.reqGlEsVersion : " + deviceConfigurationInfo.reqGlEsVersion + "   major:" + i17 + "  curVersion:" + o17);
                int i18 = 2;
                if (o17 >= 3 && i17 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GLEnvironmentUtil", "markEglVersion2");
                    jx3.f.INSTANCE.w(985L, 11L, 1L);
                }
                if (!M.i("has_reported_egl_version", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GLEnvironmentUtil", "markEglVersion3");
                    jx3.f.INSTANCE.w(985L, 12L, 1L);
                    M.G("has_reported_egl_version", true);
                }
                if (i17 >= 3) {
                    i17 = 3;
                }
                if (i17 > 2) {
                    i18 = i17;
                }
                M.A("support_egl_context_client_version", i18);
            }
            if (deviceConfigurationInfo == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GLEnvironmentUtil", "configurationInfo == null");
            }
            if (j62.e.g().l("clicfg_gles_version_enable", true, true, true)) {
                return;
            }
            com.tencent.mm.sdk.platformtools.o4.M("mmkv_gl_key").A("support_egl_context_client_version", 3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GLEnvironmentUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
