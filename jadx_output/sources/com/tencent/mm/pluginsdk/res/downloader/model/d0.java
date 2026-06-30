package com.tencent.mm.pluginsdk.res.downloader.model;

@j95.b
/* loaded from: classes5.dex */
public final class d0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f189668d = new com.tencent.mm.pluginsdk.res.downloader.model.c0(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f189669e;

    static {
        new com.tencent.mm.pluginsdk.res.downloader.model.d0();
    }

    public d0() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f189669e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppActiveEvent>(this, a0Var) { // from class: com.tencent.mm.pluginsdk.res.downloader.model.PinResDownloaderCore$2
            {
                this.__eventId = 2123042947;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AppActiveEvent appActiveEvent) {
                boolean z17;
                if (!appActiveEvent.f53977g.f7684a) {
                    ((com.tencent.mm.feature.performance.q) ((ob0.n2) i95.n0.c(ob0.n2.class))).getClass();
                    if (gi.d.h(84)) {
                        ((com.tencent.mm.feature.performance.q) ((ob0.r2) i95.n0.c(ob0.r2.class))).Zi(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN, ph.t.k().c());
                        ((com.tencent.mm.feature.performance.q) ((ob0.q2) i95.n0.c(ob0.q2.class))).getClass();
                        if (gi.i0.f272055b) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.PinResDownloaderCore", "skip resume onCallback for low energy: doze mode on!");
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            ((com.tencent.mm.feature.performance.q) ((ob0.r2) i95.n0.c(ob0.r2.class))).getClass();
                            ri.o.a(84);
                        }
                    }
                    ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.pluginsdk.res.downloader.model.h0(), "PostTaskCheckResume-Check");
                }
                return false;
            }
        };
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        java.util.Iterator it = com.tencent.mm.pluginsdk.res.downloader.model.m0.a().iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n nVar = (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n) ((com.tencent.mm.pluginsdk.res.downloader.model.o) it.next());
            nVar.f189626b.alive();
            com.tencent.mm.app.w.INSTANCE.a(nVar.f189625a);
            gm0.j1.e().k(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m(nVar), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
        gm0.j1.n().a(this.f189668d);
        this.f189669e.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        gm0.j1.n().d(this.f189668d);
        this.f189669e.dead();
        java.util.Iterator it = com.tencent.mm.pluginsdk.res.downloader.model.m0.a().iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n nVar = (com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n) ((com.tencent.mm.pluginsdk.res.downloader.model.o) it.next());
            nVar.f189626b.dead();
            com.tencent.mm.app.w.INSTANCE.p(nVar.f189625a);
        }
    }
}
