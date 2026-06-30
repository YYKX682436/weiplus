package zw1;

/* loaded from: classes.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f476705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.n2 f476706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476708g;

    public l2(android.widget.RelativeLayout relativeLayout, zw1.n2 n2Var, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f476705d = relativeLayout;
        this.f476706e = n2Var;
        this.f476707f = textView;
        this.f476708g = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17;
        int i17;
        android.widget.RelativeLayout relativeLayout = this.f476705d;
        if (relativeLayout.getWidth() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[adjustTitleAndRedDotWidth] parentLayout.width <= 0, skip");
            return;
        }
        zw1.n2 n2Var = this.f476706e;
        int width = (((relativeLayout.getWidth() - relativeLayout.getPaddingStart()) - relativeLayout.getPaddingEnd()) - i65.a.b(n2Var.getContext(), 12)) - i65.a.b(n2Var.getContext(), 8);
        int b17 = i65.a.b(n2Var.getContext(), 32);
        int b18 = i65.a.b(n2Var.getContext(), 12);
        int b19 = i65.a.b(n2Var.getContext(), 8) + n2Var.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        android.widget.TextView textView = this.f476707f;
        android.text.TextPaint paint = textView.getPaint();
        float f18 = 0.0f;
        if (paint != null) {
            java.lang.CharSequence text = textView.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            if (obj == null) {
                obj = "";
            }
            f17 = paint.measureText(obj);
        } else {
            f17 = 0.0f;
        }
        android.widget.TextView textView2 = this.f476708g;
        android.text.TextPaint paint2 = textView2.getPaint();
        if (paint2 != null) {
            java.lang.CharSequence text2 = textView2.getText();
            java.lang.String obj2 = text2 != null ? text2.toString() : null;
            f18 = paint2.measureText(obj2 != null ? obj2 : "");
        }
        int i18 = ((width - b17) - b18) - b19;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[adjustTitleAndRedDotWidth] textBudget=" + i18 + ", titleTextW=" + f17 + ", redDotTextW=" + f18);
        if (f17 + f18 <= i18) {
            textView.setMaxWidth(Integer.MAX_VALUE);
            textView2.setMaxWidth(Integer.MAX_VALUE);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[adjustTitleAndRedDotWidth] branch=FIT_ONE_LINE");
        } else {
            int i19 = i18 / 2;
            if (i19 < 0) {
                i19 = 0;
            }
            int i27 = (int) f17;
            int i28 = (int) f18;
            if (i27 <= i19) {
                int i29 = i18 - i27;
                i17 = i29 >= 0 ? i29 : 0;
                textView.setMaxWidth(i27);
                textView2.setMaxWidth(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[adjustTitleAndRedDotWidth] branch=TITLE_SHORT_REDDOT_LONG, titleMaxW=" + i27 + ", redDotMaxW=" + i17);
            } else if (i28 <= i19) {
                int i37 = i18 - i28;
                i17 = i37 >= 0 ? i37 : 0;
                textView2.setMaxWidth(i28);
                textView.setMaxWidth(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[adjustTitleAndRedDotWidth] branch=TITLE_LONG_REDDOT_SHORT, titleMaxW=" + i17 + ", redDotMaxW=" + i28);
            } else {
                textView.setMaxWidth(i19);
                textView2.setMaxWidth(i19);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[adjustTitleAndRedDotWidth] branch=BOTH_LONG_HALF, half=" + i19);
            }
        }
        textView.requestLayout();
        textView2.requestLayout();
    }
}
