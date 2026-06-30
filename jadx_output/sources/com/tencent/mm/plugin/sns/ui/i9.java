package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class i9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.j9 f168603d;

    public i9(com.tencent.mm.plugin.sns.ui.j9 j9Var) {
        this.f168603d = j9Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SightWidget$3");
        this.f168603d.f169502u = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SightWidget$3");
    }
}
