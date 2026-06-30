package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wn implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.yn f171331d;

    public wn(com.tencent.mm.plugin.sns.ui.yn ynVar) {
        this.f171331d = ynVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$6$1");
        com.tencent.mm.plugin.sns.ui.yn ynVar = this.f171331d;
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = ynVar.f171638d;
        int i18 = com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.C1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.G = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        ynVar.f171638d.l7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$6$1");
    }
}
