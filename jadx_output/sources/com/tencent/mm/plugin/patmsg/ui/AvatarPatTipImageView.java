package com.tencent.mm.plugin.patmsg.ui;

/* loaded from: classes5.dex */
public class AvatarPatTipImageView extends com.tencent.mm.plugin.patmsg.ui.AvatarPatImageView implements mp3.m {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.patmsg.ui.PatPopupWindow f152895i;

    public AvatarPatTipImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public float getTipTextSize() {
        try {
            return ((android.widget.TextView) this.f152895i.getContentView().findViewById(com.tencent.mm.R.id.kpx)).getTextSize();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvatarPatTipImageView", th6, "getTipTextSize err", new java.lang.Object[0]);
            return 0.0f;
        }
    }

    @Override // mp3.m
    public void m(java.lang.CharSequence charSequence) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.leftMargin = dimensionPixelSize;
        android.widget.TextView textView = (android.widget.TextView) this.f152895i.getContentView().findViewById(com.tencent.mm.R.id.kpx);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence));
        this.f152895i.a(this, 0, 1, layoutParams, false, true, false);
        post(new pp3.a(this, iArr));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        pp3.j jVar = (pp3.j) this.f152894h;
        jVar.getClass();
        jVar.f357483b = this;
    }

    @Override // com.tencent.mm.plugin.patmsg.ui.AvatarPatImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((pp3.j) this.f152894h).b();
        this.f152895i.dismiss();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
    }

    @Override // com.tencent.mm.plugin.patmsg.ui.AvatarPatImageView
    public void setTagUsername(java.lang.String str) {
        java.lang.String tagUsername = getTagUsername();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (tagUsername == null) {
            tagUsername = "";
        }
        if (!tagUsername.equals(str)) {
            ((pp3.j) this.f152894h).b();
        }
        super.setTagUsername(str);
    }

    public AvatarPatTipImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.plugin.patmsg.ui.PatPopupWindow patPopupWindow = new com.tencent.mm.plugin.patmsg.ui.PatPopupWindow(com.tencent.mm.ui.id.b(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.c8y, (android.view.ViewGroup) null));
        this.f152895i = patPopupWindow;
        patPopupWindow.setAnimationStyle(com.tencent.mm.R.style.f494445ne);
        patPopupWindow.setOutsideTouchable(false);
    }
}
