package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class rh extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f199856e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199857f;

    public rh() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f199857f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.MusicComponent$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                yb5.d dVar;
                int i17 = musicPlayerEvent.f54512g.f7036b;
                if ((i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 7) || (dVar = com.tencent.mm.ui.chatting.component.rh.this.f198580d) == null) {
                    return false;
                }
                dVar.J();
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        this.f199857f.alive();
        if (!(this.f198580d != null ? !com.tencent.mm.sdk.platformtools.t8.K0(r0.x()) : false)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MusicComponent", "onChattingEnterAnimEnd not init");
            return;
        }
        qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
        java.lang.String Vi = bj6 == null ? null : ((rk4.z8) bj6).Vi(0);
        if ((com.tencent.mm.sdk.platformtools.t8.K0(Vi) || Vi.equals(this.f199856e)) && (com.tencent.mm.sdk.platformtools.t8.K0(this.f199856e) || this.f199856e.equals(Vi))) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicComponent", "onChattingEnterAnimEnd playingMsgId: %s, last: %s", Vi, this.f199856e);
        yb5.d dVar = this.f198580d;
        if (dVar != null) {
            dVar.J();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199857f.dead();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f199857f.dead();
        try {
            qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
            if (bj6 != null) {
                this.f199856e = ((rk4.z8) bj6).Vi(0);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MusicComponent", e17, "getPlayingMusicId exception", new java.lang.Object[0]);
        }
    }
}
