package l94;

/* loaded from: classes4.dex */
public final class c implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.e f317333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h94.a f317334e;

    public c(l94.e eVar, h94.a aVar) {
        this.f317333d = eVar;
        this.f317334e = aVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2$1");
        l94.l eventData = (l94.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2$1");
        l94.e eVar = this.f317333d;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        h94.a adInfo = this.f317334e;
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        kotlin.jvm.internal.o.g(eventData, "eventData");
        java.lang.String d17 = adInfo.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTraceId", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTraceId", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        if (kotlin.jvm.internal.o.b(d17, eventData.f317376c)) {
            eVar.l(adInfo, eventData);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2$1");
        return f0Var;
    }
}
