package s74;

/* loaded from: classes4.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404418d;

    public m0(s74.o0 o0Var) {
        this.f404418d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        s74.o0 o0Var = this.f404418d;
        s74.f3 D = o0Var.D();
        if (D != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            android.view.ViewGroup viewGroup = D.f404291y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            if (viewGroup != null) {
                viewGroup.performClick();
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1");
            }
        }
        com.tencent.mars.xlog.Log.e(o0Var.j(), "error! rootContainer not finded!");
        ca4.q.a("dynamicImageKeeperError", "", 9);
        com.tencent.mm.plugin.sns.ui.listener.i f17 = o0Var.C().f();
        if ((f17 != null ? f17.T : null) == null) {
            ca4.q.c("-1listener null", null);
        }
        com.tencent.mm.plugin.sns.ui.listener.i f18 = o0Var.C().f();
        if (f18 != null && (onClickListener = f18.T) != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$setImageKeeperLayoutClick$rootClickListener$1");
    }
}
