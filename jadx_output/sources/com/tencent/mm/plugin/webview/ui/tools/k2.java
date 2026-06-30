package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes11.dex */
public class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dg5 f185600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f185601e;

    public k2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI, r45.dg5 dg5Var) {
        this.f185601e = sDKOAuthUI;
        this.f185600d = dg5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "showQRCodeOauthExceptionConfirm, continue login");
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f185601e;
        android.view.View view2 = sDKOAuthUI.f183727p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sDKOAuthUI.e7(0, 0, "", com.tencent.mm.plugin.webview.model.j3.c(this.f185600d));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
