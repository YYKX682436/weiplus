package ut2;

/* loaded from: classes3.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f431057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.k74 f431058e;

    public q4(ut2.j5 j5Var, r45.k74 k74Var) {
        this.f431057d = j5Var;
        this.f431058e = k74Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShowLicense$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        ut2.j5 j5Var = this.f431057d;
        android.content.Context context = j5Var.f430937e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        r45.k74 k74Var = this.f431058e;
        finderJumpInfo.setLite_app_info(k74Var);
        finderJumpInfo.setJumpinfo_type(6);
        ac4Var.set(1, finderJumpInfo);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        ac4Var.set(2, bool);
        ac4Var.set(3, bool);
        ac4Var.set(4, 1);
        c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        j5Var.f430936d.u();
        com.tencent.mars.xlog.Log.i(j5Var.f430940h, "enter licenseLiteApp " + pm0.b0.g(k74Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShowLicense$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
