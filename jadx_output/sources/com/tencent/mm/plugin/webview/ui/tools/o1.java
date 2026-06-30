package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI f186723d;

    public o1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI sDKOAuthFriendUI) {
        this.f186723d = sDKOAuthFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hy4.b bVar = hy4.b.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI sDKOAuthFriendUI = this.f186723d;
        bVar.a(sDKOAuthFriendUI.f183671f, sDKOAuthFriendUI.f183677o, 0, sDKOAuthFriendUI.f183680r, sDKOAuthFriendUI.U6(), 1, 0);
        sDKOAuthFriendUI.f183669d.d(-2, sDKOAuthFriendUI.f183683u, sDKOAuthFriendUI.f183685w, sDKOAuthFriendUI.f183687y, sDKOAuthFriendUI.f183684v);
        sDKOAuthFriendUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
