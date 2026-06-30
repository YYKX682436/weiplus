package sd4;

/* loaded from: classes14.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String name, java.lang.String state) {
        f4.u uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        sd4.c cVar = com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity.f169929s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        f4.s sVar = com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity.f169930t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        if (sVar != null && (uVar = sVar.f259404a) != null) {
            synchronized (uVar.f259409b) {
                long nanoTime = java.lang.System.nanoTime();
                uVar.d(name, uVar.f259408a, nanoTime);
                ((java.util.ArrayList) uVar.f259408a).add(new f4.t(nanoTime, -1L, new f4.v(name, state)));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
    }

    public final void b(java.lang.String name) {
        f4.u uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        sd4.c cVar = com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity.f169929s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        f4.s sVar = com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity.f169930t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMetricsStateHolder$cp", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMetricsStateHolder", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
        if (sVar != null && (uVar = sVar.f259404a) != null) {
            uVar.d(name, uVar.f259408a, java.lang.System.nanoTime());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeState", "com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity$Companion");
    }
}
