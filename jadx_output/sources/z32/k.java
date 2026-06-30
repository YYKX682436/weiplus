package z32;

/* loaded from: classes12.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z32.s f469917e;

    public k(r45.ed6 ed6Var, z32.s sVar) {
        this.f469916d = ed6Var;
        this.f469917e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
        r45.ed6 ed6Var = this.f469916d;
        ((k91.g4) f6Var).Ni(ed6Var.f373327d, new z32.j(this.f469917e, ed6Var));
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
