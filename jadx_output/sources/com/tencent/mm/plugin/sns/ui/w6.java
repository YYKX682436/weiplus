package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.NewSnsLabelUI f170734d;

    public w6(com.tencent.mm.plugin.sns.ui.NewSnsLabelUI.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener, com.tencent.mm.plugin.sns.ui.NewSnsLabelUI newSnsLabelUI) {
        this.f170734d = newSnsLabelUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener$1");
        this.f170734d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI$ReturnSnsObjectDetailEventListener$1");
    }
}
