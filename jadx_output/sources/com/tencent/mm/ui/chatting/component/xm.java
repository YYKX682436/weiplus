package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.k2.class)
/* loaded from: classes9.dex */
public class xm extends com.tencent.mm.ui.chatting.component.a implements sb5.k2 {

    /* renamed from: q, reason: collision with root package name */
    public static long f200246q = -1;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.HashMap f200247r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashMap f200248s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.LinkedHashMap f200249t = new java.util.LinkedHashMap();

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f200250u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.ArrayList f200251v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.HashMap f200252w = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f200253e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200254f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f200255g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f200256h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f200257i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f200258m;

    /* renamed from: n, reason: collision with root package name */
    public long f200259n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f200260o;

    /* renamed from: p, reason: collision with root package name */
    public int f200261p;

    public xm() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f200253e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecallVoiceTransTextActEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.TransformComponent$1
            {
                this.__eventId = 2127530956;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecallVoiceTransTextActEvent recallVoiceTransTextActEvent) {
                com.tencent.mm.autogen.events.RecallVoiceTransTextActEvent recallVoiceTransTextActEvent2 = recallVoiceTransTextActEvent;
                com.tencent.mm.ui.chatting.component.wm wmVar = (com.tencent.mm.ui.chatting.component.wm) com.tencent.mm.ui.chatting.component.xm.f200252w.get(java.lang.Long.valueOf(recallVoiceTransTextActEvent2.f54649g.f7737a));
                if (wmVar == null) {
                    return false;
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(recallVoiceTransTextActEvent2.f54649g.f7737a);
                int i17 = wmVar.f200184b;
                com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "RecallVoiceTransTextActEvent %s %s", valueOf, java.lang.Integer.valueOf(i17));
                com.tencent.mm.ui.chatting.component.xm.this.u0(wmVar.f200183a, i17);
                return false;
            }
        };
        this.f200254f = false;
        this.f200255g = false;
        this.f200256h = false;
        this.f200257i = new java.util.ArrayList();
        this.f200258m = false;
        this.f200260o = null;
        this.f200261p = -1;
    }

    public void A0(int i17) {
        com.tencent.mm.storage.f9 f9Var;
        if (i17 == 2) {
            this.f200256h = true;
            return;
        }
        if (this.f200258m) {
            long j17 = this.f200259n;
            synchronized (this) {
                android.util.Pair pair = (android.util.Pair) f200249t.get(java.lang.Long.valueOf(j17));
                f9Var = pair == null ? null : (com.tencent.mm.storage.f9) pair.first;
            }
            p0(f9Var, true, -1, i17);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        java.util.LinkedHashMap linkedHashMap;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "clear VoiceTransTextAct");
        synchronized (this) {
            linkedHashMap = f200249t;
            linkedHashMap.clear();
        }
        f200248s.clear();
        linkedHashMap.clear();
        f200250u.clear();
        if (this.f200258m) {
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent();
            extTranslateVoiceEvent.f54213g.f8179c = 3;
            extTranslateVoiceEvent.e();
            this.f200258m = false;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f200253e.dead();
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.View view2;
        int top;
        if (i17 < this.f200261p) {
            this.f200255g = false;
        }
        this.f200261p = i17;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceTransformScrollOpt()) != 0 && (view2 = this.f200260o) != null && (top = view2.getTop()) > 0 && top - i27 <= 0) {
            recyclerView.f1();
            recyclerView.scrollBy(0, top);
            com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "onScroll top:%s dy:%s", java.lang.Integer.valueOf(top), java.lang.Integer.valueOf(i27));
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 1) {
            this.f200260o = null;
        }
    }

    public final void m0(int i17) {
        if (this.f200254f) {
            java.util.List list = this.f200257i;
            if (((java.util.ArrayList) list).size() > 0) {
                java.lang.String l17 = ((java.lang.Long) ((java.util.ArrayList) list).get(0)).toString();
                for (int i18 = 1; i18 < ((java.util.ArrayList) list).size(); i18++) {
                    l17 = l17 + ":" + ((java.util.ArrayList) list).get(i18);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16128, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(!this.f200255g ? 1 : 0), 0, l17);
                this.f200254f = false;
                ((java.util.ArrayList) list).clear();
            }
        }
    }

    public synchronized void n0(long j17, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.io ioVar) {
        f200247r.put(java.lang.Long.valueOf(j17), str);
        f200248s.put(java.lang.Long.valueOf(j17), ioVar);
        if (ioVar == com.tencent.mm.ui.chatting.viewitems.io.Transformed) {
            f200250u.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        }
    }

    public boolean o0(long j17) {
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceTransformScrollOpt()) == 0 || j17 == f200246q;
    }

    public void p0(com.tencent.mm.storage.f9 f9Var, boolean z17, int i17, int i18) {
        android.widget.RelativeLayout relativeLayout;
        if (f9Var == null) {
            return;
        }
        com.tencent.mm.storage.f9 f27 = pt0.f0.f2(f9Var.Q0(), f9Var.getMsgId());
        if (f27 != null && f27.W2()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TransformComponent", "go VoiceTransTextAct  msg is revoke");
            return;
        }
        if (f9Var.a2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag MsgId:%s,isVoiceTransforming:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Boolean.valueOf(this.f200258m));
            f9Var.l1(f9Var.F & (-65));
            long msgId = f9Var.getMsgId();
            synchronized (this) {
                f200250u.put(java.lang.Long.valueOf(msgId), java.lang.Boolean.FALSE);
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true);
            r0();
            com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent voiceTransTextCompletedEvent = new com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent();
            voiceTransTextCompletedEvent.f54940g.f7954a = f9Var.getMsgId();
            voiceTransTextCompletedEvent.f54940g.f7959f = true;
            voiceTransTextCompletedEvent.e();
            return;
        }
        int i19 = 3;
        if (q0(f9Var.getMsgId()) && z17) {
            if (t0(f9Var.getMsgId()) == com.tencent.mm.ui.chatting.viewitems.io.PreTransform) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag removeCache");
                v0(f9Var.getMsgId());
                w0(f9Var.getMsgId());
                x0(5, f9Var);
            } else if (this.f200258m) {
                com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent();
                extTranslateVoiceEvent.f54213g.f8179c = 3;
                extTranslateVoiceEvent.e();
                v0(f9Var.getMsgId());
                w0(f9Var.getMsgId());
                f9Var.l1(f9Var.F & (-65));
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                this.f200258m = false;
                u0(f9Var, -1);
            }
            r0();
            if (z17) {
                m0(i18);
                return;
            }
            return;
        }
        java.lang.String Ai = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        com.tencent.mm.storage.kb y07 = w21.p0.Ai().y0(Ai);
        if (y07 != null && !com.tencent.mm.sdk.platformtools.t8.K0(y07.field_content)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "VoiceTransformText has TransContent MsgId:%s, clientMsgId: %s", java.lang.Long.valueOf(f9Var.getMsgId()), f9Var.z0());
            f9Var.l1(f9Var.F | 64);
            n0(f9Var.getMsgId(), y07.field_content, com.tencent.mm.ui.chatting.viewitems.io.Transformed);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
            this.f200254f = false;
            y0(i17);
            com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent voiceTransTextCompletedEvent2 = new com.tencent.mm.autogen.events.VoiceTransTextCompletedEvent();
            voiceTransTextCompletedEvent2.f54940g.f7954a = f9Var.getMsgId();
            voiceTransTextCompletedEvent2.f54940g.f7955b = f9Var.Q0();
            am.t00 t00Var = voiceTransTextCompletedEvent2.f54940g;
            t00Var.f7956c = y07.field_content;
            t00Var.f7957d = f9Var.getCreateTime();
            voiceTransTextCompletedEvent2.f54940g.f7958e = f9Var.A0();
            voiceTransTextCompletedEvent2.e();
            return;
        }
        int n17 = c01.d9.e().n();
        if (n17 != 4 && n17 != 6) {
            yb5.d dVar = this.f198580d;
            db5.e1.i(dVar != null ? dVar.g() : com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.b6b, com.tencent.mm.R.string.f490573yv);
            x0(2, f9Var);
            this.f200254f = false;
            return;
        }
        if (this.f200258m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransformText insert transformQueue");
            long msgId2 = f9Var.getMsgId();
            synchronized (this) {
                f200249t.put(java.lang.Long.valueOf(msgId2), new android.util.Pair(f9Var, java.lang.Integer.valueOf(i17)));
            }
            n0(f9Var.getMsgId(), "", com.tencent.mm.ui.chatting.viewitems.io.PreTransform);
            r0();
        } else {
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent2 = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent();
            extTranslateVoiceEvent2.f54213g.f8179c = 1;
            extTranslateVoiceEvent2.e();
            sb5.q2 q2Var = (sb5.q2) this.f198580d.f460708c.a(sb5.q2.class);
            long msgId3 = f9Var.getMsgId();
            com.tencent.mm.ui.chatting.component.ro roVar = (com.tencent.mm.ui.chatting.component.ro) q2Var;
            roVar.f199874q.set(true);
            if (roVar.f199878u == msgId3) {
                android.view.View O0 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) roVar.f198580d.f460708c.a(sb5.z.class))).O0(roVar.f199878u);
                if (O0 != null && (relativeLayout = (android.widget.RelativeLayout) O0.findViewById(com.tencent.mm.R.id.blv)) != null) {
                    roVar.f199878u = -1L;
                    relativeLayout.setVisibility(8);
                }
            }
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent3 = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent();
            extTranslateVoiceEvent3.f54213g.f8178b = java.lang.String.valueOf(f9Var.getMsgId());
            extTranslateVoiceEvent3.f54213g.f8183g = f9Var.Q0();
            am.v8 v8Var = extTranslateVoiceEvent3.f54213g;
            v8Var.f8177a = Ai;
            v8Var.f8180d = 1;
            v8Var.f8179c = 0;
            if (c01.e2.G(this.f198580d.x())) {
                boolean z18 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198754s;
                if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198753r) {
                    i19 = z18 ? 5 : 4;
                } else if (!r01.z.h(this.f198580d.x())) {
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    java.lang.String x17 = this.f198580d.x();
                    ((qv.o) u2Var).getClass();
                    i19 = r01.z.j(x17) ? 0 : r01.z.n(this.f198580d.x()) ? 6 : 7;
                }
            } else {
                i19 = this.f198580d.C() ? 2 : 1;
            }
            v8Var.f8182f = i19;
            extTranslateVoiceEvent3.f54213g.f8181e = new com.tencent.mm.ui.chatting.component.tm(this, extTranslateVoiceEvent3, i17, f9Var);
            if (34 == f9Var.getType()) {
                f200251v.add(java.lang.Long.valueOf(f9Var.getMsgId()));
            }
            n0(java.lang.Long.valueOf(extTranslateVoiceEvent3.f54213g.f8178b).longValue(), "", com.tencent.mm.ui.chatting.viewitems.io.Transforming);
            long msgId4 = f9Var.getMsgId();
            synchronized (this) {
                f200249t.put(java.lang.Long.valueOf(msgId4), new android.util.Pair(f9Var, java.lang.Integer.valueOf(i17)));
            }
            this.f200258m = true;
            this.f200259n = f9Var.getMsgId();
            r0();
            y0(i17);
            if (extTranslateVoiceEvent3.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent fail");
                yb5.d dVar2 = this.f198580d;
                java.lang.String string = (dVar2 != null ? dVar2.g() : com.tencent.mm.sdk.platformtools.x2.f193071a).getString(com.tencent.mm.R.string.b6a);
                yb5.d dVar3 = this.f198580d;
                if (dVar3 != null && dVar3.g() != null) {
                    yb5.d dVar4 = this.f198580d;
                    db5.t7.g(dVar4 != null ? dVar4.g() : com.tencent.mm.sdk.platformtools.x2.f193071a, string);
                }
                w0(java.lang.Long.valueOf(extTranslateVoiceEvent3.f54213g.f8178b).longValue());
                v0(java.lang.Long.valueOf(extTranslateVoiceEvent3.f54213g.f8178b).longValue());
                this.f200258m = false;
                u0(f9Var, i17);
            }
        }
        if (z17) {
            this.f200255g = true;
        }
    }

    public synchronized boolean q0(long j17) {
        java.util.LinkedHashMap linkedHashMap;
        linkedHashMap = f200249t;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "isInMsgTransformQueue[%s]:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(linkedHashMap.containsKey(java.lang.Long.valueOf(j17))));
        return linkedHashMap.containsKey(java.lang.Long.valueOf(j17));
    }

    public final void r0() {
        yb5.d dVar = this.f198580d;
        if (dVar != null) {
            dVar.J();
        }
    }

    public java.lang.String s0(long j17, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.storage.kb y07;
        synchronized (this) {
            str2 = (java.lang.String) f200247r.get(java.lang.Long.valueOf(j17));
        }
        return (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || (y07 = w21.p0.Ai().y0(str)) == null || com.tencent.mm.sdk.platformtools.t8.K0(y07.field_content)) ? str2 : y07.field_content;
    }

    public synchronized com.tencent.mm.ui.chatting.viewitems.io t0(long j17) {
        com.tencent.mm.ui.chatting.viewitems.io ioVar;
        ioVar = (com.tencent.mm.ui.chatting.viewitems.io) f200248s.get(java.lang.Long.valueOf(j17));
        if (ioVar == null) {
            ioVar = com.tencent.mm.ui.chatting.viewitems.io.NoTransform;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "queryMsgTransformStatus[%s]:%s", java.lang.Long.valueOf(j17), ioVar.name());
        return ioVar;
    }

    public final synchronized void u0(com.tencent.mm.storage.f9 f9Var, int i17) {
        yb5.d dVar = this.f198580d;
        com.tencent.mm.sdk.platformtools.n3 q17 = dVar != null ? dVar.q() : null;
        if (q17 != null) {
            q17.post(new com.tencent.mm.ui.chatting.component.vm(this, i17, f9Var));
        }
    }

    public final synchronized void v0(long j17) {
        f200249t.remove(java.lang.Long.valueOf(j17));
    }

    public final synchronized void w0(long j17) {
        f200247r.remove(java.lang.Long.valueOf(j17));
        f200248s.remove(java.lang.Long.valueOf(j17));
    }

    public final void x0(int i17, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return;
        }
        com.tencent.mm.autogen.events.ExtVoiceTransformTextResultEvent extVoiceTransformTextResultEvent = new com.tencent.mm.autogen.events.ExtVoiceTransformTextResultEvent();
        am.c9 c9Var = extVoiceTransformTextResultEvent.f54220g;
        c9Var.getClass();
        c9Var.f6339a = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(f9Var);
        c9Var.f6340b = i17;
        extVoiceTransformTextResultEvent.e();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "[onChattingPause]");
        A0(3);
    }

    public final void y0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TransformComponent", "scrollTo isAutoScroll:%s, pos:%s", java.lang.Boolean.valueOf(this.f200255g), java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.chatting.component.um(this, i17), 200L);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f200253e.alive();
    }
}
