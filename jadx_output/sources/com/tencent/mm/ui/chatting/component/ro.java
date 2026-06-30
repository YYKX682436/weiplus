package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.q2.class)
/* loaded from: classes9.dex */
public class ro extends com.tencent.mm.ui.chatting.component.a implements sb5.q2, com.tencent.mm.modelbase.u0 {
    public final c01.r8 A;
    public final com.tencent.mm.sdk.event.IListener B;
    public final com.tencent.mm.sdk.event.IListener C;
    public android.view.View D;
    public final com.tencent.mm.pluginsdk.ui.chat.a5 E;
    public final com.tencent.mm.sdk.event.IListener F;
    public final java.util.List G;

    /* renamed from: e, reason: collision with root package name */
    public boolean f199865e = false;

    /* renamed from: f, reason: collision with root package name */
    public final bm5.w0 f199866f;

    /* renamed from: g, reason: collision with root package name */
    public bm5.x0 f199867g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f199868h;

    /* renamed from: i, reason: collision with root package name */
    public long f199869i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f199870m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f199871n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f199872o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.app.t2 f199873p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f199874q;

    /* renamed from: r, reason: collision with root package name */
    public int f199875r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199876s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.Future f199877t;

    /* renamed from: u, reason: collision with root package name */
    public long f199878u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f199879v;

    /* renamed from: w, reason: collision with root package name */
    public long f199880w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.ap f199881x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.concurrent.Future f199882y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f199883z;

