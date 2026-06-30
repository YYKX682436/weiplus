package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class e implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f198044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198045e;

    public e(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI, android.app.ProgressDialog progressDialog) {
        this.f198045e = brandServiceNotifyUI;
        this.f198044d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f198045e.f198034u;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f198044d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
