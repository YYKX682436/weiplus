package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class hd {
    public static void a(com.tencent.neattextview.textview.view.NeatTextView neatTextView) {
        java.lang.CharSequence a17 = neatTextView.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            neatTextView.b(c(a17));
        }
        java.lang.CharSequence hint = neatTextView.getHint();
        if (!android.text.TextUtils.isEmpty(hint)) {
            neatTextView.setHint(c(hint));
        }
        java.lang.CharSequence contentDescription = neatTextView.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            return;
        }
        neatTextView.setContentDescription(c(contentDescription));
    }

    public static void b(android.widget.TextView textView) {
        java.lang.CharSequence text = textView.getText();
        if (!android.text.TextUtils.isEmpty(text)) {
            textView.setText(c(text));
        }
        java.lang.CharSequence hint = textView.getHint();
        if (!android.text.TextUtils.isEmpty(hint)) {
            textView.setHint(c(hint));
        }
        java.lang.CharSequence contentDescription = textView.getContentDescription();
        if (android.text.TextUtils.isEmpty(contentDescription)) {
            return;
        }
        textView.setContentDescription(c(contentDescription));
    }

    public static java.lang.String c(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        java.lang.String charSequence2 = charSequence.toString();
        return android.text.TextUtils.isEmpty(charSequence2) ? charSequence2 : com.tencent.mm.sdk.platformtools.p9.e(charSequence2);
    }
}
