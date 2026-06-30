package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f142755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f142756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f142757f;

    public b0(com.tencent.mm.plugin.ipcall.ui.c0 c0Var, android.widget.ImageView imageView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f142755d = imageView;
        this.f142756e = str;
        this.f142757f = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        android.widget.ImageView imageView = this.f142755d;
        if (imageView.getTag() == null || !imageView.getTag().equals(this.f142756e) || (bitmap = this.f142757f) == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }
}
