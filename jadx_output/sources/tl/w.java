package tl;

/* loaded from: classes14.dex */
public class w {
    public yl.d A;
    public final int C;
    public java.lang.String F;

    /* renamed from: f, reason: collision with root package name */
    public final int f420153f;

    /* renamed from: g, reason: collision with root package name */
    public final int f420154g;

    /* renamed from: h, reason: collision with root package name */
    public int f420155h;

    /* renamed from: k, reason: collision with root package name */
    public int f420158k;

    /* renamed from: l, reason: collision with root package name */
    public final int f420159l;

    /* renamed from: q, reason: collision with root package name */
    public int f420164q;

    /* renamed from: s, reason: collision with root package name */
    public int f420166s;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f420170w;

    /* renamed from: x, reason: collision with root package name */
    public android.media.AudioRecord f420171x;

    /* renamed from: y, reason: collision with root package name */
    public tl.c f420172y;

    /* renamed from: z, reason: collision with root package name */
    public tl.f0 f420173z;

    /* renamed from: a, reason: collision with root package name */
    public int f420148a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f420149b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f420150c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f420151d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f420152e = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f420156i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f420157j = false;

    /* renamed from: m, reason: collision with root package name */
    public int f420160m = -123456789;

    /* renamed from: n, reason: collision with root package name */
    public boolean f420161n = false;

    /* renamed from: o, reason: collision with root package name */
    public long f420162o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long f420163p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f420165r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f420167t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f420168u = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f420169v = false;
    public boolean B = false;
    public int D = 1;
    public int E = 0;
    public long G = -1;
    public int H = -1;
    public final tl.e0 I = new tl.u(this);

