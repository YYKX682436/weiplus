package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.px4 f186765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI f186766e;

    public q1(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI sDKOAuthFriendUI, r45.px4 px4Var) {
        this.f186766e = sDKOAuthFriendUI;
        this.f186765d = px4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hy4.b bVar = hy4.b.INSTANCE;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI sDKOAuthFriendUI = this.f186766e;
        bVar.a(sDKOAuthFriendUI.f183671f, sDKOAuthFriendUI.f183677o, 0, sDKOAuthFriendUI.f183680r, sDKOAuthFriendUI.U6(), 1, 0);
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.T6(sDKOAuthFriendUI, false, this.f186765d);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
