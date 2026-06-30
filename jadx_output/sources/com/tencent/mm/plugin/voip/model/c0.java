package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class c0 extends com.tencent.mm.plugin.voip.model.n implements com.tencent.mm.plugin.voip.ui.g {
    private byte[] field_capInfo;
    private byte[] field_peerId;

    /* renamed from: r, reason: collision with root package name */
    public final jq4.c1 f176364r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.d3 f176365s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$voipListener$1 f176366t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$renderListener$1 f176367u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f176368v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$voipListener$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$renderListener$1] */
    public c0(jq4.c1 floatCardManager, com.tencent.mm.plugin.voip.model.d3 implVoip) {
        super(floatCardManager);
        kotlin.jvm.internal.o.g(floatCardManager, "floatCardManager");
        kotlin.jvm.internal.o.g(implVoip, "implVoip");
        this.f176364r = floatCardManager;
        this.f176365s = implVoip;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f176366t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$voipListener$1
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54945g.f8415b != 11) {
                    return false;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.model.b0(com.tencent.mm.plugin.voip.model.c0.this));
                return false;
            }
        };
        this.f176367u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.voip.video.render.VoIPRenderEvent>(a0Var) { // from class: com.tencent.mm.plugin.voip.model.NewVoipIncomingCallManager$renderListener$1
            {
                this.__eventId = -1223349174;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.voip.video.render.VoIPRenderEvent voIPRenderEvent) {
                com.tencent.mm.plugin.voip.video.render.VoIPRenderEvent event = voIPRenderEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f177087g != 2) {
                    return false;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.model.a0(com.tencent.mm.plugin.voip.model.c0.this));
                return false;
            }
        };
        this.f176368v = new java.util.LinkedHashSet();
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void K(int i17) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean U() {
        v();
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void V() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void X(boolean z17, boolean z18, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void c(com.tencent.mm.plugin.voip.ui.f iVoipUI) {
        kotlin.jvm.internal.o.g(iVoipUI, "iVoipUI");
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void d() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void f() {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void g(com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void h(com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView, int i17) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean i() {
        m();
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public void j(boolean z17, boolean z18) {
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean l() {
        m();
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean n() {
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.model.n
    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "release");
        this.f176760n = null;
        this.f176763q = false;
        this.f176761o = false;
        this.f176762p = false;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f176754e;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f176754e = null;
        wu5.c cVar = this.f176758i;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f176758i = null;
        wu5.c cVar2 = this.f176759m;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.f176759m = null;
        ((com.tencent.mm.booter.notification.x) mo3.f.f330406a).f(49);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "release");
        dead();
        dead();
        this.f176760n = null;
        this.field_capInfo = null;
        this.field_peerId = null;
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean r() {
        v();
        return true;
    }

    public void s(r45.r27 roomInfo) {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2;
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        java.lang.String str = roomInfo.f384494i;
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176365s.f176411a;
        byte[] bArr = null;
        this.field_capInfo = (g1Var == null || (v2protocalVar2 = g1Var.f176532x) == null) ? null : v2protocalVar2.field_capInfo;
        if (g1Var != null && (v2protocalVar = g1Var.f176532x) != null) {
            bArr = v2protocalVar.field_peerId;
        }
        this.field_peerId = bArr;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        jq4.c1 c1Var = this.f176364r;
        c1Var.getClass();
        c1Var.C = weakReference;
        c1Var.f301224y = new com.tencent.mm.plugin.voip.model.z(this);
        this.f176365s.d(roomInfo.f384489d, roomInfo.f384490e, 1, this.field_peerId, this.field_capInfo, str);
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean t() {
        return true;
    }

    public boolean u() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_allow_incoming_call_when_connected, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "clicfg_voip_allow_incoming_call_when_connected value:" + fj6);
        return fj6;
    }

    public void v() {
        r45.r27 r27Var = this.f176760n;
        if (r27Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "onReject, roomInfo:" + com.tencent.mm.plugin.voip.model.o.a(r27Var));
        q();
        java.lang.String str = r27Var.f384494i;
        long j17 = r27Var.f384490e;
        int i17 = r27Var.f384489d;
        boolean z17 = r27Var.f384495m == 0;
        new mq4.g(2, vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a), i17, new byte[0], new byte[0], j17, false, false, null).L();
        com.tencent.mm.plugin.voip.model.k0 k0Var = new com.tencent.mm.plugin.voip.model.k0(i17, j17, 0L, str, z17, false);
        java.lang.String str2 = r27Var.f384494i;
        int i18 = com.tencent.mm.storage.f9.f193926r2;
        com.tencent.mm.plugin.voip.model.b2.d(str2, z17 ? "voip_content_video" : "voip_content_voice", 0, 6, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kae), false, k0Var, null);
        r45.r27 r27Var2 = this.f176760n;
        if (r27Var2 != null) {
            y(1, r27Var2);
        }
        p();
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean w() {
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.ui.g
    public boolean x(boolean z17) {
        return true;
    }

    public void y(int i17, r45.r27 roomInfo) {
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        if (u()) {
            if (i17 == 9) {
                java.util.Set set = this.f176368v;
                if (set.contains(java.lang.Integer.valueOf(roomInfo.f384489d))) {
                    return;
                } else {
                    set.add(java.lang.Integer.valueOf(roomInfo.f384489d));
                }
            }
            long n17 = gq4.v.Bi().n();
            int m17 = gq4.v.Bi().m();
            long j17 = roomInfo.f384490e;
            int i18 = roomInfo.f384489d;
            com.tencent.mm.autogen.mmdata.rpt.VoipNewCallWhenInCallReportStruct voipNewCallWhenInCallReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoipNewCallWhenInCallReportStruct();
            voipNewCallWhenInCallReportStruct.f61786d = n17;
            voipNewCallWhenInCallReportStruct.f61787e = m17;
            voipNewCallWhenInCallReportStruct.f61788f = j17;
            voipNewCallWhenInCallReportStruct.f61789g = i18;
            voipNewCallWhenInCallReportStruct.f61790h = i17;
            voipNewCallWhenInCallReportStruct.k();
        }
    }

    public void z(r45.r27 roomInfo) {
        kotlin.jvm.internal.o.g(roomInfo, "roomInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "startAcceptVoIP, roomInfo:" + com.tencent.mm.plugin.voip.model.o.a(roomInfo));
        boolean z17 = true;
        if (!this.f176365s.p(roomInfo)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoipIncomingCallManager", "startAcceptVoIP setInviteContent failed!");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.r(11525, true, true, java.lang.Integer.valueOf(roomInfo.f384489d), java.lang.Long.valueOf(roomInfo.f384490e), java.lang.Integer.valueOf(roomInfo.f384495m), 5, java.lang.Integer.valueOf(vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            g0Var.r(11526, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 7);
            vq4.d0.i(0);
            return;
        }
        r45.r27 r27Var = this.f176760n;
        boolean z18 = r27Var != null && r27Var.f384495m == 0;
        final com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        final java.lang.String str = roomInfo.f384494i;
        final long j17 = roomInfo.f384490e;
        final boolean z19 = true;
        Bi.getClass();
        final android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipService", "start VideoActivity in foreground,%s", java.lang.Boolean.valueOf(wVar.f53889n));
        vq4.b0.o();
        com.tencent.mm.plugin.voip.model.d3 d3Var = Bi.f176558a;
        d3Var.f176431u = str;
        d3Var.f176433w = false;
        d3Var.f176432v = z18;
        Bi.G();
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (vq4.b0.f439271b && z18 && Bi.E == null) {
            gq4.v.wi().d();
            if (!fp.h.a(26) && (!wVar.f53889n || Bi.u() || Bi.v())) {
                z17 = false;
            }
            dr4.p1 p1Var = new dr4.p1(false, z17);
            Bi.E = p1Var;
            if (vq4.b0.f439280k) {
                p1Var.f();
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.voip.model.o2(Bi, z18, str, j17));
        final boolean z27 = false;
        final boolean z28 = z18;
        ((y03.e) i95.n0.c(y03.e.class)).d8(context, str, z18, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.h2$$d
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean z29;
                android.content.Intent intent;
                com.tencent.mm.plugin.voip.model.h2 h2Var = com.tencent.mm.plugin.voip.model.h2.this;
                java.lang.String str2 = str;
                boolean z37 = z28;
                long j18 = j17;
                boolean z38 = z27;
                android.content.Context context2 = context;
                long j19 = currentTimeMillis;
                boolean z39 = z19;
                android.content.Intent intent2 = (android.content.Intent) obj;
                h2Var.getClass();
                if (vq4.b0.f439276g) {
                    h2Var.f176560c = true;
                    z29 = z39;
                    intent = intent2;
                    h2Var.F(str2, z37, false, j18);
                } else {
                    z29 = z39;
                    intent = intent2;
                }
                com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
                com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
                com.tencent.mm.pointers.PBool pBool2 = new com.tencent.mm.pointers.PBool();
                com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                com.tencent.mm.pointers.PLong pLong = new com.tencent.mm.pointers.PLong();
                pString.value = str2;
                pBool.value = z38;
                pBool2.value = z37;
                pInt.value = vq4.n0.c(pBool.value, z37);
                pLong.value = j18;
                gq4.a t17 = gq4.v.Bi().t(context2, pString, pBool, pBool2, pInt, pLong, ((y03.e) i95.n0.c(y03.e.class)).pd(intent));
                if (t17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipService", "voip mgr init failed and not allow to continue accept incoming call");
                    return null;
                }
                if (z37) {
                    ((com.tencent.mm.plugin.voip.model.d0) t17).i();
                } else {
                    ((com.tencent.mm.plugin.voip.model.d0) t17).l();
                }
                h2Var.D = new vq4.m0();
                com.tencent.mm.plugin.voip.model.j0.o(h2Var.z());
                intent.putExtra("Voip_User", str2);
                intent.putExtra("Voip_Outcall", z38);
                intent.putExtra("Voip_VideoCall", z37);
                intent.putExtra("Voip_LastPage_Hash", j19);
                intent.putExtra("Voip_CallRoomKey", j18);
                if (z29) {
                    intent.setFlags(603979776);
                    intent.addFlags(268435456);
                }
                if (android.os.Build.VERSION.SDK_INT >= 29 && !com.tencent.mm.app.w.INSTANCE.f53889n) {
                    h2Var.f176580w = j19;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "start channel ring, now:" + h2Var.f176580w);
                }
                ((tf0.a) ((uf0.e) i95.n0.c(uf0.e.class))).wi(context2, intent, null, "", intent.getComponent().getClassName(), true, mx3.i0.h(str2), true, true);
                if (mx3.f0.j() && fp.e0.g()) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.grantUriPermission("com.android.systemui", com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.vfs.r6.j(new java.io.File(mx3.i0.j(str2).h()))), 1);
                }
                rq4.u.f399109a.c(false, z38);
                return null;
            }
        });
    }
}
