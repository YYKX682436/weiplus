package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wl implements db5.f6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f171330a;

    public wl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f171330a = snsMsgUI;
    }

    @Override // db5.f6
    public void a(android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$6");
        this.f171330a.f167267d.performItemClick(view, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$6");
    }
}
