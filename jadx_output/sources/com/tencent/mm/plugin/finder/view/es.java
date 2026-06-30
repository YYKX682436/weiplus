package com.tencent.mm.plugin.finder.view;

/* loaded from: classes12.dex */
public final class es implements nl5.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SignatureEditText f132058a;

    public es(com.tencent.mm.plugin.finder.view.SignatureEditText signatureEditText) {
        this.f132058a = signatureEditText;
    }

    @Override // nl5.u
    public void a(android.text.Editable editable, java.lang.CharSequence charSequence, int i17, int i18) {
        if (charSequence == null || editable == null) {
            return;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(?m)^[ \t]*\r?\n");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(charSequence).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        this.f132058a.setText(editable.replace(i17, i18 + i17, replaceAll));
    }
}
