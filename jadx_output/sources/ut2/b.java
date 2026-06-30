package ut2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.p f430827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hw0 f430828e;

    public b(ut2.p pVar, r45.hw0 hw0Var) {
        this.f430827d = pVar;
        this.f430828e = hw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.p pVar = this.f430827d;
        gk2.e eVar = pVar.f431027e;
        r45.hw0 hw0Var = this.f430828e;
        ut2.p.l(pVar, hw0Var, eVar);
        r45.lo loVar = (r45.lo) hw0Var.getCustom(8);
        if (loVar == null || (str = loVar.getString(2)) == null) {
            str = "";
        }
        pVar.s(hw0Var, 0L, str);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
