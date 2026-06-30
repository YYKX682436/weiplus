package db5;

/* loaded from: classes5.dex */
public class d2 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.c5 f228315d = new com.tencent.mm.sdk.platformtools.c5();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFormMobileInputView f228316e;

    public d2(com.tencent.mm.ui.base.MMFormMobileInputView mMFormMobileInputView) {
        this.f228316e = mMFormMobileInputView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (r11.f197367i.toString().length() <= r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r11.f197363e.setSelection(r11.f197367i.toString().length());
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterTextChanged(android.text.Editable r11) {
        /*
            r10 = this;
            com.tencent.mm.ui.base.MMFormMobileInputView r11 = r10.f228316e
            android.widget.EditText r0 = r11.f197363e
            int r0 = r0.getSelectionEnd()
            android.widget.EditText r1 = r11.f197363e
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            android.widget.EditText r2 = r11.f197363e
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r0)
            if (r1 == 0) goto Lcb
            java.lang.String r4 = r11.f197366h
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto Lcb
            android.widget.EditText r4 = r11.f197362d
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "+"
            java.lang.String r6 = ""
            java.lang.String r7 = r4.replace(r5, r6)
            com.tencent.mm.sdk.platformtools.c5 r8 = r10.f228315d
            java.lang.String r7 = r8.f(r7, r1)
            r11.f197366h = r7
            java.lang.String r7 = r4.replace(r5, r6)
            java.lang.String r7 = r8.f(r7, r2)
            r11.f197367i = r7
            java.lang.String r7 = r11.f197366h
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L58
            return
        L58:
            android.widget.EditText r7 = r11.f197363e
            java.lang.String r9 = r11.f197366h
            r7.setText(r9)
            android.widget.EditText r7 = r11.f197363e
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            int r7 = r7.length()
            if (r2 == 0) goto Lbd
            java.lang.String r4 = r4.replace(r5, r6)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r4 = r8.f(r4, r2)     // Catch: java.lang.Exception -> Lc3
            r11.f197367i = r4     // Catch: java.lang.Exception -> Lc3
            int r4 = r1.length()     // Catch: java.lang.Exception -> Lc3
            r5 = 13
            if (r4 <= r5) goto L8e
            if (r0 <= r7) goto L84
            goto L8e
        L84:
            android.widget.EditText r11 = r11.f197363e     // Catch: java.lang.Exception -> Lc3
            int r0 = r2.length()     // Catch: java.lang.Exception -> Lc3
            r11.setSelection(r0)     // Catch: java.lang.Exception -> Lc3
            goto Lcb
        L8e:
            if (r0 > r7) goto Lad
            java.lang.String r2 = r11.f197367i     // Catch: java.lang.Exception -> Lc3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc3
            int r2 = r2.length()     // Catch: java.lang.Exception -> Lc3
            if (r2 <= r7) goto L9d
            goto Lad
        L9d:
            android.widget.EditText r0 = r11.f197363e     // Catch: java.lang.Exception -> Lc3
            java.lang.String r11 = r11.f197367i     // Catch: java.lang.Exception -> Lc3
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lc3
            int r11 = r11.length()     // Catch: java.lang.Exception -> Lc3
            r0.setSelection(r11)     // Catch: java.lang.Exception -> Lc3
            goto Lcb
        Lad:
            android.widget.EditText r11 = r11.f197363e     // Catch: java.lang.Exception -> Lc3
            int r1 = r1.length()     // Catch: java.lang.Exception -> Lc3
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> Lc3
            int r7 = r7 - r0
            r11.setSelection(r7)     // Catch: java.lang.Exception -> Lc3
            goto Lcb
        Lbd:
            android.widget.EditText r11 = r11.f197363e     // Catch: java.lang.Exception -> Lc3
            r11.setSelection(r3)     // Catch: java.lang.Exception -> Lc3
            goto Lcb
        Lc3:
            r11 = move-exception
            java.lang.String r0 = "MicroMsg.MMFormMobileInputView"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r11, r6, r1)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db5.d2.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
