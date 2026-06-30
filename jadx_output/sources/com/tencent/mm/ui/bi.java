package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class bi implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f197884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f197885e;

    public bi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, android.app.ProgressDialog progressDialog) {
        this.f197885e = singleChatInfoUI;
        this.f197884d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return com.tencent.mm.ui.SingleChatInfoUI.f197069x;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f197884d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(this.f197885e.f197077n);
        }
    }
}
