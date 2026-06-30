package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.n3 f159583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159584e;

    public l0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI, e04.n3 n3Var) {
        this.f159584e = productUI;
        this.f159583d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.scanner.ui.ProductUI.S;
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159584e;
        e04.n3 n3Var = this.f159583d;
        productUI.b7(n3Var);
        productUI.getClass();
        if (n3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_thumburl)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "product == null || Util.isNullOrNil(product.field_thumburl)");
            return;
        }
        try {
            productUI.f159312g.setBackgroundColor(android.graphics.Color.parseColor(n3Var.field_headermask));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_headermask) && n3Var.field_headermask.length() == 9) {
                productUI.f159320r.setBackgroundColor(android.graphics.Color.parseColor("#" + n3Var.field_headermask.substring(3, 9)));
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "parse maskColor wrong");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "begin to get the url " + n3Var.field_thumburl);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.tencent.mm.plugin.scanner.ui.b1 b1Var = productUI.f159328z;
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(b1Var);
        if (d17 != null) {
            productUI.f159310e.setImageBitmap(d17);
            productUI.f159310e.setBackgroundDrawable(null);
            productUI.f159310e.setBackgroundColor(-1);
            productUI.h7();
        } else {
            productUI.f159310e.setImageBitmap(null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(n3Var.field_headerbackgroundurl)) {
            return;
        }
        e04.s3 s3Var = new e04.s3(n3Var.field_headerbackgroundurl);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d18 = x51.w0.d(s3Var);
        if (d18 == null || d18.isRecycled()) {
            return;
        }
        productUI.f159311f.setImageBitmap(d18);
    }
}
