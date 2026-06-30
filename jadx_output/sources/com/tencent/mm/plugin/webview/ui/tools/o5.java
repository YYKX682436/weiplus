package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class o5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.b5 f186729d;

    public o5(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var) {
        this.f186729d = b5Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = this.f186729d;
        boolean p17 = b5Var.p();
        try {
            z17 = b5Var.f183947o.getController().A.lb();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "get has setuin failed : %s", e17.getMessage());
            z17 = false;
        }
        boolean z18 = (b5Var.f183947o.getController().R.b().f192177d & 16384) > 0;
        boolean z19 = (b5Var.f183947o.getController().R.b().f192177d & 32768) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!p17) {
            if (z17 && z18) {
                arrayList.add(new com.tencent.mm.plugin.webview.ui.tools.x5(1, b5Var.l().getString(com.tencent.mm.R.string.hr_)));
            }
            arrayList.add(new com.tencent.mm.plugin.webview.ui.tools.x5(2, b5Var.l().getString(com.tencent.mm.R.string.i8c)));
            if (z17 && z19) {
                arrayList.add(new com.tencent.mm.plugin.webview.ui.tools.x5(3, b5Var.l().getString(com.tencent.mm.R.string.hjg)));
            }
            if (!((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
                if (((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(7, 8)) {
                    arrayList.add(new com.tencent.mm.plugin.webview.ui.tools.x5(6, ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(7, 8)));
                    ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(7, 8, tg0.e1.f419061d);
                } else {
                    arrayList.add(new com.tencent.mm.plugin.webview.ui.tools.x5(5, b5Var.l().getString(com.tencent.mm.R.string.hku)));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                try {
                    bundle.putString("web_search_data_ui_image_path", b5Var.f183934b);
                    bundle.putString("web_search_data_ui_image_path_origin_url", b5Var.f183941i);
                    b5Var.f183947o.getController().A.ng(54, bundle, b5Var.f183947o.getController().U());
                } catch (android.os.RemoteException e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic exp:%s", e18.getLocalizedMessage());
                }
            }
        }
        java.util.ArrayList arrayList2 = b5Var.f183933a;
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(arrayList2);
        kd0.p2 p2Var = b5Var.f183939g;
        if (!L0) {
            arrayList.add(new com.tencent.mm.plugin.webview.ui.tools.x5(4, ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).m(arrayList2)));
        }
        b5Var.f183938f.o(null);
        g4Var.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.tencent.mm.plugin.webview.ui.tools.x5 x5Var = (com.tencent.mm.plugin.webview.ui.tools.x5) arrayList.get(i17);
            int i18 = x5Var.f187667a;
            if (i18 == 4) {
                android.view.View c17 = ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).c(new com.tencent.mm.plugin.webview.ui.tools.s5(b5Var), arrayList2, null, 7);
                b5Var.f183938f.o(c17);
                if (c17 instanceof com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) {
                    if (arrayList.size() > 1) {
                        ((com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) c17).setTopPaddingVisibility(0);
                    } else {
                        ((com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) c17).setTopPaddingVisibility(8);
                    }
                }
            } else {
                g4Var.f(i18, x5Var.f187668b);
            }
        }
    }
}
