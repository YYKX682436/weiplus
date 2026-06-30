package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154408d;

    public l5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo) {
        this.f154408d = contactWidgetTabBizInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f154408d;
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher c17 = contactWidgetTabBizInfo.c();
        if (c17 != null) {
            java.lang.String event = contactWidgetTabBizInfo.N;
            kotlin.jvm.internal.o.g(event, "event");
            if (c17.f154280h) {
                com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
                vr3.r rVar = new vr3.r(c17);
                sVar.getClass();
                sVar.Ai().i(event, new com.tencent.mm.plugin.profile.ui.tab.p(rVar));
            }
        }
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher c18 = contactWidgetTabBizInfo.c();
        if (c18 != null && c18.f154280h) {
            ((com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class)).Ai().g();
        }
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher c19 = contactWidgetTabBizInfo.c();
        if (c19 != null) {
            java.lang.String event2 = contactWidgetTabBizInfo.P;
            kotlin.jvm.internal.o.g(event2, "event");
            if (c19.f154280h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "subscribeProfileUpdateMessages: Start. Event=".concat(event2));
                com.tencent.mm.plugin.profile.ui.tab.s sVar2 = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
                vr3.t tVar = new vr3.t(c19);
                sVar2.getClass();
                sVar2.Ai().j(event2, new com.tencent.mm.plugin.profile.ui.tab.r(tVar));
            }
        }
    }
}
