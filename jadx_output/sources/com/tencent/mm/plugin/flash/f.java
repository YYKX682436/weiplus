package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.d0 f137217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashPreviewLayout f137218e;

    public f(com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout, com.tencent.mm.plugin.flash.d0 d0Var) {
        this.f137218e = faceFlashPreviewLayout;
        this.f137217d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int b17;
        com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = this.f137218e;
        faceFlashPreviewLayout.f137019d.setVisibility(0);
        int min = java.lang.Math.min(com.tencent.mm.ui.bl.b(faceFlashPreviewLayout.getContext()).x, com.tencent.mm.ui.bl.b(faceFlashPreviewLayout.getContext()).y);
        int i18 = com.tencent.mm.ui.bl.b(faceFlashPreviewLayout.getContext()).x;
        int i19 = com.tencent.mm.ui.bl.b(faceFlashPreviewLayout.getContext()).y;
        com.tencent.mm.plugin.flash.d0 d0Var = this.f137217d;
        if (i18 > i19) {
            b17 = (int) (min * com.tencent.mm.plugin.flash.view.FaceFlashReflectMask.f137256q * 2.0f);
            i17 = (int) (b17 * d0Var.b());
        } else {
            i17 = (int) (min * com.tencent.mm.plugin.flash.view.FaceFlashReflectMask.f137256q * 2.0f);
            b17 = (int) (i17 * d0Var.b());
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) faceFlashPreviewLayout.f137022g.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = b17;
        int i27 = (b17 - i17) / 2;
        if (i27 < 0) {
            i27 = 0;
        }
        int circleMarginY = (int) faceFlashPreviewLayout.f137019d.getCircleMarginY();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "faceReflectMask.getCircleMarginY() >> %d", java.lang.Integer.valueOf(circleMarginY));
        if (circleMarginY > 0) {
            layoutParams.topMargin = circleMarginY - i27;
        } else {
            layoutParams.topMargin = i65.a.h(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.dimen.f480396wr) - i27;
        }
        faceFlashPreviewLayout.f137022g.setLayoutParams(layoutParams);
        faceFlashPreviewLayout.f137023h.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) faceFlashPreviewLayout.f137026n.getLayoutParams();
        layoutParams2.topMargin = (i65.a.h(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.dimen.f480396wr) + (java.lang.Math.min(i17, b17) / 2)) - (faceFlashPreviewLayout.f137026n.getHeight() / 2);
        faceFlashPreviewLayout.f137026n.setLayoutParams(layoutParams2);
        if (faceFlashPreviewLayout.f137035w != com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE) {
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) faceFlashPreviewLayout.f137028p.getLayoutParams();
            float f17 = (int) (min * com.tencent.mm.plugin.flash.view.FaceFlashReflectMask.f137256q * 2.0f);
            int i28 = (int) (0.85f * f17);
            layoutParams3.width = i28;
            layoutParams3.height = i28;
            if (circleMarginY > 0) {
                layoutParams3.topMargin = circleMarginY + (((int) (f17 * 0.14999998f)) / 2);
            } else {
                layoutParams3.topMargin = i65.a.h(faceFlashPreviewLayout.getContext(), com.tencent.mm.R.dimen.f480396wr) + (((int) (f17 * 0.14999998f)) / 2);
            }
            faceFlashPreviewLayout.f137028p.setLayoutParams(layoutParams3);
            faceFlashPreviewLayout.f137028p.setVisibility(0);
        }
    }
}
