package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.l2.class)
/* loaded from: classes5.dex */
public class ym extends com.tencent.mm.ui.chatting.component.a implements sb5.l2 {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f200332u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f200333v = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f200338i;

    /* renamed from: m, reason: collision with root package name */
    public int f200339m;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f200342p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f200343q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.regex.Pattern f200344r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.regex.Pattern f200345s;

    /* renamed from: t, reason: collision with root package name */
    public int f200346t;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.i6 f200334e = new com.tencent.mm.sdk.platformtools.i6(5, "msg-translate-update-worker", 1);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f200335f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f200336g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200337h = false;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest f200340n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f200341o = "";

    public ym() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f200342p = new com.tencent.mm.ui.chatting.component.TranslateComponent$2(this, a0Var);
        this.f200343q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.TranslateComponent$3
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                int D1;
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent2 = changeTranslateLanguageEvent;
                com.tencent.mm.ui.chatting.component.ym ymVar = com.tencent.mm.ui.chatting.component.ym.this;
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = ymVar.f200340n;
                java.lang.String str = settingsTranslateLanguageRequest == null ? null : settingsTranslateLanguageRequest.f67822e;
                if (settingsTranslateLanguageRequest == null) {
                    D1 = -1;
                } else {
                    java.util.Map map = settingsTranslateLanguageRequest.f67823f;
                    D1 = com.tencent.mm.sdk.platformtools.t8.D1(map == null ? null : (java.lang.String) map.get("TranslateComponent.SettingsRequestExtKey.MsgPosition"), 0);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.TranslateComponent", "changeTransLangListener, eventSessionId: " + changeTranslateLanguageEvent2.f54035g.f8502a + ", requestMsgId: " + str + ", requestMsgPosition: " + D1);
                if (str != null && android.text.TextUtils.equals(str, changeTranslateLanguageEvent2.f54035g.f8502a)) {
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(ymVar.f200341o, com.tencent.mm.sdk.platformtools.t8.E1(str));
                    qn4.y.e(Li.getMsgId(), 4);
                    ymVar.f200340n = null;
                    ymVar.f200341o = "";
                    ymVar.A0(Li, D1);
                }
                return false;
            }
        };
        this.f200344r = java.util.regex.Pattern.compile("[a-zA-z]");
        this.f200345s = java.util.regex.Pattern.compile("[一-龥]");
        this.f200346t = -1;
    }

    public final void A0(com.tencent.mm.storage.f9 f9Var, int i17) {
        com.tencent.mm.ui.chatting.viewitems.io v07 = v0(f9Var);
        com.tencent.mm.ui.chatting.viewitems.io ioVar = com.tencent.mm.ui.chatting.viewitems.io.Transforming;
        if (v07 == ioVar) {
            return;
        }
        boolean k27 = f9Var.k2();
        com.tencent.mm.autogen.events.TranslateMessageEvent translateMessageEvent = new com.tencent.mm.autogen.events.TranslateMessageEvent();
        am.hz hzVar = translateMessageEvent.f54902g;
        hzVar.getClass();
        hzVar.f6880c = "" + f9Var.getMsgId();
        hzVar.f6878a = r0(f9Var);
        hzVar.f6879b = com.tencent.mm.sdk.platformtools.m2.c(this.f198580d.g());
        if (this.f198580d.D()) {
            if (n0(f9Var.getMsgId())) {
                hzVar.f6882e = 4;
            } else {
                hzVar.f6882e = 118;
            }
        } else if (n0(f9Var.getMsgId())) {
            hzVar.f6882e = 1;
        } else {
            hzVar.f6882e = 117;
        }
        if (!this.f198580d.D() || f9Var.A0() == 1) {
            hzVar.f6881d = 0;
        } else if (k27) {
            hzVar.f6881d = 0;
        } else {
            hzVar.f6881d = 1;
        }
        hzVar.f6883f = f9Var.Q0();
        translateMessageEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "showTranslateFromRequest, msgId: " + f9Var.getMsgId() + ", targetIso: " + hzVar.f6879b + ", source: " + hzVar.f6883f + ", talker: " + this.f198580d.x());
        m0(f9Var.getMsgId(), ioVar);
        this.f200336g = i17;
        this.f198580d.J();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f200342p.dead();
        this.f200343q.dead();
        go.d dVar = go.d.f273696a;
        go.d.f273701f = go.c.f273695d;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f200342p.dead();
        this.f200343q.dead();
        go.d dVar = go.d.f273696a;
        go.d.f273701f = go.c.f273695d;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f200335f.clear();
        this.f200342p.alive();
        this.f200343q.alive();
        go.d.f273701f = new yz5.l() { // from class: com.tencent.mm.ui.chatting.component.ym$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
                com.tencent.mm.ui.chatting.component.ym ymVar = com.tencent.mm.ui.chatting.component.ym.this;
                int R0 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) ymVar.f198580d.f460708c.a(sb5.z.class))).R0(f9Var);
                if (f9Var.b2()) {
                    return null;
                }
                ymVar.p0(f9Var, R0, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "registerListener autoTransFlag MsgId: %s", java.lang.Long.valueOf(f9Var.getMsgId()));
                com.tencent.mm.ui.chatting.component.ym.f200332u.put(java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Boolean.TRUE);
                return null;
            }
        };
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (i17 < this.f200346t) {
            this.f200337h = false;
        }
        this.f200346t = i17;
    }

    public void m0(long j17, com.tencent.mm.ui.chatting.viewitems.io ioVar) {
        this.f200335f.put(java.lang.Long.valueOf(j17), ioVar);
    }

    public boolean n0(long j17) {
        java.util.HashMap hashMap = f200333v;
        if (hashMap.get(java.lang.Long.valueOf(j17)) == null) {
            return false;
        }
        return ((java.lang.Boolean) hashMap.get(java.lang.Long.valueOf(j17))).booleanValue();
    }

    public boolean o0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        db5.t7.m(this.f198580d.g(), this.f198580d.g().getResources().getString(com.tencent.mm.R.string.b6d));
        r45.aq6 aq6Var = new r45.aq6();
        aq6Var.f370207d = u0(r0(f9Var));
        aq6Var.f370208e = u0(f9Var.W0());
        aq6Var.f370209f = com.tencent.mm.sdk.platformtools.m2.f(this.f198580d.g());
        aq6Var.b().l().h(new com.tencent.mm.ui.chatting.component.dn(this));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(com.tencent.mm.storage.f9 r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.ym.p0(com.tencent.mm.storage.f9, int, boolean):void");
    }

    public java.lang.String q0(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        if (z17) {
            java.lang.String W0 = f9Var.W0();
            return (this.f198580d.C() && W0 != null && f9Var.A0() == 0) ? c01.w9.u(W0) : W0;
        }
        java.lang.String j17 = f9Var.j();
        return (this.f198580d.C() && j17 != null && f9Var.A0() == 0) ? c01.w9.u(j17) : j17;
    }

    public final java.lang.String r0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            ot0.q v17 = ot0.q.v(f9Var.U1());
            if (v17 != null) {
                return v17.n();
            }
            return null;
        }
        if (!f9Var.g3()) {
            return f9Var.j();
        }
        com.tencent.mm.storage.kb y07 = w21.p0.Ai().y0(f9Var.z0());
        if (y07 != null) {
            return y07.field_content;
        }
        return null;
    }

    public final void s0(com.tencent.mm.storage.f9 f9Var) {
        qn4.y.d(4);
        if (f9Var.i2()) {
            f9Var.l1(f9Var.F & (-17));
        }
        m0(f9Var.getMsgId(), com.tencent.mm.ui.chatting.viewitems.io.NoTransform);
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
        com.tencent.mm.modelstat.e.f71505a.getClass();
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        this.f200336g = -1;
        this.f198580d.J();
    }

    public boolean t0(android.view.MenuItem menuItem, com.tencent.mm.storage.f9 f9Var) {
        int i17;
        int itemId = menuItem.getItemId();
        int groupId = menuItem.getGroupId();
        long msgId = f9Var.getMsgId();
        if (itemId != 124 && itemId != 125 && itemId != 163) {
            if (itemId != 164) {
                return false;
            }
            wd0.k2 k2Var = f9Var.H2() ? f9Var.b2() ? wd0.k2.CHAT_MSG_SOLITAIRE_TRANSLATE_RESULT : wd0.k2.CHAT_MSG_SOLITAIRE : f9Var.T2() ? f9Var.b2() ? wd0.k2.CHAT_MSG_QUOTE_TRANSLATE_RESULT : wd0.k2.CHAT_MSG_QUOTE : f9Var.b2() ? wd0.k2.CHAT_MSG_DEFAULT_TRANSLATE_RESULT : wd0.k2.CHAT_MSG_DEFAULT;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TranslateComponent", "longclick to change translate language, messageType: " + f9Var.getType() + ", msgId: " + msgId + ", msgPosition: " + groupId + ", entrance: " + k2Var);
            com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
            settingsTranslateLanguageRequest.f67821d = k2Var;
            settingsTranslateLanguageRequest.f67822e = java.lang.String.valueOf(msgId);
            settingsTranslateLanguageRequest.b("TranslateComponent.SettingsRequestExtKey.MsgPosition", java.lang.String.valueOf(groupId));
            settingsTranslateLanguageRequest.f67824g = 3;
            this.f200340n = settingsTranslateLanguageRequest.clone();
            this.f200341o = f9Var.Q0();
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(this.f198580d.g(), settingsTranslateLanguageRequest);
            return true;
        }
        f9Var.b2();
        com.tencent.mm.ui.chatting.component.xm.f200246q = msgId;
        java.util.HashMap hashMap = f200333v;
        java.lang.Long valueOf = java.lang.Long.valueOf(msgId);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        hashMap.put(valueOf, bool);
        java.util.HashMap hashMap2 = f200332u;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(msgId);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        hashMap2.put(valueOf2, bool2);
        com.tencent.mm.sdk.platformtools.f9 f9Var2 = com.tencent.mm.sdk.platformtools.f9.ContextTranslate;
        if (itemId != 124 || ((java.lang.Boolean) c01.d9.b().p().l(327712, bool2)).booleanValue()) {
            if (itemId != 125 || ((java.lang.Boolean) c01.d9.b().p().l(327713, bool2)).booleanValue()) {
                i17 = 0;
            } else {
                if (!f9Var2.k(this.f198580d.g(), null)) {
                    return true;
                }
                c01.d9.b().p().w(327713, bool);
                i17 = com.tencent.mm.R.string.b5j;
            }
        } else {
            if (!f9Var2.k(this.f198580d.g(), null)) {
                return true;
            }
            c01.d9.b().p().w(327712, bool);
            i17 = com.tencent.mm.R.string.b6l;
        }
        if (i17 != 0) {
            android.app.Activity context = this.f198580d.f460717l.getContext();
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211729s = this.f198580d.s().getString(i17);
            aVar.f211709a = this.f198580d.s().getString(com.tencent.mm.R.string.b6m);
            aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f492294fz1);
            aVar.E = new com.tencent.mm.ui.chatting.component.cn(this, msgId, f9Var, groupId, itemId);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
        } else {
            this.f200337h = true;
            this.f200338i = false;
            this.f200339m = 0;
            go.d.f273696a.b(itemId == 163, msgId);
            p0(f9Var, groupId, itemId == 125);
        }
        return true;
    }

    public final java.lang.String u0(java.lang.String str) {
        int t17;
        return (!this.f198580d.D() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198753r || (t17 = c01.w9.t(str)) == -1) ? str : str.substring(t17 + 1).trim();
    }

    public com.tencent.mm.ui.chatting.viewitems.io v0(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.io ioVar = (com.tencent.mm.ui.chatting.viewitems.io) this.f200335f.get(java.lang.Long.valueOf(f9Var.getMsgId()));
        if (ioVar != null) {
            return ioVar;
        }
        boolean i27 = f9Var.i2();
        com.tencent.mm.ui.chatting.viewitems.io ioVar2 = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        if (!i27) {
            com.tencent.mm.autogen.events.TranslateMessageQueryStatusEvent translateMessageQueryStatusEvent = new com.tencent.mm.autogen.events.TranslateMessageQueryStatusEvent();
            translateMessageQueryStatusEvent.f54903g.f6985a = "" + f9Var.getMsgId();
            translateMessageQueryStatusEvent.e();
            if (translateMessageQueryStatusEvent.f54904h.f7107a) {
                com.tencent.mm.ui.chatting.viewitems.io ioVar3 = com.tencent.mm.ui.chatting.viewitems.io.Transforming;
                m0(f9Var.getMsgId(), ioVar3);
                return ioVar3;
            }
        } else if (f9Var.b2()) {
            return com.tencent.mm.ui.chatting.viewitems.io.Transformed;
        }
        return ioVar2;
    }

    public final int w0(int i17) {
        sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
        int i18 = 0;
        while (i18 <= 20) {
            if (!y0(((com.tencent.mm.ui.chatting.adapter.k) zVar).getItem(i17 + i18 + 1))) {
                break;
            }
            i18++;
        }
        return i18;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        this.f200340n = null;
        this.f200341o = "";
    }

    public final void x0(int i17, int i18, int i19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19168, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17 + i19));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        this.f200338i = true;
        int i17 = this.f200336g;
        if (i17 >= 0) {
            x0(this.f200339m, 1, w0(i17));
        }
    }

    public final boolean y0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        if ((!f9Var.b3() && !f9Var.T2()) || f9Var.i2() || f9Var.A0() != 0) {
            return false;
        }
        java.lang.String j17 = f9Var.j();
        int indexOf = j17.indexOf(58);
        if (indexOf != -1) {
            j17 = j17.substring(indexOf + 1);
        }
        return com.tencent.mm.sdk.platformtools.m2.j() ? this.f200344r.matcher(j17).find() : this.f200345s.matcher(j17).find();
    }
}
