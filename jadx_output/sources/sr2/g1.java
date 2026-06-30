package sr2;

/* loaded from: classes10.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f411568d;

    public g1(sr2.o1 o1Var) {
        this.f411568d = o1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkMemberVisible$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.o1 o1Var = this.f411568d;
        o1Var.U6().Q6();
        yz5.a aVar = o1Var.f411658i;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkMemberVisible$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
