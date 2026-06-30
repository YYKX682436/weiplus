package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp0.n f128939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f128940e;

    public b7(cp0.n nVar, android.graphics.Bitmap bitmap) {
        this.f128939d = nVar;
        this.f128940e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View b17 = this.f128939d.b();
        if (b17 != null) {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) b17;
            android.graphics.Bitmap bitmap = this.f128940e;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
            multiTouchImageView.i();
        }
    }
}
