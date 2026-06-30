package r74;

/* loaded from: classes4.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f393243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f393245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r74.a0 f393246g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w64.n f393247h;

    public w(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, r74.a0 a0Var, w64.n nVar) {
        this.f393243d = snsInfo;
        this.f393244e = str;
        this.f393245f = timeLineObject;
        this.f393246g = a0Var;
        this.f393247h = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$7$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$7$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.d(this.f393243d);
        l44.k4 k4Var = l44.k4.f316220a;
        kotlin.jvm.internal.o.d(view);
        java.lang.String str = this.f393244e;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f393245f;
        r74.a0 a0Var = this.f393246g;
        a0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.model.k4 k4Var2 = a0Var.f393187h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        int i17 = a0Var.f393184e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        k4Var.a(view, str, timeLineObject, k4Var2, i17, a0Var.f393183d, this.f393247h, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$7$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$7$4");
    }
}
