package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes3.dex */
public class d2 implements p11.h {
    public d2(com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI topStoryUploadUI) {
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        com.tencent.mars.xlog.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap url = " + str);
        if (bVar == null || (bitmap = bVar.f359534d) == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap bitmap is null");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap url is null");
            return null;
        }
        if (!(view instanceof android.widget.ImageView)) {
            com.tencent.mars.xlog.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap view not ImageView");
            return null;
        }
        if (bVar.f359534d.getWidth() < bVar.f359534d.getHeight()) {
            ((android.widget.ImageView) view).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else {
            ((android.widget.ImageView) view).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return null;
    }
}
