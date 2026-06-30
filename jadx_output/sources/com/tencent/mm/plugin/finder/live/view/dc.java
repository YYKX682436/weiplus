package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class dc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f116258e;

    public dc(com.tencent.mm.plugin.finder.live.view.mc mcVar, r45.lv1 lv1Var) {
        this.f116257d = mcVar;
        this.f116258e = lv1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindRunningView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.mc.a(this.f116257d, this.f116258e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindRunningView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
