package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class o3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154499d;

    public o3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154499d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154499d;
        if (s4Var.f154551d.f154452d.a()) {
            com.tencent.mm.plugin.profile.s1.e(s4Var.f154547b, s4Var.f154551d.f154452d.g().f411832d, 1338);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
