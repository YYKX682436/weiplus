package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159608f;

    public p0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f159608f = productUI;
        this.f159606d = str;
        this.f159607e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159608f;
        java.lang.String str = productUI.f159319q.field_thumburl;
        java.lang.String str2 = this.f159606d;
        boolean equals = str2.equals(str);
        android.graphics.Bitmap bitmap = this.f159607e;
        if (equals && productUI.f159310e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=" + str2);
            try {
                productUI.f159310e.setImageBitmap(bitmap);
                productUI.f159310e.setBackgroundDrawable(null);
                productUI.f159310e.setBackgroundColor(-1);
                productUI.h7();
                productUI.getClass();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "onGetPictureFinish : [%s]", e17.getLocalizedMessage());
            }
        }
        if (!str2.equals(productUI.f159319q.field_headerbackgroundurl) || (imageView = productUI.f159311f) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }
}
