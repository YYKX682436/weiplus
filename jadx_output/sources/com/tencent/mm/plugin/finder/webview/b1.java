package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class b1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.n1 f136850d;

    public b1(com.tencent.mm.plugin.finder.webview.n1 n1Var) {
        this.f136850d = n1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        com.tencent.mm.plugin.finder.webview.n1 n1Var = this.f136850d;
        n1Var.getClass();
        try {
            z17 = n1Var.f().getInvoke().lb();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "get has setuin failed : %s", e17.getMessage());
            z17 = false;
        }
        boolean z18 = (n1Var.f().getPerm().b().f192177d & 16384) > 0;
        boolean z19 = (n1Var.f().getPerm().b().f192177d & 32768) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17 && z18) {
            arrayList.add(new com.tencent.mm.plugin.finder.webview.i1(1, n1Var.f().getContext().getString(com.tencent.mm.R.string.hr_)));
        }
        arrayList.add(new com.tencent.mm.plugin.finder.webview.i1(2, n1Var.c().getString(com.tencent.mm.R.string.i8c)));
        if (z17 && z19) {
            arrayList.add(new com.tencent.mm.plugin.finder.webview.i1(3, n1Var.c().getString(com.tencent.mm.R.string.hjg)));
        }
        if (!((qk.s6) gm0.j1.s(qk.s6.class)).isTeenMode()) {
            arrayList.add(new com.tencent.mm.plugin.finder.webview.i1(5, n1Var.c().getString(com.tencent.mm.R.string.hku)));
            android.os.Bundle bundle = new android.os.Bundle();
            try {
                bundle.putString("web_search_data_ui_image_path", n1Var.f136898b);
                bundle.putString("web_search_data_ui_image_path_origin_url", n1Var.f136905i);
                n1Var.f().getInvoke().ng(54, bundle, ((com.tencent.mm.plugin.webview.core.r0) n1Var.f().getWebViewController()).U());
            } catch (android.os.RemoteException e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic exp:%s", e18.getLocalizedMessage());
            }
        }
        java.util.ArrayList arrayList2 = n1Var.f136897a;
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(arrayList2);
        kd0.p2 p2Var = n1Var.f136903g;
        if (!L0) {
            arrayList.add(new com.tencent.mm.plugin.finder.webview.i1(4, ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).m(arrayList2)));
        }
        n1Var.f136902f.o(null);
        g4Var.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.tencent.mm.plugin.finder.webview.i1 i1Var = (com.tencent.mm.plugin.finder.webview.i1) arrayList.get(i17);
            int i18 = i1Var.f136874a;
            if (i18 == 4) {
                android.view.View c17 = ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).c(new com.tencent.mm.plugin.finder.webview.f1(n1Var), arrayList2, null, 7);
                n1Var.f136902f.o(c17);
                if (c17 instanceof com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) {
                    if (arrayList.size() > 1) {
                        ((com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) c17).setTopPaddingVisibility(0);
                    } else {
                        ((com.tencent.mm.ui.widget.bottomsheet.ViewTitleWithAnimation) c17).setTopPaddingVisibility(8);
                    }
                }
            } else {
                g4Var.f(i18, i1Var.f136875b);
            }
        }
    }
}
