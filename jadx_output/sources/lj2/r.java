package lj2;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318924e;

    public r(yz5.p pVar, lj2.c0 c0Var) {
        this.f318923d = pVar;
        this.f318924e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lj2.c0 c0Var = this.f318924e;
        this.f318923d.invoke(java.lang.Integer.valueOf(c0Var.f318835f.f318945i), java.lang.Integer.valueOf(c0Var.f318835f.f318946j));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveNewBattleAnchorTipWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
