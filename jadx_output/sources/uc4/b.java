package uc4;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.g f426378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426379e;

    public b(uc4.g gVar, android.view.View view) {
        this.f426378d = gVar;
        this.f426379e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/click/BaseImproveClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f426378d.a(this.f426379e);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/click/BaseImproveClick$register$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$1");
    }
}
