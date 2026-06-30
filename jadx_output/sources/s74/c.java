package s74;

/* loaded from: classes4.dex */
public final class c implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f404220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f404221b;

    public c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s74.o0 o0Var) {
        this.f404220a = snsInfo;
        this.f404221b = o0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$11");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$11");
        java.lang.String t07 = ca4.z0.t0(this.f404220a.field_snsId);
        if (!z17) {
            com.tencent.mars.xlog.Log.i(this.f404221b.j(), "dynamic_feed_report isAttached = false ! snsId = " + t07);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$11");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$11");
    }
}
