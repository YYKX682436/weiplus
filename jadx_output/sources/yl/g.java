package yl;

/* loaded from: classes12.dex */
public class g implements yl.b {

    /* renamed from: o, reason: collision with root package name */
    public static final yl.a f462937o = new yl.a();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f462940c;

    /* renamed from: f, reason: collision with root package name */
    public final int f462943f;

    /* renamed from: g, reason: collision with root package name */
    public final int f462944g;

    /* renamed from: k, reason: collision with root package name */
    public volatile java.io.OutputStream f462948k;

    /* renamed from: l, reason: collision with root package name */
    public int f462949l;

    /* renamed from: n, reason: collision with root package name */
    public w21.w f462951n;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f462938a = new java.util.concurrent.ArrayBlockingQueue(1024);

    /* renamed from: b, reason: collision with root package name */
    public boolean f462939b = false;

    /* renamed from: d, reason: collision with root package name */
    public int f462941d = 0;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f462942e = null;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f462945h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public yl.f f462946i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f462947j = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f462950m = false;

    public g(int i17, int i18) {
        this.f462943f = 16000;
        this.f462944g = 16000;
        this.f462943f = i17;
        this.f462944g = i18;
    }

    @Override // yl.b
    public int a(tl.h0 h0Var, int i17) {
        return e(h0Var, i17, false);
    }

    @Override // yl.b
    public boolean b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "initWriter path: " + str);
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "path is null");
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "[carl] !!!! VFS parent! exists(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(!m17.a() ? false : m17.f213266a.F(m17.f213267b)), substring);
            if (!r6Var.s().m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "[carl] ???? Dir not created! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var.s().J()), r6Var.s().o());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(357L, 58L, 1L);
            } else if (!r6Var2.s().m()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "[carl] !!!! VFS not created dir! Do mkdirs(ret %s). Parent dir(%s)", java.lang.Boolean.valueOf(r6Var2.s().J()), r6Var.s().o());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(357L, 57L, 1L);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SilkWriter", th6, "Check out file dir error.", new java.lang.Object[0]);
        }
        try {
            outputStream = com.tencent.mm.vfs.w6.K(str, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SilkWriter", e17, "initWriter openWrite failed: %s", e17.getMessage());
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "initWriter FileOutputStream error:%s", e18.getMessage());
            return false;
        }
    }

    @Override // yl.b
    public boolean c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "resetWriter");
        synchronized (this.f462945h) {
            try {
                w21.w wVar = this.f462951n;
                if (wVar != null) {
                    com.tencent.mm.modelvoice.MediaRecorder.SilkEncUnInit(wVar.f442483a);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        w21.w wVar2 = new w21.w(this.f462943f, this.f462944g, this.f462949l);
        this.f462951n = wVar2;
        if (0 != wVar2.f442483a) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "resetWriter SilkEncoderInit Error");
        this.f462951n = null;
        return false;
    }

    @Override // yl.b
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "waitStop");
        synchronized (this) {
            this.f462939b = true;
        }
        yl.f fVar = this.f462946i;
        if (fVar != null) {
            try {
                java.util.concurrent.Future future = fVar.f462935d;
                if (future != null) {
                    future.get();
                }
            } catch (java.lang.InterruptedException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            } catch (java.util.concurrent.ExecutionException e18) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            }
        }
        synchronized (this.f462945h) {
            try {
                w21.w wVar = this.f462951n;
                if (wVar != null) {
                    com.tencent.mm.modelvoice.MediaRecorder.SilkEncUnInit(wVar.f442483a);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "finish Thread file:" + this.f462940c);
        if (this.f462948k != null) {
            try {
                this.f462948k.close();
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "close silk file:" + this.f462940c + "msg:" + e19.getMessage());
            }
            this.f462948k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015a A[SYNTHETIC] */
    @Override // yl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(tl.h0 r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl.g.e(tl.h0, int, boolean):int");
    }

    public boolean f(java.lang.String str, java.io.OutputStream outputStream) {
        this.f462940c = str;
        this.f462948k = outputStream;
        this.f462947j = false;
        int a17 = wo.r.a();
        if ((a17 & 1024) != 0) {
            this.f462949l = 4;
        } else {
            if ((a17 & 512) == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "initWriter cpuType error! silk don't support arm_v5!!!!");
                return false;
            }
            this.f462949l = 2;
        }
        w21.w wVar = new w21.w(this.f462943f, this.f462944g, this.f462949l);
        this.f462951n = wVar;
        if (0 == wVar.f442483a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "initWriter SilkEncoderInit Error");
            this.f462951n = null;
            return false;
        }
        this.f462942e = new byte[((this.f462943f * 20) * 2) / 1000];
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_msg_voice_silk_opt, -1);
        if (1 == Ni) {
            this.f462950m = true;
        }
        if (Ni == 0) {
            this.f462950m = false;
        }
        if (this.f462950m) {
            w21.w wVar2 = this.f462951n;
            if (wVar2 != null) {
                com.tencent.mm.modelvoice.MediaRecorder.SetVoiceSilkControl(200, 1, wVar2.f442483a);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Open !");
        } else {
            w21.w wVar3 = this.f462951n;
            if (wVar3 != null) {
                com.tencent.mm.modelvoice.MediaRecorder.SetVoiceSilkControl(200, 0, wVar3.f442483a);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "Voice Message Compression Optimization is Close !");
        }
        return true;
    }

    public void g(byte[] bArr, int i17, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.util.concurrent.BlockingQueue blockingQueue = this.f462938a;
        objArr[0] = java.lang.Integer.valueOf(blockingQueue == null ? -1 : ((java.util.concurrent.ArrayBlockingQueue) blockingQueue).size());
        objArr[1] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkWriter", "pushBuf queueLen:%d bufLen:%d len:%d, lastFrame: %s", objArr);
        if (i17 <= 0) {
            return;
        }
        synchronized (this) {
            if (this.f462939b) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkWriter", "already stop");
                return;
            }
            if (this.f462946i == null) {
                this.f462946i = new yl.f(this, null);
                ((ku5.t0) ku5.t0.f312615d).g(this.f462946i);
            }
            java.util.concurrent.BlockingQueue blockingQueue2 = this.f462938a;
            if (blockingQueue2 != null) {
                try {
                    ((java.util.concurrent.ArrayBlockingQueue) blockingQueue2).add(new tl.h0(bArr, i17, z17));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SilkWriter", e17, "pushBuf add queue error:%s", e17.getMessage());
                }
            }
        }
    }
}
