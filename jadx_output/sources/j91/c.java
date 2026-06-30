package j91;

/* loaded from: classes7.dex */
public abstract class c {
    public static final boolean a(java.lang.String chatToolMode) {
        kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
        return kotlin.jvm.internal.o.b(chatToolMode, "allPage") || kotlin.jvm.internal.o.b(chatToolMode, "subpackage");
    }

    public static final boolean b(boolean z17, java.util.List list, java.lang.String str) {
        if (z17) {
            return true;
        }
        if (list == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatToolUtil", "chatToolInfos is null, path:" + str + " return false");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatToolUtil", "targetPath:" + str + " is null, return false");
            return false;
        }
        java.lang.String n17 = u46.l.n(nf.z.a(str), ".html");
        ph1.i0 i0Var = ph1.i0.f354332a;
        java.lang.String[] e17 = i0Var.e(n17);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String root = ((com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaChatToolInfo) it.next()).f77403d;
            kotlin.jvm.internal.o.f(root, "root");
            if (i0Var.f(e17, i0Var.e(root))) {
                return true;
            }
        }
        return false;
    }
}
