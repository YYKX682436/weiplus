package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class n2 extends k75.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.o2 f184536e;

    public n2(com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var, com.tencent.mm.plugin.webview.ui.tools.fts.t1 t1Var) {
        this.f184536e = o2Var;
    }

    @Override // k75.b, k75.c
    public void a() {
        super.a();
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184536e;
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = o2Var.f184567n;
        int i17 = com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.R5;
        fTSSOSHomeWebViewUI.Ta(true);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI2 = o2Var.f184567n;
        fTSSOSHomeWebViewUI2.F4.setPadding(fTSSOSHomeWebViewUI2.f184302q5, 0, 0, 0);
        o2Var.f184567n.F4.setX(0.0f);
        o2Var.f184567n.F4.setY(0.0f);
        o2Var.f184567n.J4.setSearchBarCancelTextContainerVisibile(8);
        if (!o2Var.f184567n.Da()) {
            o2Var.f184567n.J4.setCommonRightImageButtonVisibile(8);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(o2Var.f184567n.P9())) {
            o2Var.f184567n.J4.setCommonRightBtnForceHide(true);
            o2Var.f184567n.J4.setCommonRightImageButtonVisibile(8);
        } else {
            o2Var.f184567n.J4.setCommonRightBtnForceHide(false);
            o2Var.f184567n.J4.setCommonRightImageButtonVisibile(0);
        }
        o2Var.f184567n.Ma(0);
        o2Var.f184567n.Ra(0);
        if (!o2Var.f184567n.J4.k()) {
            o2Var.f184567n.J4.m();
            o2Var.f184567n.showVKB();
        }
        if (fp.h.c(23)) {
            u75.d.g();
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI3 = o2Var.f184567n;
            fTSSOSHomeWebViewUI3.C9(fTSSOSHomeWebViewUI3.getResources().getColor(com.tencent.mm.R.color.aaw));
        }
        if (android.text.TextUtils.isEmpty(o2Var.f184567n.N9())) {
            return;
        }
        o2Var.f184567n.J4.r();
    }

    @Override // k75.b, k75.c
    public void b() {
        super.b();
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184536e;
        o2Var.f184567n.T9(java.lang.Boolean.FALSE);
        o2Var.f184567n.Ma(8);
    }

    @Override // k75.c
    public boolean c(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.plugin.webview.ui.tools.fts.o2 o2Var = this.f184536e;
        if (i17 == 0 || i17 == 11) {
            com.tencent.mars.xlog.Log.i("LogStateTransitionState", "SearchWithFocusState processMessage = %d.", java.lang.Integer.valueOf(i17));
            if (o2Var.f184567n.P9().length() <= 0) {
                return false;
            }
            o2Var.o(o2Var.f184565i);
            return false;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = o2Var.f184567n;
            if (fTSSOSHomeWebViewUI.K4) {
                fTSSOSHomeWebViewUI.finish();
                return false;
            }
            com.tencent.mm.plugin.webview.ui.tools.fts.c5 c5Var = fTSSOSHomeWebViewUI.f184291f5;
            com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var = com.tencent.mm.plugin.webview.ui.tools.fts.u4.Init;
            c5Var.a(u4Var);
            com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.wa(o2Var.f184567n, u4Var);
            return false;
        }
        if (i17 == 3 || i17 == 4) {
            o2Var.o(o2Var.f184563g);
            return false;
        }
        if (i17 != 5) {
            return false;
        }
        if (o2Var.f184567n.J4.getEditText().hasFocus()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15521, java.lang.Integer.valueOf(o2Var.f184567n.Y3), 2, o2Var.f184567n.J4.getInEditTextQuery(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(o2Var.f184567n.f184245b4));
            return false;
        }
        o2Var.o(o2Var.f184565i);
        return false;
    }

    @Override // k75.c, k75.a
    public java.lang.String getName() {
        return "SearchWithFocusState";
    }
}
