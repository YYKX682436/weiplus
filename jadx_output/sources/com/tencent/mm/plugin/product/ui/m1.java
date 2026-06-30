package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153316d;

    public m1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI) {
        this.f153316d = mallProductUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        xq3.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.product.ui.w wVar = this.f153316d.f153262w;
        wq3.j jVar = wVar.f153367g;
        int i17 = jVar.f448553f;
        boolean z17 = (i17 <= 0 || jVar.f448549b == null || i17 > jVar.g() || (cVar = jVar.f448549b.f448599e) == null || cVar.f456072t == null) ? false : true;
        android.app.Activity activity = wVar.f153364d;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "goSelectSku", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/product/ui/MallProductHelper", "goSelectSku", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11008, jVar.j(), jVar.f448549b.f448595a, java.lang.Integer.valueOf(com.tencent.mm.plugin.product.ui.w.f153363m), 1);
        } else {
            db5.t7.makeText(activity, com.tencent.mm.R.string.grp, 1).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
