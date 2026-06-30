package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.z0 f187991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI f187992e;

    public a(com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI extDeviceWXLoginUI, iy4.z0 z0Var) {
        this.f187992e = extDeviceWXLoginUI;
        this.f187991d = z0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f187991d);
        android.app.ProgressDialog progressDialog = this.f187992e.f187967m;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}
