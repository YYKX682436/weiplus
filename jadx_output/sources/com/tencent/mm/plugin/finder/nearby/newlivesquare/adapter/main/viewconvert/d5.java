package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f121634f;

    public d5(in5.s0 s0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, vp2.l0 l0Var) {
        this.f121632d = s0Var;
        this.f121633e = t5Var;
        this.f121634f = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$checkMoreEntranceShow$moreEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f121632d;
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        vp2.l0 l0Var = this.f121634f;
        if (mMActivity != null) {
            ((sp2.b0) pf5.z.f353948a.a(mMActivity).a(sp2.b0.class)).R6(l0Var.f438940d.f374134p);
        }
        this.f121633e.s(s0Var, l0Var.f438940d.f374125d, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$checkMoreEntranceShow$moreEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
