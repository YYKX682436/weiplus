package s74;

/* loaded from: classes4.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.n f404241f;

    public d0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.o0 o0Var, w64.n nVar) {
        this.f404239d = snsInfo;
        this.f404240e = o0Var;
        this.f404241f = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l44.k4 k4Var = l44.k4.f316220a;
        kotlin.jvm.internal.o.d(view);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404239d;
        java.lang.String localid = snsInfo.getLocalid();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        s74.o0 o0Var = this.f404240e;
        o0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        k4Var.a(view, localid, timeLine, o0Var.f404451r, o0Var.H(), o0Var.G(), this.f404241f, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$processClickableViews$1$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$processClickableViews$1$1$4");
    }
}
