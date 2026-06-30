package com.tencent.mm.ui.chatting.component.biz;

@yn.c(exportInterface = sb5.f.class)
/* loaded from: classes11.dex */
public class a extends com.tencent.mm.ui.chatting.component.a implements sb5.f, r01.w2, l75.z0, xg3.h0 {
    public hr1.a F;
    public final com.tencent.mm.sdk.event.IListener N;
    public boolean P;
    public final java.lang.Runnable Q;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.app.plugin.exdevice.b f198743e;

    /* renamed from: f, reason: collision with root package name */
    public s01.h f198744f;

    /* renamed from: g, reason: collision with root package name */
    public s01.a0 f198745g;

    /* renamed from: h, reason: collision with root package name */
    public qk.o f198746h;

    /* renamed from: i, reason: collision with root package name */
    public qk.o f198747i;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f198752q;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RelativeLayout f198758w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f198759x;

    /* renamed from: z, reason: collision with root package name */
    public int f198761z;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.LiveBizSessionTipsBar f198748m = null;

    /* renamed from: n, reason: collision with root package name */
    public zq1.v f198749n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f198750o = null;

    /* renamed from: p, reason: collision with root package name */
    public long f198751p = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f198753r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f198754s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f198755t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f198756u = false;

    /* renamed from: v, reason: collision with root package name */
    public long f198757v = -1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f198760y = null;
    public r45.j16 A = null;
    public boolean B = false;
    public long C = 0;
    public android.view.View D = null;
    public final java.util.concurrent.atomic.AtomicBoolean E = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final com.tencent.mm.ui.chatting.component.biz.j0 G = new com.tencent.mm.ui.chatting.component.biz.a0(this);
    public final com.tencent.mm.pluginsdk.ui.chat.e5 H = new com.tencent.mm.ui.chatting.component.biz.c0(this);
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public final s01.l f198742J = new com.tencent.mm.ui.chatting.component.biz.d0(this);
    public boolean K = false;
    public boolean L = false;
    public final r01.v M = new com.tencent.mm.ui.chatting.component.biz.f0(this);

