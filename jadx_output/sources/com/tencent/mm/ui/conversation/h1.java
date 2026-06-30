package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class h1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f207713e;

    public h1(com.tencent.mm.pointers.PBool pBool, android.app.ProgressDialog progressDialog) {
        this.f207712d = pBool;
        this.f207713e = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f207712d.value;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f207713e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
