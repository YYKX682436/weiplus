package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class r8 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.s8 f170393a;

    public r8(com.tencent.mm.plugin.sns.ui.s8 s8Var) {
        this.f170393a = s8Var;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4$1");
        if (i17 == 0) {
            com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent = new com.tencent.mm.autogen.events.SightSendResultEvent();
            am.su suVar = sightSendResultEvent.f54784g;
            suVar.f7936a = 0;
            suVar.getClass();
            suVar.f7937b = true;
            sightSendResultEvent.e();
            com.tencent.mm.plugin.sns.ui.s8 s8Var = this.f170393a;
            s8Var.f170445d.hideVKB();
            s8Var.f170445d.finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4$1");
    }
}
