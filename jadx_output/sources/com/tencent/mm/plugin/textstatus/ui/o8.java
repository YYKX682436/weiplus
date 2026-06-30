package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174148d;

    public o8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174148d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174148d;
        android.app.ProgressDialog progressDialog = textStatusEditActivity.f173607t2;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        textStatusEditActivity.Y6();
    }
}
