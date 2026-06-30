package zl2;

/* loaded from: classes3.dex */
public final class j3 extends com.tencent.mm.ui.tools.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f473841h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.t4 f473842i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(int i17, com.tencent.mm.ui.tools.t4 t4Var) {
        super(i17, t4Var);
        this.f473841h = i17;
        this.f473842i = t4Var;
    }

    @Override // com.tencent.mm.ui.tools.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        int e17;
        int length = spanned != null ? spanned.length() : 0;
        com.tencent.mm.ui.tools.t4 t4Var = this.f473842i;
        if (length > i19) {
            e17 = com.tencent.mm.ui.tools.v4.e(java.lang.String.valueOf(spanned != null ? spanned.subSequence(0, i19) : null), t4Var);
        } else {
            e17 = com.tencent.mm.ui.tools.v4.e(java.lang.String.valueOf(spanned), t4Var);
        }
        int e18 = (spanned == null || spanned.length() <= i27) ? 0 : com.tencent.mm.ui.tools.v4.e(spanned.subSequence(i27, spanned.length()).toString(), t4Var);
        int e19 = com.tencent.mm.ui.tools.v4.e(java.lang.String.valueOf(charSequence), t4Var);
        int i28 = (this.f473841h - e17) - e18;
        return e19 > i28 ? zl2.r4.f473950a.c1(java.lang.String.valueOf(charSequence), i28, false) : charSequence == null ? "" : charSequence;
    }
}
