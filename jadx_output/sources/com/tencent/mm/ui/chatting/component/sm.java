package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.j2.class)
/* loaded from: classes8.dex */
public class sm extends com.tencent.mm.ui.chatting.component.a implements sb5.j2, p21.a, q21.c, com.tencent.mm.plugin.multitalk.model.x, com.tencent.mm.ui.s9 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199950e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.TalkRoomPopupNav f199951f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f199952g;

    /* renamed from: h, reason: collision with root package name */
    public final db5.i9 f199953h;

    public sm() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f199950e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(this, a0Var) { // from class: com.tencent.mm.ui.chatting.component.TrackRoomComponent$2
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent2 = voipEvent;
                if (!gm0.j1.a()) {
                    return false;
                }
                int i17 = voipEvent2.f54945g.f8415b;
                if (i17 == 5 || i17 == 3) {
                    com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
                    exitTrackRoomEvent.f54187g.f8176a = ((va3.v0) q21.d.b()).f434364v;
                    exitTrackRoomEvent.e();
                }
                return true;
            }
        };
        this.f199953h = new com.tencent.mm.ui.chatting.component.nm(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f199951f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.i();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        r0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
    }

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        yb5.d dVar = this.f198580d;
        if (dVar == null || !str.equals(dVar.x())) {
            return;
        }
        m0(false);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.x
    public void b(java.lang.String str) {
        yb5.d dVar = this.f198580d;
        if (dVar == null || !str.equals(dVar.x())) {
            return;
        }
        m0(false);
    }

    @Override // q21.c
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        yb5.d dVar = this.f198580d;
        if (dVar == null || !str.equals(dVar.x())) {
            return;
        }
        m0(false);
    }

    @Override // com.tencent.mm.ui.s9
    public void j(java.lang.String str) {
        yb5.d dVar = this.f198580d;
        if (dVar == null || !str.equals(dVar.x())) {
            return;
        }
        m0(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f4, code lost:
    
        if (r8.f199951f == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(boolean r9) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.sm.m0(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(java.lang.String r11) {
        /*
            r10 = this;
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            r1 = 0
            r2 = 274436(0x43004, float:3.84567E-40)
            java.lang.Object r0 = r0.l(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = u11.c.f(r0)
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Class<tb0.j> r3 = tb0.j.class
            if (r0 == 0) goto La6
            i95.m r0 = i95.n0.c(r3)
            tb0.j r0 = (tb0.j) r0
            yb5.d r4 = r10.f198580d
            android.app.Activity r4 = r4.g()
            sb0.f r0 = (sb0.f) r0
            r0.getClass()
            r0 = 1
            boolean r4 = j35.u.d(r4, r2, r0)
            if (r4 == 0) goto L4f
            i95.m r4 = i95.n0.c(r3)
            tb0.j r4 = (tb0.j) r4
            yb5.d r5 = r10.f198580d
            android.app.Activity r5 = r5.g()
            sb0.f r4 = (sb0.f) r4
            r4.getClass()
            boolean r4 = j35.u.d(r5, r1, r0)
            if (r4 == 0) goto L4f
            r4 = r0
            goto L50
        L4f:
            r4 = 0
        L50:
            if (r4 != 0) goto Lc4
            gm0.b0 r11 = gm0.j1.u()
            com.tencent.mm.storage.n3 r11 = r11.c()
            com.tencent.mm.storage.u3 r4 = com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r11 = r11.m(r4, r5)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L8b
            yb5.d r11 = r10.f198580d
            android.app.Activity r11 = r11.g()
            yb5.d r1 = r10.f198580d
            android.content.res.Resources r1 = r1.s()
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.m2.d()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131770645(0x7f103d15, float:1.9172599E38)
            java.lang.String r1 = r1.getString(r3, r2)
            r2 = 30762(0x782a, float:4.3107E-41)
            c71.b.c(r11, r1, r2, r0)
            goto La5
        L8b:
            i95.m r11 = i95.n0.c(r3)
            tb0.j r11 = (tb0.j) r11
            yb5.d r0 = r10.f198580d
            android.app.Activity r0 = r0.g()
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            sb0.f r11 = (sb0.f) r11
            r11.getClass()
            r11 = 68
            j35.u.l(r0, r1, r11)
        La5:
            return
        La6:
            i95.m r0 = i95.n0.c(r3)
            tb0.j r0 = (tb0.j) r0
            yb5.d r3 = r10.f198580d
            android.app.Activity r5 = r3.g()
            java.lang.String[] r6 = new java.lang.String[]{r2, r1}
            r7 = 68
            r8 = 0
            r9 = 0
            r4 = r0
            sb0.f r4 = (sb0.f) r4
            boolean r0 = r4.Di(r5, r6, r7, r8, r9)
            if (r0 != 0) goto Lc4
            return
        Lc4:
            r10.t0(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.sm.n0(java.lang.String):void");
    }

    public void o0(boolean z17) {
        java.lang.String string;
        int i17;
        boolean z18 = ((com.tencent.mm.ui.chatting.component.q2) ((sb5.n) this.f198580d.f460708c.a(sb5.n.class))).u0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).P;
        if (com.tencent.mm.storage.z3.R4(this.f198580d.x()) && !z18) {
            db5.e1.s(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.joi), null);
            return;
        }
        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
        talkRoomServerEvent.f54883g.f7583a = true;
        talkRoomServerEvent.e();
        am.py pyVar = talkRoomServerEvent.f54884h;
        if (z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(pyVar.f7671a) || this.f198580d.x().equals(pyVar.f7671a)) {
                p0(this.f198580d.x());
                return;
            }
            com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f199951f;
            if (talkRoomPopupNav == null || talkRoomPopupNav.getVisibility() != 0) {
                db5.e1.u(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.jo_), null, new com.tencent.mm.ui.chatting.component.jm(this), new com.tencent.mm.ui.chatting.component.km(this));
                return;
            }
            return;
        }
        if (q21.d.a() != null) {
            if (((va3.z0) q21.d.a()).f(this.f198580d.u().d1())) {
                java.util.LinkedList b17 = ((va3.z0) q21.d.a()).b(this.f198580d.u().d1());
                if (b17 == null || !b17.contains(this.f198580d.t())) {
                    string = this.f198580d.s().getString(com.tencent.mm.R.string.joe);
                    i17 = com.tencent.mm.R.string.g6r;
                } else {
                    string = this.f198580d.s().getString(com.tencent.mm.R.string.jod);
                    i17 = com.tencent.mm.R.string.c0z;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10997, 19, 0, 0, 0);
                android.app.Activity g17 = this.f198580d.g();
                com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                aVar.f211729s = string;
                aVar.f211732v = of5.b.a(g17).getString(com.tencent.mm.R.string.f490347sg);
                aVar.E = new com.tencent.mm.ui.chatting.component.om(this);
                aVar.f211733w = of5.b.a(g17).getString(i17);
                aVar.F = new com.tencent.mm.ui.chatting.component.pm(this, z17);
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(g17, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                j0Var.show();
                return;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(pyVar.f7671a) || this.f198580d.x().equals(pyVar.f7671a)) {
            p0(this.f198580d.x());
        } else {
            db5.e1.u(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.jo_), null, new com.tencent.mm.ui.chatting.component.qm(this), new com.tencent.mm.ui.chatting.component.rm(this));
        }
    }

    public final void p0(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enter_room_username", str);
        intent.setFlags(268435456);
        j45.l.j(this.f198580d.g(), "talkroom", ".ui.TalkRoomUI", intent, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (((va3.z0) q21.d.a()).f(r4.f198580d.u().d1()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q0(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            yb5.d r5 = r4.f198580d
            android.app.Activity r5 = r5.g()
            boolean r5 = iq.b.C(r5)
            if (r5 != 0) goto Ld0
            yb5.d r5 = r4.f198580d
            android.app.Activity r5 = r5.g()
            boolean r5 = iq.b.v(r5)
            if (r5 != 0) goto Ld0
            yb5.d r5 = r4.f198580d
            android.app.Activity r5 = r5.g()
            boolean r5 = iq.b.e(r5)
            if (r5 == 0) goto L26
            goto Ld0
        L26:
            q21.a r5 = q21.d.a()
            if (r5 == 0) goto L42
            q21.a r5 = q21.d.a()
            yb5.d r0 = r4.f198580d
            com.tencent.mm.storage.z3 r0 = r0.u()
            java.lang.String r0 = r0.d1()
            va3.z0 r5 = (va3.z0) r5
            boolean r5 = r5.f(r0)
            if (r5 != 0) goto L44
        L42:
            if (r7 == 0) goto Lcd
        L44:
            q21.a r5 = q21.d.a()
            yb5.d r7 = r4.f198580d
            com.tencent.mm.storage.z3 r7 = r7.u()
            java.lang.String r7 = r7.d1()
            va3.z0 r5 = (va3.z0) r5
            java.util.LinkedList r5 = r5.b(r7)
            yb5.d r7 = r4.f198580d
            java.lang.String r7 = r7.x()
            boolean r7 = com.tencent.mm.storage.z3.R4(r7)
            r0 = 0
            if (r7 != 0) goto L7a
            if (r5 == 0) goto L84
            int r7 = r5.size()
            if (r7 <= 0) goto L84
            yb5.d r7 = r4.f198580d
            java.lang.String r7 = r7.t()
            boolean r7 = r5.contains(r7)
            if (r7 == 0) goto L84
            goto L82
        L7a:
            if (r5 == 0) goto L84
            int r7 = r5.size()
            if (r7 <= 0) goto L84
        L82:
            r7 = 1
            goto L85
        L84:
            r7 = r0
        L85:
            if (r7 == 0) goto L8b
            r4.n0(r6)
            goto Ld0
        L8b:
            com.tencent.mm.plugin.report.service.g0 r7 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r1 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r0}
            r1 = 10997(0x2af5, float:1.541E-41)
            r7.d(r1, r0)
            com.tencent.mm.ui.base.TalkRoomPopupNav r7 = r4.f199951f
            if (r7 != 0) goto Lb5
            java.lang.String r5 = "MicroMsg.ChattingUI.TrackRoomComponent"
            java.lang.String r6 = "talkRoomPopupNav = null."
            com.tencent.mars.xlog.Log.i(r5, r6)
            return
        Lb5:
            yb5.d r0 = r4.f198580d
            android.content.res.Resources r0 = r0.s()
            r1 = 2131760552(0x7f1015a8, float:1.9152128E38)
            java.lang.String r0 = r0.getString(r1)
            r7.setDialogContent(r0)
            com.tencent.mm.ui.base.TalkRoomPopupNav r7 = r4.f199951f
            r0 = 300(0x12c, double:1.48E-321)
            r7.j(r6, r5, r0)
            goto Ld0
        Lcd:
            r4.t0(r6)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.sm.q0(java.lang.String, java.lang.String, boolean):void");
    }

    public final void r0() {
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f199951f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.setVisibility(8);
            this.f199951f.a();
            this.f199951f.c(-1, 0);
            this.f199951f.i();
            ((com.tencent.mm.ui.chatting.component.rf) ((sb5.a1) this.f198580d.f460708c.a(sb5.a1.class))).I0(-1, false);
        }
    }

    public boolean s0() {
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f199951f;
        return talkRoomPopupNav != null && talkRoomPopupNav.getVisibility() == 0;
    }

    public void t0(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 6);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("map_sender_name", this.f198580d.t());
        intent.putExtra("map_talker_name", this.f198580d.x());
        intent.putExtra("fromWhereShare", str);
        j45.l.j(this.f198580d.g(), ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingResume]");
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).a(this);
        }
        if (q21.d.a() != null) {
            va3.z0 z0Var = (va3.z0) q21.d.a();
            synchronized (z0Var) {
                ((java.util.LinkedList) z0Var.f434399d).add(this);
            }
        }
        if (i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class) != null) {
            ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).Ud(this);
        }
        java.util.HashSet hashSet = com.tencent.mm.ui.u9.f211073d;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f199950e.alive();
        m0(true);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.TrackRoomComponent", "[onChattingPause]");
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(this);
        }
        if (q21.d.a() != null) {
            va3.z0 z0Var = (va3.z0) q21.d.a();
            synchronized (z0Var) {
                ((java.util.LinkedList) z0Var.f434399d).remove(this);
            }
        }
        java.util.HashSet hashSet = com.tencent.mm.ui.u9.f211073d;
        if (hashSet != null) {
            hashSet.remove(this);
        }
        this.f199950e.dead();
        ((com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class)).p2(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
    }
}
