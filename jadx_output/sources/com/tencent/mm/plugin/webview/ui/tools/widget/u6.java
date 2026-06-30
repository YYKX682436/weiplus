package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f187576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f187577e;

    public u6(com.tencent.mm.plugin.webview.ui.tools.widget.w6 w6Var, r45.jv5 jv5Var, android.widget.ImageView imageView) {
        this.f187576d = jv5Var;
        this.f187577e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.jv5 jv5Var = this.f187576d;
        int i17 = jv5Var.f378133f;
        android.widget.ImageView imageView = this.f187577e;
        if (i17 == 2) {
            imageView.setImageResource(com.tencent.mm.R.raw.login_auth_state_not_selected);
            jv5Var.f378133f = 1;
        } else if (i17 == 1) {
            imageView.setImageResource(com.tencent.mm.R.raw.login_auth_state_default_select);
            jv5Var.f378133f = 2;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
