package eg4;

/* loaded from: classes11.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f252776d;

    public p1(eg4.t1 t1Var) {
        this.f252776d = t1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof y35.r) {
            final y35.r rVar = (y35.r) view.getTag();
            ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(this.f252776d.f252811o, new ns.j() { // from class: eg4.p1$$a
                @Override // ns.j
                public final void a(boolean z17) {
                    eg4.p1 p1Var = eg4.p1.this;
                    eg4.t1 t1Var = p1Var.f252776d;
                    y35.r rVar2 = rVar;
                    if (!z17) {
                        eg4.t1.u(t1Var, rVar2);
                        return;
                    }
                    ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(t1Var.f252811o, 3, rVar2.f459232a, new eg4.q1(p1Var, rVar2));
                }
            });
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
