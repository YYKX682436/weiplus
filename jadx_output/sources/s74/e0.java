package s74;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404251d;

    public e0(s74.o0 o0Var) {
        this.f404251d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.listener.i f17 = this.f404251d.C().f();
        if (f17 != null && (onClickListener = f17.f169797J) != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$5");
    }
}
