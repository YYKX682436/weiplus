package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes11.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.a1 f185846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pq0 f185847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.lq0 f185848f;

    public z0(com.tencent.mm.plugin.webview.ui.tools.media.a1 a1Var, bw5.kq0 kq0Var, bw5.pq0 pq0Var, bw5.lq0 lq0Var, bw5.mq0 mq0Var) {
        this.f185846d = a1Var;
        this.f185847e = pq0Var;
        this.f185848f = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.lp0 lp0Var;
        java.lang.String str;
        b66.n a17;
        b66.n a18;
        int i17 = this.f185847e.f31808d;
        int i18 = this.f185848f.f29930d;
        com.tencent.mm.plugin.webview.ui.tools.media.a1 a1Var = this.f185846d;
        if (i18 == a1Var.f185742e) {
            return;
        }
        a1Var.f185742e = i18;
        com.tencent.mm.plugin.webview.ui.tools.media.b1 b1Var = com.tencent.mm.plugin.webview.ui.tools.media.b1.f185746a;
        ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).getClass();
        int f17 = rk4.k5.f(i18);
        if (f17 < 0) {
            return;
        }
        b66.h hVar = b66.i.f18167d;
        java.lang.String standAloneId = a1Var.f185741d;
        kotlin.jvm.internal.o.g(standAloneId, "standAloneId");
        b66.g gVar = (b66.g) urgen.ur_2BA9.UR_882D.UR_EC54(standAloneId);
        if (gVar == null || (a18 = ((b66.i) gVar).a()) == null || (lp0Var = ((b66.q) a18).g()) == null) {
            lp0Var = new bw5.lp0();
        }
        long k17 = (gVar == null || (a17 = ((b66.i) gVar).a()) == null) ? 0L : a17.k();
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7035a = 2;
        jkVar.f7036b = f17;
        b21.r rVar = new b21.r();
        rVar.E = lp0Var.b();
        rVar.N = false;
        rVar.V = false;
        rVar.U = true;
        jkVar.f7037c = rVar;
        jkVar.f7040f = rk4.m.f396834a.a(qk.ia.f364169e.a(i17));
        jkVar.f7039e = k17;
        if (i18 >= 0) {
            il4.l lVar = il4.l.f292142a;
            switch (i18) {
                case 1:
                    str = "prepare";
                    break;
                case 2:
                    str = "ready";
                    break;
                case 3:
                    str = "playstart";
                    break;
                case 4:
                    str = "playend";
                    break;
                case 5:
                    str = "pause";
                    break;
                case 6:
                    str = "resume";
                    break;
                case 7:
                    str = "bufferstart";
                    break;
                case 8:
                    str = "bufferend";
                    break;
                case 9:
                    str = "seekstart";
                    break;
                case 10:
                    str = "seekend";
                    break;
                case 11:
                    str = "stop";
                    break;
                case 12:
                    str = "error";
                    break;
                case 13:
                    str = "preempted";
                    break;
                default:
                    str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                    break;
            }
            jkVar.f7047m = str;
        }
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
    }
}
