package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f124252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f124253e;

    public u3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f124252d = f4Var;
        this.f124253e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onResume$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.f4.a7(this.f124252d, "set", 0, null, 0, null, 30, null);
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f124252d;
        f4Var.f123689m = true;
        f4Var.W6().setChecked(true);
        f4Var.U6(true);
        this.f124253e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onResume$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
