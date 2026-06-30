package f12;

/* loaded from: classes4.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258675d;

    public x(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258675d = springLuckyEggActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringLuckyEggActivity", "clicked bottom title");
        int i17 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.f97437o;
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258675d;
        if (springLuckyEggActivity.X6().f258625o.getValue() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        b12.k kVar = b12.k.f17060a;
        uq.n nVar = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
        kVar.d(10, nVar != null ? nVar.f430173u : 0L);
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.U6(springLuckyEggActivity, springLuckyEggActivity.X6().f258625o.getValue());
        yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
