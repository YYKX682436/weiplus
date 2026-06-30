package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161556d;

    public t0(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f161556d = colorfulChatroomQRCodeUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI.f160124u;
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f161556d;
        if (colorfulChatroomQRCodeUI.W6().getLineCount() > 1) {
            android.view.ViewGroup.LayoutParams layoutParams = colorfulChatroomQRCodeUI.W6().getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(0, 0, 0, (int) (colorfulChatroomQRCodeUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz) / i65.a.m(colorfulChatroomQRCodeUI)));
                colorfulChatroomQRCodeUI.W6().setLayoutParams(layoutParams2);
            }
        }
        colorfulChatroomQRCodeUI.X6().getLayoutParams().width = (int) (colorfulChatroomQRCodeUI.X6().getWidth() / i65.a.m(colorfulChatroomQRCodeUI));
        colorfulChatroomQRCodeUI.X6().getLayoutParams().height = (int) (colorfulChatroomQRCodeUI.X6().getHeight() / i65.a.m(colorfulChatroomQRCodeUI));
        colorfulChatroomQRCodeUI.W6().requestLayout();
        colorfulChatroomQRCodeUI.X6().requestLayout();
        if (!c01.e2.R(colorfulChatroomQRCodeUI.getUserName())) {
            java.lang.String Y6 = colorfulChatroomQRCodeUI.Y6(colorfulChatroomQRCodeUI.W6().a().toString(), "...", "", colorfulChatroomQRCodeUI.W6(), true);
            com.tencent.mm.ui.widget.MMNeat7extView W6 = colorfulChatroomQRCodeUI.W6();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = colorfulChatroomQRCodeUI.W6().getTextSize();
            ((ke0.e) xVar).getClass();
            W6.b(com.tencent.mm.pluginsdk.ui.span.c0.j(colorfulChatroomQRCodeUI, Y6, textSize));
            return;
        }
        java.lang.String Y62 = colorfulChatroomQRCodeUI.Y6(colorfulChatroomQRCodeUI.W6().a().toString(), "...", "@@@@", colorfulChatroomQRCodeUI.W6(), true);
        android.graphics.drawable.Drawable drawable = colorfulChatroomQRCodeUI.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
        drawable.setBounds(0, 0, colorfulChatroomQRCodeUI.W6().getLineHeight(), colorfulChatroomQRCodeUI.W6().getLineHeight());
        android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(drawable);
        android.text.SpannableString spannableString = new android.text.SpannableString(Y62);
        com.tencent.mm.ui.widget.MMNeat7extView W62 = colorfulChatroomQRCodeUI.W6();
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        float textSize2 = colorfulChatroomQRCodeUI.W6().getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(colorfulChatroomQRCodeUI, spannableString, textSize2);
        j17.setSpan(imageSpan, Y62.length() - 4, Y62.length(), 18);
        W62.b(j17);
    }
}
