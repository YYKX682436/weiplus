package xt2;

/* loaded from: classes3.dex */
public final class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r5 f456830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f456831e;

    public j5(xt2.r5 r5Var, cm2.m0 m0Var) {
        this.f456830d = r5Var;
        this.f456831e = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$ChooseProductAdapter$ChooseProductItemViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt2.r5 r5Var = this.f456830d;
        yz5.l lVar = r5Var.f456998q;
        if (lVar != null) {
            lVar.invoke(this.f456831e);
        }
        r5Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingQuestionChooseProductPanel$ChooseProductAdapter$ChooseProductItemViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
