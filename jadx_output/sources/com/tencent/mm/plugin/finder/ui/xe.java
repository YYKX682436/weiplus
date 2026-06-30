package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class xe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f130022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f130023e;

    public xe(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, android.graphics.Bitmap bitmap) {
        this.f130022d = finderSelectCoverUI;
        this.f130023e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f130022d;
        if (finderSelectCoverUI.s7()) {
            android.widget.ImageView imageView = finderSelectCoverUI.f128669J;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("thumbImageView");
                throw null;
            }
            android.graphics.Bitmap bitmap = finderSelectCoverUI.W;
            if (bitmap == null) {
                kotlin.jvm.internal.o.o("thumbBitmap");
                throw null;
            }
            imageView.setImageBitmap(bitmap);
        } else if (finderSelectCoverUI.P1) {
            android.widget.SeekBar seekBar = finderSelectCoverUI.F;
            if (seekBar == null) {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
            android.content.res.Resources resources = finderSelectCoverUI.getResources();
            android.graphics.Bitmap bitmap2 = finderSelectCoverUI.W;
            if (bitmap2 == null) {
                kotlin.jvm.internal.o.o("thumbBitmap");
                throw null;
            }
            seekBar.setThumb(new android.graphics.drawable.BitmapDrawable(resources, bitmap2));
            android.widget.SeekBar seekBar2 = finderSelectCoverUI.F;
            if (seekBar2 == null) {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
            seekBar2.setThumbOffset(0);
            finderSelectCoverUI.P1 = false;
        } else {
            android.widget.SeekBar seekBar3 = finderSelectCoverUI.F;
            if (seekBar3 == null) {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
            android.graphics.drawable.Drawable thumb = seekBar3.getThumb();
            if (thumb != null) {
                thumb.invalidateSelf();
            }
        }
        android.graphics.Bitmap h76 = finderSelectCoverUI.h7();
        if (h76 != null) {
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.e7(finderSelectCoverUI, h76);
        }
        android.widget.ImageView imageView2 = finderSelectCoverUI.f128679v;
        if (imageView2 != null) {
            imageView2.setImageBitmap(this.f130023e);
        } else {
            kotlin.jvm.internal.o.o("cropBlurView");
            throw null;
        }
    }
}
