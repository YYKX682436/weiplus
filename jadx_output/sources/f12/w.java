package f12;

/* loaded from: classes4.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258674d;

    public w(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258674d = springLuckyEggActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        b12.k kVar = b12.k.f17060a;
        int i17 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.f97437o;
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258674d;
        uq.n nVar = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
        kVar.d(22, nVar != null ? nVar.f430173u : 0L);
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.U6(springLuckyEggActivity, springLuckyEggActivity.X6().f258626p.getValue());
        yj0.a.h(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
