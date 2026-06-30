package f93;

/* loaded from: classes11.dex */
public final class t4 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f260470d = {'\n', ',', ';', 12289, 65292, 65307};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.u4 f260471e;

    public t4(f93.u4 u4Var) {
        this.f260471e = u4Var;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dest, "dest");
        for (int i28 = i17; i28 < i18; i28++) {
            char[] cArr = new char[i18 - i17];
            android.text.TextUtils.getChars(source, i17, i18, cArr, 0);
            for (char c17 : this.f260470d) {
                char c18 = cArr[i28];
                if (c18 == ' ' && i19 == 0 && i28 == 0) {
                    return "";
                }
                if (c18 == c17) {
                    f93.u4 u4Var = this.f260471e;
                    u4Var.b();
                    u4Var.b().setVisibility(8);
                    com.tencent.mm.ui.jk.f209011a.a();
                    dp.a.makeText(u4Var.b().getContext(), u4Var.b().getContext().getString(com.tencent.mm.R.string.f489828cw), 0).show();
                    return "";
                }
            }
        }
        return null;
    }
}
