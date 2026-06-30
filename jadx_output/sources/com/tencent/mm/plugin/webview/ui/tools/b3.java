package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI f183923d;

    public b3(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI sDKOAuthWechatUI) {
        this.f183923d = sDKOAuthWechatUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f183923d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI$initMyView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
