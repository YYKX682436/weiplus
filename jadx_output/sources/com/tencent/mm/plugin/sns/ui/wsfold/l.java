package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class l implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.w f171400d;

    public l(com.tencent.mm.plugin.sns.ui.wsfold.w wVar) {
        this.f171400d = wVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observeDBChangeEvent$1");
        o75.c event = (o75.c) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observeDBChangeEvent$1");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleDBEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        this.f171400d.U6(event);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleDBEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observeDBChangeEvent$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observeDBChangeEvent$1");
    }
}
