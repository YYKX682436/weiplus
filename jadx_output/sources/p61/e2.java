package p61;

/* loaded from: classes.dex */
public class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI f352239d;

    public e2(com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI bindMobilePolicyUI) {
        this.f352239d = bindMobilePolicyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI bindMobilePolicyUI = this.f352239d;
        intent.putExtra("rawUrl", (java.lang.String) bindMobilePolicyUI.f73011z.get(".sysmsg.BindPhoneGuidance.guidanceHelp.jumpUrl"));
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.n(bindMobilePolicyUI.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
