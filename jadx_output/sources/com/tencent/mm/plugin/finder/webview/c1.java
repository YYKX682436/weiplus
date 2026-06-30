package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class c1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136855e;

    public c1(com.tencent.mm.plugin.finder.webview.n1 n1Var, java.lang.String str) {
        this.f136855e = n1Var;
        this.f136854d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        java.lang.String str = this.f136854d;
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = null;
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136855e;
        if (itemId == 1) {
            n1Var.b(1, null);
            try {
                boolean e17 = n1Var.e();
                zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
                android.content.Context c17 = n1Var.c();
                java.lang.String a17 = com.tencent.xweb.d.g().a(str);
                com.tencent.mm.plugin.finder.webview.s0 s0Var = new com.tencent.mm.plugin.finder.webview.s0(n1Var);
                ((yg0.s4) q3Var).getClass();
                com.tencent.mm.pluginsdk.ui.tools.e9.h(c17, str, a17, e17, s0Var);
                return;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e18.getMessage());
                return;
            }
        }
        if (itemId == 2) {
            java.util.ArrayList arrayList = n1Var.f136897a;
            if (arrayList != null && arrayList.size() > 0) {
                imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) n1Var.f136897a.get(0);
            }
            n1Var.b(2, imageQBarDataBean);
            try {
                boolean e19 = n1Var.e();
                zg0.q3 q3Var2 = (zg0.q3) i95.n0.c(zg0.q3.class);
                android.content.Context c18 = n1Var.c();
                java.lang.String a18 = com.tencent.xweb.d.g().a(str);
                ((yg0.s4) q3Var2).getClass();
                com.tencent.mm.pluginsdk.ui.tools.e9.m(c18, str, "", a18, e19, null);
                return;
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "save to sdcard failed : %s", e27.getMessage());
                return;
            }
        }
        if (itemId == 3) {
            n1Var.b(3, null);
            try {
                boolean e28 = n1Var.e();
                java.lang.String replaceAll = str.replaceAll("tp=webp", "");
                zg0.q3 q3Var3 = (zg0.q3) i95.n0.c(zg0.q3.class);
                android.content.Context c19 = n1Var.c();
                java.lang.String a19 = com.tencent.xweb.d.g().a(replaceAll);
                com.tencent.mm.plugin.finder.webview.t0 t0Var = new com.tencent.mm.plugin.finder.webview.t0(n1Var);
                ((yg0.s4) q3Var3).getClass();
                com.tencent.mm.pluginsdk.ui.tools.e9.h(c19, replaceAll, a19, e28, t0Var);
                return;
            } catch (java.lang.Exception e29) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e29.getMessage());
                return;
            }
        }
        if (itemId != 5) {
            return;
        }
        n1Var.b(7, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic mResultOfImageUrl nil");
            return;
        }
        try {
            boolean e37 = n1Var.e();
            zg0.q3 q3Var4 = (zg0.q3) i95.n0.c(zg0.q3.class);
            android.content.Context context = n1Var.f().getContext();
            java.lang.String a27 = com.tencent.xweb.d.g().a(str);
            com.tencent.mm.plugin.finder.webview.u0 u0Var = new com.tencent.mm.plugin.finder.webview.u0(n1Var);
            ((yg0.s4) q3Var4).getClass();
            com.tencent.mm.pluginsdk.ui.tools.e9.h(context, str, a27, e37, u0Var);
        } catch (java.lang.Exception e38) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic Exception:%s", e38.getLocalizedMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic");
    }
}
