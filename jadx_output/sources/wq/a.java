package wq;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static wq.a f448469b;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f448470a;

    public static wq.a f() {
        if (f448469b == null) {
            synchronized (wq.a.class) {
                f448469b = new wq.a();
            }
        }
        return f448469b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (com.tencent.mm.sdk.platformtools.y1.e(r9) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.mm.storage.emotion.EmojiInfo r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiFileEncryptMgr"
            r1 = 0
            if (r9 != 0) goto Lb
            java.lang.String r9 = "decodeEmojiData failed. emoji is null."
            com.tencent.mars.xlog.Log.w(r0, r9)
            return r1
        Lb:
            java.lang.System.currentTimeMillis()
            java.lang.String r2 = r9.N0()
            long r3 = com.tencent.mm.vfs.w6.k(r2)
            int r3 = (int) r3
            r4 = 1024(0x400, float:1.435E-42)
            if (r3 <= r4) goto L1c
            r3 = r4
        L1c:
            byte[] r3 = com.tencent.mm.vfs.w6.N(r2, r1, r3)
            long r4 = com.tencent.mm.vfs.w6.k(r2)
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L71
            if (r3 == 0) goto L71
            int r2 = r3.length
            r4 = 10
            if (r2 < r4) goto L71
            byte[] r2 = new byte[r4]
            java.lang.System.arraycopy(r3, r1, r2, r1, r4)
            boolean r2 = com.tencent.mm.sdk.platformtools.y1.e(r2)
            r4 = 1
            if (r2 == 0) goto L3f
        L3d:
            r1 = r4
            goto L71
        L3f:
            int r9 = r9.field_reserved4
            r9 = r9 & r4
            if (r9 != r4) goto L71
            java.lang.String r9 = r8.e()
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.K0(r9)
            if (r9 != 0) goto L63
            java.lang.String r9 = r8.e()     // Catch: java.lang.Throwable -> L5b
            byte[] r9 = r9.getBytes()     // Catch: java.lang.Throwable -> L5b
            byte[] r9 = com.tencent.mm.jniinterface.AesEcb.aesCryptEcb(r3, r9, r1, r1)     // Catch: java.lang.Throwable -> L5b
            goto L64
        L5b:
            r9 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r9, r2, r3)
        L63:
            r9 = 0
        L64:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.M0(r9)
            if (r0 != 0) goto L71
            boolean r9 = com.tencent.mm.sdk.platformtools.y1.e(r9)
            if (r9 == 0) goto L71
            goto L3d
        L71:
            java.lang.System.currentTimeMillis()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wq.a.a(com.tencent.mm.storage.emotion.EmojiInfo):boolean");
    }

    public final boolean b(com.tencent.mm.api.IEmojiInfo iEmojiInfo, byte[] bArr) {
        java.lang.String H0;
        if (com.tencent.mm.sdk.platformtools.y1.h(bArr)) {
            H0 = iEmojiInfo.g1();
            if (android.text.TextUtils.isEmpty(H0)) {
                return true;
            }
        } else {
            H0 = iEmojiInfo.H0();
        }
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(bArr);
        boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(H0) || com.tencent.mm.sdk.platformtools.t8.K0(b17) || !com.tencent.mm.sdk.platformtools.t8.D0(H0, b17)) ? false : true;
        if (!z17) {
            iEmojiInfo.w();
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiFileEncryptMgr", "checkFileMd5: %s", iEmojiInfo.H0());
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] c(com.tencent.mm.api.IEmojiInfo r26) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = 0
            java.lang.String r4 = "MicroMsg.emoji.EmojiFileEncryptMgr"
            if (r2 != 0) goto Lf
            java.lang.String r0 = "decodeEmojiData failed. emoji is null."
            com.tencent.mars.xlog.Log.w(r4, r0)
            return r3
        Lf:
            java.lang.String r5 = r26.N0()
            r0 = -1
            r6 = 0
            byte[] r7 = com.tencent.mm.vfs.w6.N(r5, r6, r0)
            long r8 = com.tencent.mm.vfs.w6.k(r5)
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto Lca
            if (r7 == 0) goto Lca
            int r0 = r7.length
            r8 = 10
            if (r0 < r8) goto Lca
            byte[] r0 = new byte[r8]
            java.lang.System.arraycopy(r7, r6, r0, r6, r8)
            int r8 = r26.O1()
            r9 = 1
            r8 = r8 & r9
            if (r8 == r9) goto L45
            boolean r0 = com.tencent.mm.sdk.platformtools.y1.e(r0)
            if (r0 != 0) goto L3e
            goto L45
        L3e:
            boolean r0 = r1.b(r2, r7)
            if (r0 == 0) goto Lc9
            return r7
        L45:
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = com.tencent.mm.vfs.w6.k(r5)
            int r0 = (int) r10
            r10 = 1024(0x400, float:1.435E-42)
            if (r0 <= r10) goto L53
            goto L54
        L53:
            r10 = r0
        L54:
            byte[] r0 = com.tencent.mm.vfs.w6.N(r5, r6, r10)
            java.lang.String r11 = r25.e()
            boolean r11 = com.tencent.mm.sdk.platformtools.t8.K0(r11)
            if (r11 != 0) goto L77
            java.lang.String r11 = r25.e()     // Catch: java.lang.Throwable -> L6f
            byte[] r11 = r11.getBytes()     // Catch: java.lang.Throwable -> L6f
            byte[] r0 = com.tencent.mm.jniinterface.AesEcb.aesCryptEcb(r0, r11, r6, r6)     // Catch: java.lang.Throwable -> L6f
            goto L78
        L6f:
            r0 = move-exception
            java.lang.String r11 = ""
            java.lang.Object[] r12 = new java.lang.Object[r6]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r0, r11, r12)
        L77:
            r0 = r3
        L78:
            boolean r11 = com.tencent.mm.sdk.platformtools.t8.M0(r0)
            if (r11 != 0) goto Lad
            boolean r11 = com.tencent.mm.sdk.platformtools.t8.M0(r7)
            if (r11 != 0) goto Lad
            java.lang.System.arraycopy(r0, r6, r7, r6, r10)
            long r4 = java.lang.System.currentTimeMillis()
            long r15 = r4 - r8
            com.tencent.mm.plugin.report.service.g0 r0 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r11 = 252(0xfc, double:1.245E-321)
            r13 = 0
            r17 = 0
            r10 = r0
            r10.idkeyStat(r11, r13, r15, r17)
            r18 = 252(0xfc, double:1.245E-321)
            r20 = 5
            r22 = 1
            r24 = 0
            r17 = r0
            r17.idkeyStat(r18, r20, r22, r24)
            boolean r0 = r1.b(r2, r7)
            if (r0 == 0) goto Lc9
            return r7
        Lad:
            com.tencent.mm.plugin.report.service.g0 r8 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r9 = 252(0xfc, double:1.245E-321)
            r11 = 2
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
            java.lang.String r0 = "decode emoji file failed. path:%s return original "
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.i(r4, r0, r5)
            boolean r0 = r1.b(r2, r7)
            if (r0 == 0) goto Lc9
            return r7
        Lc9:
            return r3
        Lca:
            java.lang.String r0 = "decode emoji file failed. path is no exist :%s "
            java.lang.Object[] r2 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.i(r4, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wq.a.c(com.tencent.mm.api.IEmojiInfo):byte[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:12|(3:45|46|(2:48|(7:19|(1:21)(1:44)|22|23|24|(1:40)(1:31)|(4:33|(1:35)|36|37)(2:38|39))(2:17|18)))|14|(0)|19|(0)(0)|22|23|24|(1:26)|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiFileEncryptMgr", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(com.tencent.mm.storage.emotion.EmojiInfo r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq.a.d(com.tencent.mm.storage.emotion.EmojiInfo, boolean):boolean");
    }

    public java.lang.String e() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f448470a)) {
            gr.t g17 = gr.t.g();
            java.lang.String[] strArr = g17.f274687f;
            if (strArr[0] == null) {
                synchronized (strArr) {
                    if (g17.f274687f[0] == null) {
                        if (com.tencent.mm.sdk.platformtools.x2.n()) {
                            g17.f274687f[0] = com.tencent.mm.storage.n5.f().c().T1();
                        } else {
                            g17.f274687f[0] = h65.c.B(h65.c.C(), "getEmojiKey", null, null).getString("key_data", "");
                        }
                    }
                }
            }
            this.f448470a = g17.f274687f[0];
        }
        return this.f448470a;
    }
}
