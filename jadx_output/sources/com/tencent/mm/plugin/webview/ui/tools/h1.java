package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI f184785d;

    public h1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI) {
        this.f184785d = sDKOAuthAppDataUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hy4.b bVar = hy4.b.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI = this.f184785d;
        bVar.a(sDKOAuthAppDataUI.f183652g, sDKOAuthAppDataUI.f183656n, 1, sDKOAuthAppDataUI.f183660r, 5, 1, 0);
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI.T6(sDKOAuthAppDataUI, true);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
