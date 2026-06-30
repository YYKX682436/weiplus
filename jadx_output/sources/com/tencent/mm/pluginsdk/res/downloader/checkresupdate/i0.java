package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f189593a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f189594b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f189595c;

    /* renamed from: d, reason: collision with root package name */
    public final int f189596d;

    /* renamed from: e, reason: collision with root package name */
    public final int f189597e;

    /* renamed from: f, reason: collision with root package name */
    public final int f189598f;

    /* renamed from: g, reason: collision with root package name */
    public final long f189599g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f189600h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f189601i;

    /* renamed from: j, reason: collision with root package name */
    public final int f189602j;

    /* renamed from: k, reason: collision with root package name */
    public final int f189603k;

    /* renamed from: l, reason: collision with root package name */
    public final int f189604l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f189605m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f189606n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f189607o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f189608p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f189609q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f189610r;

    /* renamed from: s, reason: collision with root package name */
    public volatile int f189611s = -1;

    /* renamed from: t, reason: collision with root package name */
    public volatile java.lang.String f189612t = null;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.String f189613u = null;

    public i0(int i17, int i18, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, int i19, boolean z19, boolean z27, byte[] bArr, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5, int i27, int i28, int i29) {
        this.f189593a = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.c(i17, i18);
        this.f189596d = i17;
        this.f189597e = i18;
        this.f189605m = str;
        this.f189606n = z17;
        this.f189607o = z18;
        this.f189608p = str2;
        this.f189598f = i19;
        this.f189609q = bArr;
        this.f189610r = str3;
        this.f189594b = z19;
        this.f189595c = z27;
        this.f189600h = str4;
        this.f189599g = j17;
        this.f189601i = str5;
        this.f189602j = i27;
        this.f189603k = i28;
        this.f189604l = i29;
    }

    public static boolean c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", str);
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            m17.f213266a.d(m17.f213267b);
        }
        byte[] c17 = kk.y.c(o35.a.i(str));
        if (!com.tencent.mm.sdk.platformtools.t8.M0(c17)) {
            return o35.a.k(str2, c17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "uncompressed bytes empty");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a r23) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.i0.e(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a):java.lang.String");
    }

    public final java.lang.String a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSum(), state " + b(), this.f189593a);
        if (16 == this.f189611s) {
            return this.f189612t;
        }
        java.lang.String str = null;
        if (4 != this.f189611s && 32 != this.f189611s) {
            return null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189612t)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = this.f189593a;
            objArr[1] = b();
            objArr[2] = this.f189610r;
            byte[] bArr = this.f189609q;
            objArr[3] = bArr == null ? "null" : java.lang.String.valueOf(bArr.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, originalMd5 = %s, eccSig.size = %s", objArr);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189610r)) {
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(this.f189612t);
                if (p17 == null) {
                    p17 = "";
                }
                if (p17.equals(this.f189610r)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, md5 ok", this.f189593a, b());
                    if (this.f189611s == 4) {
                        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(this.f189599g, 23L);
                    }
                    str = this.f189612t;
                }
            }
            if (this.f189611s == 4) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(this.f189599g, 24L);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.M0(this.f189609q) && com.tencent.mm.jni.utils.UtilsJni.doEcdsaSHAVerify(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.f189558a, o35.a.i(this.f189612t), this.f189609q) > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl(), state = %s, ecc check ok", this.f189593a, b());
                if (this.f189611s == 4) {
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(this.f189599g, 25L);
                }
                str = this.f189612t;
            } else if (this.f189611s == 4) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(this.f189599g, 26L);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "%s: checkSumImpl return = %s", this.f189593a, str);
        if (this.f189611s == 4) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) && !this.f189607o) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(this.f189599g, 58L);
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(this.f189599g, 45L);
            }
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0 d0Var = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0.RETRY_SUCC;
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0 d0Var2 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0.SUCC;
            if (K0) {
                if (this.f189606n) {
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.d(this.f189596d, this.f189597e, this.f189598f, this.f189594b, true, true, false, this.f189600h);
                } else if (this.f189607o && this.f189595c) {
                    com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.c(this.f189596d, this.f189597e, this.f189601i, this.f189604l, this.f189602j > this.f189603k ? d0Var : d0Var2, false, this.f189594b, true, this.f189600h);
                }
            } else if (this.f189606n) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.d(this.f189596d, this.f189597e, this.f189598f, this.f189594b, true, true, true, this.f189600h);
            } else if (this.f189607o && this.f189595c) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.c(this.f189596d, this.f189597e, this.f189601i, this.f189604l, this.f189602j > this.f189603k ? d0Var : d0Var2, true, this.f189594b, true, this.f189600h);
            }
        }
        return str;
    }

    public final java.lang.String b() {
        int i17 = this.f189611s;
        if (i17 == 1) {
            return "state_decrypt";
        }
        if (i17 == 2) {
            return "state_decompress";
        }
        if (i17 == 4) {
            return "state_check_sum";
        }
        if (i17 == 8) {
            return "state_file_invalid";
        }
        if (i17 == 16) {
            return "state_file_valid";
        }
        if (i17 == 32) {
            return "state_pre_verify_check_sum";
        }
        return this.f189611s + "";
    }

    public final boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.A()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "inFile(%s) not exists", str);
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2));
        r6Var2.s().J();
        r6Var2.l();
        byte[] i17 = o35.a.i(str);
        boolean M0 = com.tencent.mm.sdk.platformtools.t8.M0(i17);
        long j17 = this.f189599g;
        if (M0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "read bytes empty");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 56L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 45L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 18L);
            return false;
        }
        byte[] aesDecrypt = com.tencent.mm.protocal.MMProtocalJni.aesDecrypt(i17, str3.getBytes());
        if (com.tencent.mm.sdk.platformtools.t8.M0(aesDecrypt)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypted bytes empty");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 55L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 45L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 18L);
            return false;
        }
        boolean k17 = o35.a.k(str2, aesDecrypt);
        if (!k17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.FileDecryptPerformer", "decrypt write bytes fail");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 57L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 45L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(j17, 18L);
        }
        return k17;
    }
}
