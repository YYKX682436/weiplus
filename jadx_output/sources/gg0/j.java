package gg0;

/* loaded from: classes12.dex */
public final class j extends kq.n {
    public final jz5.g A;
    public final jz5.g B;

    /* renamed from: t, reason: collision with root package name */
    public final gg0.a f271513t;

    /* renamed from: u, reason: collision with root package name */
    public w21.w0 f271514u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f271515v;

    /* renamed from: w, reason: collision with root package name */
    public int f271516w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f271517x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f271518y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f271519z;

    public j(gg0.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f271513t = params;
        this.f271518y = jz5.h.b(gg0.h.f271511d);
        this.f271519z = jz5.h.b(gg0.i.f271512d);
        this.A = jz5.h.b(gg0.d.f271505d);
        this.B = jz5.h.b(gg0.e.f271506d);
    }

    public final void D() {
        eg0.e eVar = (eg0.e) i95.n0.c(eg0.e.class);
        boolean z17 = this.f311224q;
        gg0.a aVar = this.f271513t;
        if (z17) {
            java.lang.String fileName = aVar.f271488b;
            hg0.k kVar = (hg0.k) eVar;
            kVar.getClass();
            kotlin.jvm.internal.o.g(fileName, "fileName");
            kVar.f281331d.remove(fileName);
        } else {
            ((hg0.k) eVar).wi(aVar.f271488b);
        }
        fg0.g.f261836h.a().X6(aVar.f271488b);
    }

    public final cv.h1 E() {
        return (cv.h1) ((jz5.n) this.f271518y).getValue();
    }

    public final cv.i1 G() {
        return (cv.i1) ((jz5.n) this.f271519z).getValue();
    }

    public final void H(java.lang.String str) {
        ((hg0.k) ((eg0.e) i95.n0.c(eg0.e.class))).Bi(this.f271513t.f271488b, str);
    }

