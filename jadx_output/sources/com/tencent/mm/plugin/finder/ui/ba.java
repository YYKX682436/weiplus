package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class ba implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderManagementUI f128942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f128943e;

    public ba(com.tencent.mm.plugin.finder.ui.FinderManagementUI finderManagementUI, r45.qt2 qt2Var) {
        this.f128942d = finderManagementUI;
        this.f128943e = qt2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        androidx.appcompat.app.AppCompatActivity context = this.f128942d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Ek(context);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.W2;
        java.util.HashMap i17 = kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "4"), new jz5.l("type", "3"), new jz5.l("ref_scene", "2"));
        r45.qt2 qt2Var = this.f128943e;
        zy2.zb.T8(zbVar, t1Var, i17, qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
