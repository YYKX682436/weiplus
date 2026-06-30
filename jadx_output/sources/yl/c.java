package yl;

/* loaded from: classes12.dex */
public class c implements yl.b {

    /* renamed from: k, reason: collision with root package name */
    public static final yl.a f462921k = new yl.a();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f462922a;

    /* renamed from: b, reason: collision with root package name */
    public int f462923b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f462924c;

    /* renamed from: d, reason: collision with root package name */
    public final int f462925d;

    /* renamed from: e, reason: collision with root package name */
    public final int f462926e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f462927f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f462928g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.io.OutputStream f462929h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f462930i;

    /* renamed from: j, reason: collision with root package name */
    public w21.s f462931j;

    public c(int i17, int i18) {
        new java.util.concurrent.ArrayBlockingQueue(1024);
        this.f462923b = 0;
        this.f462924c = null;
        this.f462925d = 16000;
        this.f462926e = 64000;
        this.f462927f = new java.lang.Object();
        this.f462928g = false;
        this.f462930i = true;
        this.f462925d = i17;
        this.f462926e = i18;
    }

    @Override // yl.b
    public int a(tl.h0 h0Var, int i17) {
        return e(h0Var, i17, false);
    }

    @Override // yl.b
    public boolean b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpusWriter", "initWriter path: " + str);
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "path is null");
            return false;
        }
        java.io.OutputStream outputStream = null;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            java.lang.String substring = str.substring(0, str.lastIndexOf("/") + 1);
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(substring);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "[carl] !!!! VFS parent! exists(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(!m17.a() ? false : m17.f213266a.F(m17.f213267b)), substring);
            if (!r6Var.s().m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "[carl] ???? Dir not created! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var.s().J()), r6Var.s().o());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(357L, 58L, 1L);
            } else if (!r6Var2.s().m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "[carl] !!!! VFS not created dir! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var2.s().J()), r6Var.s().o());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(357L, 57L, 1L);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpusWriter", th6, "Check out file dir error.", new java.lang.Object[0]);
        }
        try {
            outputStream = com.tencent.mm.vfs.w6.K(str, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpusWriter", e17, "initWriter openWrite failed: %s", e17.getMessage());
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(357L, 55L, 1L);
            if (o45.wf.f343033k) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("stack", e17.getMessage());
                g0Var.i("Record", "Write failed", hashMap);
            }
        }
        if (outputStream == null) {
            return false;
        }
        try {
            return f(str, outputStream);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "initWriter FileOutputStream error:%s", e18.getMessage());
            return false;
        }
    }

    @Override // yl.b
    public boolean c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpusWriter", "resetWriter");
        synchronized (this.f462927f) {
            w21.s sVar = this.f462931j;
            if (sVar != null) {
                synchronized (sVar) {
                    if (!sVar.f442463b) {
                        sVar.f442463b = true;
                        com.tencent.mm.modelvoice.VoiceOpus.nativeEncUninit(sVar.f442462a);
                        sVar.f442462a = 0L;
                    }
                }
                this.f462931j = null;
            }
            w21.s sVar2 = new w21.s(this.f462925d, this.f462926e);
            this.f462931j = sVar2;
            if (0 != sVar2.f442462a) {
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "resetWriter OpusEncoderInit Error");
            this.f462931j = null;
            return false;
        }
    }

    @Override // yl.b
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpusWriter", "waitStop");
        synchronized (this) {
        }
        synchronized (this.f462927f) {
            try {
                w21.s sVar = this.f462931j;
                if (sVar != null) {
                    synchronized (sVar) {
                        if (!sVar.f442463b) {
                            sVar.f442463b = true;
                            com.tencent.mm.modelvoice.VoiceOpus.nativeEncUninit(sVar.f442462a);
                            sVar.f442462a = 0L;
                        }
                    }
                    this.f462931j = null;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpusWriter", "finish Thread file:" + this.f462922a);
        if (this.f462929h != null) {
            try {
                this.f462929h.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "close Opus file:" + this.f462922a + "msg:" + e17.getMessage());
            }
            this.f462929h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152 A[SYNTHETIC] */
    @Override // yl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(tl.h0 r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.c.e(tl.h0, int, boolean):int");
    }

    public boolean f(java.lang.String str, java.io.OutputStream outputStream) {
        this.f462922a = str;
        this.f462929h = outputStream;
        this.f462928g = false;
        w21.s sVar = new w21.s(this.f462925d, this.f462926e);
        this.f462931j = sVar;
        if (0 == sVar.f442462a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpusWriter", "initWriter OpusEncoderInit Error");
            this.f462931j = null;
            return false;
        }
        this.f462924c = new byte[((this.f462925d * 20) * 2) / 1000];
        if (this.f462930i) {
            w21.s sVar2 = this.f462931j;
            if (sVar2 != null) {
                sVar2.a(200, 1);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpusWriter", "Voice Message Compression Optimization is Open !");
        } else {
            w21.s sVar3 = this.f462931j;
            if (sVar3 != null) {
                sVar3.a(200, 0);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpusWriter", "Voice Message Compression Optimization is Close !");
        }
        return true;
    }
}
