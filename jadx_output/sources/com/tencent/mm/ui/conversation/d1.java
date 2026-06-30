package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class d1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207625e;

    public d1(com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog) {
        this.f207624d = pBool;
        this.f207625e = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        com.tencent.mm.pointers.PBool pBool = this.f207624d;
        return (pBool != null && pBool.value) || !((progressDialog = this.f207625e) == null || progressDialog.isShowing());
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f207625e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
