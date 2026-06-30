package r74;

/* loaded from: classes4.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f393238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f393240f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r74.a0 f393241g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w64.n f393242h;

    public v(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, r74.a0 a0Var, w64.n nVar) {
        this.f393238d = snsInfo;
        this.f393239e = str;
        this.f393240f = timeLineObject;
        this.f393241g = a0Var;
        this.f393242h = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.d(this.f393238d);
        l44.k4 k4Var = l44.k4.f316220a;
        kotlin.jvm.internal.o.d(view);
        java.lang.String str = this.f393239e;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f393240f;
        r74.a0 a0Var = this.f393241g;
        a0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.model.k4 k4Var2 = a0Var.f393187h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        int i17 = a0Var.f393184e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        k4Var.a(view, str, timeLineObject, k4Var2, i17, a0Var.f393183d, this.f393242h, true);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$6");
    }
}