    public ro() {
        bm5.w0 w0Var = new bm5.w0() { // from class: com.tencent.mm.ui.chatting.component.ro$$a
            @Override // bm5.w0
            public final java.lang.Object a() {
                com.tencent.mm.ui.chatting.component.ro roVar = com.tencent.mm.ui.chatting.component.ro.this;
                yb5.d dVar = roVar.f198580d;
                com.tencent.mm.ui.chatting.v0 v0Var = new com.tencent.mm.ui.chatting.v0(dVar, roVar, dVar.x());
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "getAutoPlayInstance autoPlay=%s", v0Var);
                roVar.f199883z = roVar.f198580d.x();
                w21.z0.f442519d.add(v0Var);
                java.util.ArrayList arrayList = (java.util.ArrayList) w21.k.f442401v;
                if (!arrayList.contains(v0Var)) {
                    arrayList.add(v0Var);
                }
                ig0.o oVar = (ig0.o) ((dg0.f) i95.n0.c(dg0.f.class));
                oVar.getClass();
                oVar.f291335o = new java.lang.ref.WeakReference(v0Var);
                roVar.v0(v0Var);
                v0Var.G(!roVar.f199865e);
                return v0Var;
            }
        };
        this.f199866f = w0Var;
        this.f199867g = new bm5.x0(w0Var);
        this.f199868h = false;
        this.f199871n = new java.util.concurrent.ConcurrentHashMap();
        this.f199872o = false;
        this.f199873p = new com.tencent.mm.ui.chatting.component.to(this);
        this.f199874q = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f199875r = -1;
        this.f199876s = false;
        this.f199877t = null;
        this.f199878u = -1L;
        this.f199879v = false;
        this.f199880w = -1L;
        this.f199881x = null;
        this.f199882y = null;
        this.A = new com.tencent.mm.ui.chatting.component.vo(this);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B = new com.tencent.mm.ui.chatting.component.VoiceComponent$3(this, a0Var);
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoicePlayStopEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.VoiceComponent$4
            {
                this.__eventId = 1250962690;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoicePlayStopEvent voicePlayStopEvent) {
                if (voicePlayStopEvent != null) {
                    com.tencent.mm.ui.chatting.component.ro roVar = com.tencent.mm.ui.chatting.component.ro.this;
                    roVar.f199874q.set(false);
                    roVar.f199879v = false;
                    roVar.x0();
                }
                return false;
            }
        };
        this.D = null;
        this.E = new com.tencent.mm.ui.chatting.component.xo(this);
        this.F = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceInputStartEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.VoiceComponent$6
            {
                this.__eventId = -615338656;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoiceInputStartEvent voiceInputStartEvent) {
                if (!voiceInputStartEvent.f54935g.f7501a) {
                    return false;
                }
                com.tencent.mm.ui.tools.sd.f210742a.b(true);
                com.tencent.mm.ui.chatting.component.ro.this.n0();
                return false;
            }
        };
        this.G = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        c01.d9.e().a(127, this);
        this.B.alive();
        this.C.alive();
        this.f199874q.set(false);
        x0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mm.ui.chatting.v0 o07 = o0();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "doDestroy, autoPlay:%s", o07);
        c01.d9.e().q(127, this);
        u0();
        if (o07 != null) {
            w21.z0.f442519d.remove(o07);
            ((java.util.ArrayList) w21.k.f442401v).remove(o07);
            ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).f291335o = null;
            if (o07.m()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AutoPlay", "destroySwitchToBack: ");
                com.tencent.mm.ui.chatting.v0.U = o07;
                o07.f202772r = null;
                o07.f202771q = null;
                o07.A();
                com.tencent.mm.ui.chatting.component.ro roVar = o07.f202773s;
                o07.M = roVar != null ? roVar.f199865e : o07.M;
                o07.f202773s = null;
            } else {
                o07.h();
                o07.r();
            }
            this.f199867g = new bm5.x0(this.f199866f);
        }
        java.util.HashMap hashMap = com.tencent.mm.modelbase.c.f70594a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AsyncMediaPlayerWrapper", "dead, tag:".concat("VoiceComponent_playUploadVoiceSound"));
        java.util.HashMap hashMap2 = com.tencent.mm.modelbase.c.f70594a;
        com.tencent.mm.modelbase.j0 j0Var = (com.tencent.mm.modelbase.j0) hashMap2.get("VoiceComponent_playUploadVoiceSound");
        if (j0Var != null) {
            j0Var.f70655a.quitSafely();
        }
        hashMap2.remove("VoiceComponent_playUploadVoiceSound");
        this.F.dead();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        c01.d9.e().q(127, this);
        java.util.concurrent.Future future = this.f199882y;
        if (future != null) {
            future.cancel(false);
        }
        this.B.dead();
        this.C.dead();
        this.f199871n.clear();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.F.alive();
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.VoiceComponent", "onScroll visibleItemCount == 0");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f199880w;
        if (j17 != -1 && currentTimeMillis - j17 > 2000) {
            this.f199879v = false;
        }
        this.f199880w = currentTimeMillis;
        sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
        com.tencent.mm.ui.chatting.component.ap apVar = new com.tencent.mm.ui.chatting.component.ap();
        int m17 = this.f198580d.m();
        int i28 = i17 - m17;
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
        com.tencent.mm.storage.f9 item = kVar.getItem(i28);
        if (item != null) {
            apVar.f198661a = item.getMsgId();
        } else {
            com.tencent.mm.storage.f9 item2 = kVar.getItem((i17 + 1) - m17);
            if (item2 != null) {
                apVar.f198661a = item2.getMsgId();
            }
        }
        int i29 = i28 + i18 + 2;
        if (i29 > kVar.getCount() - 1) {
            i29 = kVar.getCount() - 1;
        }
        com.tencent.mm.storage.f9 item3 = kVar.getItem(i29);
        if (item3 != null) {
            apVar.f198662b = item3.getMsgId();
        }
        this.f199881x = apVar;
        if (!this.f199876s) {
            if (this.f199874q.get()) {
                this.f199879v = false;
                return;
            } else if (this.f199879v) {
                this.f199879v = false;
                return;
            } else {
                this.f199879v = true;
                x0();
                return;
            }
        }
        this.f199879v = false;
        java.util.concurrent.Future future = this.f199877t;
        if (future != null) {
            future.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.chatting.component.yo yoVar = new com.tencent.mm.ui.chatting.component.yo(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f199877t = t0Var.z(yoVar, 300L, false);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onScrollStateChanged %s", java.lang.Integer.valueOf(i17));
        this.f199879v = false;
        if (i17 != 0) {
            this.f199876s = true;
            return;
        }
        this.f199876s = false;
        if (this.f199874q.get()) {
            return;
        }
        x0();
    }

    public boolean m0(com.tencent.mm.storage.f9 f9Var) {
        if (!f9Var.g3()) {
            return false;
        }
        if (!c01.d9.b().E()) {
            db5.t7.k(this.f198580d.g(), this.f198580d.f460717l.getContentView());
            return true;
        }
        com.tencent.mm.ui.chatting.v0 o07 = o0();
        if (o07 != null && f9Var.getMsgId() == o07.f202766i) {
            o07.J(true);
        }
        if (!this.f198580d.x().equals("medianote")) {
            ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
        }
        com.tencent.mm.ui.chatting.ic.f(f9Var);
        return true;
    }

    public final void n0() {
        boolean isHeld;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "voiceComponent doPause");
        this.f199868h = false;
        if (com.tencent.mm.storage.z3.I4(this.f198580d.x())) {
            c01.n8.c();
            c01.t8 c17 = c01.n8.c();
            c01.r8 r8Var = this.A;
            zf4.l lVar = (zf4.l) c17;
            if (r8Var != null) {
                ((java.util.HashSet) lVar.f472676h).remove(r8Var);
            }
        }
        android.view.View view = this.D;
        if (view != null && view.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "doPause set voiceinputMask GONE");
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/VoiceComponent", "doPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/VoiceComponent", "doPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e.setVoiceInputShowCallback(null);
        c01.d9.b().p().w(26, java.lang.Boolean.valueOf(this.f199865e));
        com.tencent.mm.ui.chatting.v0 o07 = o0();
        if (o07 != null && o07.n()) {
            com.tencent.mm.ui.tools.sd sdVar = com.tencent.mm.ui.tools.sd.f210742a;
            if (!(com.tencent.mm.ui.tools.sd.f210745d ? com.tencent.mm.ui.tools.sd.f210744c : true)) {
                this.f199872o = true;
                sdVar.b(true);
                com.tencent.mm.app.w.INSTANCE.a(this.f199873p);
                return;
            }
        }
        com.tencent.mm.ui.tools.sd.f210742a.b(true);
        synchronized (com.tencent.mm.ui.ga.f208630x0) {
            android.os.PowerManager.WakeLock wakeLock = com.tencent.mm.ui.ga.f208629w0;
            isHeld = wakeLock != null ? wakeLock.isHeld() : false;
        }
        if (isHeld || o07 == null) {
            return;
        }
        o07.h();
        o07.J(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "AutoPlay release");
        com.tencent.mm.sdk.platformtools.s7 s7Var = o07.f202776v;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    public com.tencent.mm.ui.chatting.v0 o0() {
        return (com.tencent.mm.ui.chatting.v0) this.f199867g.d();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        w21.w0 w0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " sceneType:" + m1Var.getType());
        this.f198580d.b();
        yb5.d dVar = this.f198580d;
        if (!dVar.f460714i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd fragment not foreground, return");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.U0(dVar.g())) {
            android.app.Activity g17 = this.f198580d.g();
            boolean z17 = true;
            if (!com.tencent.mm.ui.pc.a(g17, i17, i18, str, 7) && !com.tencent.mm.plugin.account.ui.d.a(g17, i17, i18, new android.content.Intent().setClass(g17, com.tencent.mm.ui.LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str)) {
                z17 = false;
            }
            if (!z17 && i17 == 0 && i18 == 0 && m1Var.getType() == 127) {
                if (m1Var instanceof w21.o) {
                    w0Var = w21.x0.j(((w21.o) m1Var).f442432f);
                } else if ((m1Var.getReqResp() instanceof com.tencent.mm.modelbase.o) && (((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a instanceof r45.dv6)) {
                    return;
                } else {
                    w0Var = null;
                }
                if (w0Var == null || w0Var.f442492i != 99) {
                    return;
                }
                ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ri(this.f198580d.g());
            }
        }
    }

    public com.tencent.mm.ui.chatting.v0 p0() {
        return (com.tencent.mm.ui.chatting.v0) this.f199867g.b();
    }

    public boolean q0(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f199871n;
        if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17))) {
            return ((java.lang.Boolean) concurrentHashMap.get(java.lang.Long.valueOf(j17))).booleanValue();
        }
        return false;
    }

    public boolean r0() {
        boolean z17 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198753r;
        boolean z18 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198754s;
        return z17 ? z18 ? ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198744f.t0(1) : ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198745g.t0(1) : ((this.f198580d.C() || z18) && this.f198580d.u().T == 0) || c01.e2.P(this.f198580d.u());
    }

    public boolean s0(long j17) {
        com.tencent.mm.ui.chatting.v0 o07 = o0();
        return o07 != null && o07.n() && o07.f202766i == j17;
    }

    public void t0(com.tencent.mm.ui.MMFragment mMFragment, boolean z17) {
        if (mMFragment.getLandscapeMode()) {
            if (!z17) {
                mMFragment.setRequestedOrientation(-1);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "rotation %d", java.lang.Integer.valueOf(mMFragment.getWindowManager().getDefaultDisplay().getOrientation()));
            int orientation = mMFragment.getWindowManager().getDefaultDisplay().getOrientation();
            if (orientation == 0) {
                mMFragment.setRequestedOrientation(1);
                return;
            }
            if (orientation == 1) {
                mMFragment.setRequestedOrientation(0);
            } else if (orientation == 2) {
                mMFragment.setRequestedOrientation(9);
            } else {
                if (orientation != 3) {
                    return;
                }
                mMFragment.setRequestedOrientation(8);
            }
        }
    }

    public void u0() {
        this.f198580d.Q(false);
        com.tencent.mm.ui.chatting.v0 o07 = o0();
        if (o07 != null && this.f199872o) {
            this.f199872o = false;
            o07.h();
            o07.J(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoPlay", "AutoPlay release");
            com.tencent.mm.sdk.platformtools.s7 s7Var = o07.f202776v;
            if (s7Var != null) {
                s7Var.b();
            }
        }
        com.tencent.mm.app.w.INSTANCE.p(this.f199873p);
        this.f199872o = false;
    }

    public final void v0(com.tencent.mm.ui.chatting.v0 v0Var) {
        qk.n D0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "resetAutoPlay autoPlay is:%s tid:%d looper:%s", v0Var, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), android.os.Looper.myLooper());
        java.lang.String str = this.f199883z;
        if (str == null || !str.equals(this.f198580d.x())) {
            java.lang.String x17 = this.f198580d.x();
            this.f199883z = x17;
            v0Var.g(x17);
        }
        boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) c01.d9.b().p().l(16387, null), true);
        if (!v0Var.C) {
            v0Var.f202779y = m17;
            v0Var.h();
        }
        qk.o x07 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).x0();
        if (x07 == null || (D0 = x07.D0(false)) == null) {
            return;
        }
        org.json.JSONObject jSONObject = D0.f364256a;
        if (jSONObject != null) {
            D0.f364270o = jSONObject.optInt("AudioPlayType", 0) == 1;
        }
        if (D0.f364270o) {
            v0Var.B = false;
        }
    }

    public void w0(boolean z17) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff value is %s", java.lang.Boolean.valueOf(z17));
        sb5.z0 z0Var = (sb5.z0) this.f198580d.f460708c.a(sb5.z0.class);
        if (z17) {
            this.f199865e = true;
            c01.d9.b().p().w(26, java.lang.Boolean.TRUE);
            ((com.tencent.mm.ui.chatting.component.pe) z0Var).G0(0);
            dp.a.makeText(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.fdo), 0).show();
            yb5.d dVar = this.f198580d;
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[updateOptionMenuIcon] menuID:%d iconID:%s", 2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_ear_icon));
            dVar.f460718m.updateOptionMenuIcon(2, com.tencent.mm.R.raw.actionbar_ear_icon);
            com.tencent.mm.ui.chatting.v0 o07 = o0();
            if (o07 != null) {
                o07.G(false);
                o07.K();
                return;
            }
            return;
        }
        this.f199865e = false;
        c01.d9.b().p().w(26, java.lang.Boolean.FALSE);
        ((com.tencent.mm.ui.chatting.component.pe) z0Var).G0(8);
        dp.a.makeText(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.fdp), 0).show();
        yb5.d dVar2 = this.f198580d;
        dVar2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingContext", "[updateOptionMenuIcon] menuID:%d iconID:%s", 2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.actionbar_loud_icon));
        dVar2.f460718m.updateOptionMenuIcon(2, com.tencent.mm.R.raw.actionbar_loud_icon);
        com.tencent.mm.ui.chatting.v0 o08 = o0();
        if (o08 != null) {
            if (ym1.f.Ni()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff true but isBluetoothOn");
            } else {
                o08.G(true);
            }
            o08.K();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay looper[%s]", android.os.Looper.myLooper());
        this.f199868h = true;
        com.tencent.mm.ui.chatting.v0 o07 = o0();
        if (!this.f199872o && o07 != null && !o07.m()) {
            v0(o07);
            o07.G(!this.f199865e);
            o07.s();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay complete");
        if (com.tencent.mm.storage.z3.I4(this.f198580d.x())) {
            c01.n8.c();
            c01.t8 c17 = c01.n8.c();
            c01.r8 r8Var = this.A;
            zf4.l lVar = (zf4.l) c17;
            if (r8Var != null) {
                ((java.util.HashSet) lVar.f472676h).add(r8Var);
            }
        }
        if (!u11.c.g()) {
            ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e.setVoiceInputShowCallback(this.E);
        }
        y0();
        com.tencent.mm.app.w.INSTANCE.p(this.f199873p);
        com.tencent.mm.ui.tools.sd.f210742a.b(true);
    }

    public void x0() {
        if (((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) this.f198580d.f460708c.a(sb5.p1.class))).f198977e) {
            return;
        }
        sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
        java.util.ArrayList arrayList = ((com.tencent.mm.ui.chatting.adapter.k) zVar).I.f152065o;
        if (arrayList != null) {
            this.f199882y = ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.zo(this, arrayList, zVar));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.ui.chatting.v0 o07 = o0();
        if (o07 == null || !o07.m()) {
            n0();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "onChattingPause: background playing, skip pause");
        }
    }

    public void y0() {
        sb5.z0 z0Var = (sb5.z0) this.f198580d.f460708c.a(sb5.z0.class);
        sb5.d0 d0Var = (sb5.d0) this.f198580d.f460708c.a(sb5.d0.class);
        sb5.p1 p1Var = (sb5.p1) this.f198580d.f460708c.a(sb5.p1.class);
        if (((com.tencent.mm.ui.chatting.component.b5) d0Var).f198696g || ((com.tencent.mm.ui.chatting.component.ej) p1Var).f198977e || this.f198580d.E()) {
            this.f198580d.X(2, false);
            com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) z0Var;
            peVar.G0(8);
            peVar.F0(8);
            return;
        }
        if (r0()) {
            ((com.tencent.mm.ui.chatting.component.pe) z0Var).F0(0);
        } else {
            ((com.tencent.mm.ui.chatting.component.pe) z0Var).F0(8);
        }
        java.lang.Boolean bool = (java.lang.Boolean) c01.d9.b().p().l(26, null);
        if (bool == null) {
            this.f199865e = false;
        } else {
            this.f199865e = bool.booleanValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VoiceComponent", "triggerTitleIcon and setForceSpeakOff value is %s", java.lang.Boolean.valueOf(this.f199865e));
        ((com.tencent.mm.ui.chatting.component.pe) z0Var).G0(this.f199865e ? 0 : 8);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        y0();
    }
}
