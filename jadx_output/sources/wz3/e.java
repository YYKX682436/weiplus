package wz3;

/* loaded from: classes12.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f450777a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f450778b = "";

    /* renamed from: c, reason: collision with root package name */
    public static e04.x2 f450779c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f450780d;

    public static final void a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String b17;
        if (f450777a.length() <= 0 || !com.tencent.mm.vfs.w6.j(f450777a) || f450778b.length() <= 0 || !com.tencent.mm.vfs.w6.j(f450778b)) {
            boolean a07 = c01.e2.a0();
            str = "";
            if (a07) {
                if (f450779c == null) {
                    f450779c = new e04.x2();
                }
                e04.x2 x2Var = f450779c;
                if (x2Var == null || (str2 = x2Var.b("MODEL_SCAN_GOODS_CSC_DET")) == null) {
                    str2 = "";
                }
                f450777a = str2;
                e04.x2 x2Var2 = f450779c;
                if (x2Var2 != null && (b17 = x2Var2.b("MODEL_SCAN_GOODS_SCAN_CLS")) != null) {
                    str = b17;
                }
                f450778b = str;
                if (!f450780d) {
                    if (f450777a.length() <= 0 || f450778b.length() <= 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 11);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 10);
                    }
                }
            } else {
                ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
                p05.a3 a3Var = p05.a3.f350439a;
                java.lang.String g17 = a3Var.g("MODEL_CSC_DET");
                if (com.tencent.mm.vfs.w6.j(g17)) {
                    if (g17 == null) {
                        g17 = "";
                    }
                    f450777a = g17;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ScanProductModelConfigManager", "cscDetectModelPath not exist: " + g17);
                    f450777a = "";
                }
                ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
                java.lang.String g18 = a3Var.g("MODEL_SCAN_CLS");
                if (com.tencent.mm.vfs.w6.j(g18)) {
                    f450778b = g18 != null ? g18 : "";
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ScanProductModelConfigManager", "scanClsModelPath not exist: " + g18);
                    f450778b = "";
                }
                if (!f450780d) {
                    if (f450777a.length() <= 0 || f450778b.length() <= 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 13);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 12);
                    }
                }
            }
            f450780d = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductModelConfigManager", "initScanProductModelConfig detectModel: " + f450777a + ", scanClsModel: " + f450778b + ", isOverseaUser: " + a07);
        }
    }
}
