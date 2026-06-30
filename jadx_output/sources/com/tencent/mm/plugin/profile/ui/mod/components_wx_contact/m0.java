package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0 f154097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f154098e;

    public m0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0 n0Var, android.content.Intent intent) {
        this.f154097d = n0Var;
        this.f154098e = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModLabelUIWxContact$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0 n0Var = this.f154097d;
        n0Var.f154103u = true;
        ((j93.n) ((jz5.n) n0Var.f154102t).getValue()).V6(600, this.f154098e, false, new java.util.ArrayList(n0Var.f154100r));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModLabelUIWxContact$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
