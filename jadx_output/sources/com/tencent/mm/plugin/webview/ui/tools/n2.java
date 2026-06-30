package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes11.dex */
public class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.px4 f185851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv5 f185852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f185853f;

    public n2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI, r45.px4 px4Var, r45.xv5 xv5Var) {
        this.f185853f = sDKOAuthUI;
        this.f185851d = px4Var;
        this.f185852e = xv5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "fillNewOauthPage click disagreeBtn");
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.T6(this.f185853f, this.f185851d, this.f185852e, false);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
