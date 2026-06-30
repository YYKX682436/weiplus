package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f153328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductUI f153329e;

    public p1(com.tencent.mm.plugin.product.ui.MallProductUI mallProductUI, android.graphics.Bitmap bitmap) {
        this.f153329e = mallProductUI;
        this.f153328d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f153329e.f153249g.setImageBitmap(this.f153328d);
    }
}
