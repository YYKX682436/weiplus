package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f122459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.w1 f122460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f122461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f122462g;

    public t1(android.view.View view, com.tencent.mm.plugin.finder.playlist.w1 w1Var, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f122459d = view;
        this.f122460e = w1Var;
        this.f122461f = textView;
        this.f122462g = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        int a18 = a06.d.a(i18 * 0.6d);
        android.view.View view = this.f122459d;
        int measuredWidth = view.getMeasuredWidth() <= a18 ? view.getMeasuredWidth() : a18;
        if (measuredWidth != view.getMeasuredWidth()) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = measuredWidth;
            view.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.finder.playlist.w1 w1Var = this.f122460e;
        int dimensionPixelOffset = measuredWidth - w1Var.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);
        android.widget.TextView textView = this.f122461f;
        float measureText = textView.getPaint().measureText(textView.getText().toString());
        android.widget.TextView textView2 = this.f122462g;
        float measureText2 = textView2.getPaint().measureText(textView2.getText().toString());
        int dimensionPixelOffset2 = w1Var.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        if (measuredWidth >= a18) {
            float f17 = dimensionPixelOffset2;
            float f18 = dimensionPixelOffset;
            if (measureText + measureText2 + f17 > f18) {
                textView.setText(android.text.TextUtils.ellipsize(textView.getText(), textView.getPaint(), ((f18 - measureText2) - f17) - textView.getPaint().measureText("…"), android.text.TextUtils.TruncateAt.END));
            }
        }
    }
}
