package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154622d;

    public v3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154622d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154622d;
        ((com.tencent.mm.plugin.profile.ui.tab.u0) s4Var.f154549c).a(s4Var.f154551d.f154452d.g());
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
