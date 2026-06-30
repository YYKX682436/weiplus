package vw3;

/* loaded from: classes12.dex */
public final class z5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSportUI f441208d;

    public z5(com.tencent.mm.plugin.repairer.ui.RepairerSportUI repairerSportUI) {
        this.f441208d = repairerSportUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSportUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.events.ExtStepCountEvent extStepCountEvent = new com.tencent.mm.autogen.events.ExtStepCountEvent();
        extStepCountEvent.f54211g.f7989a = 3;
        extStepCountEvent.e();
        java.lang.String str = this.f441208d.d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getconfig:  ");
        am.u8 u8Var = extStepCountEvent.f54212h;
        sb6.append(u8Var.f8058c);
        sb6.append(' ');
        sb6.append(u8Var.f8056a);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSportUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
