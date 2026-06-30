package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nq implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113670d;

    public nq(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f113670d = etVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if ((r2.getText() != null ? !r26.n0.N(r1) : false) != false) goto L16;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void afterTextChanged(android.text.Editable r7) {
        /*
            r6 = this;
            java.lang.String r7 = "Finder.LiveInputPlugin"
            java.lang.String r0 = "[afterTextChanged]"
            com.tencent.mars.xlog.Log.i(r7, r0)
            com.tencent.mm.plugin.finder.live.plugin.et r0 = r6.f113670d
            int r1 = r0.f112454t
            com.tencent.mm.ui.widget.MMEditText r2 = r0.f112461y
            ck5.f r3 = ck5.f.b(r2)
            r4 = 1
            r3.f42561f = r4
            r3.f42560e = r1
            com.tencent.mm.ui.tools.t4 r5 = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2
            r3.f42562g = r5
            r3.f42556a = r4
            com.tencent.mm.plugin.finder.live.plugin.jr r5 = new com.tencent.mm.plugin.finder.live.plugin.jr
            r5.<init>(r0, r1)
            r3.d(r5)
            com.tencent.mm.plugin.finder.live.plugin.mq r1 = new com.tencent.mm.plugin.finder.live.plugin.mq
            r1.<init>(r0)
            r2.post(r1)
            android.text.Editable r1 = r2.getText()
            r3 = 0
            if (r1 == 0) goto L3b
            int r1 = r1.length()
            if (r1 <= 0) goto L3b
            r1 = r4
            goto L3c
        L3b:
            r1 = r3
        L3c:
            if (r1 == 0) goto L4e
            android.text.Editable r1 = r2.getText()
            if (r1 == 0) goto L4a
            boolean r1 = r26.n0.N(r1)
            r1 = r1 ^ r4
            goto L4b
        L4a:
            r1 = r3
        L4b:
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r4 = r3
        L4f:
            boolean r1 = r0.T
            if (r4 != r1) goto L54
            return
        L54:
            r0.T = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[afterTextChanged] text = "
            r0.<init>(r1)
            android.text.Editable r1 = r2.getText()
            if (r1 != 0) goto L65
            java.lang.String r1 = ""
        L65:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.nq.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(java.lang.CharSequence r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.nq.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
