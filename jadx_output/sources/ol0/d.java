package ol0;

/* loaded from: classes7.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:61:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r12, java.lang.String r13) {
        /*
            com.tencent.mm.vfs.z7 r13 = com.tencent.mm.vfs.z7.a(r13)
            r0 = 0
            java.lang.String r1 = r13.f213279f
            if (r1 == 0) goto L22
            java.lang.String r5 = com.tencent.mm.vfs.e8.l(r1, r0, r0)
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L22
            com.tencent.mm.vfs.z7 r1 = new com.tencent.mm.vfs.z7
            java.lang.String r3 = r13.f213277d
            java.lang.String r4 = r13.f213278e
            java.lang.String r6 = r13.f213280g
            java.lang.String r7 = r13.f213281h
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            r13 = r1
        L22:
            com.tencent.mm.vfs.b3 r1 = com.tencent.mm.vfs.a3.f212781a
            r2 = 0
            com.tencent.mm.vfs.z2 r1 = r1.m(r13, r2)
            boolean r3 = r1.a()
            if (r3 != 0) goto L31
            r3 = r0
            goto L39
        L31:
            com.tencent.mm.vfs.q2 r3 = r1.f213266a
            java.lang.String r4 = r1.f213267b
            boolean r3 = r3.F(r4)
        L39:
            r4 = 1
            java.lang.String r5 = "Kara.ZstdUtils"
            if (r3 == 0) goto L45
            java.lang.String r12 = "unzstd file exist"
            com.tencent.mars.xlog.Log.i(r5, r12)
            return r4
        L45:
            com.tencent.mm.vfs.z7 r12 = com.tencent.mm.vfs.z7.a(r12)
            java.lang.String r3 = r12.f213279f
            if (r3 == 0) goto L66
            java.lang.String r9 = com.tencent.mm.vfs.e8.l(r3, r0, r0)
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L66
            com.tencent.mm.vfs.z7 r3 = new com.tencent.mm.vfs.z7
            java.lang.String r7 = r12.f213277d
            java.lang.String r8 = r12.f213278e
            java.lang.String r10 = r12.f213280g
            java.lang.String r11 = r12.f213281h
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            r12 = r3
        L66:
            com.tencent.mm.vfs.b3 r3 = com.tencent.mm.vfs.a3.f212781a
            com.tencent.mm.vfs.z2 r3 = r3.m(r12, r2)
            boolean r6 = r3.a()
            if (r6 != 0) goto L74
            r3 = r0
            goto L7c
        L74:
            com.tencent.mm.vfs.q2 r6 = r3.f213266a
            java.lang.String r3 = r3.f213267b
            boolean r3 = r6.F(r3)
        L7c:
            if (r3 != 0) goto L85
            java.lang.String r12 = "src file not exist!!!"
            com.tencent.mars.xlog.Log.e(r5, r12)
            return r0
        L85:
            com.tencent.mars.zstd.ZstdInputStream r3 = new com.tencent.mars.zstd.ZstdInputStream     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc1
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc1
            java.io.InputStream r6 = com.tencent.mm.vfs.w6.E(r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc1
            r3.<init>(r6)     // Catch: java.lang.Throwable -> Lbe java.lang.Exception -> Lc1
            com.tencent.mm.vfs.b3 r6 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            com.tencent.mm.vfs.z2 r1 = r6.m(r13, r1)     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            java.io.OutputStream r2 = com.tencent.mm.vfs.w6.I(r13, r1, r0)     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            r13 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r13]     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
        La0:
            int r6 = r3.read(r1, r0, r13)     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            r7 = -1
            if (r6 == r7) goto Lab
            r2.write(r1, r0, r6)     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            goto La0
        Lab:
            r2.flush()     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            com.tencent.mm.vfs.w6.h(r12)     // Catch: java.lang.Exception -> Lbc java.lang.Throwable -> Ld7
            r2.close()     // Catch: java.io.IOException -> Lb8
        Lb8:
            r3.close()     // Catch: java.io.IOException -> Lbb
        Lbb:
            return r4
        Lbc:
            r12 = move-exception
            goto Lc3
        Lbe:
            r12 = move-exception
            r3 = r2
            goto Ld8
        Lc1:
            r12 = move-exception
            r3 = r2
        Lc3:
            java.lang.String r13 = "may ProcessZstd exp: %s"
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> Ld7
            com.tencent.mars.xlog.Log.e(r5, r13, r12)     // Catch: java.lang.Throwable -> Ld7
            if (r2 == 0) goto Ld1
            r2.close()     // Catch: java.io.IOException -> Ld1
        Ld1:
            if (r3 == 0) goto Ld6
            r3.close()     // Catch: java.io.IOException -> Ld6
        Ld6:
            return r0
        Ld7:
            r12 = move-exception
        Ld8:
            if (r2 == 0) goto Ldd
            r2.close()     // Catch: java.io.IOException -> Ldd
        Ldd:
            if (r3 == 0) goto Le2
            r3.close()     // Catch: java.io.IOException -> Le2
        Le2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.d.a(java.lang.String, java.lang.String):boolean");
    }
}
