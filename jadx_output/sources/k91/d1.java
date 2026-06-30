package k91;

/* loaded from: classes7.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f305561a = com.tencent.mm.sdk.platformtools.o4.M("com.tencent.mm.plugin.appbrand.config.AppDebugInfoHelper");

    public static boolean a(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f305561a;
        boolean z17 = o4Var.getBoolean(str + "ENABLE_AUDITS_FLAG", false);
        o4Var.putBoolean(str + "ENABLE_AUDITS_FLAG", false);
        return z17;
    }

    public static void b(java.lang.String str, boolean z17) {
        f305561a.putBoolean(str + "_AppDebugEnabled", z17);
    }
}
