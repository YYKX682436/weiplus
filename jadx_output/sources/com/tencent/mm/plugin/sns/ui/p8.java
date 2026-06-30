package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class p8 implements al5.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightUploadUI f170186a;

    public p8(com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI) {
        this.f170186a = sightUploadUI;
    }

    @Override // al5.n1
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.SightUploadUI$2");
        com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI = this.f170186a;
        sightUploadUI.hideVKB();
        com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent = new com.tencent.mm.autogen.events.SightSendResultEvent();
        am.su suVar = sightSendResultEvent.f54784g;
        suVar.f7936a = 0;
        suVar.f7937b = false;
        sightSendResultEvent.e();
        sightUploadUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBack", "com.tencent.mm.plugin.sns.ui.SightUploadUI$2");
    }
}
