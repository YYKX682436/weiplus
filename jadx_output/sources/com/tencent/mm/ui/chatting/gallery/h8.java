package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class h8 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f200991e;

    public h8(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, android.view.View view) {
        this.f200991e = imageGalleryUI;
        this.f200990d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        this.f200990d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f200991e;
        if (imageGalleryUI.isFinishing() || imageGalleryUI.isDestroyed() || imageGalleryUI.V1) {
            return;
        }
        int B = i65.a.B(imageGalleryUI);
        int k17 = i65.a.k(imageGalleryUI);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "handleHorizontalUI width = %d, height = %d", java.lang.Integer.valueOf(B), java.lang.Integer.valueOf(k17));
        if ((B <= k17 && imageGalleryUI.y8(imageGalleryUI)) || (fp.h.c(24) && imageGalleryUI.isInMultiWindowMode())) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.W6(imageGalleryUI);
            return;
        }
        com.tencent.mm.ui.chatting.gallery.q3 q3Var = imageGalleryUI.f200605e3;
        if (q3Var != null) {
            q3Var.f201296e = false;
            android.util.SparseArray sparseArray = q3Var.f201292a;
            int size = sparseArray.size();
            for (int i18 = 0; i18 < size; i18++) {
                sparseArray.keyAt(i18);
                ((com.tencent.mm.ui.chatting.gallery.g4) sparseArray.valueAt(i18)).g();
            }
            return;
        }
        int c17 = com.tencent.mm.ui.bl.c(imageGalleryUI);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "%d handleHorizontalUI image gallery ui isNavigationBarTint %b navBarHeight %d", java.lang.Integer.valueOf(imageGalleryUI.hashCode()), java.lang.Boolean.valueOf(imageGalleryUI.f200656s), java.lang.Integer.valueOf(c17));
        android.view.View view = imageGalleryUI.W3;
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, c17, 0);
            imageGalleryUI.W3.setLayoutParams(layoutParams);
        }
        int f17 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479738dv);
        int f18 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479693cs);
        int f19 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479672c9);
        int f27 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479731dn);
        int f28 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479731dn);
        i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479672c9);
        imageGalleryUI.V7();
        int id6 = imageGalleryUI.O1.getId();
        int f29 = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479688cn);
        int max = java.lang.Math.max(c17 - (f17 * 3), 0);
        int i19 = f17 * 2;
        i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.f479672c9);
        boolean H = com.tencent.mm.ui.chatting.gallery.ja.H();
        if (H) {
            f29 = 0;
            i17 = 12;
        } else {
            i17 = 15;
        }
        imageGalleryUI.f200650q.setPadding(f28, i19, f28, i19);
        imageGalleryUI.f200606e4.setPadding(f28, f17, f28, f17);
        imageGalleryUI.B = f19;
        imageGalleryUI.C = max + f27;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.M.getLayoutParams();
        layoutParams2.removeRule(3);
        if (H) {
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.addRule(12);
        } else {
            layoutParams2.setMargins(0, f18, 0, f18);
            layoutParams2.addRule(15);
        }
        imageGalleryUI.M.setLayoutParams(layoutParams2);
        imageGalleryUI.V7();
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.O1.getLayoutParams();
        layoutParams3.setMargins(0, 0, 0, 0);
        layoutParams3.removeRule(3);
        layoutParams3.addRule(2, com.tencent.mm.R.id.d2y);
        imageGalleryUI.V7();
        imageGalleryUI.O1.setLayoutParams(layoutParams3);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.T.getLayoutParams();
        layoutParams4.removeRule(3);
        layoutParams4.setMargins(f19, f18, 0, f29);
        layoutParams4.addRule(i17);
        imageGalleryUI.T.setLayoutParams(layoutParams4);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.P.getLayoutParams();
        layoutParams5.removeRule(3);
        layoutParams5.setMargins(0, f18, 0, f29);
        layoutParams5.addRule(i17);
        imageGalleryUI.P.setLayoutParams(layoutParams5);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.X.getLayoutParams();
        if (H) {
            if (java.lang.Math.round(imageGalleryUI.X.getTextSize()) == 0) {
                imageGalleryUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca);
            }
            layoutParams6.setMargins(0, 0, 0, 0);
            layoutParams6.removeRule(3);
            layoutParams6.addRule(12);
            imageGalleryUI.X.setPadding(0, 0, 0, 0);
        } else {
            layoutParams6.setMargins(0, i19, f27, 0);
        }
        imageGalleryUI.X.setLayoutParams(layoutParams6);
        android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.Q.getLayoutParams();
        layoutParams7.removeRule(3);
        layoutParams7.setMargins(0, f18, 0, f29);
        layoutParams7.addRule(i17);
        imageGalleryUI.Q.setLayoutParams(layoutParams7);
        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.S.getLayoutParams();
        layoutParams8.removeRule(3);
        layoutParams8.setMargins(0, f18, 0, f29);
        layoutParams8.addRule(i17);
        imageGalleryUI.S.setLayoutParams(layoutParams8);
        android.widget.RelativeLayout.LayoutParams layoutParams9 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.U.getLayoutParams();
        layoutParams9.removeRule(3);
        layoutParams9.setMargins(0, f18, 0, f29);
        layoutParams9.addRule(i17);
        imageGalleryUI.U.setLayoutParams(layoutParams9);
        imageGalleryUI.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.U1.getLayoutParams();
        layoutParams10.height = i65.a.h(imageGalleryUI, com.tencent.mm.R.dimen.by);
        layoutParams10.bottomMargin = 0;
        imageGalleryUI.U7();
        imageGalleryUI.U1.setLayoutParams(layoutParams10);
        imageGalleryUI.X7();
        android.widget.RelativeLayout.LayoutParams layoutParams11 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200610f4.getLayoutParams();
        layoutParams11.addRule(3, id6);
        layoutParams11.setMargins(0, f18, 0, f29);
        layoutParams11.removeRule(i17);
        imageGalleryUI.X7();
        imageGalleryUI.f200610f4.setLayoutParams(layoutParams11);
        imageGalleryUI.S7();
        android.widget.RelativeLayout.LayoutParams layoutParams12 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200646p0.getLayoutParams();
        layoutParams12.removeRule(3);
        layoutParams12.setMargins(0, f18, f19, f29);
        layoutParams12.addRule(i17);
        imageGalleryUI.S7();
        imageGalleryUI.f200646p0.setLayoutParams(layoutParams12);
        imageGalleryUI.O7();
        android.widget.RelativeLayout.LayoutParams layoutParams13 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200629l1.f201458a.getLayoutParams();
        layoutParams13.removeRule(3);
        layoutParams13.setMargins(0, f18, f19, f29);
        layoutParams13.addRule(i17);
        imageGalleryUI.O7();
        imageGalleryUI.f200629l1.f201458a.setLayoutParams(layoutParams13);
        android.widget.RelativeLayout.LayoutParams layoutParams14 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200677y0.getLayoutParams();
        layoutParams14.removeRule(3);
        layoutParams14.setMargins(0, f18, f19, f29);
        layoutParams14.addRule(i17);
        imageGalleryUI.f200677y0.setLayoutParams(layoutParams14);
        imageGalleryUI.P7();
        android.widget.RelativeLayout.LayoutParams layoutParams15 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.A1.getLayoutParams();
        layoutParams15.removeRule(3);
        layoutParams15.setMargins(0, f18, f19, f29);
        layoutParams15.addRule(i17);
        imageGalleryUI.P7();
        imageGalleryUI.A1.setLayoutParams(layoutParams15);
        if (imageGalleryUI.f200682z1 == null) {
            imageGalleryUI.f200682z1 = imageGalleryUI.findViewById(com.tencent.mm.R.id.tze);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams16 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.f200682z1.getLayoutParams();
        layoutParams16.removeRule(3);
        layoutParams16.setMargins(0, f18, f19, f29);
        layoutParams16.addRule(i17);
        layoutParams16.addRule(20);
        imageGalleryUI.T7();
        imageGalleryUI.f200682z1.setLayoutParams(layoutParams16);
        imageGalleryUI.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams17 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.R1.getLayoutParams();
        layoutParams17.height = i65.a.f(imageGalleryUI, com.tencent.mm.R.dimen.aki);
        imageGalleryUI.U7();
        imageGalleryUI.R1.setLayoutParams(layoutParams17);
        imageGalleryUI.U7();
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = imageGalleryUI.L1;
        if (redesignVideoPlayerSeekBar instanceof com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) {
            ((com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation) redesignVideoPlayerSeekBar).setVertical(false);
        }
        imageGalleryUI.U7();
        android.widget.RelativeLayout.LayoutParams layoutParams18 = (android.widget.RelativeLayout.LayoutParams) imageGalleryUI.L1.getLayoutParams();
        if (H) {
            layoutParams18.addRule(2, id6);
            imageGalleryUI.U7();
            imageGalleryUI.L1.setPadding(0, 0, 0, 0);
        } else {
            layoutParams18.addRule(1, com.tencent.mm.R.id.f487545oy5);
            layoutParams18.addRule(0, com.tencent.mm.R.id.ozx);
            layoutParams18.setMargins(0, f18, 0, f18);
            layoutParams18.addRule(1, com.tencent.mm.R.id.p1o);
            if (imageGalleryUI.Q.getVisibility() == 0) {
                layoutParams18.addRule(1, com.tencent.mm.R.id.p1r);
            }
            if (imageGalleryUI.U.getVisibility() == 0) {
                layoutParams18.addRule(1, com.tencent.mm.R.id.p1q);
            }
        }
        imageGalleryUI.U7();
        imageGalleryUI.L1.setLayoutParams(layoutParams18);
        if (imageGalleryUI.G) {
            imageGalleryUI.G = false;
        }
    }
}
