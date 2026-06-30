package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class p implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.m1 f188055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI f188056e;

    public p(com.tencent.mm.modelsimple.m1 m1Var, com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI loginDeviceListUI) {
        this.f188055d = m1Var;
        this.f188056e = loginDeviceListUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f188055d);
        android.app.ProgressDialog progressDialog = this.f188056e.f187985g;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}