    public final boolean I(w21.w0 w0Var, int i17, boolean z17) {
        int i18 = w0Var.f442491h;
        w0Var.f442490g = i17;
        w0Var.f442494k = com.tencent.mm.sdk.platformtools.t8.i1();
        w0Var.f442484a = 272;
        if (i17 > i18) {
            w0Var.f442491h = i17;
            w0Var.f442489f = i17;
            w0Var.f442484a = 272 | 32 | 8;
        }
        if (z17) {
            w0Var.f442492i = 99;
            w0Var.f442505v = 0;
            w0Var.f442484a = w0Var.f442484a | 64 | 1048576;
            this.f271513t.f271495i.put("is_last_chunk", 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceDownloadTask", "updateVoiceInfoAfterCgiChunk[" + w0Var.f442485b + "] complete, newSize:" + i17 + " total:" + w0Var.f442491h);
        }
        try {
            ((bv.p0) G()).Ui(w0Var.f442485b, w0Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "updateVoiceInfoAfterCgiChunk[" + w0Var.f442485b + "] failed: " + e17);
            return false;
        }
    }

    @Override // w65.g, w65.m
    public void f1() {
        super.f1();
        w21.w0 w0Var = this.f271514u;
        if (w0Var != null) {
            qi3.c0 c0Var = new qi3.c0();
            long j17 = w0Var.f442496m;
            java.lang.String str = w0Var.f442486c;
            if (str == null) {
                str = w0Var.f442507x;
            }
            if (str == null) {
                str = "";
            }
            c0Var.f363679a = new com.tencent.mm.plugin.msg.MsgIdTalker(j17, str);
            c0Var.f363680b = this.f311219i;
            c0Var.f363681c = this.f311222o;
            jm.m mVar = (jm.m) ((qi3.w) ((jz5.n) this.B).getValue());
            mVar.getClass();
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) mVar.f300238m).getValue(), null, new jm.k(c0Var, mVar, null), 1, null);
        }
    }

    @Override // w65.m
    public java.lang.String id() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String str2 = this.f271513t.f271488b;
        if (!(!r26.n0.N(str2))) {
            str2 = null;
        }
        return str2 == null ? this.f443355d : str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x026b, code lost:
    
        if ((!(r0.length == 0)) != false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // kq.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(kotlin.coroutines.Continuation r29) {
        /*
            Method dump skipped, instructions count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.j.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kq.n
    public java.lang.String o() {
        tg3.u0 u0Var = (tg3.u0) ((jz5.n) this.A).getValue();
        gg0.a aVar = this.f271513t;
        return ((k90.b) u0Var).vj(new bm5.y(aVar.f271489c, aVar.f271490d, aVar.f271491e, aVar.f271492f, aVar.f271488b, bm5.v.f22749o, bm5.f0.f22573u), aVar.f271488b, true);
    }

    @Override // kq.n
    public void p() {
        gg0.a aVar = this.f271513t;
        java.lang.String concat = o().concat("_cdn");
        try {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            com.tencent.mm.storage.f9 k17 = e0Var.k(aVar.f271489c, aVar.f271490d);
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadCancel[" + aVar.f271488b + "] msgInfo is null");
                return;
            }
            cv.h1 E = E();
            java.lang.String str = aVar.f271488b;
            ((bv.p0) E).getClass();
            w21.x0.e(k17, str);
            e0Var.b(aVar.f271489c, aVar.f271490d);
            if (com.tencent.mm.vfs.w6.j(concat)) {
                com.tencent.mm.vfs.w6.h(concat);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadCancel[" + aVar.f271488b + "] post procedure error: " + e17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da A[Catch: Exception -> 0x016f, TryCatch #0 {Exception -> 0x016f, blocks: (B:5:0x0092, B:7:0x00a5, B:9:0x00c8, B:11:0x00cd, B:17:0x00da, B:19:0x00e6, B:20:0x00eb, B:23:0x00f6, B:26:0x0103, B:32:0x013d, B:34:0x0156), top: B:4:0x0092 }] */
    @Override // kq.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.j.r():void");
    }

    @Override // kq.n
    public void s() {
        w21.w0 w0Var;
        ((hg0.k) ((eg0.e) i95.n0.c(eg0.e.class))).wi(this.f271513t.f271488b);
        try {
            w0Var = this.f271514u;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadSuccess: update msg failed, msgId:" + this.f271513t.f271490d + " talker:" + this.f271513t.f271489c + ": " + e17);
        }
        if (w0Var == null) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        gg0.a aVar = this.f271513t;
        com.tencent.mm.storage.f9 k17 = e0Var.k(aVar.f271489c, aVar.f271490d);
        if (k17 != null) {
            k17.r1(3);
            java.lang.String str = w0Var.f442497n;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            k17.d1(w21.u0.c(str, java.lang.Math.max(w0Var.f442495l, 0), false));
            k17.l1(k17.F & (-8193));
            java.lang.String Q0 = k17.Q0();
            if (Q0 != null) {
                str2 = Q0;
            }
            e0Var.s(str2, k17.getMsgId(), k17);
        }
        try {
            gg0.a aVar2 = this.f271513t;
            yz5.p pVar = aVar2.f271496j;
            if (pVar != null) {
                pVar.invoke(aVar2.f271489c, java.lang.Long.valueOf(aVar2.f271490d));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "onDownloadSuccess: onSuccess callback error: " + e18);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new gg0.g(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0164  */
    @Override // kq.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg0.j.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kq.n
    public void u() {
        gg0.a aVar = this.f271513t;
        com.tencent.mm.storage.f9 f9Var = this.f271515v;
        if (f9Var != null) {
            this.f271515v = null;
            try {
                cv.h1 E = E();
                java.lang.String fileName = aVar.f271488b;
                ((bv.p0) E).getClass();
                kotlin.jvm.internal.o.g(fileName, "fileName");
                java.util.HashMap hashMap = w21.x0.f442511a;
                w21.p0.Di().m0(bm5.y.a(f9Var, bm5.f0.f22573u), fileName);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "releaseHeldResources[" + aVar.f271488b + "] cleanFileOperator error: " + e17);
            }
        }
        D();
    }

    @Override // kq.n
    public void w(com.tencent.mm.modelcdntran.n1 n1Var, boolean z17) {
        java.lang.String str;
        com.tencent.mm.modelcdntran.m1 m1Var;
        gg0.a aVar = this.f271513t;
        java.util.Map map = aVar.f271495i;
        long j17 = this.f311223p;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        map.put("duration", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
        if (n1Var == null || (m1Var = n1Var.f71103a) == null || (str = m1Var.name()) == null) {
            str = "";
        }
        map.put("cdn_status", str);
        map.put("is_ok", java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (z17) {
            return;
        }
        java.util.Map map2 = aVar.f271495i;
        map2.put("is_cdn", 0);
        map2.put("is_cgi", 1);
        hg0.k kVar = (hg0.k) ((eg0.e) i95.n0.c(eg0.e.class));
        kVar.getClass();
        java.lang.String fileName = aVar.f271488b;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kVar.f281331d.computeIfPresent(fileName, hg0.i.f281325a);
        com.tencent.mm.modelcdntran.m1 m1Var2 = n1Var != null ? n1Var.f71103a : null;
        kVar.Bi(fileName, (m1Var2 == null ? -1 : gg0.b.f271498a[m1Var2.ordinal()]) == 1 ? "cdn_cancel_fallback" : "cdn_error_fallback");
    }

    @Override // kq.n
    public boolean y() {
        gg0.a aVar = this.f271513t;
        try {
            cv.h1 E = E();
            java.lang.String str = aVar.f271488b;
            ((bv.p0) E).getClass();
            w21.w0 j17 = w21.x0.j(str);
            if (j17 == null) {
                return false;
            }
            j17.f442492i = 5;
            j17.f442490g = 0;
            j17.f442484a = 80;
            ((bv.p0) G()).Ui(aVar.f271488b, j17);
            this.f271514u = null;
            this.f271516w = 0;
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceDownloadTask", "resetForRetry[" + aVar.f271488b + "] error: " + e17);
            return false;
        }
    }

    @Override // w65.m
    public void z() {
        D();
    }

    @Override // w65.m
    public java.lang.Class z1() {
        return this.f271513t.f271487a;
    }
}
