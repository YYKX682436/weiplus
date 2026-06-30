package sb4;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb4.y f405587d;

    public x(sb4.y yVar) {
        this.f405587d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter$onBindViewHolder$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOnClickFun$p", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        this.f405587d.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOnClickFun$p", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter$onBindViewHolder$1");
    }
}
