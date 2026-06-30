package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class j implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.l f169354a;

    public j(com.tencent.mm.plugin.sns.ui.item.l lVar) {
        this.f169354a = lVar;
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$5");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timelineVideoView setUICallback onDestroy, the tlId is ");
        sb6.append(str);
        sb6.append(", the timelineId is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.l lVar = this.f169354a;
        java.lang.String str2 = lVar.f169377x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.w("MiroMsg.CardAdTimeLineItem", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            java.lang.String str3 = lVar.f169377x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            if (str.equals(str3)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                lVar.f169375v = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                lVar.R();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$5");
    }
}
