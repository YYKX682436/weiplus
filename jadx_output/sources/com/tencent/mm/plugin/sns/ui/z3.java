package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p3 f171663d;

    public z3(com.tencent.mm.plugin.sns.ui.p3 p3Var) {
        this.f171663d = p3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$9");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.p3 p3Var = this.f171663d;
        if (com.tencent.mm.plugin.sns.ui.p3.d(p3Var) != null) {
            com.tencent.mm.plugin.sns.ui.p3.d(p3Var).b(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$9");
    }
}
