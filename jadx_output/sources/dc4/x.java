package dc4;

/* loaded from: classes4.dex */
public class x implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f228853a;

    public x(dc4.d0 d0Var) {
        this.f228853a = d0Var;
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timelineVideoView setUICallback onDestroy, the tlId is ");
        sb6.append(str);
        sb6.append(", the timelineId is ");
        dc4.d0 d0Var = this.f228853a;
        sb6.append(d0Var.f228831d.Id);
        com.tencent.mars.xlog.Log.w("MicroMsg.CardAdDetailItemView", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(d0Var.f228831d.Id)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            d0Var.f228738x1 = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$2");
    }
}