    public w(int i17, int i18, int i19) {
        int i27;
        this.f420153f = 1;
        this.f420154g = 8000;
        this.f420155h = 120;
        this.f420158k = 10;
        this.f420159l = -1;
        this.f420170w = false;
        this.C = 16;
        this.f420153f = i18;
        this.f420154g = i17;
        this.f420159l = i19;
        if (i18 == 2) {
            this.C = 12;
        } else {
            this.C = 16;
        }
        if (i19 == 0 && (i27 = wo.v1.f447833m.f447749g) > 0) {
            this.f420155h = i27;
        }
        wo.o oVar = wo.v1.f447833m;
        int i28 = oVar.f447756n;
        if (i28 > 0) {
            this.C = i28;
        }
        int i29 = oVar.f447746d;
        if (i29 > 0) {
            this.f420158k = i29;
        }
        if (wo.v1.f447823c.G) {
            this.A = new yl.d(tl.i0.f420052a, i18, i17, 2);
        }
        ((bv.c) ((cv.x0) i95.n0.c(cv.x0.class))).getClass();
        this.f420170w = 1 == tl.g0.a("EnableRecorderCheckUnreasonableData", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "MMPcmRecorder sampleRate:%d channelCnt:%d durationPreFrame:%d newBufPreFrame:%b Biz:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f420155h), java.lang.Boolean.valueOf(this.f420156i), java.lang.Integer.valueOf(i19));
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "doNewIDKeyStatOnStopRecord, mRecordDetailState: %d", java.lang.Integer.valueOf(this.f420148a));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mars.smc.IDKey(357, 0, 1));
        if (this.f420148a != 0) {
            arrayList.add(new com.tencent.mars.smc.IDKey(357, 1, 1));
        }
        switch (this.f420148a) {
            case 1:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 2, 1));
                break;
            case 2:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 3, 1));
                break;
            case 3:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 4, 1));
                break;
            case 4:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 5, 1));
                break;
            case 5:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 6, 1));
                break;
            case 6:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 7, 1));
                break;
            case 7:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 8, 1));
                break;
            case 8:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 9, 1));
                break;
            case 9:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 10, 1));
                break;
            case 10:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 11, 1));
                break;
            case 11:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 12, 1));
                break;
            case 12:
                arrayList.add(new com.tencent.mars.smc.IDKey(357, 13, 1));
                break;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "do idkey, infolist size: %d", java.lang.Integer.valueOf(arrayList.size()));
        jx3.f.INSTANCE.b(arrayList, false);
    }

    public int b() {
        tl.f0 f0Var = this.f420173z;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "getAudioRecordReadNum: return cached num %d", java.lang.Integer.valueOf(this.H));
            return this.H;
        }
        int i17 = f0Var.f420047c;
        this.H = i17;
        return i17;
    }

    public int c() {
        int i17 = this.E;
        if (i17 > 0) {
            return i17;
        }
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(this.f420154g, this.C, 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "getDefaultMinBufferSize minBufSize:%d", java.lang.Integer.valueOf(minBufferSize));
        if (minBufferSize == -2 || minBufferSize == -1) {
            return 0;
        }
        int i18 = this.f420158k * minBufferSize;
        this.E = i18;
        return i18;
    }

    public final void d() {
        tl.c cVar = this.f420172y;
        if (cVar != null) {
            cVar.a(this.D, this.f420148a);
        }
    }

    public void e(int i17) {
        this.f420152e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "mAudioSource: " + i17);
    }

    public void f(boolean z17) {
        this.f420157j = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "mCheckAudioQuality: " + this.f420157j);
    }

    public void g(int i17) {
        this.f420155h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "mDurationPreFrame: " + this.f420155h);
    }

    public void h(int i17, boolean z17) {
        if (10 == this.f420158k || z17) {
            this.f420158k = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "mMultipleOfMinBuffer: " + this.f420158k);
        }
    }

    public void i(boolean z17) {
        this.f420156i = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "mNewBufPreFrame: " + this.f420156i);
    }

    public void j(boolean z17) {
        this.f420161n = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "mUsePreProcess: " + this.f420161n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x01c6, code lost:
    
        if (r11 > (-1)) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k() {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.w.k():boolean");
    }

    public synchronized boolean l() {
        if (true == this.f420167t) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "already have stopped");
            return true;
        }
        this.f420167t = true;
        boolean m17 = m();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f420162o;
        this.f420163p = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "stopRecord recordLen:%s ", java.lang.Long.valueOf(currentTimeMillis));
        if ((!this.f420165r && -1 != this.f420162o && java.lang.System.currentTimeMillis() - this.f420162o >= 2000) || this.f420169v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "stopRecord publish PermissionShowDlgEvent");
            com.tencent.mm.autogen.events.PermissionShowDlgEvent permissionShowDlgEvent = new com.tencent.mm.autogen.events.PermissionShowDlgEvent();
            permissionShowDlgEvent.f54614g.f6856a = 1;
            permissionShowDlgEvent.e();
        }
        com.tencent.mm.autogen.events.PermissionOpMarkEvent permissionOpMarkEvent = new com.tencent.mm.autogen.events.PermissionOpMarkEvent();
        am.fo foVar = permissionOpMarkEvent.f54612g;
        foVar.f6688b = 1;
        foVar.f6687a = false;
        foVar.getClass();
        permissionOpMarkEvent.e();
        a();
        return m17;
    }

    public final boolean m() {
        fp.j jVar = new fp.j();
        yl.d dVar = this.A;
        if (dVar != null) {
            dVar.a();
            this.A = null;
        }
        jVar.b();
        tl.f0 f0Var = this.f420173z;
        if (f0Var != null) {
            f0Var.b();
            this.f420173z = null;
        }
        this.B = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "cost " + jVar.a() + "ms to call stopRecord");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopRecord, ");
        sb6.append(java.lang.Thread.currentThread().getStackTrace()[2].getMethodName());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", sb6.toString());
        android.media.AudioRecord audioRecord = this.f420171x;
        if (audioRecord == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPcmRecorder", "audioRecord is null");
            return false;
        }
        if (audioRecord.getState() != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMPcmRecorder", "audioRecord sate error " + this.f420171x.getState());
            return false;
        }
        if (this.F != null) {
            int i17 = this.f420159l;
            if (i17 == 0) {
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ai(0, 0, this.F, this.f420152e, this.f420154g, this.C, this.f420148a);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ni(i17);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ri(i17);
            } else if (i17 == 1) {
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ai(0, 1, this.F, this.f420152e, this.f420154g, this.C, this.f420148a);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ni(i17);
                ((bv.c) ((cv.t0) i95.n0.c(cv.t0.class))).Ri(i17);
            }
        }
        jVar.b();
        this.f420171x.stop();
        this.f420171x.release();
        this.f420171x = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "cost " + jVar.a() + "ms to call stop and release");
        return true;
    }

    public void n(boolean z17) {
        this.B = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPcmRecorder", "switchMute mute:" + z17 + ", mRecordMode=" + this.f420173z);
        tl.f0 f0Var = this.f420173z;
        if (f0Var != null) {
            f0Var.c(z17);
        }
    }
}
