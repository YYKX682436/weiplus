package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rt implements com.tencent.mm.ui.tools.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f170434a;

    public rt(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f170434a = snsUIAction;
    }

    @Override // com.tencent.mm.ui.tools.h1
    public java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.SnsUIAction$8");
        java.lang.String str2 = com.tencent.mm.plugin.sns.model.l4.Ni() + kk.k.g((this.f170434a.f167490n + java.lang.System.currentTimeMillis()).getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genOutputPath", "com.tencent.mm.plugin.sns.ui.SnsUIAction$8");
        return str2;
    }
}
