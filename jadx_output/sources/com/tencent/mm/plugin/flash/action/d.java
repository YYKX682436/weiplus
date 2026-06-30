package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.ColorMatrixColorFilter f137122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137123e;

    public d(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout, android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        this.f137123e = faceFlashActionPreviewLayout;
        this.f137122d = colorMatrixColorFilter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f137123e;
        if (faceFlashActionPreviewLayout.B) {
            faceFlashActionPreviewLayout.f137078s.Z6(i65.a.d(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.color.f478553an));
            faceFlashActionPreviewLayout.f137069h.setTextColor(i65.a.d(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
            faceFlashActionPreviewLayout.f137067f.setTextColor(i65.a.d(faceFlashActionPreviewLayout.getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_8));
            faceFlashActionPreviewLayout.f137066e.setColorMatrixColorFilter(this.f137122d);
        }
    }
}
