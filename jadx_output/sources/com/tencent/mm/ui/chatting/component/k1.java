package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.m.class)
/* loaded from: classes9.dex */
public final class k1 extends com.tencent.mm.ui.chatting.component.a implements yn.e, sb5.m {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f199338f;

    /* renamed from: g, reason: collision with root package name */
    public long f199339g;

    /* renamed from: h, reason: collision with root package name */
    public long f199340h;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f199342m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f199343n;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f199337e = jz5.h.b(com.tencent.mm.ui.chatting.component.j1.f199249d);

    /* renamed from: i, reason: collision with root package name */
    public boolean f199341i = true;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mm.sdk.event.IListener iListener = this.f199342m;
        if (iListener == null) {
            kotlin.jvm.internal.o.o("playingMsgUpdateListener");
            throw null;
        }
        iListener.alive();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f199343n;
        if (iListener2 == null) {
            kotlin.jvm.internal.o.o("playbackStateUpdateListener");
            throw null;
        }
        iListener2.alive();
        m0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mm.sdk.event.IListener iListener = this.f199342m;
        if (iListener == null) {
            kotlin.jvm.internal.o.o("playingMsgUpdateListener");
            throw null;
        }
        iListener.dead();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f199343n;
        if (iListener2 != null) {
            iListener2.dead();
        } else {
            kotlin.jvm.internal.o.o("playbackStateUpdateListener");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mm.sdk.event.IListener iListener = this.f199342m;
        if (iListener == null) {
            kotlin.jvm.internal.o.o("playingMsgUpdateListener");
            throw null;
        }
        iListener.dead();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f199343n;
        if (iListener2 != null) {
            iListener2.dead();
        } else {
            kotlin.jvm.internal.o.o("playbackStateUpdateListener");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        m0();
        final com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
        this.f199342m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent>(baseChattingUIFragment) { // from class: com.tencent.mm.ui.chatting.component.ChatRecordsTtsIndicatorComponent$onChattingInit$1
            {
                this.__eventId = -1580329748;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent chatRecordsTtsPlayingMsgUpdateEvent) {
                com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlayingMsgUpdateEvent event = chatRecordsTtsPlayingMsgUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.ui.chatting.component.k1 k1Var = com.tencent.mm.ui.chatting.component.k1.this;
                java.lang.String x17 = k1Var.f198580d.x();
                java.lang.String str = event.f65346g;
                if (kotlin.jvm.internal.o.b(x17, str)) {
                    long j17 = k1Var.f199339g;
                    k1Var.f199338f = str;
                    long j18 = event.f65347h;
                    k1Var.f199339g = j18;
                    k1Var.f199341i = j17 != j18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsIndicatorComponent", "playingMsgUpdate talker=" + str + " msgId=" + j18 + " isNewMsg=" + k1Var.f199341i);
                    k1Var.p0();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsIndicatorComponent", "playingMsgUpdate ignored, different talker current=" + x17 + " event=" + str);
                    k1Var.n0(false);
                    k1Var.o0();
                }
                return false;
            }
        };
        final com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = this.f198580d.f460717l;
        this.f199343n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlaybackStateUpdateEvent>(baseChattingUIFragment2) { // from class: com.tencent.mm.ui.chatting.component.ChatRecordsTtsIndicatorComponent$onChattingInit$2
            {
                this.__eventId = 1308607341;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlaybackStateUpdateEvent chatRecordsTtsPlaybackStateUpdateEvent) {
                com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsPlaybackStateUpdateEvent event = chatRecordsTtsPlaybackStateUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playbackStateUpdate state=");
                oy.k kVar = event.f65345g;
                sb6.append(kVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsIndicatorComponent", sb6.toString());
                oy.k kVar2 = oy.k.f349823d;
                com.tencent.mm.ui.chatting.component.k1 k1Var = com.tencent.mm.ui.chatting.component.k1.this;
                if (kVar != kVar2) {
                    k1Var.p0();
                    return false;
                }
                k1Var.n0(true);
                k1Var.o0();
                return false;
            }
        };
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        int i28;
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var;
        com.tencent.mm.ui.chatting.gb gbVar = this.f198580d.f460719n;
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = gbVar != null ? ((com.tencent.mm.ui.chatting.ChattingUIFragment) gbVar).B : null;
        if (mMChattingListView != null && (i28 = mMChattingListView.A1) >= 0 && mMChattingListView.f202849y1 > 0.0f && (v3Var = mMChattingListView.T) != null) {
            android.view.View F = ((com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView) v3Var).F(i28);
            if (F == null) {
                mMChattingListView.f202845p1.setEmpty();
            } else {
                mMChattingListView.s(F, mMChattingListView.k(F));
            }
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0 || i17 == 1) {
            p0();
        }
    }

    public final void m0() {
        java.lang.String Q0;
        jz5.g gVar = this.f199337e;
        oy.k kVar = ((com.tencent.mm.feature.chatrecordstts.b1) ((oy.i) ((jz5.n) gVar).getValue())).f65353p;
        if (kVar != oy.k.f349825f && kVar != oy.k.f349826g) {
            n0(false);
            o0();
            return;
        }
        com.tencent.mm.feature.chatrecordstts.j jVar = ((com.tencent.mm.feature.chatrecordstts.b1) ((oy.i) ((jz5.n) gVar).getValue())).f65354q;
        oy.l lVar = null;
        if (jVar != null && (Q0 = jVar.f65467a.Q0()) != null) {
            lVar = new oy.l(Q0, jVar.f65467a.getMsgId());
        }
        if (lVar != null) {
            java.lang.String x17 = this.f198580d.x();
            java.lang.String str = lVar.f349828a;
            if (kotlin.jvm.internal.o.b(str, x17)) {
                this.f199338f = str;
                long j17 = lVar.f349829b;
                this.f199339g = j17;
                this.f199341i = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsTtsIndicatorComponent", "checkAndInitializePlayingState found playing message talker=" + str + " msgId=" + j17);
                p0();
            }
        }
    }

    public final void n0(boolean z17) {
        com.tencent.mm.ui.chatting.gb gbVar = this.f198580d.f460719n;
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = gbVar != null ? ((com.tencent.mm.ui.chatting.ChattingUIFragment) gbVar).B : null;
        if (mMChattingListView == null) {
            return;
        }
        mMChattingListView.l(z17);
        this.f199340h = 0L;
    }

    public final void o0() {
        this.f199338f = null;
        this.f199339g = 0L;
        this.f199340h = 0L;
        this.f199341i = true;
    }

    public final void p0() {
        int i17;
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView;
        com.tencent.mm.ui.chatting.adapter.k kVar;
        com.tencent.mm.storage.f9 K0;
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView2;
        oy.k kVar2 = ((com.tencent.mm.feature.chatrecordstts.b1) ((oy.i) ((jz5.n) this.f199337e).getValue())).f65353p;
        if (kVar2 != oy.k.f349825f && kVar2 != oy.k.f349826g) {
            n0(true);
            return;
        }
        long j17 = this.f199339g;
        sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
        if (zVar == null || (K0 = (kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar).K0(j17)) == null) {
            i17 = -1;
        } else {
            int R0 = kVar.R0(K0);
            com.tencent.mm.ui.chatting.gb gbVar = this.f198580d.f460719n;
            i17 = R0 + ((gbVar == null || (mMChattingListView2 = ((com.tencent.mm.ui.chatting.ChattingUIFragment) gbVar).B) == null) ? 0 : mMChattingListView2.getHeaderViewsCount());
        }
        if (i17 < 0) {
            n0(true);
            return;
        }
        if (!kotlin.jvm.internal.o.b(this.f199338f, this.f198580d.x())) {
            n0(false);
            return;
        }
        boolean z17 = this.f199341i && this.f199340h != this.f199339g;
        com.tencent.mm.ui.chatting.gb gbVar2 = this.f198580d.f460719n;
        if (gbVar2 == null || (mMChattingListView = ((com.tencent.mm.ui.chatting.ChattingUIFragment) gbVar2).B) == null) {
            return;
        }
        long j18 = this.f199340h;
        if (j18 == this.f199339g) {
            if (mMChattingListView.getPersistentHighLightIndex() != i17) {
                mMChattingListView.r(i17, false);
            }
        } else {
            if (j18 != 0) {
                mMChattingListView.l(false);
            }
            mMChattingListView.r(i17, z17);
            this.f199340h = this.f199339g;
            this.f199341i = false;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        m0();
    }
}
