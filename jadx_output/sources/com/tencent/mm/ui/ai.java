package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ai implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f197137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f197138e;

    public ai(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, android.app.ProgressDialog progressDialog) {
        this.f197138e = singleChatInfoUI;
        this.f197137d = progressDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f197138e;
        g0Var.d(14553, 6, 3, singleChatInfoUI.f197077n);
        android.app.ProgressDialog progressDialog = this.f197137d;
        progressDialog.show();
        com.tencent.mm.ui.SingleChatInfoUI.f197069x = false;
        singleChatInfoUI.X6(progressDialog);
    }
}
