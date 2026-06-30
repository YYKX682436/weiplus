package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class xc implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f161735a;

    public xc(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        this.f161735a = settingsHearingAidInitUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if ((r12.length == 0) == false) goto L20;
     */
    @Override // j35.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRequestPermissionsResult(int r10, java.lang.String[] r11, int[] r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onRequestPermissionsResult, requestCode: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = ", permissions: "
            r0.append(r1)
            java.lang.String r1 = "toString(...)"
            r2 = 0
            if (r11 == 0) goto L1c
            java.lang.String r11 = java.util.Arrays.toString(r11)
            kotlin.jvm.internal.o.f(r11, r1)
            goto L1d
        L1c:
            r11 = r2
        L1d:
            r0.append(r11)
            java.lang.String r11 = ", grantResults: "
            r0.append(r11)
            if (r12 == 0) goto L2e
            java.lang.String r2 = java.util.Arrays.toString(r12)
            kotlin.jvm.internal.o.f(r2, r1)
        L2e:
            r0.append(r2)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "MicroMsg.SettingsHearingAidInitUI"
            com.tencent.mars.xlog.Log.i(r0, r11)
            r11 = 80
            if (r10 != r11) goto L87
            r10 = 0
            if (r12 == 0) goto L4b
            int r11 = r12.length
            r1 = 1
            if (r11 != 0) goto L47
            r11 = r1
            goto L48
        L47:
            r11 = r10
        L48:
            if (r11 != 0) goto L4b
            goto L4c
        L4b:
            r1 = r10
        L4c:
            if (r1 != 0) goto L4f
            goto L87
        L4f:
            r10 = r12[r10]
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI r1 = r9.f161735a
            if (r10 == 0) goto L84
            java.lang.String r10 = "onRequestPermissionsResult: permission denied"
            com.tencent.mars.xlog.Log.i(r0, r10)
            int r10 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.f160424r
            r10 = 2131781308(0x7f1066bc, float:1.9194226E38)
            java.lang.String r2 = r1.getString(r10)
            r10 = 2131781309(0x7f1066bd, float:1.9194228E38)
            java.lang.String r3 = r1.getString(r10)
            r10 = 2131781307(0x7f1066bb, float:1.9194224E38)
            java.lang.String r4 = r1.getString(r10)
            r10 = 2131781306(0x7f1066ba, float:1.9194222E38)
            java.lang.String r5 = r1.getString(r10)
            r6 = 0
            com.tencent.mm.plugin.setting.ui.setting.bd r7 = new com.tencent.mm.plugin.setting.ui.setting.bd
            r7.<init>(r1)
            com.tencent.mm.plugin.setting.ui.setting.cd r8 = com.tencent.mm.plugin.setting.ui.setting.cd.f160908d
            db5.e1.C(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L84:
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.T6(r1)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.xc.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
