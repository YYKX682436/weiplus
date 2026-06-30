package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class rh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostTextModifyView f132961d;

    public rh(com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView) {
        this.f132961d = finderPostTextModifyView;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterTextChanged(android.text.Editable r11) {
        /*
            r10 = this;
            java.lang.String r0 = java.lang.String.valueOf(r11)
            int r0 = com.tencent.mm.ui.tools.v4.f(r0)
            com.tencent.mm.plugin.finder.view.FinderPostTextModifyView r1 = r10.f132961d
            int r2 = com.tencent.mm.plugin.finder.view.FinderPostTextModifyView.a(r1)
            int r2 = r2 - r0
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            com.tencent.mm.plugin.finder.view.pp r2 = r1.f131433x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L66
            java.lang.String r11 = java.lang.String.valueOf(r11)
            so2.p6 r5 = r1.f131428s
            sr2.w0 r2 = (sr2.w0) r2
            java.lang.String r6 = "textType"
            kotlin.jvm.internal.o.g(r5, r6)
            so2.p6 r6 = so2.p6.f410543f
            if (r5 != r6) goto L66
            qd2.r r5 = qd2.x.f361849a
            androidx.appcompat.app.AppCompatActivity r6 = r2.getActivity()
            com.tencent.mm.plugin.finder.storage.t70 r7 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            java.lang.String r7 = r7.f1()
            java.lang.String r8 = "_"
            java.lang.String r9 = ""
            java.lang.String r7 = r26.i0.t(r7, r8, r9, r3)
            java.lang.String r8 = "[^a-zA-Z0-9一-龥#]"
            java.lang.String r9 = "#"
            java.lang.String r7 = r26.i0.t(r8, r9, r7, r3)
            java.lang.String r11 = r5.b(r6, r11, r7)
            int r5 = r11.length()
            if (r5 != 0) goto L53
            r5 = r4
            goto L54
        L53:
            r5 = r3
        L54:
            if (r5 == 0) goto L61
            db5.d5 r11 = r2.f411770x
            if (r11 == 0) goto L5d
            r11.dismiss()
        L5d:
            r11 = 0
            r2.f411770x = r11
            goto L66
        L61:
            r2.r7(r11)
            r11 = r3
            goto L67
        L66:
            r11 = r4
        L67:
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L6f
            if (r11 == 0) goto L6f
            r3 = r4
        L6f:
            com.tencent.mm.ui.widget.button.WeButton r11 = r1.f131419g
            r11.setEnabled(r3)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto L79
            r0 = r2
        L79:
            int r11 = (int) r0
            java.lang.String r11 = java.lang.String.valueOf(r11)
            android.widget.TextView r0 = r1.f131423n
            r0.setText(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.rh.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
