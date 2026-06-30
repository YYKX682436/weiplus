package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class qb implements com.tencent.mm.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186779a;

    public qb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186779a = webViewUI;
    }

    @Override // com.tencent.mm.ui.e8
    public void a(int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186779a;
        if (webViewUI.B1 && webViewUI.isPaused()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUI", "onKeyBoardStateChange, is isPaused, state = " + i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "onKeyBoardStateChange, state = " + i17);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = this.f186779a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = webViewUI2.f183865w;
        com.tencent.mm.plugin.webview.core.e3 e3Var = webViewUI2.L1;
        if (e3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard dispatchKeyboardStateChange controller == null");
        } else if (!e3Var.B0.contains(java.lang.Integer.valueOf(e3Var.f181953s0))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard dispatchKeyboardStateChange hasCurrentPageFinished");
        } else if (i17 == -3) {
            webViewUI2.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.rb(webViewUI2, webViewKeyboardLinearLayout.getKeyBoardHeight(), webViewUI2.F.getInputContainerHeight()));
        } else if (!webViewUI2.isPaused()) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = webViewUI2.F.f187296h;
            if (chatFooterPanel == null || chatFooterPanel.getVisibility() == 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard hide dispatchKeyboardStateChange");
                com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = webViewUI2.F;
                webViewRedesignInputFooter.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewInputFooter", "hideInputFooterOnly");
                android.view.View view = webViewRedesignInputFooter.f187294f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideInputFooterOnly", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideInputFooterOnly", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                webViewRedesignInputFooter.setVisibility(8);
                java.lang.String obj = (webViewRedesignInputFooter.f187307v == null || (mMEditText = webViewRedesignInputFooter.f187300o) == null) ? "" : mMEditText.getText().toString();
                webViewRedesignInputFooter.f187295g = 0;
                webViewRedesignInputFooter.c(true);
                webViewRedesignInputFooter.e();
                ey4.u uVar = webViewRedesignInputFooter.f187292d;
                if (uVar != null) {
                    ((com.tencent.mm.plugin.webview.ui.tools.ua) uVar).a(obj);
                }
            } else {
                webViewUI2.Q2.post(new com.tencent.mm.plugin.webview.ui.tools.sb(webViewUI2, webViewUI2.F.getSmilePanelHeight(), webViewUI2.F.getInputContainerHeight()));
            }
        }
        if (i17 == -3) {
            com.tencent.mm.plugin.webview.core.e3 e3Var2 = this.f186779a.L1;
            if (e3Var2 != null) {
                e3Var2.O0(1);
            }
            this.f186779a.f183835m2.h().f183035t = 1;
            int keyBoardHeight = this.f186779a.f183865w.getKeyBoardHeight();
            if (keyBoardHeight > 0) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI.W6(this.f186779a, keyBoardHeight);
                this.f186779a.F.f(keyBoardHeight, true);
            }
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI3 = this.f186779a;
            dy4.l lVar = webViewUI3.E1;
            lVar.getClass();
            cy4.e eVar = lVar.f244684g;
            if (eVar != null) {
                if (eVar.f224867b != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new cy4.c(eVar, webViewUI3));
                }
            }
            com.tencent.mm.plugin.webview.model.h4 i18 = this.f186779a.f183835m2.i();
            if (i18.f182920e < 0 || java.lang.System.currentTimeMillis() - i18.f182920e >= 500) {
                i18.f182920e = java.lang.System.currentTimeMillis();
                i18.d(hy4.a0.f286079o);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "keyboard kbListener onKeyBoardStateChange");
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI.W6(this.f186779a, 0);
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI4 = this.f186779a;
            cy4.e eVar2 = webViewUI4.E1.f244684g;
            if (eVar2 != null) {
                if ((eVar2.f224867b != null) && eVar2.f224876k) {
                    ((ku5.t0) ku5.t0.f312615d).B(new cy4.d(eVar2, webViewUI4));
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI5 = this.f186779a;
        com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout2 = webViewUI5.f183865w;
        if (i17 == -3 && webViewUI5.f183868x0 != null && (wVar = webViewUI5.f183876z1) != null) {
            wVar.b().getClass();
        }
        this.f186779a.f183853r3 = i17;
    }
}
