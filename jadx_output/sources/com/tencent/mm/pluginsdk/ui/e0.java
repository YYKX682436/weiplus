package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.BioHelperUI f190785d;

    public e0(com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI) {
        this.f190785d = bioHelperUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/BioHelperUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI = this.f190785d;
        intent.putExtra("rawUrl", new java.lang.StringBuilder(bioHelperUI.f189761g).toString());
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(bioHelperUI, "webview", ".ui.tools.WebViewUI", intent, null);
        bioHelperUI.finish();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/BioHelperUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
