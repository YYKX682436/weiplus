package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSubmitUI f153269d;

    public a1(com.tencent.mm.plugin.product.ui.MallProductSubmitUI mallProductSubmitUI) {
        this.f153269d = mallProductSubmitUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wq3.j jVar = this.f153269d.f153246y.f153367g;
        if (jVar.b()) {
            if (jVar.o() == 0) {
                gm0.j1.i();
                com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                r45.a76 n17 = jVar.n();
                xq3.n nVar = jVar.f448549b.f448600f;
                r1Var.g(new wq3.r(n17, nVar != null ? nVar.f456105d : null));
            } else {
                gm0.j1.i();
                com.tencent.mm.modelbase.r1 r1Var2 = gm0.j1.n().f273288b;
                r45.a76 n18 = jVar.n();
                xq3.n nVar2 = jVar.f448549b.f448600f;
                r1Var2.g(new wq3.s(n18, nVar2 != null ? nVar2.f456105d : null));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
