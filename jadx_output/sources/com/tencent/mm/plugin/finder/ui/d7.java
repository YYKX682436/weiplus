package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.n f129058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f129059e;

    public d7(cp0.n nVar, android.graphics.Bitmap bitmap) {
        this.f129058d = nVar;
        this.f129059e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View b17 = this.f129058d.b();
        if (b17 != null) {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) b17;
            android.graphics.Bitmap bitmap = this.f129059e;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
            multiTouchImageView.i();
        }
    }
}
