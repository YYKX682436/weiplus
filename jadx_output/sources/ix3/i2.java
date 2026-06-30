package ix3;

/* loaded from: classes7.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.l2 f295447d;

    public i2(ix3.l2 l2Var) {
        this.f295447d = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).getClass();
        com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
        f17.getClass();
        com.tencent.mm.plugin.ball.service.p4.f93204r.clear();
        for (pv.a0 a0Var : pv.a0.values()) {
            com.tencent.mm.sdk.platformtools.o4.M(f17.h()).remove("content_edu_" + a0Var.f358478d);
        }
        com.tencent.mm.plugin.ball.service.p4.f93205s.clear();
        com.tencent.mm.plugin.ball.service.p4.f93206t = null;
        com.tencent.mm.plugin.ball.service.p4.f93207u = null;
        for (pv.b0 b0Var : pv.b0.values()) {
            com.tencent.mm.sdk.platformtools.o4.M(f17.h()).remove(f17.e(b0Var));
        }
        com.tencent.mm.sdk.platformtools.o4.M(f17.h()).remove("content_menu_clicked");
        com.tencent.mm.sdk.platformtools.o4.M(f17.h()).remove("content_menu_all_not_show");
        dp.a.makeText(this.f295447d.getContext(), "重置成功", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
