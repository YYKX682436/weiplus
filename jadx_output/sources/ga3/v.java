package ga3;

/* loaded from: classes15.dex */
public class v {
    public static ga3.v A;
    public static final java.lang.Object B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam f269878d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f269881g;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f269885k;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f269894t;

    /* renamed from: a, reason: collision with root package name */
    public ga3.e f269875a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f269876b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f269877c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public ga3.u f269879e = ga3.u.INITIALIZING;

    /* renamed from: f, reason: collision with root package name */
    public kh1.e f269880f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f269882h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f269883i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f269884j = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f269886l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f269887m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f269888n = 1;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f269889o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f269890p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f269891q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f269892r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f269893s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f269895u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f269896v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f269897w = false;

    /* renamed from: x, reason: collision with root package name */
    public final ga3.d f269898x = new ga3.m(this);

    /* renamed from: y, reason: collision with root package name */
    public final kh1.d f269899y = new ga3.n(this);

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.media.record.k f269900z = new ga3.k(this);

    static {
        com.tencent.mm.plugin.appbrand.media.record.o0.f85832a = new ga3.l();
        B = new java.lang.Object();
    }

    public static void c(ga3.v vVar) {
        com.tencent.mm.plugin.appbrand.media.record.l lVar;
        vVar.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "LiteAppRecorderManager _start in runnable");
            vVar.f269885k = "";
            if (!vVar.f()) {
                vVar.h(2);
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "init encoder fail");
                vVar.f269885k = "init encoder fail";
                return;
            }
            vVar.f269882h = false;
            vVar.f269883i = 0;
            if (!vVar.f269895u) {
                vVar.f269895u = true;
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = vVar.f269878d;
                if (recordParam != null && (lVar = recordParam.f85846r) != null) {
                    ((com.tencent.mm.plugin.appbrand.media.record.i0) lVar).f85812a = vVar.f269900z;
                    ((com.tencent.mm.plugin.appbrand.media.record.i0) lVar).b();
                }
            }
            if (!vVar.j()) {
                vVar.h(6);
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "start record fail");
                return;
            }
            kh1.e eVar = vVar.f269880f;
            tl.w wVar = vVar.f269875a.f269844a;
            eVar.c(wVar != null ? wVar.c() : 0);
            vVar.f269880f.b(vVar.f269878d.f85842n);
            vVar.f269892r = 0;
            vVar.f269890p = vVar.f269878d.f85835d;
            vVar.f269893s = java.lang.System.currentTimeMillis();
            long j17 = vVar.f269890p;
            vVar.f269891q = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "mDuration:%d, mCurrentTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(vVar.f269893s));
            vVar.e().post(new ga3.g(vVar));
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onStart");
            vVar.f269879e = ga3.u.START;
            vVar.f269876b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "start record success");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppRecordMgr", e17, "_start", new java.lang.Object[0]);
            vVar.h(4);
        }
    }

    public static void d(ga3.v vVar) {
        vVar.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "_resume in runnable");
            vVar.f269885k = "";
            if (vVar.f269880f == null) {
                vVar.h(3);
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "resume record fail, mAudioEncoder is null");
                vVar.f269885k = "resume record fail, mAudioEncoder is null";
            } else if (vVar.f269891q <= 0) {
                vVar.b();
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "resume record fail, record time reach max time, to stop record");
                vVar.f269885k = "resume record fail, record time reach max time, to stop record";
            } else if (vVar.j()) {
                vVar.f269893s = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "mLimitTime:%d, currentTime:%d", java.lang.Long.valueOf(vVar.f269891q), java.lang.Long.valueOf(vVar.f269893s));
                vVar.e().post(new ga3.h(vVar));
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onResume");
                vVar.f269879e = ga3.u.RESUME;
                vVar.f269876b = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "resume record success");
            } else {
                vVar.h(7);
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "resume record fail");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppRecordMgr", e17, "_resume", new java.lang.Object[0]);
            vVar.h(5);
        }
    }

    public static ga3.v g() {
        ga3.v vVar;
        synchronized (B) {
            if (A == null) {
                A = new ga3.v();
            }
            vVar = A;
        }
        return vVar;
    }

    public void a() {
        boolean z17;
        com.tencent.mm.plugin.appbrand.media.record.l lVar;
        ga3.u uVar = ga3.u.PAUSE;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "pause record in runnable");
        this.f269885k = "";
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppRecordMgr", e17, "_pause", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f269879e == uVar) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "recorder is paused, don't pause again");
            this.f269885k = "recorder is paused, don't pause again";
            return;
        }
        ga3.e eVar = this.f269875a;
        if (eVar != null) {
            z17 = eVar.a();
            this.f269875a = null;
        } else {
            z17 = false;
        }
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = this.f269878d;
        if (recordParam != null && (lVar = recordParam.f85846r) != null) {
            boolean a17 = ((com.tencent.mm.plugin.appbrand.media.record.i0) lVar).a();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "isInterrupted:%b, interrupted:%b", java.lang.Boolean.valueOf(this.f269896v), java.lang.Boolean.valueOf(a17));
            if (a17 && !this.f269896v) {
                this.f269896v = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onInterruptionBegin");
            }
        }
        e().post(new ga3.i(this));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - this.f269893s;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f269892r));
        int i17 = (int) (this.f269892r + j17);
        this.f269892r = i17;
        long j18 = this.f269890p - i17;
        this.f269891q = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f269892r));
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            h(8);
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "pause record fail");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onPause");
            this.f269879e = uVar;
            this.f269876b = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "pause record success");
        }
    }

    public final void b() {
        boolean z17;
        ga3.u uVar = ga3.u.STOP;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "stop record in runnable");
        this.f269885k = "";
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppRecordMgr", e17, "_stop", new java.lang.Object[0]);
            z17 = false;
        }
        if (this.f269879e == uVar) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "recorder is stopped, don't stop again");
            this.f269885k = "recorder is stopped, don't stop again";
            return;
        }
        ga3.e eVar = this.f269875a;
        if (eVar != null) {
            z17 = eVar.a();
            this.f269875a = null;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "mRecorder is null, has stop record!");
            z17 = true;
        }
        this.f269882h = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "mPcmDuration:%d", java.lang.Integer.valueOf(this.f269883i));
        kh1.e eVar2 = this.f269880f;
        if (eVar2 != null) {
            eVar2.flush();
            this.f269880f.close();
            this.f269880f = null;
        }
        e().post(new ga3.j(this));
        if (this.f269879e == ga3.u.PAUSE) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "don't calculate time again if it is pause state");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f269893s;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(this.f269892r));
            int i17 = (int) (this.f269892r + currentTimeMillis2);
            this.f269892r = i17;
            long j17 = this.f269890p - i17;
            this.f269891q = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f269892r));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "stop:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onStop");
            this.f269879e = uVar;
            this.f269876b = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "stop record success");
        } else {
            h(9);
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "stop record fail");
        }
        java.lang.String str = this.f269878d.f85844p;
        java.lang.Long l17 = ga3.b.f269839a;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis3 - ga3.b.f269841c <= ga3.b.f269840b.longValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordCacheClean", "The last clean time is in AUDIO_RECORD_NO_SCAN_TIME time");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "start clean audio record file");
            ga3.b.f269841c = currentTimeMillis3;
            ((ku5.t0) ku5.t0.f312615d).h(new ga3.a(str), "LiteAppRecorderCacheClean");
        }
        this.f269878d = null;
    }

    public final com.tencent.mm.sdk.platformtools.n3 e() {
        if (this.f269894t == null) {
            this.f269894t = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        }
        return this.f269894t;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga3.v.f():boolean");
    }

    public void h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onError errType:%d", java.lang.Integer.valueOf(i17));
        ga3.u uVar = this.f269879e;
        ga3.u uVar2 = ga3.u.ERROR;
        if (uVar != uVar2) {
            com.tencent.mm.plugin.appbrand.media.record.o0.b(i17);
        }
        this.f269879e = uVar2;
        this.f269876b = false;
    }

    public java.lang.String i(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            jSONObject.put("error", str2);
            jSONObject.put("isNoisy", z17);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final boolean j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "startRecordInternal");
        ga3.e eVar = this.f269875a;
        if (eVar != null) {
            eVar.a();
            this.f269875a = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "mRecorder is not null, stop it");
        }
        if (this.f269875a == null) {
            this.f269887m = 0;
            this.f269888n = 1;
            ga3.e eVar2 = new ga3.e(this.f269878d);
            this.f269875a = eVar2;
            eVar2.f269849f = this.f269898x;
        }
        ga3.e eVar3 = this.f269875a;
        eVar3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecorder", "LiteApp startRecord");
        tl.w wVar = eVar3.f269844a;
        if (wVar != null) {
            wVar.l();
            eVar3.f269844a = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        eVar3.f269848e = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecorder", "LiteApp start record time ticket:%d", java.lang.Long.valueOf(currentTimeMillis));
        eVar3.f269844a = new tl.w(eVar3.f269846c, eVar3.f269847d, eVar3.f269850g);
        com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam recordParam = eVar3.f269845b;
        if ("mp3".equalsIgnoreCase(recordParam.f85839h)) {
            eVar3.f269844a.g(40);
        } else {
            eVar3.f269844a.g(20);
        }
        eVar3.f269844a.i(false);
        tl.w wVar2 = eVar3.f269844a;
        wVar2.f420172y = eVar3.f269851h;
        wVar2.e(recordParam.f85845q.f85806d);
        boolean k17 = eVar3.f269844a.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "record start:%b", java.lang.Boolean.valueOf(k17));
        return k17;
    }

    public java.lang.String k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME);
        boolean z17 = false;
        if (this.f269875a == null && this.f269880f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
            return i("", "mRecord is null and mAudioEncoder is null, stop fail", false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ga3.t tVar = new ga3.t(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        try {
            t0Var.l(tVar, 0L, "lite_app_stop_record").get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
        int i17 = this.f269886l;
        if (i17 != 0 && this.f269887m >= i17) {
            this.f269887m = 0;
            z17 = true;
            this.f269888n = 1;
        }
        return i(this.f269881g, this.f269885k, z17);
    }

    public final void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "LiteAppRecorderManager stopTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f269889o;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f269889o = null;
    }
}
