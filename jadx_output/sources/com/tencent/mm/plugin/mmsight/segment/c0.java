package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f148994d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f148995e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.d0 f148996f;

    public c0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.tencent.mm.plugin.mmsight.segment.d0 d0Var) {
        this.f148994d = bitmap;
        this.f148995e = imageView;
        this.f148996f = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f148994d;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bitmap == null);
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "bitmap is null %b in DrawBitmapOnViewTask", objArr);
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.d0 d0Var = this.f148996f;
        if (d0Var == null || d0Var.f149005h || (imageView = this.f148995e) == null) {
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "bitmap in DrawBitmapOnViewTask");
            return;
        }
        imageView.setTag(null);
        android.animation.ObjectAnimator.ofInt(imageView, "imageAlpha", 50, 255).setDuration(200L).start();
        imageView.setImageBitmap(bitmap);
    }
}
