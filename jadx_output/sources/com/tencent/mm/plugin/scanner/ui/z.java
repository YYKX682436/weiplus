package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes5.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f159822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159823e;

    public z(com.tencent.mm.plugin.scanner.ui.a0 a0Var, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f159822d = imageView;
        this.f159823e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f159823e;
        android.widget.ImageView imageView = this.f159822d;
        imageView.setImageBitmap(bitmap);
        imageView.setBackgroundColor(0);
    }
}
