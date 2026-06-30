package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184429d;

    public h2(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184429d = fTSSOSHomeWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184429d;
        java.lang.String str = fTSSOSHomeWebViewUI.B3;
        java.lang.String str2 = fTSSOSHomeWebViewUI.f184304s5;
        int i17 = fTSSOSHomeWebViewUI.Y3;
        java.lang.String str3 = (fTSSOSHomeWebViewUI.J4.getClearBtn() == null || fTSSOSHomeWebViewUI.J4.getClearBtn().getVisibility() != 0) ? "" : "1";
        android.widget.ImageView imageView = fTSSOSHomeWebViewUI.O4;
        if (imageView != null && imageView.getVisibility() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str3);
            sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(str3) ? "" : "#");
            sb6.append("2");
            str3 = sb6.toString();
        }
        if (fTSSOSHomeWebViewUI.J4.getSearchDone() != null && fTSSOSHomeWebViewUI.J4.getSearchDone().getVisibility() == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str3);
            sb7.append(com.tencent.mm.sdk.platformtools.t8.K0(str3) ? "" : "#");
            sb7.append("3");
            str3 = sb7.toString();
        }
        android.widget.TextView textView = fTSSOSHomeWebViewUI.f184289d5;
        if (textView != null && textView.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "getFeatureInfo, show hide searchtitle.");
        } else if (fTSSOSHomeWebViewUI.J4.getSearchBarCancelTextContainer() != null && fTSSOSHomeWebViewUI.J4.getSearchBarCancelTextContainer().getVisibility() == 0 && fTSSOSHomeWebViewUI.J4.getCancelTextView() != null && fTSSOSHomeWebViewUI.J4.getCancelTextView().getVisibility() == 0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str3);
            sb8.append(com.tencent.mm.sdk.platformtools.t8.K0(str3) ? "" : "#");
            sb8.append(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
            str3 = sb8.toString();
        }
        if (fTSSOSHomeWebViewUI.J4.getVoiceImageButton() != null && fTSSOSHomeWebViewUI.J4.getVoiceImageButton().getVisibility() == 0) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str3);
            sb9.append(com.tencent.mm.sdk.platformtools.t8.K0(str3) ? "" : "#");
            sb9.append("2001");
            str3 = sb9.toString();
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.ha(str, str2, "", 2, i17, 1, str3, 0L, "");
    }
}
