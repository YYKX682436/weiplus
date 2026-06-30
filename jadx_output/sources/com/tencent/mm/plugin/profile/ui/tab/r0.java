package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154527e;

    public r0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var, java.lang.String str) {
        this.f154527e = m0Var;
        this.f154526d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f154526d;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154527e;
        m0Var.getClass();
        int i17 = com.tencent.mm.storage.c2.f193803a;
        int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(m0Var.f154463r);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).s(m0Var.f154456h, m0Var.f154463r, str, 8, j17, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23044, 2, m0Var.f154463r, java.lang.Integer.valueOf(m0Var.f154467v), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(j17), 1, "");
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
