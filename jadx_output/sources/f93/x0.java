package f93;

/* loaded from: classes11.dex */
public final class x0 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f260500d = {'\n', ',', ';', 12289, 65292, 65307};

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelCreateUI f260501e;

    public x0(com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI) {
        this.f260501e = contactLabelCreateUI;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dest, "dest");
        for (int i28 = i17; i28 < i18; i28++) {
            char[] cArr = new char[i18 - i17];
            android.text.TextUtils.getChars(source, i17, i18, cArr, 0);
            for (char c17 : this.f260500d) {
                char c18 = cArr[i28];
                com.tencent.mm.ui.ik ikVar = com.tencent.mm.ui.jk.f209011a;
                com.tencent.mm.plugin.label.ui.ContactLabelCreateUI contactLabelCreateUI = this.f260501e;
                if (c18 == ' ' && i19 == 0 && i28 == 0) {
                    android.widget.TextView textView = contactLabelCreateUI.f143214f;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    android.widget.TextView textView2 = contactLabelCreateUI.f143214f;
                    if (textView2 != null) {
                        textView2.setText(contactLabelCreateUI.getString(com.tencent.mm.R.string.f489829cx));
                    }
                    ikVar.a();
                    return "";
                }
                if (c18 == c17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ContactLabelCreateUI", "MMInputFilter, showInvalidMsg.");
                    android.widget.TextView textView3 = contactLabelCreateUI.f143214f;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    android.widget.TextView textView4 = contactLabelCreateUI.f143214f;
                    if (textView4 != null) {
                        textView4.setText(contactLabelCreateUI.getString(com.tencent.mm.R.string.f489829cx));
                    }
                    ikVar.a();
                    return "";
                }
            }
        }
        return null;
    }
}
