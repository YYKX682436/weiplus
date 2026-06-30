package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class p5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f186749e;

    public p5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, java.lang.String str) {
        this.f186749e = b5Var;
        this.f186748d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = null;
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f186749e;
        if (itemId == 1) {
            com.tencent.mm.plugin.webview.ui.tools.b5.b(b5Var, 1, null);
            java.lang.String str = this.f186748d;
            boolean k17 = b5Var.k();
            try {
                r01.h0 h17 = b5Var.h();
                if (h17.f368094b) {
                    com.tencent.mm.pluginsdk.ui.tools.e9.g(b5Var.l(), str, b5Var.f183941i, com.tencent.xweb.d.g().a(str), k17, new com.tencent.mm.plugin.webview.ui.tools.u5(b5Var), new com.tencent.mm.plugin.webview.ui.tools.c5(b5Var, h17, str));
                } else {
                    com.tencent.mm.pluginsdk.ui.tools.e9.f(b5Var.l(), str, b5Var.f183941i, com.tencent.xweb.d.g().a(str), k17, new com.tencent.mm.plugin.webview.ui.tools.d5(b5Var));
                }
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
                return;
            }
        }
        if (itemId == 2) {
            java.util.ArrayList arrayList = b5Var.f183933a;
            if (arrayList != null && arrayList.size() > 0) {
                imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) b5Var.f183933a.get(0);
            }
            com.tencent.mm.plugin.webview.ui.tools.b5.b(b5Var, 2, imageQBarDataBean);
            java.lang.String str2 = this.f186748d;
            try {
                boolean k18 = b5Var.k();
                r01.h0 h18 = b5Var.h();
                if (h18.f368094b) {
                    com.tencent.mm.pluginsdk.ui.tools.e9.m(b5Var.l(), str2, b5Var.f183941i, com.tencent.xweb.d.g().a(str2), k18, new com.tencent.mm.plugin.webview.ui.tools.e5(b5Var, h18, str2));
                } else {
                    com.tencent.mm.pluginsdk.ui.tools.e9.m(b5Var.l(), str2, b5Var.f183941i, com.tencent.xweb.d.g().a(str2), k18, null);
                }
                return;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "save to sdcard failed : %s", e18.getMessage());
                return;
            }
        }
        java.lang.String str3 = this.f186748d;
        if (itemId != 3) {
            if (itemId == 5) {
                com.tencent.mm.plugin.webview.ui.tools.b5.b(b5Var, 7, null);
                com.tencent.mm.plugin.webview.ui.tools.b5.c(b5Var, str3, java.lang.Boolean.FALSE);
                return;
            } else {
                if (itemId != 6) {
                    return;
                }
                com.tencent.mm.plugin.webview.ui.tools.b5.b(b5Var, 7, null);
                com.tencent.mm.plugin.webview.ui.tools.b5.c(b5Var, str3, java.lang.Boolean.TRUE);
                return;
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.b5.b(b5Var, 3, null);
        try {
            boolean k19 = b5Var.k();
            java.lang.String replaceAll = str3.replaceAll("tp=webp", "");
            r01.h0 h19 = b5Var.h();
            if (h19.f368094b) {
                com.tencent.mm.pluginsdk.ui.tools.e9.g(b5Var.l(), replaceAll, b5Var.f183941i, com.tencent.xweb.d.g().a(replaceAll), k19, new com.tencent.mm.plugin.webview.ui.tools.f5(b5Var), new com.tencent.mm.plugin.webview.ui.tools.g5(b5Var, h19, str3));
            } else {
                com.tencent.mm.pluginsdk.ui.tools.e9.f(b5Var.l(), replaceAll, b5Var.f183941i, com.tencent.xweb.d.g().a(replaceAll), k19, new com.tencent.mm.plugin.webview.ui.tools.h5(b5Var));
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e19.getMessage());
        }
    }
}
