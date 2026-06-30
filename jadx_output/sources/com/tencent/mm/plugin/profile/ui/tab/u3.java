package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154608f;

    public u3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var, java.lang.String str, java.lang.String str2) {
        this.f154606d = s4Var;
        this.f154607e = str;
        this.f154608f = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFinderTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.d7 d7Var = this.f154606d.f154549c;
        java.lang.String finderUserName = this.f154607e;
        kotlin.jvm.internal.o.f(finderUserName, "$finderUserName");
        java.lang.String finderNickName = this.f154608f;
        kotlin.jvm.internal.o.f(finderNickName, "$finderNickName");
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = ((com.tencent.mm.plugin.profile.ui.tab.u0) d7Var).f154603a;
        m0Var.getClass();
        gr3.f.f274857a.a(m0Var.M, "click_finder", "", -1L);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22118, java.lang.Long.valueOf(m0Var.D), m0Var.f154459n.d1(), 2, finderUserName, finderNickName);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_profile_type", 12);
        intent.putExtra("finder_username", finderUserName);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(m0Var.f154456h, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFinderTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
