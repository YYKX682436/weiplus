package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class df implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.df f118102d = new com.tencent.mm.plugin.finder.live.widget.df();

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        return charSequence.toString().contentEquals("\n") ? "" : charSequence;
    }
}
