package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class l4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c4 f169728d;

    public l4(com.tencent.mm.plugin.sns.ui.c4 c4Var, com.tencent.mm.plugin.sns.model.q2 q2Var) {
        this.f169728d = c4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$8");
        this.f169728d.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$8");
    }
}
