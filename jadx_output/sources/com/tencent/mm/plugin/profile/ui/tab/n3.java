package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154488d;

    public n3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154488d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = ((com.tencent.mm.plugin.profile.ui.tab.u0) this.f154488d.f154549c).f154603a;
        java.lang.String d17 = m0Var.f154459n.d1();
        android.content.Intent intent = new android.content.Intent(m0Var.f154456h, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg.class);
        intent.putExtra(dm.i4.COL_USERNAME, d17);
        intent.putExtra("brand_icon_url", m0Var.f154460o);
        com.tencent.mm.ui.MMActivity mMActivity = m0Var.f154456h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mMActivity, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "doEnterAvatar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(mMActivity, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "doEnterAvatar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
