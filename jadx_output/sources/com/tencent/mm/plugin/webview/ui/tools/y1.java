package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI f187686d;

    public y1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI sDKOAuthOtherUI, int i17, int i18) {
        this.f187686d = sDKOAuthOtherUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hy4.b bVar = hy4.b.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI sDKOAuthOtherUI = this.f187686d;
        bVar.a(sDKOAuthOtherUI.f183700g, sDKOAuthOtherUI.f183705o, 1, sDKOAuthOtherUI.f183708r, 4, 1, 0);
        sDKOAuthOtherUI.T6(true);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