    public a() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.N = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.biz.BizComponent$6
            {
                this.__eventId = -1315546616;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent appMsgRelatedInfoUpdateEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "AppMsgRelatedInfoUpdateEvent scene %d", java.lang.Integer.valueOf(appMsgRelatedInfoUpdateEvent.f53989g.f6297a));
                com.tencent.mm.ui.chatting.component.biz.a.this.f198580d.J();
                return false;
            }
        };
        this.P = false;
        this.Q = new com.tencent.mm.ui.chatting.component.biz.b0(this);
    }

    public static void m0(com.tencent.mm.ui.chatting.component.biz.a aVar, com.tencent.wechat.mm.biz.b bVar) {
        aVar.getClass();
        if (bVar == null || com.tencent.mm.sdk.platformtools.t8.K0(bVar.f217890f)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", bVar.f217890f);
        intent.putExtra("Kdel_from", 0);
        intent.putExtra("preUsername", bVar.f217890f);
        intent.putExtra("preChatName", bVar.f217890f);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_IsBizAuthor", true);
        j45.l.j(aVar.f198580d.g(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public int A0() {
        yb5.d dVar;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment;
        yb5.d dVar2 = this.f198580d;
        int intExtra = (dVar2 == null || dVar2.g() == null || this.f198580d.g().getIntent() == null) ? 0 : this.f198580d.g().getIntent().getIntExtra("specific_chat_from_scene", 0);
        return (intExtra != 0 || (dVar = this.f198580d) == null || (baseChattingUIFragment = dVar.f460717l) == null || baseChattingUIFragment.getArguments() == null) ? intExtra : this.f198580d.f460717l.getArguments().getInt("specific_chat_from_scene", 0);
    }

    public final hr1.a B0() {
        hr1.a aVar = this.F;
        if (aVar != null) {
            return aVar;
        }
        java.lang.String x17 = this.f198580d.x();
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            return null;
        }
        if (G0()) {
            this.F = yq1.u0.Bi().y0(x17);
        } else if (H0()) {
            this.F = yq1.u0.Ui().y0(x17);
        }
        return this.F;
    }

    public java.lang.String C0() {
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368154b;
        if (bVar != null && bVar.f217897p && !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f217890f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bizAcctResp is valid, biz: %s, acctResp.interactive_identity: %s, acctResp.username: %s", bVar.f217889e, java.lang.Boolean.valueOf(bVar.f217897p), bVar.f217890f);
            return bVar.f217890f;
        }
        com.tencent.wechat.mm.biz.b bVar2 = ((r01.l1) i95.n0.c(r01.l1.class)).f368148m.f368154b;
        if (bVar2 == null || !bVar2.f217897p || com.tencent.mm.sdk.platformtools.t8.K0(bVar2.f217890f)) {
            return "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "photoAcctResp is valid, photo: %s, photoAcctResp.interactive_identity: %s, photoAcctResp.username: %s", bVar2.f217889e, java.lang.Boolean.valueOf(bVar2.f217897p), bVar2.f217890f);
        return bVar2.f217890f;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (this.f198580d.u().r2() && this.f198580d.u().k2() && this.f198580d.u().r2() && this.f198580d.u().k2()) {
            r01.q3.Zi().f368222d = this.f198580d.g().getIntent().getStringExtra("uinserve_search_click_id");
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String x17 = this.f198580d.x();
            ((qv.o) u2Var).getClass();
            if (!r01.z.g(x17)) {
                int intExtra = this.f198580d.f460717l.getIntExtra("specific_chat_from_scene", 0);
                if (this.A == null) {
                    this.A = new r45.j16();
                }
                this.A.f377500h = this.f198580d.f460717l.getIntExtra("Main_IndexInSessionList", 0);
                this.A.f377498f = this.f198580d.f460717l.getIntExtra("Main_UnreadCount", 0);
                com.tencent.mm.storage.f9 f9Var = this.f198752q;
                if (f9Var != null) {
                    this.A.f377499g = f9Var.getType();
                    r45.j16 j16Var = this.A;
                    if (j16Var.f377498f > 0) {
                        j16Var.f377497e = ((int) (this.f198751p - this.f198752q.getCreateTime())) / 1000;
                    }
                }
                r01.r1 Zi = r01.q3.Zi();
                java.lang.String x18 = this.f198580d.x();
                com.tencent.mm.storage.f9 f9Var2 = this.f198752q;
                r45.j16 j16Var2 = this.A;
                Zi.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new r01.p1(Zi, j16Var2, x18, f9Var2, intExtra));
            }
        }
        if (com.tencent.mm.storage.z3.j4(this.f198580d.x())) {
            ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.ui.chatting.component.biz.o(this), "ReportEnterNotifyMessage");
        }
        if (G0()) {
            yq1.u0.Di().m(this.f198580d.x(), true);
            rk.e wi6 = ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi();
            java.lang.String str = yq1.u0.Ni().y0(this.f198580d.x()).field_talker;
            ((gr1.h) wi6).c(str != null ? str : "", 0);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
            hr1.a y07 = yq1.u0.Bi().y0(this.f198580d.t());
            if (chatFooter != null) {
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.getChatFooterPanel();
                if (chatFooterPanel != null) {
                    chatFooterPanel.setShowSearch(false);
                    chatFooterPanel.j();
                }
                if (y07 == null || com.tencent.mm.sdk.platformtools.t8.K0(y07.field_nickname)) {
                    return;
                }
                chatFooter.m1(this.f198580d.t(), java.lang.Boolean.TRUE, y07.field_nickname + ":");
                return;
            }
            return;
        }
        if (H0()) {
            yq1.u0.Vi().m(this.f198580d.x(), true);
            rk.e wi7 = ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi();
            java.lang.String str2 = yq1.u0.Zi().z0(this.f198580d.x()).field_talker;
            ((gr1.h) wi7).c(str2 != null ? str2 : "", 5);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter2 = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
            hr1.a y08 = yq1.u0.Ui().y0(this.f198580d.t());
            if (chatFooter2 != null) {
                com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = chatFooter2.getChatFooterPanel();
                if (chatFooterPanel2 != null) {
                    chatFooterPanel2.setShowSearch(false);
                    chatFooterPanel2.j();
                }
                if (y08 == null || com.tencent.mm.sdk.platformtools.t8.K0(y08.field_nickname)) {
                    return;
                }
                chatFooter2.m1(this.f198580d.t(), java.lang.Boolean.TRUE, y08.field_nickname + ":");
            }
        }
    }

    public java.lang.String E0() {
        if (!this.f198753r) {
            if (this.f198580d.u() == null) {
                return null;
            }
            return this.f198580d.u().P0();
        }
        if (this.f198754s) {
            s01.h hVar = this.f198744f;
            if (hVar == null) {
                return null;
            }
            return hVar.field_chatName;
        }
        s01.a0 a0Var = this.f198745g;
        if (a0Var == null) {
            return null;
        }
        return a0Var.field_userName;
    }

    public final void F0() {
        com.tencent.mm.ui.LiveBizSessionTipsBar liveBizSessionTipsBar = this.f198748m;
        if (liveBizSessionTipsBar == null || liveBizSessionTipsBar.getVisibility() != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar");
        this.f198748m.setVisibility(8);
        com.tencent.mm.ui.ga e17 = this.f198580d.e();
        if (e17.F() != null) {
            e17.F().G(1.0f);
        }
    }

    public boolean G0() {
        return com.tencent.mm.storage.z3.E3(this.f198580d.x());
    }

    public boolean H0() {
        return com.tencent.mm.storage.z3.G3(this.f198580d.x());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        s0();
    }

    public final void I0() {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject jSONObject = null;
        if (!com.tencent.mm.storage.z3.L3(this.f198580d.x())) {
            this.f198747i = null;
            return;
        }
        vh0.g1 g1Var = (vh0.g1) i95.n0.c(vh0.g1.class);
        java.lang.String x17 = this.f198580d.x();
        vh0.i2 i2Var = (vh0.i2) g1Var;
        i2Var.getClass();
        java.lang.String Ni = i2Var.Ni("IntelligenceExternalInfo");
        if (Ni == null || (optJSONObject = new org.json.JSONObject(Ni).optJSONObject(x17)) == null) {
            java.lang.String str = (java.lang.String) i2Var.Ri().f454475e.a(x17);
            if (str != null) {
                jSONObject = new org.json.JSONObject(str);
            }
        } else {
            jSONObject = optJSONObject;
        }
        qk.o oVar = new qk.o();
        oVar.field_username = this.f198580d.x();
        oVar.field_extInfo = jSONObject != null ? jSONObject.toString() : "{}";
        this.f198747i = oVar;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        qk.o oVar;
        if (this.f198755t && (oVar = this.f198746h) != null && oVar.Q0() && this.f198756u) {
            this.f198580d.q().post(new com.tencent.mm.ui.chatting.component.biz.m(this));
        }
        this.B = false;
    }

    public final void J0() {
        this.I = false;
        if (this.f198580d.u() == null || !this.f198580d.u().k2()) {
            return;
        }
        this.I = true;
        r01.q3.Ai().c(this.f198580d.u().d1(), null);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.K = false;
        s0();
        android.widget.RelativeLayout relativeLayout = this.f198758w;
        if (relativeLayout == null || relativeLayout.getVisibility() == 8) {
            return;
        }
        this.f198758w.setVisibility(8);
    }

    public boolean K0() {
        if (!G0() && !H0()) {
            return false;
        }
        hr1.a B0 = B0();
        if (B0 == null || com.tencent.mm.sdk.platformtools.t8.K0(B0.field_nickname)) {
            yb5.d dVar = this.f198580d;
            dVar.f460717l.setMMTitle(dVar.g().getString(com.tencent.mm.R.string.f490737n55));
            return true;
        }
        yb5.d dVar2 = this.f198580d;
        dVar2.f460717l.setMMTitle(dVar2.u().g2());
        return true;
    }

    @Override // r01.w2
    public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 1357) {
            this.f198580d.b();
            if (i17 != 0) {
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f198580d.s().getString(com.tencent.mm.R.string.i3y), 0).show();
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        dVar.z(zq1.w.class, new com.tencent.mm.ui.chatting.component.biz.j(this));
    }

    public void L0(boolean z17, java.lang.String str, android.view.View.OnClickListener onClickListener, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.biz.g0(this, z17, str2, str, onClickListener));
    }

    public void M0(java.lang.String str, boolean z17) {
        this.f198580d.b0();
        if (!com.tencent.mm.sdk.platformtools.t8.D0(str, this.f198580d.x())) {
            F0();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar not current user %s, %s", str, this.f198580d.x());
            return;
        }
        if (!z17) {
            F0();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "hideLiveBizSessionTipsBar not live now");
            return;
        }
        if (this.f198748m == null) {
            com.tencent.mm.ui.chatting.component.z4.j(this.f198580d.f460717l, com.tencent.mm.R.id.p2q);
            com.tencent.mm.ui.LiveBizSessionTipsBar liveBizSessionTipsBar = (com.tencent.mm.ui.LiveBizSessionTipsBar) this.f198580d.c(com.tencent.mm.R.id.f485577i75);
            this.f198748m = liveBizSessionTipsBar;
            if (liveBizSessionTipsBar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.BizComponent", "liveBizSessionTipsBar is null");
                return;
            }
        }
        this.f198748m.setChattingContext(this.f198580d);
        this.f198748m.setVisibility(0);
        com.tencent.mm.ui.ga e17 = this.f198580d.e();
        if (e17.F() != null) {
            e17.F().G(0.0f);
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.app.plugin.exdevice.b bVar;
        if (i17 == 12001 && (bVar = this.f198743e) != null) {
            yb5.d dVar = bVar.f53658a;
            if (dVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null, maybe has been released");
                return;
            }
            if (i18 != -1) {
                if (i18 == 0) {
                    dp.a.makeText(dVar.g(), com.tencent.mm.R.string.c3z, 0).show();
                    return;
                }
                return;
            }
            dp.a.makeText(dVar.g(), com.tencent.mm.R.string.f491142c40, 0).show();
            com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent = new com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent();
            am.o6 o6Var = exDeviceOpInChattingUIEvent.f54154g;
            o6Var.f7513a = 0;
            o6Var.f7514b = dVar.x();
            o6Var.f7515c = dVar.g();
            exDeviceOpInChattingUIEvent.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x008f, code lost:
    
        if (java.lang.Math.abs(r4 - r6) <= 3600000) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182  */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.biz.a.a():void");
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        if (m0Var == null || l0Var == null) {
            return;
        }
        java.lang.String str = l0Var.f454410a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (arrayList = l0Var.f454412c) == null || arrayList.isEmpty()) {
            return;
        }
        if (!str.equals(this.f198580d.x())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw onNotifyChange talker null or not ture");
            return;
        }
        if ("insert".equals(l0Var.f454411b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw onNotifyChange insert new msg");
            p0();
            if (!this.f198580d.u().n2()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw onNotifyChange isBizSubscribeContact not true");
                return;
            }
            if (G0() || H0()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "onNotifyChange insert msg");
            android.view.View view = this.D;
            if (view != null && view.getVisibility() == 0) {
                q0();
            }
        }
    }

    @Override // yn.d
    public boolean d0(int i17, android.view.KeyEvent keyEvent) {
        qk.o oVar;
        if (keyEvent.getKeyCode() == 82 && keyEvent.getAction() == 1 && ((oVar = this.f198746h) == null || oVar.D0(false) == null || this.f198746h.D0(false).c() == null || this.f198746h.D0(false).c().f364140b == null || this.f198746h.D0(false).c().f364140b.isEmpty())) {
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e.v(null);
        }
        return false;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        this.f198580d.x();
        if (this.I || !com.tencent.mm.sdk.platformtools.t8.C0(obj, this.f198580d.x())) {
            return;
        }
        if (this.f198580d.u() != null && this.f198580d.u().k2()) {
            r01.x cj6 = r01.q3.cj();
            cj6.f368272d.a(this.M, android.os.Looper.getMainLooper());
        }
        J0();
    }

    public final void n0(boolean z17, java.lang.String str) {
        if (z17) {
            s01.y Ni = r01.q3.Ni();
            java.lang.String str2 = this.f198744f.field_bizChatServId;
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            Ni.getClass();
            gm0.j1.n().f273288b.g(new s01.o0(str, str2, currentTimeMillis));
        }
    }

    public boolean o0() {
        yb5.d dVar = this.f198580d;
        if (dVar == null || dVar.u() == null) {
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_conv_mass_send_hide_enable_android, 0) == 1) {
            return this.f198580d.u().n2();
        }
        return false;
    }

    public final void p0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "bobkw begin checkAndClearUnreadWithBizMsg");
        if (this.E.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "checkAndClearUnreadWithBizMsg: already checking, skip");
            return;
        }
        this.E.set(true);
        ((ku5.t0) ku5.t0.f312615d).k(this.Q, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.biz.a.q0():void");
    }

    public boolean r0() {
        qk.o oVar;
        if (!((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).wi() || (oVar = this.f198746h) == null || com.tencent.mm.sdk.platformtools.t8.K0(oVar.field_extInfo) || !this.f198580d.u().n2()) {
            return false;
        }
        qk.n D0 = this.f198746h.D0(true);
        org.json.JSONObject jSONObject = D0.f364256a;
        if (jSONObject != null) {
            D0.D = jSONObject.optInt("PrivateMsgScope");
        }
        int i17 = D0.D;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "privateMsgScope: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            return !this.f198580d.u().r2();
        }
        if (i17 == 2) {
            return !this.f198580d.u().r2() || ((long) c01.id.e()) - g95.e.f269801a.c(this.f198580d.x()) < 604800;
        }
        return i17 == 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0() {
        com.tencent.mm.sdk.event.IListener iListener;
        com.tencent.mm.app.plugin.exdevice.b bVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        c01.ia.K("bizflag", 1, false);
        this.N.dead();
        boolean z17 = this.f198753r;
        if (z17) {
            n0(z17, this.f198580d.x());
            s01.z Ri = r01.q3.Ri();
            s01.h hVar = this.f198744f;
            Ri.getClass();
            java.lang.String format = java.lang.String.format("%s;%s;%d", hVar.field_brandUserName, hVar.field_bizChatServId, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
            de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
            java.lang.String str5 = hVar.field_brandUserName;
            ((ce0.e) jVar).getClass();
            com.tencent.mm.modelsimple.g1.K(str5, 8, "EnterpriseChatStatus", format);
        }
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        int currentTimeMillis = this.f198751p != 0 ? ((int) (java.lang.System.currentTimeMillis() - this.f198751p)) / 1000 : 0;
        if (gm0.j1.a()) {
            if (this.f198753r) {
                s01.m Ui = r01.q3.Ui();
                s01.l lVar = this.f198742J;
                l75.v0 v0Var = Ui.f401901e;
                if (v0Var != null) {
                    v0Var.j(lVar);
                }
            }
            if (this.f198580d.u() != null && this.f198580d.u().k2()) {
                r01.x cj6 = r01.q3.cj();
                r01.v vVar = this.M;
                l75.v0 v0Var2 = cj6.f368272d;
                if (v0Var2 != null) {
                    v0Var2.j(vVar);
                }
            }
            if (this.f198580d.u().r2() && this.f198580d.u().k2()) {
                rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                java.lang.String x17 = this.f198580d.x();
                ((qv.o) u2Var).getClass();
                if (!r01.z.g(x17)) {
                    qk.o oVar = this.f198746h;
                    if (oVar != null && oVar.Q0()) {
                        if (this.A == null) {
                            this.A = new r45.j16();
                        }
                        r45.j16 j16Var = this.A;
                        j16Var.f377496d = currentTimeMillis;
                        j16Var.f377500h = this.f198580d.f460717l.getIntExtra("Main_IndexInSessionList", 0);
                        this.A.f377498f = this.f198580d.f460717l.getIntExtra("Main_UnreadCount", 0);
                        com.tencent.mm.storage.f9 f9Var = this.f198752q;
                        if (f9Var != null) {
                            this.A.f377499g = f9Var.getType();
                            r45.j16 j16Var2 = this.A;
                            if (j16Var2.f377498f > 0) {
                                j16Var2.f377497e = ((int) (this.f198751p - this.f198752q.getCreateTime())) / 1000;
                            }
                        }
                    }
                    r01.r1 Zi = r01.q3.Zi();
                    java.lang.String x18 = this.f198580d.x();
                    r45.j16 j16Var3 = this.A;
                    Zi.getClass();
                    ((ku5.t0) ku5.t0.f312615d).g(new r01.q1(Zi, j16Var3, x18));
                }
            }
        }
        if (com.tencent.mm.app.plugin.exdevice.b.a(this.f198746h) && this.f198743e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s, notify exit chattingui", E0());
            this.f198743e.b(2, this.f198746h);
            this.f198580d.f460717l.setMMSubTitle((java.lang.String) null);
        }
        if (this.f198580d.u().r2() && this.f198580d.u().k2() && currentTimeMillis != 0) {
            android.content.Intent intent = this.f198580d.g().getIntent();
            if (intent != null) {
                str = intent.getStringExtra("uinserve_search_id");
                java.lang.String stringExtra = intent.getStringExtra("uinserve_search_click_id");
                str3 = intent.getStringExtra("uinserve_search_session_id");
                str2 = intent.getStringExtra("uinserve_search_time_token");
                str4 = stringExtra;
            } else {
                str = "";
                str2 = "";
                str3 = str2;
                str4 = str3;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            int intExtra = this.f198580d.f460717l.getIntExtra("specific_chat_from_scene", 0);
            int i17 = com.tencent.mm.storage.c2.f193803a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10638, this.f198580d.x(), java.lang.Integer.valueOf(currentTimeMillis), java.lang.Integer.valueOf(this.f198580d.f460717l.getIntExtra("biz_click_item_unread_count", 0)), java.lang.Integer.valueOf(this.f198580d.f460717l.getIntExtra("biz_click_item_position", 0)), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis2), str3 + ":" + str + ":" + str2, str4);
        }
        com.tencent.mm.app.plugin.exdevice.b bVar2 = this.f198743e;
        if (bVar2 != null) {
            com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$OpFromExDeviceEventListener chattingUIExDeviceLogic$OpFromExDeviceEventListener = bVar2.f53659b;
            if (chattingUIExDeviceLogic$OpFromExDeviceEventListener != null) {
                chattingUIExDeviceLogic$OpFromExDeviceEventListener.dead();
                bVar2.f53659b = null;
                java.util.Map map = bVar2.f53662e;
                if (map != null) {
                    ((java.util.HashMap) map).clear();
                }
            }
            bVar2.f53663f = false;
            com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener chattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener = bVar2.f53660c;
            if (chattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener != null) {
                chattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener.dead();
                bVar = 0;
                bVar2.f53660c = null;
            } else {
                bVar = 0;
            }
            this.f198743e = bVar;
            iListener = bVar;
        } else {
            iListener = null;
        }
        this.f198751p = 0L;
        F0();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f198750o;
        if (iListener2 != null) {
            iListener2.dead();
            this.f198750o = iListener;
        }
        this.E.set(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "doDestroy %s", this.f198580d.x());
    }

    public boolean t0() {
        yb5.d dVar = this.f198580d;
        if (dVar == null || dVar.u() == null || !(this.f198580d.u().n2() || this.f198580d.u().l2())) {
            return false;
        }
        com.tencent.wechat.mm.biz.b bVar = ((r01.l1) i95.n0.c(r01.l1.class)).f368147i.f368154b;
        if (bVar != null && bVar.f217897p && !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f217892h)) {
            return ur1.n.f430361a.b().f385826m == 1;
        }
        com.tencent.wechat.mm.biz.b bVar2 = ((r01.l1) i95.n0.c(r01.l1.class)).f368148m.f368154b;
        return bVar2 != null && bVar2.f217897p && !com.tencent.mm.sdk.platformtools.t8.K0(bVar2.f217892h) && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi();
    }

    public final void u0(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f198580d.x());
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("KNeedScrollToTab", z17);
        j45.l.j(this.f198580d.g(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public final void v0() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f198580d.x());
        intent.putExtra("key_start_biz_profile_setting_from_scene", 1);
        j45.l.j(this.f198580d.g(), com.google.android.gms.common.Scopes.PROFILE, ".ui.newbizinfo.NewBizInfoSettingUI", intent, null);
    }

    public long w0() {
        s01.h hVar = this.f198744f;
        if (hVar == null) {
            return -1L;
        }
        return hVar.field_bizChatLocalId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x02b7, code lost:
    
        if (((r0 == null || r0.u() == null) ? false : r10.f198580d.u().m2()) == false) goto L130;
     */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.biz.a.x():void");
    }

    public qk.o x0() {
        if (!com.tencent.mm.storage.z3.L3(this.f198580d.x())) {
            return this.f198746h;
        }
        qk.o oVar = this.f198747i;
        if (oVar != null) {
            return oVar;
        }
        I0();
        return this.f198747i;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        this.L = false;
        if (this.f198580d.u().r2() && this.f198580d.u().k2() && this.f198746h != null) {
            r01.q3.Zi().g();
            com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f198760y;
            if (j0Var != null) {
                j0Var.dismiss();
            }
        }
        g31.a aVar = g31.l.f268085h;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "clearNotifyCallback");
        g31.l.f268086i.clear();
        zq1.v vVar = this.f198749n;
        if (vVar != null) {
            ((com.tencent.mm.pluginsdk.model.h) vVar).b();
        }
    }

    public java.lang.String y0(java.lang.String str) {
        qk.o oVar;
        qk.n D0;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.contains("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/emoticonstore/")) {
            return null;
        }
        java.lang.String substring = str.substring(str.lastIndexOf("/") + 1);
        if (!this.f198580d.u().r2() || !this.f198580d.u().k2() || (oVar = this.f198746h) == null || (D0 = oVar.D0(false)) == null) {
            return null;
        }
        org.json.JSONObject jSONObject = D0.f364256a;
        if (jSONObject != null) {
            D0.f364273r = jSONObject.optString("SupportEmoticonLinkPrefix");
        }
        if (android.text.TextUtils.isEmpty(D0.f364273r)) {
            return null;
        }
        org.json.JSONObject jSONObject2 = D0.f364256a;
        if (jSONObject2 != null) {
            D0.f364273r = jSONObject2.optString("SupportEmoticonLinkPrefix");
        }
        if (substring.contains(D0.f364273r)) {
            return substring;
        }
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f198751p = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class));
        this.f198752q = kVar.getCount() > 0 ? kVar.getItem(kVar.getCount() - 1) : null;
        this.f198580d.x();
        this.F = B0();
        boolean z17 = this.f198753r;
        if (z17) {
            gm0.j1.e().k(new com.tencent.mm.ui.chatting.component.biz.l(this, z17, this.f198744f, this.f198580d.u(), this.f198580d.x(), this.f198754s), 500L);
        } else {
            final java.lang.String x17 = this.f198580d.x();
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.a$$b
                @Override // java.lang.Runnable
                public final void run() {
                    final com.tencent.mm.ui.chatting.component.biz.a aVar = com.tencent.mm.ui.chatting.component.biz.a.this;
                    final java.lang.String str = x17;
                    aVar.getClass();
                    ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
                    if (r01.z.g(str)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.BizComponent", "doCreate for username:%s, which is EnterpriseChat but missing bizChatId, ChattingUI should be finished", str);
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.a$$c
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.ui.chatting.component.biz.a aVar2 = com.tencent.mm.ui.chatting.component.biz.a.this;
                                yb5.d dVar = aVar2.f198580d;
                                boolean z18 = dVar.f460714i;
                                int intExtra = dVar.n().getIntExtra("biz_chat_from_scene", 7);
                                aVar2.f198580d.d();
                                if (z18) {
                                    java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                                    android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
                                    if (activity == null) {
                                        return;
                                    }
                                    android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.bizchat.BizChatConversationUI.class);
                                    intent.putExtra("Contact_User", str);
                                    intent.putExtra("biz_chat_from_scene", intExtra);
                                    intent.addFlags(67108864);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(intent);
                                    java.util.Collections.reverse(arrayList);
                                    android.app.Activity activity2 = activity;
                                    yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent", "lambda$doCreate$0", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    activity.startActivity((android.content.Intent) arrayList.get(0));
                                    yj0.a.f(activity2, "com/tencent/mm/ui/chatting/component/biz/BizComponent", "lambda$doCreate$0", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                }
                            }
                        });
                    }
                }
            });
        }
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, null);
        J0();
        this.N.alive();
        this.f198757v = this.f198580d.f460717l.getLongExtra("key_biz_chat_id", -1L);
        if (com.tencent.mm.app.plugin.exdevice.b.a(this.f198746h) && this.f198743e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.BizComponent", "hardevice brand account, init event : %s", E0());
            this.f198743e = new com.tencent.mm.app.plugin.exdevice.b(this.f198580d);
        }
        if (this.f198580d.u().k2()) {
            n21.h.f334266g = 2;
        }
        if (this.f198753r) {
            r01.q3.Ui().f401901e.a(this.f198742J, android.os.Looper.getMainLooper());
        }
        if (this.f198580d.u() != null && this.f198580d.u().k2()) {
            r01.q3.cj().f368272d.a(this.M, android.os.Looper.getMainLooper());
        }
        L0(false, "", null, "reset_on_enter");
        q0();
        p0();
        if (H0()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2126, 8);
        } else if (this.f198580d.u().l2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2126, 9);
        }
    }
}
