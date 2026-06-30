package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes5.dex */
public final class t3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.u3 f117417d;

    public t3(com.tencent.mm.plugin.finder.live.viewmodel.u3 u3Var) {
        this.f117417d = u3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.u3 u3Var = this.f117417d;
        kotlinx.coroutines.l.d(u3Var.getMainScope(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.s3(u3Var, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
