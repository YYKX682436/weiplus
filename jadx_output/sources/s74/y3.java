package s74;

/* loaded from: classes4.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.a4 f404611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(java.util.List list, s74.a4 a4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404610d = list;
        this.f404611e = a4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        s74.y3 y3Var = new s74.y3(this.f404610d, this.f404611e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        return y3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        s74.y3 y3Var = (s74.y3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y3Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Iterator it = this.f404610d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(((xc4.p) it.next()).y0());
            com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07 != null ? y07.convertToSnsInfo() : null;
            boolean z17 = false;
            if (convertToSnsInfo != null && convertToSnsInfo.isDynamicAD()) {
                z17 = true;
            }
            if (z17) {
                s74.a4.a(this.f404611e, convertToSnsInfo);
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader$preloadSnsAdViewInImproveUI$1");
        return f0Var;
    }
}
