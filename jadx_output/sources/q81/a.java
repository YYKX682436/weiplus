package q81;

/* loaded from: classes4.dex */
public abstract class a implements gm5.a {
    public abstract java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj);

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "PredownloadCmdSequence$" + e() + '$' + str;
        if (android.text.TextUtils.isEmpty(str2)) {
            return str3;
        }
        return str3 + '$' + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ff  */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r15) {
        /*
            r14 = this;
            nm5.c r15 = (nm5.c) r15
            r0 = 1
            java.lang.Object r1 = r15.a(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            r3 = 2
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrand.Predownload.AbstractCmd"
            if (r2 == 0) goto L23
            java.lang.String r1 = r14.e()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "precondition(%s) invalid appId"
            com.tencent.mars.xlog.Log.e(r5, r2, r1)
            goto Le0
        L23:
            java.lang.Object r2 = r15.a(r3)
            r45.cf7 r2 = r14.d(r2)
            if (r2 != 0) goto L3d
            java.lang.String r1 = r14.e()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "precondition(%s) null CmdBase"
            com.tencent.mars.xlog.Log.e(r5, r2, r1)
            goto Le0
        L3d:
            r81.f r6 = r81.f.INSTANCE
            int r7 = r2.f371531f
            r81.e r8 = r81.f.f393298e
            java.lang.Class r9 = r14.getClass()
            int r8 = r8.a(r9)
            r6.b(r7, r8)
            long r7 = com.tencent.mm.sdk.platformtools.t8.i1()
            int r9 = r2.f371529d
            long r9 = ik1.c0.b(r9)
            java.lang.String r11 = r14.e()
            java.lang.Long r12 = java.lang.Long.valueOf(r9)
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
            java.lang.String r12 = "precondition(%s) DealEndTime %d , now %d"
            com.tencent.mars.xlog.Log.i(r5, r12, r11)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 >= 0) goto L82
            int r1 = r2.f371531f
            r81.e r2 = r81.f.f393299f
            java.lang.Class r5 = r14.getClass()
            int r2 = r2.a(r5)
            r6.b(r1, r2)
            goto Le0
        L82:
            java.lang.String r7 = r2.f371533h
            k91.v r8 = com.tencent.mm.plugin.appbrand.app.r9.Ui()
            java.lang.String r7 = r14.c(r1, r7)
            java.lang.String r9 = "0"
            java.lang.String r7 = r8.z0(r7, r9)
            r8 = 0
            long r7 = com.tencent.mm.sdk.platformtools.t8.V(r7, r8)
            int r9 = r2.f371530e
            long r9 = ik1.c0.b(r9)
            java.lang.String r11 = r14.e()
            java.lang.Long r12 = java.lang.Long.valueOf(r7)
            java.lang.Long r13 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
            java.lang.String r12 = "precondition(%s), lastSeq %d, cmdSeq %d"
            com.tencent.mars.xlog.Log.i(r5, r12, r11)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto Lc8
            int r1 = r2.f371531f
            r81.e r2 = r81.f.f393300g
            java.lang.Class r5 = r14.getClass()
            int r2 = r2.a(r5)
            r6.b(r1, r2)
            goto Le0
        Lc8:
            if (r5 != 0) goto Le2
            boolean r1 = r14.f()
            if (r1 == 0) goto Ld1
            goto Lf3
        Ld1:
            int r1 = r2.f371531f
            r81.e r2 = r81.f.f393301h
            java.lang.Class r5 = r14.getClass()
            int r2 = r2.a(r5)
            r6.b(r1, r2)
        Le0:
            r1 = r4
            goto Lf4
        Le2:
            java.lang.String r2 = r2.f371533h
            java.lang.String r5 = java.lang.Long.toString(r9)
            k91.v r6 = com.tencent.mm.plugin.appbrand.app.r9.Ui()
            java.lang.String r1 = r14.c(r1, r2)
            r6.P2(r1, r5)
        Lf3:
            r1 = r0
        Lf4:
            if (r1 != 0) goto Lff
            km5.b r15 = km5.u.b()
            r0 = 0
            r15.a(r0)
            goto L113
        Lff:
            java.lang.Object r1 = r15.a(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r15.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r15 = r15.a(r3)
            java.lang.Object r0 = r14.b(r1, r0, r15)
        L113:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q81.a.call(java.lang.Object):java.lang.Object");
    }

    public abstract r45.cf7 d(java.lang.Object obj);

    public abstract java.lang.String e();

    public boolean f() {
        return false;
    }
}
