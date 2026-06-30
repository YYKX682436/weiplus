package l94;

/* loaded from: classes4.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final void a(l94.m eventType, int i17, java.lang.String traceId, r45.x30 x30Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryEmit", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$Companion");
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWsFoldViewEventFlow$cp", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        kotlinx.coroutines.flow.i2 i2Var = l94.e.f317341f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWsFoldViewEventFlow$cp", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        if (((kotlinx.coroutines.flow.q2) i2Var).e(new l94.l(eventType, i17, traceId, x30Var))) {
            com.tencent.mars.xlog.Log.i("WsFoldAdComponentEvent", "emit success");
        } else {
            com.tencent.mars.xlog.Log.i("WsFoldAdComponentEvent", "emit failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryEmit", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$Companion");
    }
}
