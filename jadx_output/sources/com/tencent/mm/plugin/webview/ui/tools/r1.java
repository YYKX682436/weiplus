package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI f186796d;

    public r1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI sDKOAuthGetA8KeyUI) {
        this.f186796d = sDKOAuthGetA8KeyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthGetA8KeyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI.f183689n;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI sDKOAuthGetA8KeyUI = this.f186796d;
        sDKOAuthGetA8KeyUI.U6();
        sDKOAuthGetA8KeyUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthGetA8KeyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
