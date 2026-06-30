package dd4;

/* loaded from: classes4.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final dd4.s a(r45.jj4 media) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        kotlin.jvm.internal.o.g(media, "media");
        dd4.s sVar = (dd4.s) dd4.s.d().get(media.f377855d);
        if (sVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
            return sVar;
        }
        dd4.s sVar2 = new dd4.s(media, null);
        java.util.HashMap d17 = dd4.s.d();
        java.lang.String Id = media.f377855d;
        kotlin.jvm.internal.o.f(Id, "Id");
        d17.put(Id, sVar2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        return sVar2;
    }
}
