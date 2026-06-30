package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f153284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSubmitUI f153285e;

    public e1(com.tencent.mm.plugin.product.ui.MallProductSubmitUI mallProductSubmitUI, android.graphics.Bitmap bitmap) {
        this.f153285e = mallProductSubmitUI;
        this.f153284d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f153285e.f153234m.setImageBitmap(this.f153284d);
    }
}
