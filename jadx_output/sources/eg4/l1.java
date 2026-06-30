package eg4;

/* loaded from: classes11.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f252754d;

    public l1(eg4.t1 t1Var) {
        this.f252754d = t1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof y35.r) {
            final y35.r rVar = (y35.r) view.getTag();
            if (rVar == null || com.tencent.mm.sdk.platformtools.t8.K0(rVar.f459232a)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FMessageConversationUI", "cpan add contact failed. username is null.");
                yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(this.f252754d.f252811o, new ns.j() { // from class: eg4.l1$$a
                    @Override // ns.j
                    public final void a(boolean z17) {
                        eg4.l1 l1Var = eg4.l1.this;
                        eg4.t1 t1Var = l1Var.f252754d;
                        y35.r rVar2 = rVar;
                        if (!z17) {
                            eg4.t1.t(t1Var, rVar2);
                            return;
                        }
                        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(t1Var.f252811o, 1, rVar2.f459232a, new eg4.m1(l1Var, rVar2));
                    }
                });
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
