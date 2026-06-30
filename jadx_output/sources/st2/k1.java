package st2;

/* loaded from: classes3.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f412387d;

    public k1(st2.s1 s1Var) {
        this.f412387d = s1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        st2.s1 s1Var = this.f412387d;
        s1Var.e();
        st2.s1.a(s1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
