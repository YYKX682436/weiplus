package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class eh implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.eh f118251d = new com.tencent.mm.plugin.finder.live.widget.eh();

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.String obj = charSequence.toString();
        while (i17 < charSequence.length()) {
            int codePointAt = obj.codePointAt(i17);
            int charCount = java.lang.Character.charCount(codePointAt);
            if (com.tencent.mm.plugin.finder.live.widget.xh.H.contains(java.lang.Integer.valueOf(java.lang.Character.getType(codePointAt)))) {
                return "";
            }
            i17 += charCount;
        }
        return charSequence;
    }
}
