package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f153377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.a0 f153378e;

    public z(com.tencent.mm.plugin.product.ui.a0 a0Var, android.graphics.Bitmap bitmap) {
        this.f153378e = a0Var;
        this.f153377d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f153378e.f153266d.setImageBitmap(this.f153377d);
    }
}
