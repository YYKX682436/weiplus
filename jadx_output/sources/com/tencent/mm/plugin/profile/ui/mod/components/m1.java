package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.n1 f153954e;

    public m1(java.lang.String str, com.tencent.mm.plugin.profile.ui.mod.components.n1 n1Var) {
        this.f153953d = str;
        this.f153954e = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components/PhonePreviewUI$loadCustomView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + this.f153953d));
        try {
            android.app.Activity context = this.f153954e.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/mod/components/PhonePreviewUI$loadCustomView$1$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/profile/ui/mod/components/PhonePreviewUI$loadCustomView$1$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.content.ActivityNotFoundException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileMobilePhoneView", "ActivityNotFoundException!");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components/PhonePreviewUI$loadCustomView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
