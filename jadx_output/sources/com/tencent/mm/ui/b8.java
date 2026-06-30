package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class b8 implements com.tencent.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f197219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.c8 f197220b;

    public b8(com.tencent.mm.ui.c8 c8Var, android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f197220b = c8Var;
        this.f197219a = onDismissListener;
    }

    @Override // com.tencent.mm.app.g3
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, error happened.");
        android.app.ProgressDialog progressDialog = this.f197220b.f198083b;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.j0 i17 = db5.e1.i(this.f197220b.f198084c, com.tencent.mm.R.string.f493424k44, com.tencent.mm.R.string.f490573yv);
        if (i17 != null) {
            i17.setOnDismissListener(this.f197219a);
        }
        synchronized (com.tencent.mm.ui.JSAPIUploadLogHelperUI.f196820f) {
            com.tencent.mm.ui.JSAPIUploadLogHelperUI.f196819e = false;
        }
    }

    @Override // com.tencent.mm.app.g3
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "Upload canceled(%s, %s)", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.tencent.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        if (i17 != 100) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, ipxx progress:%d", java.lang.Integer.valueOf(i17));
            android.app.ProgressDialog progressDialog = this.f197220b.f198083b;
            if (progressDialog != null) {
                progressDialog.setMessage(this.f197220b.f198084c.getString(com.tencent.mm.R.string.f493425k45) + i17 + "%");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi done.");
        android.app.ProgressDialog progressDialog2 = this.f197220b.f198083b;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.j0 i18 = db5.e1.i(this.f197220b.f198084c, com.tencent.mm.R.string.k48, com.tencent.mm.R.string.f490573yv);
        if (i18 != null) {
            i18.setOnDismissListener(this.f197219a);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12975, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        synchronized (com.tencent.mm.ui.JSAPIUploadLogHelperUI.f196820f) {
            com.tencent.mm.ui.JSAPIUploadLogHelperUI.f196819e = false;
        }
    }
}
