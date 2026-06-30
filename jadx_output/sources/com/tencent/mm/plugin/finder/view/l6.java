package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class l6 extends com.tencent.mm.ui.tools.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f132542h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.m6 f132543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(int i17, com.tencent.mm.ui.tools.t4 t4Var, com.tencent.mm.plugin.finder.view.m6 m6Var) {
        super(i17, t4Var);
        this.f132542h = i17;
        this.f132543i = m6Var;
    }

    @Override // com.tencent.mm.ui.tools.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        int i28;
        kotlin.jvm.internal.o.g(dest, "dest");
        if (charSequence == null) {
            return "";
        }
        java.lang.String obj = dest.toString();
        com.tencent.mm.plugin.finder.view.m6 m6Var = this.f132543i;
        int e17 = com.tencent.mm.ui.tools.v4.e(obj, m6Var.f42562g);
        int e18 = com.tencent.mm.ui.tools.v4.e(charSequence.toString(), m6Var.f42562g);
        int i29 = e17 + e18;
        int i37 = this.f132542h;
        if (i29 <= i37 || (i28 = i37 - e17) >= e18) {
            return charSequence;
        }
        int i38 = 1;
        while (i38 <= charSequence.length() && com.tencent.mm.ui.tools.v4.e(charSequence.subSequence(0, i38).toString(), m6Var.f42562g) <= i28) {
            i38++;
        }
        int i39 = i38 - 1;
        if (i39 <= 0 || i39 > charSequence.length()) {
            return "";
        }
        com.tencent.mm.smiley.r0 r0Var = (com.tencent.mm.smiley.r0) kz5.z.O(android.text.SpannableString.valueOf(charSequence).getSpans(0, i39, com.tencent.mm.smiley.r0.class));
        return charSequence.subSequence(0, java.lang.Math.min(i39 + (r0Var != null ? r0Var.f193354h - r0Var.f193353g : 0), charSequence.length()));
    }
}
