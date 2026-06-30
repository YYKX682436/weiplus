package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154263d;

    public c4(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        this.f154263d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.c1 c1Var = ((com.tencent.mm.plugin.profile.ui.tab.u0) this.f154263d.f154549c).f154603a.U;
        if (c1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PhotoAccountGuide] action button clicked, biz=");
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = ((com.tencent.mm.plugin.profile.ui.tab.f5) c1Var).f154313a;
            com.tencent.mm.storage.z3 z3Var = contactWidgetTabBizInfo.f154206n;
            sb6.append(z3Var != null ? z3Var.d1() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", sb6.toString());
            com.tencent.wechat.iam.biz.g.f217742b.b(new com.tencent.mm.plugin.profile.ui.tab.o5(new java.lang.ref.WeakReference(contactWidgetTabBizInfo)));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
