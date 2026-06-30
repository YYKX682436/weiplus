package nw4;

/* loaded from: classes7.dex */
public abstract class w2 {
    public static final boolean a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_debug, 0) != 1) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("_webview_jsloader");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M.getBoolean("vconsole", false);
    }
}
