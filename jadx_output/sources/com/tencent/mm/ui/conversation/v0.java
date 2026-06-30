package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class v0 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.w0 f208179d;

    public v0(com.tencent.mm.ui.conversation.w0 w0Var) {
        this.f208179d = w0Var;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        com.tencent.mm.ui.conversation.w0 w0Var = this.f208179d;
        return w0Var.f208205e.value || (progressDialog = w0Var.f208206f) == null || !progressDialog.isShowing();
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.ui.conversation.w0 w0Var = this.f208179d;
        s01.r.b(w0Var.f208207g, false, null);
        android.app.ProgressDialog progressDialog = w0Var.f208206f;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
