package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes3.dex */
public class f0 implements android.text.Spannable, java.lang.CharSequence, android.text.GetChars {

    /* renamed from: d, reason: collision with root package name */
    public final android.text.SpannableString f191210d;

    public f0() {
        this.f191210d = null;
        this.f191210d = new android.text.SpannableString("");
    }

    public void a(java.lang.Object obj, java.lang.CharSequence charSequence, int i17) {
        c(obj, 0, charSequence.length() + 0, i17);
    }

    public void b(java.lang.Object obj, java.lang.CharSequence charSequence, int i17, int i18) {
        c(obj, i17, charSequence.length() + i17, i18);
    }

    public final void c(java.lang.Object obj, int i17, int i18, int i19) {
        if (i17 >= 0) {
            android.text.SpannableString spannableString = this.f191210d;
            if (i18 <= spannableString.length()) {
                spannableString.setSpan(obj, i17, i18, i19);
            }
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i17) {
        return this.f191210d.charAt(i17);
    }

    @Override // android.text.GetChars
    public void getChars(int i17, int i18, char[] cArr, int i19) {
        this.f191210d.getChars(i17, i18, cArr, i19);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        return this.f191210d.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        return this.f191210d.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        return this.f191210d.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public java.lang.Object[] getSpans(int i17, int i18, java.lang.Class cls) {
        return this.f191210d.getSpans(i17, i18, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f191210d.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i17, int i18, java.lang.Class cls) {
        return this.f191210d.nextSpanTransition(i17, i18, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        this.f191210d.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object obj, int i17, int i18, int i19) {
        c(obj, i17, i18, i19);
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i17, int i18) {
        return this.f191210d.subSequence(i17, i18);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.f191210d.toString();
    }

    public f0(java.lang.CharSequence charSequence) {
        this.f191210d = null;
        this.f191210d = new android.text.SpannableString(charSequence);
    }

    public f0(java.lang.String str) {
        this.f191210d = null;
        this.f191210d = new android.text.SpannableString(str);
    }

    public f0(android.text.Spannable spannable) {
        this.f191210d = null;
        this.f191210d = new android.text.SpannableString(spannable);
    }

    public f0(android.text.SpannableString spannableString) {
        this.f191210d = null;
        this.f191210d = spannableString;
    }
}
