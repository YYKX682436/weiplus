package f84;

/* loaded from: classes4.dex */
public final class o implements f84.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f84.u f260198a;

    public o(f84.u uVar) {
        this.f260198a = uVar;
    }

    public void a(android.view.View view, int i17, f84.b0 itemInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnItemClickListener$1");
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        f84.u uVar = this.f260198a;
        com.tencent.mars.xlog.Log.i(uVar.j(), "onItemClick, pos=" + i17);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo c17 = itemInfo.c();
        if (c17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnItemClickListener$1");
            return;
        }
        c17.f162569a = 32;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        w64.n nVar = uVar.f260208r;
        if (nVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = uVar.f260216z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
            nVar.o(c17, snsInfo, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent");
        if (nVar != null) {
            nVar.k(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicComponent$mOnItemClickListener$1");
    }
}
