package lc4;

/* loaded from: classes4.dex */
public final class u implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317991d;

    public u(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC) {
        this.f317991d = improveDataUIC;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
        o75.c event = (o75.c) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleDBEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        this.f317991d.U6(event);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleDBEvent", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$observeDBChangeEvent$1");
    }
}
