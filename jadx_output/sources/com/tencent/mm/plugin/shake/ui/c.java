package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f162244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f162245e;

    public c(android.app.ProgressDialog progressDialog, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f162244d = progressDialog;
        this.f162245e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.ProgressDialog progressDialog = this.f162244d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f162245e.sendEmptyMessage(0);
        }
    }
}
