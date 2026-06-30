package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class SosWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public static final /* synthetic */ int K3 = 0;
    public boolean A3 = false;
    public int B3 = 0;
    public int C3 = 0;
    public int D3 = 0;
    public java.lang.String E3 = "";
    public final com.tencent.mm.autogen.mmdata.rpt.FTSRelatedSugH5ReportStruct F3 = new com.tencent.mm.autogen.mmdata.rpt.FTSRelatedSugH5ReportStruct();
    public boolean G3 = false;
    public int H3 = 0;
    public final com.tencent.mm.sdk.platformtools.n3 I3 = new com.tencent.mm.plugin.webview.ui.tools.fts.h5(this, android.os.Looper.getMainLooper());
    public final com.tencent.mm.plugin.webview.ui.tools.fts.j5 J3 = new com.tencent.mm.plugin.webview.ui.tools.fts.j5(this);

    public static void m9(com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI sosWebViewUI, java.lang.String str, int i17) {
        java.lang.String[] split;
        if (sosWebViewUI.A3 || sosWebViewUI.B3 == 0) {
            return;
        }
        sosWebViewUI.A3 = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(sosWebViewUI.N) || !sosWebViewUI.N.startsWith("wes") || (split = sosWebViewUI.N.split("#")) == null || split.length < 5) {
            return;
        }
        if (sosWebViewUI.D3 == 0) {
            sosWebViewUI.D3 = 200;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("deadlinks=1&scene=");
        stringBuffer.append(sosWebViewUI.B3);
        stringBuffer.append("&searchid=");
        stringBuffer.append(split[1]);
        stringBuffer.append("&businesstype=");
        stringBuffer.append(split[2]);
        stringBuffer.append("&docid=");
        stringBuffer.append(split[3]);
        stringBuffer.append("&subtype=");
        stringBuffer.append(sosWebViewUI.C3);
        stringBuffer.append("&contentlength=");
        stringBuffer.append(str.length());
        stringBuffer.append("&status=");
        stringBuffer.append(sosWebViewUI.D3);
        stringBuffer.append("&httpstatus=");
        stringBuffer.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "reportHtmlStatus %s", stringBuffer.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("reportString", stringBuffer.toString());
        try {
            sosWebViewUI.K1.U6(8, bundle);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.SosWebViewUI", e17, "reportHtmlStatus", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public com.tencent.mm.plugin.webview.core.e3 e7() {
        com.tencent.mm.plugin.webview.core.e3 e76 = super.e7();
        e76.E(this.J3);
        return e76;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean l7() {
        return !getIntent().getBooleanExtra("disable_minimize", false);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f183815f.addJavascriptInterface(new com.tencent.mm.plugin.webview.ui.tools.fts.k5(this), "SosJSApi");
        this.B3 = getIntent().getIntExtra("from_scence", 0);
        this.C3 = getIntent().getIntExtra("subtype", 0);
        this.E3 = getIntent().getStringExtra("rawUrl");
        java.lang.String stringExtra = getIntent().getStringExtra("key_init_url");
        boolean z17 = stringExtra != null;
        this.G3 = z17;
        if (z17) {
            long c17 = c01.id.c();
            com.tencent.mm.autogen.mmdata.rpt.FTSRelatedSugH5ReportStruct fTSRelatedSugH5ReportStruct = this.F3;
            fTSRelatedSugH5ReportStruct.f56138e = c17;
            fTSRelatedSugH5ReportStruct.f56140g = fTSRelatedSugH5ReportStruct.b("InitUrl", stringExtra.replace(",", "!"), true);
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_search_query");
            fTSRelatedSugH5ReportStruct.f56137d = fTSRelatedSugH5ReportStruct.b("Query", stringExtra2 == null ? "" : stringExtra2.replace(",", "!"), true);
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f183815f.removeJavascriptInterface("SosJSApi");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.L1;
        com.tencent.mm.plugin.webview.ui.tools.fts.j5 j5Var = this.J3;
        e3Var.M0(j5Var);
        this.L1.K0(j5Var.f184478b);
        if (this.G3) {
            long activityBrowseTimeMs = getActivityBrowseTimeMs();
            com.tencent.mm.autogen.mmdata.rpt.FTSRelatedSugH5ReportStruct fTSRelatedSugH5ReportStruct = this.F3;
            fTSRelatedSugH5ReportStruct.f56139f = activityBrowseTimeMs;
            fTSRelatedSugH5ReportStruct.f56141h = this.H3;
            fTSRelatedSugH5ReportStruct.k();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosWebViewUI", "FTSRelatedSugH5ReportStruct.report url : %s, enterTime : %d, stayTime : %d, getQuery : %s ,id : %d, pageChangeCount : %d.", fTSRelatedSugH5ReportStruct.f56140g, java.lang.Long.valueOf(fTSRelatedSugH5ReportStruct.f56138e), java.lang.Long.valueOf(fTSRelatedSugH5ReportStruct.f56139f), fTSRelatedSugH5ReportStruct.f56137d, 22251, java.lang.Integer.valueOf(this.H3));
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void x8(com.tencent.xweb.WebView webView, java.lang.String str) {
        super.x8(webView, str);
        if (this.G3) {
            this.H3++;
        }
    }
}
