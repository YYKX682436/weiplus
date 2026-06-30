package i64;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.ADInfo f289287a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.ADXml f289288b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.TimeLineObject f289289c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f289290d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f289291e;

    /* renamed from: f, reason: collision with root package name */
    public int f289292f;

    public q(com.tencent.mm.plugin.sns.storage.ADInfo adInfo, com.tencent.mm.plugin.sns.storage.ADXml adXml, com.tencent.mm.protocal.protobuf.TimeLineObject timelineObj) {
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        kotlin.jvm.internal.o.g(adXml, "adXml");
        kotlin.jvm.internal.o.g(timelineObj, "timelineObj");
        this.f289287a = adInfo;
        this.f289288b = adXml;
        this.f289289c = timelineObj;
        r45.a90 a90Var = timelineObj.ContentObj;
        boolean z17 = true;
        if (!(a90Var != null && a90Var.f369837e == 5)) {
            if (!(a90Var != null && a90Var.f369837e == 15)) {
                z17 = false;
            }
        }
        this.f289290d = z17;
    }

    public static final i64.q a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        i64.q qVar;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo != null ? snsInfo.getAdInfo() : null;
        if (adInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        } else if (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        } else {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
            if (timeLine != null) {
                qVar = new i64.q(adInfo, adXml, timeLine);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
                return qVar;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel$Companion");
        }
        qVar = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
        return qVar;
    }
}
