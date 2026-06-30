package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class AdLandingPageGetHBCoverBtnComp$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetHbCoverStateEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j5 f165045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdLandingPageGetHBCoverBtnComp$2(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j5 j5Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f165045d = j5Var;
        this.__eventId = -1796244288;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.GetHbCoverStateEvent getHbCoverStateEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
        com.tencent.mm.autogen.events.GetHbCoverStateEvent getHbCoverStateEvent2 = getHbCoverStateEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetHbCoverStateEvent callback, hbCoverId=");
            am.yf yfVar = getHbCoverStateEvent2.f54397g;
            sb6.append(yfVar.f8456a);
            sb6.append(", state=");
            sb6.append(yfVar.f8457b);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", sb6.toString());
            if (this.f165045d.B.A1.equals(yfVar.f8456a) && yfVar.f8457b == 0) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i5(this));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageGetHBCoverBtnComp", "GetHbCoverStateEvent exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2");
        return false;
    }
}
