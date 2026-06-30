package com.tencent.mm.plugin.finder.live.viewmodel.data.business;

/* loaded from: classes3.dex */
public final class LiveAnchorSlice extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f117045f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f117046g;

    /* renamed from: h, reason: collision with root package name */
    public int f117047h;

    /* renamed from: i, reason: collision with root package name */
    public long f117048i;

    /* renamed from: m, reason: collision with root package name */
    public int f117049m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f117050n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveAnchorSlice(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f117045f = "LiveAnchorSlice";
        this.f117049m = 1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f117050n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLivePauseActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice$notifyPausePushingLive$1
            {
                this.__eventId = 1760235184;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLivePauseActionEvent finderLivePauseActionEvent) {
                com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice$notifyPausePushingLive$1 liveAnchorSlice$notifyPausePushingLive$1;
                boolean z17;
                in0.q qVar;
                kn0.p pVar;
                com.tencent.mm.autogen.events.FinderLivePauseActionEvent event = finderLivePauseActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (in0.q.f292769b2 != null) {
                    liveAnchorSlice$notifyPausePushingLive$1 = this;
                    z17 = true;
                } else {
                    liveAnchorSlice$notifyPausePushingLive$1 = this;
                    z17 = false;
                }
                com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice liveAnchorSlice = com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.this;
                boolean U7 = ((mm2.c1) ((mm2.e1) liveAnchorSlice.business(mm2.e1.class)).business(mm2.c1.class)).U7();
                boolean z18 = ((mm2.e1) liveAnchorSlice.business(mm2.e1.class)).f328988r.getLong(0) != 0;
                boolean z19 = pm0.v.z(((mm2.c1) liveAnchorSlice.business(mm2.c1.class)).f328807g2, 524288);
                boolean l76 = ((mm2.c1) liveAnchorSlice.business(mm2.c1.class)).l7();
                java.util.List list = ((mm2.o4) liveAnchorSlice.business(mm2.o4.class)).f329327v;
                boolean z27 = (list != null ? list.size() : 0) > 0;
                int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3902v5).getValue()).r()).intValue();
                in0.q qVar2 = in0.q.f292769b2;
                if (qVar2 != null) {
                    if (qVar2 == null) {
                        in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
                    }
                    qVar = in0.q.f292769b2;
                    kotlin.jvm.internal.o.d(qVar);
                } else {
                    qVar = null;
                }
                boolean f17 = (qVar == null || (pVar = qVar.D) == null) ? false : pVar.f();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyPausePushingLive] isAnchor = ");
                sb6.append(z17);
                sb6.append(", isLiveStarted = ");
                sb6.append(z18);
                sb6.append(", isLiveFinish = ");
                sb6.append(U7);
                sb6.append(", isLivePaused = ");
                sb6.append(z19);
                sb6.append(", isAudioMode = ");
                sb6.append(l76);
                sb6.append(", pause = ");
                am.sb sbVar = event.f54288g;
                sb6.append(sbVar.f7891a);
                sb6.append(", isAnchorLinkMic = ");
                sb6.append(z27);
                sb6.append(", pauseWay = ");
                sb6.append(intValue);
                sb6.append(", isFloatMode = ");
                sb6.append(f17);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = liveAnchorSlice.f117045f;
                com.tencent.mars.xlog.Log.i(str, sb7);
                if (!z17 || U7) {
                    com.tencent.mars.xlog.Log.i(str, "is not Anchor, isLiveFinish, return ");
                } else if (l76) {
                    com.tencent.mars.xlog.Log.i(str, "isAudioMode, return ");
                } else if (z18 && !U7 && !f17) {
                    com.tencent.mars.xlog.Log.i(str, "isFloatMode = " + f17);
                    event.f54289h.f7997a = true;
                } else if (intValue == 0) {
                    if (sbVar.f7891a) {
                        if (qVar != null) {
                            qVar.H0();
                        }
                    } else if (qVar != null) {
                        qVar.c1(null);
                    }
                } else if (sbVar.f7891a) {
                    if (z18) {
                        if (!z19) {
                            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                            dk2.ef.f233372a.J(0);
                            if (qVar != null) {
                                qVar.k0();
                            }
                            liveAnchorSlice.f117046g = true;
                        }
                    } else if (qVar != null) {
                        qVar.H0();
                    }
                } else if (z18) {
                    if (liveAnchorSlice.f117046g) {
                        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                        dk2.xf xfVar = dk2.ef.A;
                        if (xfVar != null) {
                            ((dk2.r4) xfVar).d0(2, 0, new dk2.xe());
                        }
                        if (qVar != null) {
                            qVar.c1(null);
                        }
                        if (qVar != null) {
                            qVar.r0();
                        }
                    }
                } else if (qVar != null) {
                    qVar.c1(null);
                }
                return true;
            }
        };
    }

    public final long N6() {
        return this.f117048i;
    }

    public final int O6() {
        return this.f117047h;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f117050n.dead();
        this.f117046g = false;
    }
}
