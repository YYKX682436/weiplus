package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f159525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159526e;

    public d0(com.tencent.mm.plugin.scanner.ui.f0 f0Var, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f159525d = imageView;
        this.f159526e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f159526e;
        android.widget.ImageView imageView = this.f159525d;
        imageView.setImageBitmap(bitmap);
        imageView.setBackgroundColor(0);
    }
}
