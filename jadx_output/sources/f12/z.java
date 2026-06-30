package f12;

/* loaded from: classes4.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258677d;

    public z(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258677d = springLuckyEggActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggActivity", "setupViews: click close");
        b12.k kVar = b12.k.f17060a;
        int i17 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.f97437o;
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258677d;
        uq.n nVar = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
        kVar.d(25, nVar != null ? nVar.f430173u : 0L);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(springLuckyEggActivity);
        u1Var.u(springLuckyEggActivity.getString(com.tencent.mm.R.string.bsy));
        u1Var.g(springLuckyEggActivity.getString(com.tencent.mm.R.string.bsx));
        u1Var.n(springLuckyEggActivity.getString(com.tencent.mm.R.string.bsv));
        u1Var.b(new f12.y(springLuckyEggActivity));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
