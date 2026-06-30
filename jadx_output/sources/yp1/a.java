package yp1;

/* loaded from: classes8.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r15, com.tencent.mm.pluginsdk.model.app.h5 r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r21
            java.lang.String r5 = "tokenResult"
            kotlin.jvm.internal.o.g(r0, r5)
            r5 = 3
            r6 = 1
            r7 = 5
            r8 = 2
            if (r2 == r8) goto L24
            if (r2 == r7) goto L22
            r9 = 27
            if (r2 == r9) goto L22
            r9 = 10000(0x2710, float:1.4013E-41)
            if (r2 == r9) goto L24
            r9 = r8
            goto L25
        L22:
            r9 = r5
            goto L25
        L24:
            r9 = r6
        L25:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "reportTokenResult wxSdkVersion: %x, appSdkVersion: %x, tokenResult: "
            r10.<init>(r11)
            r10.append(r0)
            java.lang.String r11 = ", appId: "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = ", cmd: "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = ", realPackageName: "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r11 = ", appPackageName: "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r11 = ", scene: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            r11 = 638067712(0x26082400, float:4.723327E-16)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13}
            java.lang.String r13 = "MicroMsg.OpenSDKTokenResultReporter"
            com.tencent.mars.xlog.Log.i(r13, r10, r12)
            com.tencent.mm.plugin.report.service.g0 r10 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r12 = 14
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r12[r13] = r14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r6] = r11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r12[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r12[r5] = r6
            java.lang.String r5 = ""
            if (r1 != 0) goto L93
            r1 = r5
        L93:
            r6 = 4
            r12[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r12[r7] = r1
            r1 = 6
            r12[r1] = r5
            if (r19 != 0) goto La3
            r1 = r5
            goto La5
        La3:
            r1 = r19
        La5:
            r2 = 7
            r12[r2] = r1
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r12[r1] = r2
            if (r3 != 0) goto Lb3
            r3 = r5
        Lb3:
            r1 = 9
            r12[r1] = r3
            if (r4 != 0) goto Lba
            r4 = r5
        Lba:
            r1 = 10
            r12[r1] = r4
            int r0 = r0.f188929d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 11
            r12[r1] = r0
            r0 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r12[r0] = r1
            r0 = 13
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z.f193109e
            r12[r0] = r1
            r0 = 15587(0x3ce3, float:2.1842E-41)
            r10.d(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yp1.a.a(int, com.tencent.mm.pluginsdk.model.app.h5, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
