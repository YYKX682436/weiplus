package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class c implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI f207596e;

    public c(com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI, android.app.ProgressDialog progressDialog) {
        this.f207596e = appBrandServiceConversationFmUI;
        this.f207595d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        boolean z17;
        z17 = this.f207596e.isDeleteCancel;
        return z17;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f207595d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
