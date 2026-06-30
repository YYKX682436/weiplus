package vi1;

/* loaded from: classes7.dex */
public final class h1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j1 f437326d;

    public h1(vi1.j1 j1Var) {
        this.f437326d = j1Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (((r2 == null || (r2 = r2.getText()) == null || r2.length() != 0) ? false : true) == false) goto L25;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(java.lang.CharSequence r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            java.lang.String r3 = "s"
            kotlin.jvm.internal.o.g(r2, r3)
            vi1.j1 r2 = r1.f437326d
            android.widget.Button r3 = r2.f437350g
            if (r3 != 0) goto Lc
            goto L3d
        Lc:
            com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView r4 = r2.f437347d
            r5 = 1
            r0 = 0
            if (r4 == 0) goto L20
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L20
            int r4 = r4.length()
            if (r4 != 0) goto L20
            r4 = r5
            goto L21
        L20:
            r4 = r0
        L21:
            if (r4 != 0) goto L39
            com.tencent.mm.ui.base.MMFormInputView r2 = r2.f437348e
            if (r2 == 0) goto L35
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L35
            int r2 = r2.length()
            if (r2 != 0) goto L35
            r2 = r5
            goto L36
        L35:
            r2 = r0
        L36:
            if (r2 != 0) goto L39
            goto L3a
        L39:
            r5 = r0
        L3a:
            r3.setEnabled(r5)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi1.h1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
