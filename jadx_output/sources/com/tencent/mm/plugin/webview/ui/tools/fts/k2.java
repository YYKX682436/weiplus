package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class k2 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.o2 f184493e;

    public k2(com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var, com.tencent.mm.plugin.webview.ui.tools.fts.t1 t1Var) {
        this.f184493e = o2Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        super.a();
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184493e.f184567n;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "setInitStatus originInputX:%f, currentInputX:%f isPageLoadFinish:%b isWebViewPreloaded:%b", java.lang.Float.valueOf(fTSSOSHomeWebViewUI.f184293h5), java.lang.Float.valueOf(fTSSOSHomeWebViewUI.F4.getX()), java.lang.Boolean.valueOf(fTSSOSHomeWebViewUI.X4), java.lang.Boolean.valueOf(fTSSOSHomeWebViewUI.A3));
        float f17 = fTSSOSHomeWebViewUI.f184293h5;
        if (f17 > 0.0f) {
            fTSSOSHomeWebViewUI.F4.setX(f17);
        }
        float f18 = fTSSOSHomeWebViewUI.f184294i5;
        if (f18 > 0.0f) {
            fTSSOSHomeWebViewUI.F4.setY(f18);
        }
        android.view.View view = fTSSOSHomeWebViewUI.F4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fTSSOSHomeWebViewUI.f184296k5.setBackgroundColor(fTSSOSHomeWebViewUI.getResources().getColor(com.tencent.mm.R.color.aac));
        android.view.View view2 = fTSSOSHomeWebViewUI.Z4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI", "setInitStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fTSSOSHomeWebViewUI.Ra(8);
        if (fp.h.c(23)) {
            fTSSOSHomeWebViewUI.C9(fTSSOSHomeWebViewUI.getResources().getColor(com.tencent.mm.R.color.aac));
        }
        fTSSOSHomeWebViewUI.J4.setClearBtnVisable(8);
        fTSSOSHomeWebViewUI.J4.g();
        fTSSOSHomeWebViewUI.F4.setPadding(0, 0, 0, 0);
        fTSSOSHomeWebViewUI.f184245b4 = 0;
        fTSSOSHomeWebViewUI.A5 = "";
        fTSSOSHomeWebViewUI.ra();
        fTSSOSHomeWebViewUI.J4.d();
        fTSSOSHomeWebViewUI.J4.setHint(fTSSOSHomeWebViewUI.ia());
        fTSSOSHomeWebViewUI.J4.setSearchBarCancelTextContainerVisibile(8);
        fTSSOSHomeWebViewUI.J4.setCommonRightImageButtonVisibile(0);
        fTSSOSHomeWebViewUI.Ma(8);
        com.tencent.mm.ui.widget.MMWebView mMWebView = fTSSOSHomeWebViewUI.f183815f;
        if (mMWebView != null) {
            android.view.View view3 = mMWebView.getView();
            view3.setOnTouchListener(new com.tencent.mm.plugin.webview.ui.tools.fts.i1(fTSSOSHomeWebViewUI, view3));
        }
        fTSSOSHomeWebViewUI.Ta(true);
    }

    @Override // k75.b, k75.c
    public void b() {
        super.b();
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184493e.f184567n;
        fTSSOSHomeWebViewUI.f184296k5.setBackgroundColor(fTSSOSHomeWebViewUI.getResources().getColor(com.tencent.mm.R.color.a9e));
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var = com.tencent.mm.plugin.webview.ui.tools.fts.u4.Search;
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184493e;
        if (i17 != 0) {
            if (i17 == 1) {
                o2Var.f184567n.J4.f();
                o2Var.f184567n.f184291f5.a(u4Var);
                com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, u4Var);
                o2Var.f184567n.F4.setBackgroundResource(com.tencent.mm.R.color.aaw);
            } else if (i17 == 3) {
                o2Var.f184567n.V4 = true;
                o2Var.o(o2Var.f184564h);
            } else if (i17 == 4) {
                o2Var.f184567n.V4 = true;
                o2Var.o(o2Var.f184565i);
            } else if (i17 != 5) {
                if (i17 != 13) {
                    if (i17 == 14) {
                        o2Var.f184567n.J4.f();
                        o2Var.f184567n.J4.d();
                        o2Var.f184567n.f184290e5.a(u4Var, false);
                        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, u4Var);
                        o2Var.f184567n.F4.setBackgroundResource(com.tencent.mm.R.color.aaw);
                        o2Var.o(o2Var.f184565i);
                        o2Var.f184567n.V4 = true;
                    }
                }
            } else if (o2Var.f184567n.J4.getEditText().hasFocus() && o2Var.f184567n.P9().length() == 0) {
                o2Var.f184567n.J4.f();
                o2Var.f184567n.F4.setBackgroundResource(com.tencent.mm.R.color.aaw);
                o2Var.f184567n.J4.setSearchBarCancelTextContainerVisibile(8);
                o2Var.f184567n.f184291f5.a(u4Var);
                com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, u4Var);
                o2Var.f184567n.o9(new com.tencent.mm.plugin.webview.ui.tools.fts.j2(this));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(o2Var.f184567n.Y3), 3, o2Var.f184567n.J4.getInEditTextQuery(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(o2Var.f184567n.f184245b4));
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i("LogStateTransitionState", "InitState processMessage = %d.", java.lang.Integer.valueOf(i17));
        if (o2Var.f184567n.P9().length() > 0) {
            o2Var.f184567n.J4.d();
            o2Var.f184567n.f184290e5.a(u4Var, true);
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, u4Var);
            o2Var.f184567n.F4.setBackgroundResource(com.tencent.mm.R.color.aaw);
        }
        return false;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "InitSate";
    }
}
