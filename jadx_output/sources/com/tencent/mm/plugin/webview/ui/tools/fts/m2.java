package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class m2 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.o2 f184521e;

    public m2(com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var, com.tencent.mm.plugin.webview.ui.tools.fts.t1 t1Var) {
        this.f184521e = o2Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        super.a();
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184521e;
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = o2Var.f184567n;
        fTSSOSHomeWebViewUI.F4.setPadding(fTSSOSHomeWebViewUI.f184302q5, 0, 0, 0);
        o2Var.f184567n.F4.setX(0.0f);
        o2Var.f184567n.F4.setY(0.0f);
        o2Var.f184567n.J4.f();
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = o2Var.f184567n;
        if (!fTSSOSHomeWebViewUI2.f184307v5) {
            android.view.View view = fTSSOSHomeWebViewUI2.f184295j5;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchWithFocusNoResultState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$SosHomeStateMachine$SearchWithFocusNoResultState", "enter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        o2Var.f184567n.Ra(0);
        o2Var.f184567n.J4.setSearchBarCancelTextContainerVisibile(0);
        o2Var.f184567n.J4.setCommonRightImageButtonVisibile(0);
        o2Var.f184567n.Ma(8);
    }

    @Override // k75.b, k75.c
    public void b() {
        super.b();
        this.f184521e.f184567n.T9(java.lang.Boolean.FALSE);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184521e;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("LogStateTransitionState", "SearchWithFocusState processMessage = MSG_SEARCH_KEY_DOWN.");
            if (o2Var.f184567n.P9().length() <= 0) {
                return false;
            }
            o2Var.f184567n.J4.f();
            o2Var.f184567n.J4.d();
            o2Var.o(o2Var.f184565i);
            return false;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = o2Var.f184567n;
            if (fTSSOSHomeWebViewUI.K4) {
                fTSSOSHomeWebViewUI.finish();
                return false;
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.e5 e5Var = fTSSOSHomeWebViewUI.f184292g5;
            com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var = com.tencent.mm.plugin.webview.ui.tools.fts.u4.Init;
            if (u4Var != e5Var.f184691q) {
                e5Var.a();
                e5Var.f184691q = u4Var;
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, u4Var);
            return false;
        }
        if (i17 == 5) {
            if (!o2Var.f184567n.J4.getEditText().hasFocus()) {
                return false;
            }
            o2Var.o(o2Var.f184564h);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(o2Var.f184567n.Y3), 2, o2Var.f184567n.J4.getInEditTextQuery(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(o2Var.f184567n.f184245b4));
            return false;
        }
        if (i17 == 9) {
            o2Var.o(o2Var.f184563g);
            return false;
        }
        if (i17 != 10 || o2Var.f184567n.P9().length() <= 0) {
            return false;
        }
        o2Var.o(o2Var.f184565i);
        return false;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "SearchWithFocusNoResultState";
    }
}
