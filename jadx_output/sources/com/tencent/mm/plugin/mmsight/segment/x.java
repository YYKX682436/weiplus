package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Bitmap f149099d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f149100e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.y f149101f;

    public x(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar, android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.tencent.mm.plugin.mmsight.segment.y yVar) {
        this.f149099d = bitmap;
        this.f149100e = imageView;
        this.f149101f = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f149099d;
        if (bitmap == null || bitmap.isRecycled()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bitmap == null);
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "bitmap is null %b in DrawBitmapOnViewTask", objArr);
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.y yVar = this.f149101f;
        if (yVar == null || yVar.f149106f || (imageView = this.f149100e) == null) {
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "bitmap in DrawBitmapOnViewTask");
            return;
        }
        imageView.setTag(null);
        android.animation.ObjectAnimator.ofInt(imageView, "imageAlpha", 50, 255).setDuration(200L).start();
        imageView.setImageBitmap(bitmap);
    }
}
