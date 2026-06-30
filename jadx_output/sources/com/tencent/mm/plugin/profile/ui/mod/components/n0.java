package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.o0 f153956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f153957e;

    public n0(com.tencent.mm.plugin.profile.ui.mod.components.o0 o0Var, android.content.Intent intent) {
        this.f153956d = o0Var;
        this.f153957e = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components/ModLabelUI$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.mod.components.o0 o0Var = this.f153956d;
        o0Var.f153962u = true;
        ((j93.n) ((jz5.n) o0Var.f153961t).getValue()).V6(600, this.f153957e, false, new java.util.ArrayList(o0Var.f153959r));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components/ModLabelUI$loadCustomView$view$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
