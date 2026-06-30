package gs0;

/* loaded from: classes10.dex */
public final class l extends gs0.b {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f274994j;

    /* renamed from: k, reason: collision with root package name */
    public final wo.i1 f274995k;

    /* renamed from: l, reason: collision with root package name */
    public final long f274996l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f274997m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.HandlerThread f274998n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f274999o;

    /* renamed from: p, reason: collision with root package name */
    public long f275000p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f275001q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(es0.d videoCodecConfig, yz5.l lVar) {
        super(videoCodecConfig, lVar);
        kotlin.jvm.internal.o.g(videoCodecConfig, "videoCodecConfig");
        this.f274994j = "MicroMsg.MediaCodecTransEncoder";
        this.f274996l = 50000L;
        this.f274997m = new android.media.MediaCodec.BufferInfo();
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("MediaCodecTransEncoder_encodeThread", 0);
        this.f274998n = a17;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 163L, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransEncoder", "create mp4encoder " + hashCode());
        wo.i1 b17 = wo.i1.b(videoCodecConfig.f256318h);
        this.f274995k = b17;
        b17.a(videoCodecConfig.b(), null, null, 1);
        if (com.tencent.mm.sdk.platformtools.x2.n() && kotlin.jvm.internal.o.b(gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_RECORD_THROW_ERROR_INT_SYNC, -1), 1)) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "remuxer 抛出异常", 0).show();
            throw new java.lang.IllegalStateException("leex test error");
        }
        android.view.Surface e17 = b17.e();
        kotlin.jvm.internal.o.f(e17, "createInputSurface(...)");
        this.f274972b = e17;
        b17.x();
        a17.start();
        this.f274999o = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransEncoder", "create mp4encoder finish " + hashCode());
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0137, code lost:
    
        if (r8.f274977g == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0139, code lost:
    
        if (r0 < 3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x013b, code lost:
    
        com.tencent.mars.xlog.Log.i(r8.f274994j, "isFinishEncode && timeout >= 3");
        r8.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(gs0.l r8) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs0.l.g(gs0.l):void");
    }

    @Override // gs0.b
    public void a(long j17) {
        if (0 == this.f275000p) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f275000p = android.os.SystemClock.elapsedRealtime();
        }
        this.f274999o.post(new gs0.i(this));
    }

    @Override // gs0.b
    public void b() {
        if (this.f275001q) {
            com.tencent.mars.xlog.Log.e(this.f274994j, "has received eos");
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f274999o;
        n3Var.removeCallbacksAndMessages(null);
        n3Var.post(new gs0.j(this));
    }

    @Override // gs0.b
    public long d() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return android.os.SystemClock.elapsedRealtime() - this.f275000p;
    }

    @Override // gs0.b
    public void f() {
        com.tencent.mars.xlog.Log.i(this.f274994j, "try to release " + hashCode());
        this.f274999o.post(new gs0.k(this));
    }

    public final void finalize() {
        com.tencent.mars.xlog.Log.i(this.f274994j, "finalize");
        if (this.f274978h) {
            return;
        }
        this.f274995k.q();
    }
}
