package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.s2 f148476d;

    public r2(com.tencent.mm.plugin.mall.ui.s2 s2Var) {
        this.f148476d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/MallWalletUI$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f148476d.f148483e.f148493a.f148320i.dismiss();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16500, 5);
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/MallWalletUI$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
