package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI f187638d;

    public x1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI sDKOAuthOtherUI) {
        this.f187638d = sDKOAuthOtherUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hy4.b bVar = hy4.b.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI sDKOAuthOtherUI = this.f187638d;
        bVar.a(sDKOAuthOtherUI.f183700g, sDKOAuthOtherUI.f183705o, 0, sDKOAuthOtherUI.f183708r, 4, 1, 0);
        sDKOAuthOtherUI.f183697d.d(-2, sDKOAuthOtherUI.f183710t, sDKOAuthOtherUI.f183712v, sDKOAuthOtherUI.f183714x, sDKOAuthOtherUI.f183711u);
        sDKOAuthOtherUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
