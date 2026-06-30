package com.tencent.mm.plugin.music.ui;

/* loaded from: classes4.dex */
public final class f implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew f150737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150738e;

    public f(com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew floatBallMusicViewNew, java.lang.String str) {
        this.f150737d = floatBallMusicViewNew;
        this.f150738e = str;
    }

    @Override // l01.u
    public void b() {
        int i17 = com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew.f150674i;
        this.f150737d.a();
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f150738e;
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew floatBallMusicViewNew = this.f150737d;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew.f150674i;
            floatBallMusicViewNew.a();
            return;
        }
        android.widget.ImageView imageView = floatBallMusicViewNew.f150675d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = floatBallMusicViewNew.f150675d;
        if (imageView2 != null) {
            imageView2.setPadding(0, 0, 0, 0);
        }
        android.widget.ImageView imageView3 = floatBallMusicViewNew.f150675d;
        if (imageView3 != null) {
            imageView3.setImageBitmap(bitmap);
        }
    }
}
