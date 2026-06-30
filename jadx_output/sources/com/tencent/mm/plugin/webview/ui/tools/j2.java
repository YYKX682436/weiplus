package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f184851d;

    public j2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI) {
        this.f184851d = sDKOAuthUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "showQRCodeOauthExceptionConfirm, cancel login");
        int i17 = com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.f183717J;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f184851d;
        sDKOAuthUI.U6(-4);
        sDKOAuthUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
