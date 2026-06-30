package lj2;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318921e;

    public q(yz5.p pVar, lj2.c0 c0Var) {
        this.f318920d = pVar;
        this.f318921e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lj2.c0 c0Var = this.f318921e;
        this.f318920d.invoke(java.lang.Integer.valueOf(c0Var.f318834e.f318945i), java.lang.Integer.valueOf(c0Var.f318834e.f318946j));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
