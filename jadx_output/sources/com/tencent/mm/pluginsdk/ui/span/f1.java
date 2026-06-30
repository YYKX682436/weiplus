package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public abstract class f1 {
    public static final void a(android.widget.TextView textView, yz5.l onSpanClick) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        kotlin.jvm.internal.o.g(onSpanClick, "onSpanClick");
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        spannableString.setSpan(new com.tencent.mm.pluginsdk.ui.span.e1(onSpanClick), 0, spannableString.length(), 17);
        textView.setText(spannableString);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.g(textView, spannableString);
    }
}
