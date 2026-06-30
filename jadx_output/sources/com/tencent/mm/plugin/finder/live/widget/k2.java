package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.s2 f118799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.h0 f118800e;

    public k2(com.tencent.mm.plugin.finder.live.widget.s2 s2Var, yf2.h0 h0Var) {
        this.f118799d = s2Var;
        this.f118800e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.s2 s2Var = this.f118799d;
        android.widget.TextView textView = s2Var.f119710l;
        if (textView == null) {
            kotlin.jvm.internal.o.o("checkboxText");
            throw null;
        }
        android.text.TextPaint paint = textView.getPaint();
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f17 = fontMetrics.bottom - fontMetrics.top;
        if (s2Var.f119709k == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        float height = (f17 - r3.getHeight()) / 2;
        android.widget.CheckBox checkBox = s2Var.f119709k;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = checkBox.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = (int) height;
        android.widget.CheckBox checkBox2 = s2Var.f119709k;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        checkBox2.setLayoutParams(layoutParams2);
        java.lang.String obj = this.f118800e.f461707c.toString();
        float measureText = paint.measureText(obj);
        android.widget.LinearLayout linearLayout = s2Var.f119708j;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("checkboxContainer");
            throw null;
        }
        float width = linearLayout.getWidth();
        if (measureText > width) {
            int length = obj.length();
            float f18 = 0.0f;
            int i17 = 0;
            float f19 = 0.0f;
            while (i17 < length) {
                f19 += paint.measureText(java.lang.String.valueOf(obj.charAt(i17)));
                if (f19 > width) {
                    break;
                }
                i17++;
                f18 = f19;
            }
            measureText = f18;
        }
        android.widget.CheckBox checkBox3 = s2Var.f119709k;
        if (checkBox3 == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = checkBox3.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        int marginEnd = ((android.widget.LinearLayout.LayoutParams) layoutParams3).getMarginEnd();
        android.widget.CheckBox checkBox4 = s2Var.f119709k;
        if (checkBox4 == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        int width2 = checkBox4.getWidth() + marginEnd + ((int) measureText);
        android.widget.LinearLayout linearLayout2 = s2Var.f119708j;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("checkboxContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) layoutParams4;
        layoutParams5.width = width2;
        android.widget.LinearLayout linearLayout3 = s2Var.f119708j;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("checkboxContainer");
            throw null;
        }
        linearLayout3.setLayoutParams(layoutParams5);
        android.widget.LinearLayout linearLayout4 = s2Var.f119708j;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.o.o("checkboxContainer");
            throw null;
        }
        android.view.ViewParent parent = linearLayout4.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((android.widget.LinearLayout) parent).setGravity(1);
    }
}
