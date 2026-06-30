package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fh implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.fh f118354d = new com.tencent.mm.plugin.finder.live.widget.fh();

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        kotlin.jvm.internal.o.d(charSequence);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\s");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(charSequence).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
