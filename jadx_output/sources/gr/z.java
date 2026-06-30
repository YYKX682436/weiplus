package gr;

/* loaded from: classes12.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f274703a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f274704b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f274705c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f274706d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f274707e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f274708f;

    public static int a() {
        return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CustomEmojiMaxSize"), 999);
    }

    public static boolean b() {
        boolean z17;
        boolean z18;
        if (!f274704b) {
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableEmoticonExternUrl", 0);
            int errorCode = com.tencent.mm.plugin.gif.MMWXGFJNI.getErrorCode();
            if ((b17 & 2) == 2) {
                try {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo("com.google.android.wearable.app.cn", 1);
                    z17 = true;
                } catch (java.lang.Throwable unused) {
                    z17 = false;
                }
                if (!z17) {
                    try {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo("com.google.android.wearable.app", 1);
                        z18 = true;
                    } catch (android.util.AndroidException | java.lang.Exception unused2) {
                        z18 = false;
                    }
                    if (!z18) {
                        f274707e = true;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 1L, 1L, false);
                    }
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 0L, 1L, false);
                f274707e = false;
            } else {
                f274707e = false;
            }
            if (errorCode < 0) {
                f274707e = false;
            }
            f274704b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcDecode:%b", java.lang.Boolean.valueOf(f274707e));
        }
        return f274707e && ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
    }

    public static boolean c() {
        if (!f274705c) {
            if ((((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableEmoticonExternUrl", 0) & 4) == 4) {
                f274708f = true;
            } else {
                f274708f = false;
            }
            f274705c = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmotionDynamicConfigMgr", "isEnableHevcUpload:%b", java.lang.Boolean.valueOf(f274708f));
        return f274708f && ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj();
    }
}
