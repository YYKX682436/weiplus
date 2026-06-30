package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class r20 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f119569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f119570e;

    public r20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, long j17) {
        this.f119569d = e30Var;
        this.f119570e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean w17 = r4Var.w1();
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f119569d;
        if (!w17 && e30Var.D && this.f119570e == 0) {
            return;
        }
        android.widget.TextView textView = e30Var.f118219x;
        long j17 = this.f119570e;
        textView.setText(j17 > 0 ? zl2.r4.S(r4Var, j17, 0, 2, null) : "");
        android.widget.TextView textView2 = e30Var.f118219x;
        if (textView2 != null) {
            textView2.requestLayout();
        }
        android.widget.TextView textView3 = e30Var.f118219x;
        if (textView3 != null) {
            textView3.invalidate();
        }
        android.widget.TextView textView4 = e30Var.B;
        if (textView4 != null) {
            textView4.requestLayout();
        }
        android.widget.TextView textView5 = e30Var.B;
        if (textView5 != null) {
            textView5.invalidate();
        }
        android.widget.TextView textView6 = e30Var.f118219x;
        float textSize = textView6 != null ? textView6.getTextSize() : 0.0f;
        android.widget.TextView textView7 = e30Var.B;
        float textSize2 = textView7 != null ? textView7.getTextSize() : 0.0f;
        if (textSize <= 0.0f || textSize2 <= 0.0f) {
            return;
        }
        float min = java.lang.Math.min(textSize, textSize2);
        android.widget.TextView textView8 = e30Var.f118219x;
        if (textView8 != null) {
            textView8.setTextSize(0, min);
        }
        android.widget.TextView textView9 = e30Var.B;
        if (textView9 != null) {
            textView9.setTextSize(0, min);
        }
        android.widget.TextView textView10 = e30Var.f118219x;
        if (textView10 != null) {
            textView10.requestLayout();
        }
        android.widget.TextView textView11 = e30Var.B;
        if (textView11 != null) {
            textView11.requestLayout();
        }
    }
}
