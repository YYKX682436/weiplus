package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.ColorMatrixColorFilter f137193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137194e;

    public b(com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout, android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        this.f137194e = faceFlashPreviewLayout;
        this.f137193d = colorMatrixColorFilter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137194e;
        if (faceFlashPreviewLayout.f137037y) {
            faceFlashPreviewLayout.f137029q.Z6(i65.a.d(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.color.f478553an));
            faceFlashPreviewLayout.f137020e.setTextColor(i65.a.d(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
            faceFlashPreviewLayout.f137021f.setTextColor(i65.a.d(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
            faceFlashPreviewLayout.f137019d.setColorMatrixColorFilter(this.f137193d);
        }
    }
}
