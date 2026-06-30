package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.matrix.lifecycle.g f214894a;

    public static void a() {
        if (f214894a != null) {
            return;
        }
        boolean h17 = com.tencent.xweb.b.m().h("disable_kill_child_process_in_deep_background", "tools", false);
        int i17 = com.tencent.xweb.b.m().i("timeout_kill_child_process_in_deep_background", "tools", 30000);
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "initDeepBackgroundCallback, configValue:%s, configTimeout:%s", java.lang.Boolean.valueOf(h17), java.lang.Integer.valueOf(i17));
        if (h17 || f214894a != null) {
            return;
        }
        f214894a = new com.tencent.mm.xwebutil.w0(i17);
        com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner.INSTANCE.addLifecycleCallback(f214894a);
    }

    public static void b(com.tencent.xweb.f1 f1Var, com.tencent.xweb.e1 e1Var) {
        c();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null) {
            a17 = "";
        } else if (a17.contains(":")) {
            a17 = a17.substring(a17.lastIndexOf(":") + 1).toLowerCase();
            if (a17.startsWith("appbrand")) {
                a17 = "appbrand";
            }
        } else if (a17.contains(".")) {
            a17 = a17.substring(a17.lastIndexOf(".") + 1).toLowerCase();
        }
        com.tencent.xweb.WebView.v0(context, f1Var, a17, new com.tencent.mm.xwebutil.x0(e1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c() {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xwebutil.y0.c():void");
    }

    public static boolean d() {
        zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
        boolean c17 = com.tencent.mm.sdk.platformtools.a0.c();
        com.tencent.mars.xlog.Log.i("XWeb.MM.XWebUtil", "isGPVersion, get from channel util:" + c17);
        return c17;
    }
}
