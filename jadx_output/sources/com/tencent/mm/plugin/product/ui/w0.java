package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f153370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.x0 f153371e;

    public w0(com.tencent.mm.plugin.product.ui.x0 x0Var, android.graphics.Bitmap bitmap) {
        this.f153371e = x0Var;
        this.f153370d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f153371e.f153372d.setImageBitmap(this.f153370d);
    }
}
