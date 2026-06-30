package e50;

/* loaded from: classes11.dex */
public final class j1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f249509b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f249510c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f249511d;

    /* renamed from: a, reason: collision with root package name */
    public static final e50.j1 f249508a = new e50.j1();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f249512e = jz5.h.b(e50.i1.f249504d);

    public final boolean a() {
        return ((java.lang.Boolean) ((jz5.n) f249512e).getValue()).booleanValue();
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("flutter_vulkan_config");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final void c() {
        if (f249509b) {
            return;
        }
        java.lang.String str = "";
        if (a()) {
            str = b().u(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_MODEL, "");
            kotlin.jvm.internal.o.f(str, "decodeString(...)");
            boolean z17 = !kotlin.jvm.internal.o.b(str, android.os.Build.MODEL);
            f249510c = z17;
            f249511d = z17 || b().i("vulkan_test_result", true);
        }
        f249509b = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVulkanConfig", "readFromMMKV: modeInMMKV:" + str + ", vulkanEnableMMKV: " + f249511d + ", expt: " + a());
    }

    public final boolean d() {
        c();
        return a() && f249511d;
    }
}
