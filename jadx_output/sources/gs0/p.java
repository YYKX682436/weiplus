package gs0;

/* loaded from: classes10.dex */
public final class p extends gs0.b {

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f275005j;

    /* renamed from: k, reason: collision with root package name */
    public final wo.i1 f275006k;

    /* renamed from: l, reason: collision with root package name */
    public long f275007l;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f275008m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f275009n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(es0.d videoCodecConfig, yz5.l lVar) {
        super(videoCodecConfig, lVar);
        kotlin.jvm.internal.o.g(videoCodecConfig, "videoCodecConfig");
        this.f275005j = "MicroMsg.MediaCodecTransEncoderAsync";
        wo.i1 b17 = wo.i1.b(videoCodecConfig.f256318h);
        this.f275006k = b17;
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("MediaCodecTransEncoder_encodeThread", 5);
        this.f275008m = a17;
        gs0.m mVar = new gs0.m(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransEncoderAsync", "MediaCodecTransEncoderAsync start");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(985L, 165L, 1L, false);
        g0Var.idkeyStat(985L, 143L, 1L, false);
        b17.a(videoCodecConfig.b(), null, null, 1);
        if (com.tencent.mm.sdk.platformtools.x2.n() && kotlin.jvm.internal.o.b(gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_REMUX_THROW_ERROR_INT_SYNC, -1), 1)) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "remuxer 抛出异常", 0).show();
            throw new java.lang.IllegalStateException("leex test error");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecTransEncoderAsync", "MediaCodecTransEncoderAsync end");
        g0Var.idkeyStat(985L, 144L, 1L, false);
        boolean c17 = fp.h.c(23);
        android.media.MediaCodec mediaCodec = b17.f447719a;
        if (c17) {
            a17.start();
            android.os.Handler handler = new android.os.Handler(a17.getLooper());
            this.f275009n = handler;
            mediaCodec.setCallback(mVar, handler);
        } else {
            mediaCodec.setCallback(mVar);
        }
        android.view.Surface e17 = b17.e();
        kotlin.jvm.internal.o.f(e17, "createInputSurface(...)");
        this.f274972b = e17;
        b17.x();
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    @Override // gs0.b
    public void a(long j17) {
        if (0 == this.f275007l) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f275007l = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // gs0.b
    public void b() {
        android.os.Handler handler = this.f275009n;
        try {
            if (handler == null) {
                kotlin.jvm.internal.o.o("encodeHandler");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            if (handler != null) {
                handler.post(new gs0.n(this));
            } else {
                kotlin.jvm.internal.o.o("encodeHandler");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f275005j, e17, "finishEncode " + hashCode() + " \n signalEndOfInputStream error:" + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // gs0.b
    public long d() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return android.os.SystemClock.elapsedRealtime() - this.f275007l;
    }

    @Override // gs0.b
    public void f() {
        try {
            android.os.Handler handler = this.f275009n;
            if (handler != null) {
                handler.post(new gs0.o(this));
            } else {
                kotlin.jvm.internal.o.o("encodeHandler");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f275005j, "release encoder error " + e17.getMessage());
        }
    }
}
