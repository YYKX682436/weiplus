package dh2;

/* loaded from: classes10.dex */
public final class b0 implements ah2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ah2.e f232421a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole f232422b;

    /* renamed from: c, reason: collision with root package name */
    public om2.s f232423c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f232424d;

    /* renamed from: e, reason: collision with root package name */
    public ah2.d f232425e;

    /* renamed from: f, reason: collision with root package name */
    public jh2.c f232426f;

    /* renamed from: g, reason: collision with root package name */
    public long f232427g;

    /* renamed from: h, reason: collision with root package name */
    public long f232428h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f232429i;

    /* renamed from: j, reason: collision with root package name */
    public long f232430j;

    /* renamed from: k, reason: collision with root package name */
    public final bh2.c f232431k;

    public b0(com.tencent.trtc.TRTCCloud trtcCloud, ah2.e service, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        kotlin.jvm.internal.o.g(trtcCloud, "trtcCloud");
        kotlin.jvm.internal.o.g(service, "service");
        this.f232421a = service;
        this.f232422b = tXChorusRole;
        this.f232424d = "LiveKTVSingEngine";
        int i17 = tXChorusRole == null ? -1 : dh2.y.f232483a[tXChorusRole.ordinal()];
        bh2.c vVar = (i17 == 1 || i17 == 2 || i17 == 3) ? new bh2.v(trtcCloud, service, tXChorusRole) : new bh2.l(trtcCloud, service);
        this.f232431k = vVar;
        dh2.x xVar = ((dh2.w) service).f232466a;
        float intValue = ((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) xVar.f232468e.a(om2.e.class)).f346293i).getValue()).intValue();
        vVar.a(intValue / 12.0f);
        jh2.c cVar = this.f232426f;
        if (cVar != null) {
            cVar.setKeyShift((int) intValue);
        }
        int intValue2 = ((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) xVar.f232468e.a(om2.e.class)).f346298q).getValue()).intValue();
        double d17 = (intValue2 == 2 || intValue2 == 4) ? 1.0d : 0.8d;
        jh2.c cVar2 = this.f232426f;
        if (cVar2 != null) {
            cVar2.d(d17);
        }
    }

    public static final void a(dh2.b0 b0Var) {
        java.lang.String str = b0Var.f232424d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkStartTimer bgmTimerJob: ");
        kotlinx.coroutines.r2 r2Var = b0Var.f232429i;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlinx.coroutines.r2 r2Var2 = b0Var.f232429i;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = ((dh2.w) b0Var.f232421a).f232466a.f232470g;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        b0Var.f232429i = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new dh2.z(b0Var, null), 2, null);
    }

    public boolean b() {
        return this.f232431k.isPlaying();
    }

    public final void c(long j17) {
        this.f232427g = java.lang.System.currentTimeMillis();
        this.f232428h = j17;
        com.tencent.mars.xlog.Log.i(this.f232424d, "setInitTimeStamp initOffsetTime: " + j17);
    }

    public void d(bh2.w channel) {
        kotlin.jvm.internal.o.g(channel, "channel");
        com.tencent.mars.xlog.Log.i(this.f232424d, "switchMusicChannel channel: " + channel);
        this.f232431k.e(channel);
    }
}
