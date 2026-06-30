package ru1;

/* loaded from: classes13.dex */
public final class e implements ru1.u {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f399707a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f399708b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.HandlerThread f399709c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.vfs.y6 f399710d;

    /* renamed from: e, reason: collision with root package name */
    public final tl.w f399711e;

    public e(pu1.a audioConfig, yz5.l callback) {
        boolean fj6;
        kotlin.jvm.internal.o.g(audioConfig, "audioConfig");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f399707a = callback;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("MicroMsg.ScreenCastAudioEncoder" + hashCode());
        this.f399709c = handlerThread;
        handlerThread.start();
        this.f399708b = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
        int i17 = wo.v1.f447833m.f447764v;
        if (i17 != -1) {
            fj6 = i17 != 1 ? i17 != 2 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false) : false : true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false);
        }
        if (fj6) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a("/sdcard/ScreenCastDebug");
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("/sdcard/ScreenCastDebug/audio_");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append(".pcm");
            this.f399710d = new com.tencent.mm.vfs.y6(sb6.toString());
        }
        tl.w wVar = new tl.w(audioConfig.f358416b, audioConfig.f358417c, 9);
        this.f399711e = wVar;
        wVar.e(1);
        wVar.f420160m = -19;
        wVar.f420172y = new ru1.a(this);
    }

    @Override // ru1.u
    public void a() {
        ru1.c cVar = new ru1.c(this);
        if (this.f399709c.isAlive()) {
            this.f399708b.post(new ru1.b(cVar));
        }
    }

    @Override // ru1.u
    public void stopRecord() {
        ru1.d dVar = new ru1.d(this);
        if (this.f399709c.isAlive()) {
            this.f399708b.post(new ru1.b(dVar));
        }
    }
}
