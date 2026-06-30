package uu0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static uu0.c f431204v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.Object f431205w = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public uu0.k f431209d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f431212g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f431213h;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f431222q;

    /* renamed from: r, reason: collision with root package name */
    public uu0.b f431223r;

    /* renamed from: s, reason: collision with root package name */
    public uu0.a f431224s;

    /* renamed from: a, reason: collision with root package name */
    public uu0.o f431206a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f431207b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f431208c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public uu0.j f431210e = uu0.j.INITIALIZING;

    /* renamed from: f, reason: collision with root package name */
    public tu0.f f431211f = null;

    /* renamed from: i, reason: collision with root package name */
    public tu0.g f431214i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f431215j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f431216k = 0;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f431217l = null;

    /* renamed from: m, reason: collision with root package name */
    public long f431218m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f431219n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f431220o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f431221p = 0;

    /* renamed from: t, reason: collision with root package name */
    public final uu0.n f431225t = new uu0.d(this);

    /* renamed from: u, reason: collision with root package name */
    public final tu0.e f431226u = new uu0.e(this);

    public static void b(uu0.c cVar, java.lang.Boolean bool) {
        boolean z17;
        cVar.getClass();
        uu0.j jVar = uu0.j.STOP;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stop record in runnable");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordMgr", e17, "_stop", new java.lang.Object[0]);
            z17 = false;
        }
        if (cVar.f431210e == jVar) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "is stopped, don't stop again");
            return;
        }
        uu0.o oVar = cVar.f431206a;
        if (oVar != null) {
            z17 = oVar.a();
            cVar.f431206a = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "mRecorder is null, has stop record!");
            z17 = true;
        }
        cVar.f431215j = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mPcmDuration:%d", java.lang.Integer.valueOf(cVar.f431216k));
        tu0.f fVar = cVar.f431211f;
        if (fVar != null) {
            ((tu0.h) fVar).a(new byte[0], 0, true);
            cVar.f431211f.close();
            cVar.f431211f = null;
        }
        tu0.g gVar = cVar.f431214i;
        if (gVar != null) {
            gVar.d();
            cVar.f431214i = null;
        }
        if (cVar.f431222q == null) {
            cVar.f431222q = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        }
        cVar.f431222q.post(new uu0.i(cVar));
        if (cVar.f431210e == uu0.j.PAUSE) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "don't calculate time again if it is pause state");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - cVar.f431221p;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(cVar.f431220o));
            int i17 = (int) (cVar.f431220o + currentTimeMillis2);
            cVar.f431220o = i17;
            long j17 = cVar.f431218m - i17;
            cVar.f431219n = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(cVar.f431220o));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onStop");
            cVar.f431210e = jVar;
            cVar.f431207b = false;
            uu0.b bVar = cVar.f431223r;
            if (bVar != null) {
                bVar.c(cVar.f431220o, cVar.f431212g, cVar.f431213h, bool);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stop record success");
        } else {
            cVar.f(9);
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "stop record fail");
        }
        cVar.f431209d = null;
    }

    public static uu0.c e() {
        uu0.c cVar;
        synchronized (f431205w) {
            if (f431204v == null) {
                f431204v = new uu0.c();
            }
            cVar = f431204v;
        }
        return cVar;
    }

    public final void a() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "_start in runnable");
            if (!c()) {
                f(2);
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "init encoder fail");
                return;
            }
            this.f431209d.getClass();
            if (!d()) {
                f(2);
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "init SilkWriter fail");
                return;
            }
            this.f431215j = false;
            this.f431216k = 0;
            if (!g()) {
                f(6);
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "start record fail");
                return;
            }
            tu0.f fVar = this.f431211f;
            tl.w wVar = this.f431206a.f431254a;
            int c17 = wVar != null ? wVar.c() : 0;
            tu0.b bVar = (tu0.b) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "mMinBufferSize:%d", java.lang.Integer.valueOf(bVar.f422076b));
            bVar.f422076b = c17;
            tu0.f fVar2 = this.f431211f;
            double d17 = this.f431209d.f431250h;
            tu0.b bVar2 = (tu0.b) fVar2;
            bVar2.f422077c = (int) (1024.0d * d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioEncoder", "setEncodeBuffFrameSize frameKbSize:%b frameByteSize:%d", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(bVar2.f422077c));
            bVar2.f422078d = new byte[bVar2.f422077c];
            this.f431220o = 0;
            this.f431218m = this.f431209d.f431243a;
            this.f431221p = java.lang.System.currentTimeMillis();
            long j17 = this.f431218m;
            this.f431219n = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mDuration:%d, mCurrentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f431221p));
            if (this.f431222q == null) {
                this.f431222q = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
            }
            this.f431222q.post(new uu0.h(this));
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onStart");
            this.f431210e = uu0.j.START;
            this.f431207b = true;
            uu0.b bVar3 = this.f431223r;
            if (bVar3 != null) {
                bVar3.onStart();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "start record success");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordMgr", e17, "_start", new java.lang.Object[0]);
            f(4);
        }
    }

    public final boolean c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "initEncode");
        tu0.f fVar = this.f431211f;
        tu0.f fVar2 = null;
        if (fVar != null) {
            fVar.close();
            this.f431211f = null;
        }
        uu0.k kVar = this.f431209d;
        java.lang.String a17 = uu0.l.a(kVar.f431247e, kVar.f431248f);
        this.f431212g = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mFilePath:%s", a17);
        java.lang.String str = this.f431209d.f431247e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordUtil", "createEncodeByType:%s", str);
        if (uu0.l.c(str) && !"aac".equalsIgnoreCase(str) && !"mp3".equalsIgnoreCase(str)) {
            if ("wav".equalsIgnoreCase(str)) {
                fVar2 = new tu0.i();
            } else if ("pcm".equalsIgnoreCase(str)) {
                fVar2 = new tu0.h();
            }
        }
        this.f431211f = fVar2;
        boolean z17 = false;
        if (fVar2 != null) {
            if (!uu0.l.d(this.f431212g)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "prepare cache file fail");
                return false;
            }
            try {
                tu0.f fVar3 = this.f431211f;
                java.lang.String str2 = this.f431212g;
                uu0.k kVar2 = this.f431209d;
                z17 = fVar3.init(str2, kVar2.f431244b, kVar2.f431245c, kVar2.f431246d);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordMgr", e17, "init encoder fail", new java.lang.Object[0]);
            }
            ((tu0.b) this.f431211f).f422075a = this.f431226u;
        }
        return z17;
    }

    public final boolean d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "initSilkWriter");
        tu0.g gVar = this.f431214i;
        if (gVar != null) {
            gVar.c();
            this.f431214i = null;
        }
        java.lang.String a17 = uu0.l.a("silk", this.f431209d.f431248f);
        this.f431213h = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mSilkFilePath:%s", a17);
        uu0.k kVar = this.f431209d;
        this.f431214i = new tu0.g(kVar.f431244b, kVar.f431246d);
        if (!uu0.l.d(this.f431213h)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecordMgr", "prepare silk cache file fail");
            return false;
        }
        try {
            return this.f431214i.b(this.f431213h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordMgr", e17, "init silkWriter fail", new java.lang.Object[0]);
            return false;
        }
    }

    public final void f(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onError errType:%d", java.lang.Integer.valueOf(i17));
        this.f431210e = uu0.j.ERROR;
        this.f431207b = false;
        uu0.b bVar = this.f431223r;
        if (bVar != null) {
            bVar.j(i17);
        }
    }

    public final boolean g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "startRecordInternal");
        uu0.o oVar = this.f431206a;
        if (oVar != null) {
            oVar.a();
            this.f431206a = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
        }
        if (this.f431206a == null) {
            uu0.o oVar2 = new uu0.o(this.f431209d);
            this.f431206a = oVar2;
            uu0.a aVar = this.f431224s;
            if (aVar != null) {
                oVar2.f431262i = aVar;
            }
            oVar2.f431261h = this.f431225t;
        }
        uu0.o oVar3 = this.f431206a;
        oVar3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecorder", com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME);
        tl.w wVar = oVar3.f431254a;
        if (wVar != null) {
            wVar.l();
            oVar3.f431254a = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        oVar3.f431260g = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecorder", "start time ticket:%d", java.lang.Long.valueOf(currentTimeMillis));
        tl.w wVar2 = new tl.w(oVar3.f431256c, oVar3.f431257d, oVar3.f431258e);
        oVar3.f431254a = wVar2;
        wVar2.g(oVar3.f431259f);
        oVar3.f431254a.i(false);
        tl.w wVar3 = oVar3.f431254a;
        wVar3.f420172y = oVar3.f431263j;
        wVar3.e(oVar3.f431255b.f431252j);
        boolean k17 = oVar3.f431254a.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "record start:%b", java.lang.Boolean.valueOf(k17));
        return k17;
    }

    public boolean h(java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        ((ku5.t0) ku5.t0.f312615d).h(new uu0.g(this, bool), "app_brand_stop_record");
        return true;
    }
}
