package r74;

/* loaded from: classes4.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f393233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f393235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r74.a0 f393236g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w64.n f393237h;

    public u(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, r74.a0 a0Var, w64.n nVar) {
        this.f393233d = snsInfo;
        this.f393234e = str;
        this.f393235f = timeLineObject;
        this.f393236g = a0Var;
        this.f393237h = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.d(this.f393233d);
        l44.k4 k4Var = l44.k4.f316220a;
        kotlin.jvm.internal.o.d(view);
        java.lang.String str = this.f393234e;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f393235f;
        r74.a0 a0Var = this.f393236g;
        a0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsContext", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.model.k4 k4Var2 = a0Var.f393187h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSource", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        int i17 = a0Var.f393184e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        k4Var.a(view, str, timeLineObject, k4Var2, i17, a0Var.f393183d, this.f393237h, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/combinegrid/AdCombineGridCardViewLogic$updateGridUIModel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$updateGridUIModel$4");
    }
}
