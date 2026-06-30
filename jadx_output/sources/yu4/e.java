package yu4;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f465869d;

    public e(yu4.k kVar) {
        this.f465869d = kVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        yu4.k kVar = this.f465869d;
        yu4.n nVar = kVar.f465886n;
        if (nVar != null) {
            com.tencent.mars.xlog.Log.i(nVar.f465898g, "dismiss dialog");
            com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = nVar.f465900i;
            java.lang.String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
            r45.xi0 xi0Var = nVar.f465896e;
            xi0Var.f390120i = inEditTextQuery;
            fTSEditTextView.d();
            fTSEditTextView.h();
            org.json.JSONObject json = xi0Var.toJSON();
            com.tencent.mm.view.manager.d dVar = ((com.tencent.mm.view.manager.e) nVar.f465897f).f213655a;
            com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = dVar.C;
            if (v9Var != null) {
                v9Var.a(false, 0);
            }
            java.lang.Runnable runnable = dVar.M;
            if (runnable != null) {
                runnable.run();
                dVar.M = null;
            }
            com.tencent.mm.autogen.mmdata.rpt.MessagePanelEmoticonSearchButtonClickReportStruct messagePanelEmoticonSearchButtonClickReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MessagePanelEmoticonSearchButtonClickReportStruct();
            messagePanelEmoticonSearchButtonClickReportStruct.f59187d = messagePanelEmoticonSearchButtonClickReportStruct.b("SessionId", json.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID), true);
            messagePanelEmoticonSearchButtonClickReportStruct.f59189f = 99L;
            messagePanelEmoticonSearchButtonClickReportStruct.f59191h = java.lang.System.currentTimeMillis();
            messagePanelEmoticonSearchButtonClickReportStruct.k();
            ((xu4.e) ((ur.m) i95.n0.c(ur.m.class))).wi();
            nVar.f465902n.e();
            if (nVar.f465904p) {
                nVar.a().setBackgroundColor(0);
                nVar.a().getBackground().setAlpha(0);
                nVar.a().getSettings().B(0);
            }
            nVar.a().removeJavascriptInterface("emojiWebSearchJSApi");
            nVar.a().destroy();
        }
        yu4.o oVar = kVar.f465887o;
        if (oVar != null) {
            oVar.f465911i.e();
            boolean z17 = oVar.f465913n;
            com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView = oVar.f465912m;
            if (z17) {
                webSearchWebView.getSettings().B(0);
            }
            webSearchWebView.removeJavascriptInterface("emojiWebSearchJSApi");
            webSearchWebView.destroy();
        }
    }
}
