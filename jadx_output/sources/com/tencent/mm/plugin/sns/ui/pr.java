package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class pr implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagDetailUI f170254d;

    public pr(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
        this.f170254d = snsTagDetailUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$7");
        this.f170254d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$7");
    }
}
