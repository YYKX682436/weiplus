package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes7.dex */
public class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.px4 f183890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f183891e;

    public a2(com.tencent.mm.plugin.webview.ui.tools.c2 c2Var, r45.px4 px4Var, android.widget.ImageView imageView) {
        this.f183890d = px4Var;
        this.f183891e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.px4 px4Var = this.f183890d;
        int i17 = px4Var.f383460f;
        android.widget.ImageView imageView = this.f183891e;
        if (i17 == 2) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f481259or);
            px4Var.f383460f = 1;
        } else if (i17 == 1) {
            imageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected_small);
            px4Var.f383460f = 2;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
