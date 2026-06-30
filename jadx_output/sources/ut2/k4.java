package ut2;

/* loaded from: classes3.dex */
public final class k4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f430980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f430981e;

    public k4(ut2.j5 j5Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f430980d = j5Var;
        this.f430981e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkScoreInfoV2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        b1Var.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f430980d.f430937e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ac4Var.set(7, bool);
        ac4Var.set(5, bool);
        ac4Var.set(1, this.f430981e);
        ((c61.p2) ybVar).Bi(context, ac4Var, b1Var, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkScoreInfoV2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
