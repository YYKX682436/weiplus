package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f153326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI f153327e;

    public p0(com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI, android.graphics.Bitmap bitmap) {
        this.f153327e = mallProductSelectSkuUI;
        this.f153326d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f153327e.f153216e.setImageBitmap(this.f153326d);
    }
}
