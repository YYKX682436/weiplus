package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class g2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackDialogUI f142835d;

    public g2(com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackDialogUI iPCallFeedbackDialogUI) {
        this.f142835d = iPCallFeedbackDialogUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f142835d.finish();
    }
}
