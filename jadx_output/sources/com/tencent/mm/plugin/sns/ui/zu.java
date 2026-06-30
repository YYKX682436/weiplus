package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zu implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f171717e;

    public zu(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI, int i17) {
        this.f171717e = snsUserUI;
        this.f171716d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$18");
        com.tencent.mm.plugin.sns.model.l4.Fj().L0(this.f171716d);
        com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(this.f171717e).O("");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$18");
    }
}
