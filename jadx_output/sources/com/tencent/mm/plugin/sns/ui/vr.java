package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class vr implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI f170710a;

    public vr(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI) {
        this.f170710a = snsTagPartlyUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
        com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI = this.f170710a;
        snsTagPartlyUI.enableOptionMenu(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI.T6(snsTagPartlyUI).getCount() > 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostReset", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI$4");
    }
}
