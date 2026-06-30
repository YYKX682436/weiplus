package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class a3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI f183892d;

    public a3(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI sDKOAuthWechatUI) {
        this.f183892d = sDKOAuthWechatUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI sDKOAuthWechatUI = this.f183892d;
        android.os.Bundle extras = sDKOAuthWechatUI.getIntent().getExtras();
        android.content.Intent putExtras = extras != null ? new android.content.Intent().putExtras(extras) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOAuthWechatUI", "click agree!");
        j45.l.j(sDKOAuthWechatUI, "webview", ".ui.tools.SDKOAuthUI", putExtras, null);
        sDKOAuthWechatUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
