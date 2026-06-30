package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class mr implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.nr f169945d;

    public mr(com.tencent.mm.plugin.sns.ui.nr nrVar) {
        this.f169945d = nrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5$1");
        this.f169945d.f170023d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5$1");
    }
}
