package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class ir implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagDetailUI f169245d;

    public ir(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
        this.f169245d = snsTagDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$1");
        this.f169245d.a7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$1");
    }
}
