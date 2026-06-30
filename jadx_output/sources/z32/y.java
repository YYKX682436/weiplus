package z32;

/* loaded from: classes12.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f469955e;

    public y(r45.ed6 ed6Var, z32.a0 a0Var) {
        this.f469954d = ed6Var;
        this.f469955e = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
        r45.ed6 ed6Var = this.f469954d;
        ((k91.g4) f6Var).Ni(ed6Var.f373327d, new z32.x(this.f469955e, ed6Var));
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
