package my2;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332721d;

    public c0(my2.k0 k0Var) {
        this.f332721d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        my2.k0 k0Var = this.f332721d;
        k0Var.K0(8);
        k0Var.v1(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteCardPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
