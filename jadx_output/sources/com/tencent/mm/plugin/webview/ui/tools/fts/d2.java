package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184380d;

    public d2(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184380d = fTSSOSHomeWebViewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184380d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(fTSSOSHomeWebViewUI.f184246c4)) {
            fTSSOSHomeWebViewUI.f184261s4.put("query", fTSSOSHomeWebViewUI.N9());
        } else {
            fTSSOSHomeWebViewUI.f184261s4.put("query", fTSSOSHomeWebViewUI.f184246c4);
        }
        fTSSOSHomeWebViewUI.f184261s4.put("exittype", "5");
        fTSSOSHomeWebViewUI.oa();
        fTSSOSHomeWebViewUI.Q9();
        fTSSOSHomeWebViewUI.Ia(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
