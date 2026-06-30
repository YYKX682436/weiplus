package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class n6 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132695d;

    public n6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132695d = finderCommentFooter;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dest, "dest");
        android.text.Spanned spanned = dest;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            if (i28 >= spanned.length()) {
                break;
            }
            if (spanned.charAt(i28) == '\n') {
                i29++;
            }
            i28++;
        }
        int i37 = 0;
        for (int i38 = 0; i38 < source.length(); i38++) {
            if (source.charAt(i38) == '\n') {
                i37++;
            }
        }
        int i39 = i37 + i29;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132695d;
        if (i39 < finderCommentFooter.getCommentTextLineLimit()) {
            return source;
        }
        db5.t7.makeText(finderCommentFooter.getContext(), finderCommentFooter.getContext().getResources().getString(com.tencent.mm.R.string.cps), 0).show();
        int commentTextLineLimit = finderCommentFooter.getCommentTextLineLimit() - i29;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        int i47 = 0;
        int i48 = -1;
        int i49 = -1;
        while (i47 < commentTextLineLimit) {
            int K = r26.n0.K(source, '\n', i48 + 1, false, 4, null);
            if (K == -1) {
                break;
            }
            i47++;
            i49 = K;
            i48 = K + 1;
        }
        return i49 > 0 ? source.subSequence(0, i49) : i49 == 0 ? "" : source;
    }
}
