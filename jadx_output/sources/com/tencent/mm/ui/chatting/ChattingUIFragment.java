package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ChattingUIFragment extends com.tencent.mm.ui.chatting.BaseChattingUIFragment {
    public static java.lang.String M;
    public android.view.View A;
    public com.tencent.mm.ui.chatting.view.MMChattingListView B;
    public boolean C;
    public boolean D;
    public long E;
    public ke5.f0 F;
    public final androidx.recyclerview.widget.w2 G;
    public final android.view.View.OnLayoutChangeListener H;
    public n30.v I;

    /* renamed from: J, reason: collision with root package name */
    public final n52.d f198267J;
    public final com.tencent.mm.sdk.event.IListener K;
    public final com.tencent.mm.sdk.event.IListener L;

    /* renamed from: s, reason: collision with root package name */
    public sb5.z f198268s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.v3 f198269t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f198270u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f198271v;

    /* renamed from: w, reason: collision with root package name */
    public int f198272w;

    /* renamed from: x, reason: collision with root package name */
    public int f198273x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.f7 f198274y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f198275z;

    public ChattingUIFragment() {
        this.f198270u = null;
        this.f198273x = 0;
        this.f198274y = null;
        this.A = null;
        this.C = true;
        this.D = true;
        this.E = -1L;
        this.G = new com.tencent.mm.ui.chatting.w8(this);
        this.H = new com.tencent.mm.ui.chatting.x8(this);
        this.f198267J = new com.tencent.mm.ui.chatting.z8(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.K = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.19
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                if (musicPlayerEvent.f54512g.f7036b != 4) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "musicPlayerListener error");
                java.lang.String str = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
                com.tencent.mm.ui.chatting.ChattingUIFragment.this.getClass();
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.20
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "musicCheckErrorListener check error");
                if (musicCheckErrorEvent.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUIFragment", "musicCheckErrorListener, must has error.");
                    return false;
                }
                java.lang.String str = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
                com.tencent.mm.ui.chatting.ChattingUIFragment.this.getClass();
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
    }

    public static int X0(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment) {
        chattingUIFragment.getClass();
        try {
            chattingUIFragment.f198272w = java.lang.Integer.parseInt(j62.e.g().f(new com.tencent.mm.repairer.config.chatting.RepairerConfigMsgListTopPreLoadCount()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingUIFragment", e17, "", new java.lang.Object[0]);
            chattingUIFragment.f198272w = 0;
        }
        return chattingUIFragment.f198272w;
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public com.tencent.mm.ui.zb A0() {
        yb5.d dVar = this.f198152f;
        if (dVar.f460708c.a(sb5.z0.class) == null) {
            return null;
        }
        return ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).f199691o;
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public ke5.f0 B0() {
        return this.F;
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public com.tencent.mm.pluginsdk.ui.tools.v3 C0() {
        return this.f198269t;
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public boolean F0() {
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_wait_until_layout, 1) == 1) || (mMChattingListView = this.B) == null) {
            return true;
        }
        return mMChattingListView.K1;
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void L0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onEnterBegin", "()V", this);
        super.L0();
        U0();
        java.lang.String stringExtra = getStringExtra("Chat_User");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(stringExtra, true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(getStringExtra("Chat_User"), true);
        yb5.d dVar = this.f198152f;
        int e76 = com.tencent.mm.ui.chatting.ChattingUI.e7(n18, dVar);
        if (e76 == 6) {
            cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Single);
            aVar.Rj(this, iy1.a.SingleChat);
            aVar.dk(this, "ChattingUI_Single");
        } else if (e76 == 7) {
            cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Group);
            aVar2.Rj(this, iy1.a.GroupChat);
            aVar2.dk(this, "ChattingUI_Group");
        } else if (e76 == 9) {
            cy1.a aVar3 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseSingle);
            aVar3.Rj(this, iy1.a.EnterpriseSingle);
            aVar3.dk(this, "ChattingUI_EnterpriseSingle");
        } else if (e76 == 10) {
            cy1.a aVar4 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_EnterpriseGroup);
            aVar4.Rj(this, iy1.a.EnterpriseGroup);
            aVar4.dk(this, "ChattingUI_EnterpriseGroup");
        } else if (e76 == 4 || e76 == 5) {
            if (com.tencent.mm.storage.z3.D4(dVar.x())) {
                cy1.a aVar5 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_WeRun);
                aVar5.Rj(this, iy1.a.WeRun);
                aVar5.dk(this, "ChattingUI_Service");
            } else {
                cy1.a aVar6 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_Service);
                aVar6.Rj(this, iy1.a.ServiceChat);
                aVar6.dk(this, "ChattingUI_Service");
            }
        } else if (e76 == 0) {
            cy1.a aVar7 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ChattingUI_NotifyMessages);
            aVar7.Rj(this, iy1.a.ServiceNotification);
            aVar7.dk(this, "ChattingUI_NotifyMessages");
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new ly1.a() { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment$$a
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                java.lang.String str2 = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
                com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = com.tencent.mm.ui.chatting.ChattingUIFragment.this;
                chattingUIFragment.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("unread_count", java.lang.Integer.valueOf(chattingUIFragment.f198273x));
                return hashMap;
            }
        });
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("wx_username", stringExtra);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new ly1.a() { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment$$b
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                java.lang.String str2 = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
                com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = com.tencent.mm.ui.chatting.ChattingUIFragment.this;
                chattingUIFragment.getClass();
                android.util.ArrayMap arrayMap = new android.util.ArrayMap();
                com.tencent.mm.storage.z3 n19 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(chattingUIFragment.getStringExtra("Chat_User"), true);
                yb5.d dVar2 = chattingUIFragment.f198152f;
                int e77 = com.tencent.mm.ui.chatting.ChattingUI.e7(n19, dVar2);
                arrayMap.put("page_type", java.lang.Integer.valueOf(e77));
                arrayMap.put("is_mute", java.lang.Integer.valueOf(com.tencent.mm.ui.chatting.ChattingUI.f7(e77, dVar2)));
                if (n19 != null) {
                    arrayMap.put("is_in_msg_box", java.lang.Integer.valueOf(n19.v2() ? 1 : 0));
                    arrayMap.put("is_top", java.lang.Integer.valueOf(n19.w2() ? 1 : 0));
                }
                return arrayMap;
            }
        });
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int A0 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).A0();
        if (n17 != null && n17.m2()) {
            java.lang.String username = n17.d1();
            r01.r1.f368216j = currentTimeMillis;
            r01.r1.f368217k = A0;
            if (eq1.d0.a() != null) {
                r01.r1.f368218l = eq1.d0.a().o(username, 9);
            }
            long j17 = r01.r1.f368216j;
            int i17 = r01.r1.f368217k;
            int i18 = r01.r1.f368218l;
            r01.j jVar = r01.j.f368119a;
            kotlin.jvm.internal.o.g(username, "username");
            r01.j.b(r01.j.f368119a, 3, username, null, null, null, j17, i17, null, i18, null, 512, null);
        }
        if (n17 != null && (n17.m2() || com.tencent.mm.storage.z3.F4(stringExtra))) {
            cy1.a aVar8 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar8.mk(this, new com.tencent.mm.ui.chatting.f9(this, currentTimeMillis, A0, n17));
            aVar8.Tj(this, 16, 12, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onEnterBegin", "()V");
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void N0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitBegin", "()V", this);
        super.N0();
        ((com.tencent.mm.ui.chatting.adapter.k) this.f198268s).P = -1L;
        this.F.onCancel();
        U0();
        com.tencent.mm.autogen.events.ChattingUIExitForFinderEvent chattingUIExitForFinderEvent = new com.tencent.mm.autogen.events.ChattingUIExitForFinderEvent();
        chattingUIExitForFinderEvent.f54043g.f6807a = M;
        chattingUIExitForFinderEvent.e();
        new com.tencent.mm.autogen.events.ChattingUIExitBeginForPayEvent().e();
        com.tencent.mm.autogen.events.PatTipNeedDismissEvent patTipNeedDismissEvent = new com.tencent.mm.autogen.events.PatTipNeedDismissEvent();
        patTipNeedDismissEvent.f54606g.f8594a = true;
        patTipNeedDismissEvent.e();
        com.tencent.mm.ui.report.m0.f209699b.clear();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitBegin", "()V");
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void P0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitEnd", "()V", this);
        super.P0();
        a1();
        com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class));
        v4Var.getClass();
        pm0.v.X(new com.tencent.mm.feature.finder.live.z1(v4Var, 2));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "onExitEnd", "()V");
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void Q0(android.content.Context context) {
        if (this.A == null) {
            this.A = com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(context), com.tencent.mm.R.layout.f488419ss, null, false);
        }
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void R0() {
        ke5.a fVar;
        if (this.B == null || this.f198268s == null) {
            return;
        }
        java.util.List list = ((com.tencent.mm.ui.chatting.adapter.k) this.f198268s).M;
        yb5.d dVar = this.f198152f;
        hd5.j jVar = new hd5.j(dVar, list);
        hd5.l lVar = new hd5.l(dVar, this.B);
        hd5.v vVar = new hd5.v(lVar, jVar, dVar);
        if (((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) dVar.f460708c.a(sb5.p.class))).f200273m) {
            fVar = new ke5.a0(dVar, vVar);
            lVar.f280619c = fVar;
        } else {
            com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
            if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).f198753r) {
                fVar = new ke5.j(dVar, vVar);
                lVar.f280619c = fVar;
            } else {
                sb5.t0 t0Var = (sb5.t0) cVar.a(sb5.t0.class);
                dVar.x();
                t0Var.getClass();
                if (((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f199296g || ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f199297h || ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f199295f || ((((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f199298i && !((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) cVar.a(sb5.g0.class))).t0()) || ((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) cVar.a(sb5.p1.class))).n0())) {
                    if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).o0()) {
                        fVar = new ke5.i(dVar, vVar);
                        lVar.f280619c = fVar;
                    } else {
                        fVar = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupSearchPresenterV2()) == 1 ? new sd5.f(dVar, vVar) : new ke5.u(dVar, vVar);
                        lVar.f280619c = fVar;
                    }
                } else if (((sb5.s) cVar.a(sb5.s.class)).u() || ((sb5.h0) cVar.a(sb5.h0.class)).G() || ((sb5.x) cVar.a(sb5.x.class)).t() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).G0() || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).H0() || ((sb5.j0) cVar.a(sb5.j0.class)).s()) {
                    fVar = new ke5.m(dVar, vVar);
                    lVar.f280619c = fVar;
                } else if (((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) cVar.a(sb5.g0.class))).t0()) {
                    fVar = new ke5.y(dVar, vVar);
                    lVar.f280619c = fVar;
                } else if (dVar.E()) {
                    fVar = new ke5.p(dVar, vVar);
                    lVar.f280619c = fVar;
                } else if (((com.tencent.mm.ui.chatting.component.n7) ((sb5.g0) cVar.a(sb5.g0.class))).u0()) {
                    fVar = new ke5.x(dVar, vVar);
                    lVar.f280619c = fVar;
                } else if (((com.tencent.mm.ui.chatting.component.g9) ((sb5.k0) cVar.a(sb5.k0.class))).s0()) {
                    fVar = new ke5.d0(dVar, vVar);
                    lVar.f280619c = fVar;
                } else if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) cVar.a(sb5.g.class))).n0()) {
                    fVar = new ke5.l(dVar, vVar);
                    lVar.f280619c = fVar;
                } else if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).o0()) {
                    fVar = new ke5.i(dVar, vVar);
                    lVar.f280619c = fVar;
                } else {
                    fVar = new sd5.d(dVar, vVar);
                    lVar.f280619c = fVar;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingDataPresenterFactory", "[ChattingDataPresenterFactory] executor:%s", fVar.toString());
        this.F = fVar;
        ((com.tencent.mm.ui.chatting.adapter.k) this.f198268s).Z = fVar;
        this.B.setLoadExecutor(fVar);
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void U0() {
        if (((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198152f.f460708c.a(sb5.z0.class))).f199695s) {
            return;
        }
        java.lang.String x17 = this.f198152f.x();
        com.tencent.mm.storage.z3 u17 = this.f198152f.u();
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.y8(this, x17, u17), "MicroMsg.ChattingUIFragment");
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public boolean W0() {
        if (!isScreenEnable()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUIFragment", "Actionbar customView onclick screen not enable");
            return true;
        }
        hideVKB();
        if (G0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "Still entering, ignore this go back");
            return true;
        }
        if (H0() && android.os.SystemClock.elapsedRealtime() - this.E <= 500) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "Already exiting, ignore this go back");
            return true;
        }
        this.E = android.os.SystemClock.elapsedRealtime();
        if (getActivity() != null) {
            android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.huh);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "triggerGoBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingUIFragment", "triggerGoBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.post(new com.tencent.mm.ui.chatting.h9(this));
            } else {
                c1();
            }
        }
        return true;
    }

    public void a1() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        try {
            android.app.Activity context = getContext();
            if (context == null || context.isFinishing() || context.isDestroyed() || (u3Var = this.f198270u) == null) {
                return;
            }
            if (u3Var != null && u3Var.isShowing()) {
                this.f198270u.dismiss();
                this.f198270u = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUIFragment", "dismissDialog error", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public void b1(android.os.Bundle bundle) {
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = this.B;
        mMChattingListView.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[forceTopLoadData] sourceArgs:");
        sb6.append(bundle == null ? "" : bundle.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", sb6.toString());
        mMChattingListView.D1 = bundle;
        mMChattingListView.c(true);
    }

    public void c1() {
        sb5.j2 j2Var = (sb5.j2) this.f198152f.f460708c.a(sb5.j2.class);
        com.tencent.mm.ui.chatting.r8 r8Var = new com.tencent.mm.ui.chatting.r8(this);
        com.tencent.mm.ui.chatting.component.sm smVar = (com.tencent.mm.ui.chatting.component.sm) j2Var;
        smVar.getClass();
        if (q21.d.a() != null) {
            q21.a a17 = q21.d.a();
            java.lang.String d17 = smVar.f198580d.u().d1();
            if (((va3.z0) a17).b(d17).contains(smVar.f198580d.t())) {
                db5.e1.H(smVar.f198580d.f460717l.getContext(), smVar.f198580d.s().getString(com.tencent.mm.R.string.k1j), smVar.f198580d.s().getString(com.tencent.mm.R.string.f490573yv), true, new com.tencent.mm.ui.chatting.component.lm(smVar, r8Var), new com.tencent.mm.ui.chatting.component.mm(smVar));
                return;
            }
        }
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = smVar.f199951f;
        if (talkRoomPopupNav != null && talkRoomPopupNav.f197690g.getVisibility() == 0) {
            talkRoomPopupNav.e(false);
            talkRoomPopupNav.f197690g.setVisibility(8);
        }
        r8Var.run();
    }

    public void d1() {
        if (getBooleanExtra("MainUI_FromFinderNotification", false).booleanValue()) {
            zy2.c9 c9Var = (zy2.c9) i95.n0.c(zy2.c9.class);
            if (c9Var != null && (thisActivity() instanceof com.tencent.mm.ui.LauncherUI)) {
                ((com.tencent.mm.plugin.finder.service.l3) c9Var).Bi(thisActivity(), 2);
            }
            if (getArguments() != null) {
                getArguments().remove("MainUI_FromFinderNotification");
            }
        }
        yb5.d dVar = this.f198152f;
        sb5.d0 d0Var = (sb5.d0) dVar.f460708c.a(sb5.d0.class);
        sb5.u1 u1Var = (sb5.u1) dVar.f460708c.a(sb5.u1.class);
        com.tencent.mm.ui.chatting.component.b5 b5Var = (com.tencent.mm.ui.chatting.component.b5) d0Var;
        if (b5Var.f198696g) {
            com.tencent.mm.ui.chatting.component.jk jkVar = (com.tencent.mm.ui.chatting.component.jk) u1Var;
            if (jkVar.f199306t) {
                jkVar.p0();
                b5Var.q0();
            } else {
                b5Var.o0();
            }
        }
        sb5.f fVar = (sb5.f) dVar.f460708c.a(sb5.f.class);
        if (com.tencent.mm.storage.z3.G4(dVar.x())) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            j45.l.j(getContext(), "tmessage", ".ui.TConversationUI", intent, null);
        } else {
            if (getIntExtra("chat_from_scene", 0) == 4) {
                finish();
                return;
            }
            if ((getIntExtra("chat_from_scene", 0) == 1 || getIntExtra("chat_from_scene", 0) == 3) && dVar.u() != null && dVar.u().k2()) {
                com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
                if (aVar.x0() != null && aVar.x0().G0() && aVar.x0().D0(false) != null && aVar.x0().D0(false).d() != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.x0().y0())) {
                    finish();
                    return;
                }
            }
            if (((com.tencent.mm.ui.chatting.component.pg) ((sb5.b1) dVar.f460708c.a(sb5.b1.class))).f199710e) {
                finish();
            } else if (!getBooleanExtra("finish_direct", false).booleanValue()) {
                if (!this.isCurrentActivity) {
                    finish();
                    return;
                }
                android.content.Intent intent2 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
                intent2.addFlags(67108864);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "goBackImpl", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "goBackImpl", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
                finish();
                return;
            }
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void dealContentView(android.view.View view) {
        super.dealContentView(view);
        com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198152f.f460708c.a(sb5.z0.class));
        if (peVar.f198580d.f460717l.isSupportNavigationSwipeBack()) {
            if (peVar.f199690n == null) {
                peVar.f199690n = (androidx.appcompat.widget.ActionBarContainer) ((android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.bkr)).inflate();
            }
            peVar.f199691o.A0.f325237i = (android.view.ViewGroup) view;
        }
    }

    public void e1() {
        com.tencent.mm.storage.z3 u17;
        n30.t tVar = (n30.t) i95.n0.c(n30.t.class);
        n52.d dVar = this.f198267J;
        n30.u uVar = n30.u.f334471e;
        ((m30.q) tVar).getClass();
        this.I = new n52.c(dVar, "ChattingUIFragment", uVar);
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = (com.tencent.mm.ui.chatting.view.MMChattingListView) findViewById(com.tencent.mm.R.id.bm6);
        this.B = mMChattingListView;
        mMChattingListView.setIsReturnSuperDispatchWhenCancel(true);
        this.f198271v = findViewById(com.tencent.mm.R.id.f483686bp3);
        com.tencent.mm.pluginsdk.ui.tools.v3 listView = this.B.getListView();
        this.f198269t = listView;
        listView.setVisibility(0);
        yb5.d dVar2 = this.f198152f;
        com.tencent.mm.ui.chatting.component.pe peVar = (com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar2.f460708c.a(sb5.z0.class));
        android.os.Bundle bundle = null;
        if (peVar.f198580d.m() > 0) {
            peVar.f199684e = (android.widget.LinearLayout) peVar.f198580d.p().q(com.tencent.mm.R.id.i3f);
        } else {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) peVar.f198580d.g().getLayoutInflater().inflate(com.tencent.mm.R.layout.f488578xs, (android.view.ViewGroup) null);
            peVar.f199684e = linearLayout;
            ((com.tencent.mm.ui.chatting.BaseChattingUIFragment) peVar.f198580d.f460718m).C0().addHeaderView(linearLayout);
        }
        if (((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) peVar.f198580d.f460708c.a(sb5.p1.class))).f198977e) {
            ((com.tencent.mm.ui.chatting.component.a1) ((sb5.l) peVar.f198580d.f460708c.a(sb5.l.class))).o0();
        }
        peVar.u0();
        if (this.B.getBaseAdapter() == null) {
            com.tencent.mm.ui.chatting.adapter.k kVar = new com.tencent.mm.ui.chatting.adapter.k(dVar2, this.f198269t, new com.tencent.mm.ui.chatting.mvvm.MvvmChatList(new com.tencent.mm.ui.chatting.t8(this), od5.a.f344652h, dVar2, this));
            this.f198268s = kVar;
            this.B.setAdapter(kVar);
        }
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView2 = this.B;
        mMChattingListView2.c(false);
        mMChattingListView2.c(false);
        R0();
        com.tencent.mm.ui.chatting.manager.c cVar = dVar2.f460708c;
        if (((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) cVar.a(sb5.p.class))).t0()) {
            bundle = new android.os.Bundle();
            bundle.putBoolean("key_is_need_fold_msg", true);
        }
        this.F.a(hd5.n.ACTION_ENTER, true, bundle);
        this.f198269t.setOverScrollMode(2);
        ((sb5.u1) cVar.a(sb5.u1.class)).getClass();
        this.f198269t.setOnTouchListener(new com.tencent.mm.ui.chatting.u8(this));
        java.lang.Object bounceView = getBounceView();
        if (bounceView != null) {
            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).c((ul5.j) cVar.a(sb5.p0.class));
        }
        this.f198269t.i(this.G);
        this.f198269t.addOnLayoutChangeListener(new com.tencent.mm.ui.chatting.v8(this));
        this.B.addOnLayoutChangeListener(this.H);
        if (this.f198156m) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(2) && (u17 = dVar2.u()) != null && u17.k2()) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).u(0);
            }
        }
        registerForContextMenu(this.f198269t.f());
        this.B.setIsIgnoreActionUpForceTopLoad(true);
        if ((this.F instanceof ke5.s) && j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigChatListLoadCountRptEnable()) == 1) {
            this.B.B1 = true;
        }
    }

    public void f1(boolean z17, boolean z18, boolean z19) {
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        if (!z18) {
            g1(z17, z19);
            return;
        }
        yb5.d dVar = this.f198152f;
        (dVar.f460711f ? dVar.f460707b : yb5.d.A).removeCallbacks(this.f198275z);
        qu5.a aVar = dVar.f460711f ? dVar.f460707b : yb5.d.A;
        com.tencent.mm.ui.chatting.a9 a9Var = new com.tencent.mm.ui.chatting.a9(this, z17, z19);
        this.f198275z = a9Var;
        aVar.post(a9Var);
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void finish() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
        yb5.d dVar = this.f198152f;
        dVar.f460710e.Z();
        sb5.s0 s0Var = (sb5.s0) dVar.f460708c.a(sb5.s0.class);
        if (s0Var != null && (chatFooter = ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e) != null) {
            chatFooter.w0(true);
        }
        int i17 = !hideVKB() ? 0 : 100;
        com.tencent.mm.ui.chatting.s8 s8Var = new com.tencent.mm.ui.chatting.s8(this);
        if (i17 == 0) {
            s8Var.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(s8Var, i17);
        }
    }

    public final void g1(boolean z17, boolean z18) {
        int i17;
        int lastVisiblePosition = this.f198269t.getLastVisiblePosition();
        int firstVisiblePosition = this.f198269t.getFirstVisiblePosition();
        int count = this.f198269t.getCount();
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = java.lang.Boolean.valueOf(this.C);
            objArr[1] = java.lang.Integer.valueOf(lastVisiblePosition);
            objArr[2] = java.lang.Integer.valueOf(firstVisiblePosition);
            objArr[3] = java.lang.Integer.valueOf(count);
            objArr[4] = java.lang.Boolean.valueOf(z17);
            objArr[5] = java.lang.Boolean.valueOf(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            objArr[6] = new com.tencent.mm.sdk.platformtools.z3();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[scrollToLastImpl] isFirstScroll:%s [%s:%s] count:%s force:%s isMain:%s stack:%s", objArr);
        }
        this.C = false;
        if (!z17 || lastVisiblePosition != firstVisiblePosition || lastVisiblePosition < count - 1 || this.f198269t.getChildCount() <= 0) {
            i17 = 0;
        } else {
            int height = this.f198269t.getHeight() - this.f198269t.getPaddingBottom();
            com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = this.f198269t;
            i17 = height - v3Var.getChildAt(v3Var.getChildCount() - 1).getHeight();
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            this.f198269t.post(new com.tencent.mm.ui.chatting.b9(this, z17, count, i17, z18));
        } else if (z17 && this.B.A5()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "scrollToLastImpl: isAtBottom");
        } else {
            com.tencent.mm.pluginsdk.ui.tools.f7.b(this.f198269t, count - 1, i17, z18, false);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.bm6;
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment, com.tencent.mm.ui.chatting.fb
    public int getFirstVisiblePosition() {
        return this.f198269t.getFirstVisiblePosition();
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return 0;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public android.view.View getLayoutView() {
        if (this.A == null) {
            this.A = com.tencent.mm.ui.td.f209893c.a("LayoutsForLauncherUI").a(android.view.LayoutInflater.from(getContext()), com.tencent.mm.R.layout.f488419ss, null, false);
        }
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean getUserVisibleHint() {
        return this.f198152f.f460714i;
    }

    public void h1(boolean z17) {
        this.B.setBottomViewVisible(z17);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.chatting.fb
    public boolean hideVKB() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198152f.f460708c.a(sb5.s0.class))).f199263e;
        return chatFooter != null ? chatFooter.A0() : super.hideVKB();
    }

    public void i1(boolean z17) {
        this.B.setIsBottomShowAll(z17);
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean isSupportCustomActionBar() {
        return isSupportNavigationSwipeBack();
    }

    public void l1(boolean z17) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            m1(z17);
        } else {
            this.f198152f.q().post(new com.tencent.mm.ui.chatting.c9(this, z17));
        }
    }

    public final void m1(boolean z17) {
        if (z17) {
            android.view.View view = this.f198271v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f198271v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/ChattingUIFragment", "showChattingLoadingInner", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 30763 && i17 != 30762) {
            if (i17 == 3000 && i18 == 1) {
                finish();
                return;
            }
            return;
        }
        if ((i17 == 30762 || i17 == 30763) && intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("gdpr_auth_location")) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if (i17 == 30763) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.l(getActivity(), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 67);
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.l(getActivity(), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 68);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onCancelDrag() {
        if (!isSupportNavigationSwipeBack() || this.f198268s == null) {
            return;
        }
        this.D = true;
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
        super.onConfigurationChanged(configuration);
        if ((fp.e0.e() || u75.e.a() || fp.e0.f()) && (chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198152f.f460708c.a(sb5.s0.class))).f199263e) != null) {
            boolean contains = configuration.toString().contains("mWindowingMode=100");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "onConfigurationChanged: OPPO isInMultiWindowMode:%s ", java.lang.Boolean.valueOf(contains));
            chatFooter.setIsMultiWindow(contains);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.f198152f.f460714i) {
            super.onCreateOptionsMenu(menu, menuInflater);
        }
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment, com.tencent.mm.ui.MMFragment
    public void onDragBegin() {
        super.onDragBegin();
        if (!isSupportNavigationSwipeBack() || this.f198268s == null) {
            return;
        }
        this.D = false;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onKeyboardStateChanged() {
        if (keyboardState() == 1) {
            this.f198269t.post(new com.tencent.mm.ui.chatting.g9(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onMultiWindowModeChanged(boolean z17) {
        super.onMultiWindowModeChanged(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "onMultiWindowModeChanged: %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198152f.f460708c.a(sb5.s0.class))).f199263e;
        if (chatFooter != null) {
            chatFooter.setIsMultiWindow(z17);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onSwipeBack() {
        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUIFragment", "onSwipeBack");
        d1();
        if (va3.j0.Ri().c()) {
            com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
            exitTrackRoomEvent.f54187g.f8176a = ((va3.v0) q21.d.b()).f434364v;
            exitTrackRoomEvent.e();
        }
        if (isSupportNavigationSwipeBack()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void r0(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(context);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doAttach", "(Landroid/content/Context;)V", this, array);
        super.r0(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "[doAttach]:%s#0x%x hc:%d", thisActivity().getClass().getSimpleName(), java.lang.Integer.valueOf(thisActivity().hashCode()), java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.ui.ga gaVar = this.mController;
        if (gaVar != null) {
            gaVar.f208643f0 = 3;
            gaVar.f208647h0 = true;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doAttach", "(Landroid/content/Context;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s0() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.ChattingUIFragment.s0():void");
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void setBackBtn(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198152f.f460708c.a(sb5.z0.class))).x0(onMenuItemClickListener);
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void setMMSubTitle(int i17) {
        setMMSubTitle(getMMString(i17));
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void setMMTitle(int i17) {
        setMMTitle(getMMString(i17));
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void t0() {
        super.t0();
        java.lang.String username = getStringExtra("Chat_User");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(username, true);
        if (n17 == null || !n17.m2()) {
            return;
        }
        long j17 = r01.r1.f368216j;
        int i17 = r01.r1.f368217k;
        int i18 = r01.r1.f368218l;
        r01.j jVar = r01.j.f368119a;
        kotlin.jvm.internal.o.g(username, "username");
        r01.j.b(r01.j.f368119a, 4, username, null, null, null, j17, i17, null, i18, null, 512, null);
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void u0() {
        super.u0();
        this.f198152f.x();
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void w0() {
        db5.d5 d5Var;
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doPause", "()V", this);
        super.w0();
        if ((thisActivity() instanceof com.tencent.mm.ui.LauncherUI) || (thisActivity() instanceof com.tencent.mm.ui.chatting.ChattingUI)) {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(thisActivity(), this.f198274y);
        }
        this.f198274y = null;
        if (com.tencent.mm.ui.chatting.r5.b()) {
            try {
                com.tencent.mm.ui.chatting.q5 q5Var = com.tencent.mm.ui.chatting.r5.f202641b;
                if (q5Var != null && (d5Var = q5Var.f202599d) != null) {
                    d5Var.dismiss();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAvatarOnHoverHelper", "exception in dismiss, %s", e17.getMessage());
            }
        }
        yb5.d dVar = this.f198152f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "on chatting ui pause  rawuser:%s", dVar.x());
        dVar.x();
        this.K.dead();
        this.L.dead();
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) this.f198268s;
        kVar.f198426x1 = false;
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(kVar.P1);
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(kVar.L1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "adapter pause");
        kVar.O1.d();
        com.tencent.mm.sdk.event.IListener iListener = kVar.Q1;
        if (iListener != null) {
            iListener.dead();
        }
        kVar.M1.dead();
        kVar.z0();
        hideVKB();
        sb5.z zVar = this.f198268s;
        if (zVar != null) {
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            android.view.ViewGroup f17 = this.f198269t.f();
            p52.g gVar = p52.g.f352010d;
            ((c61.w8) paVar).Vi(f17, zVar, 3, -1, -1, 2L, "temp_6", 3, false);
        }
        synchronized (c01.i2.f37244a) {
            c01.i2.f37245b = "";
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doPause", "()V");
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void x0() {
        yj0.a.a("com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V", this);
        super.x0();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawableResource(com.tencent.mm.R.color.a3a);
        }
        yb5.d dVar = this.f198152f;
        sb5.e1 e1Var = (sb5.e1) dVar.f460708c.a(sb5.e1.class);
        if (e1Var != null) {
            this.f198273x = ((com.tencent.mm.ui.chatting.component.ah) e1Var).f198624f;
        }
        if (!dVar.f460714i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "onResume fragment not foreground, return,  chatting contentview is show %b, viewShow %b listviewShow:%b", java.lang.Boolean.valueOf(getContentView() != null && getContentView().isShown()), java.lang.Boolean.valueOf(getView() != null && getView().isShown()), java.lang.Boolean.valueOf(this.f198269t.getVisibility() == 0));
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
            return;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUIFragment", "account not ready, mabey not call onDestroy!!!");
            finish();
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
            return;
        }
        this.K.alive();
        this.L.alive();
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) this.f198268s;
        kVar.f198426x1 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "adapter resume");
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).n0(kVar.P1, android.os.Looper.getMainLooper());
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(kVar.L1);
        kVar.O1.c(300000L, 300000L);
        if (kVar.Z != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("SCENE", 3);
            ke5.f0 f0Var = kVar.Z;
            if (f0Var != null) {
                f0Var.a(hd5.n.ACTION_UPDATE, false, bundle);
            }
        }
        com.tencent.mm.sdk.event.IListener iListener = kVar.Q1;
        if (iListener != null) {
            iListener.alive();
        }
        kVar.M1.alive();
        kVar.A0();
        sb5.z zVar = this.f198268s;
        if (zVar != null) {
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            android.view.ViewGroup f17 = this.f198269t.f();
            p52.g gVar = p52.g.f352010d;
            ((c61.w8) paVar).Vi(f17, zVar, 2, -1, -1, 2L, "temp_6", 2, false);
            com.tencent.mm.ui.report.KV17560Reporter c17 = com.tencent.mm.ui.report.KV17560Reporter.c(getContext());
            c17.f209612d = M;
            c17.f209615g = dVar.f460722q;
            c17.f209614f = vh0.l2.a(dVar.k());
        }
        c01.i2 i2Var = c01.i2.f37244a;
        java.lang.String x17 = dVar.x();
        synchronized (i2Var) {
            c01.i2.f37245b = x17;
        }
        if (this.B.getListView() instanceof androidx.recyclerview.widget.RecyclerView) {
            this.G.onScrolled((androidx.recyclerview.widget.RecyclerView) this.B.getListView(), 0, 0);
        }
        this.f198274y = new com.tencent.mm.ui.chatting.e9(this);
        if ((thisActivity() instanceof com.tencent.mm.ui.LauncherUI) || (thisActivity() instanceof com.tencent.mm.ui.chatting.ChattingUI)) {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(thisActivity(), this.f198274y);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingUIFragment", "com/tencent/mm/ui/chatting/ChattingUIFragment", "doResume", "()V");
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public void y0(boolean z17, int i17) {
        this.B.e(z17, i17);
    }

    @Override // com.tencent.mm.ui.chatting.BaseChattingUIFragment
    public sb5.z z0() {
        return this.f198268s;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void setMMSubTitle(java.lang.String str) {
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198152f.f460708c.a(sb5.z0.class))).y0(str);
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void setMMTitle(java.lang.String str) {
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198152f.f460708c.a(sb5.z0.class))).B0(str);
    }

    public ChattingUIFragment(boolean z17) {
        super(z17);
        this.f198270u = null;
        this.f198273x = 0;
        this.f198274y = null;
        this.A = null;
        this.C = true;
        this.D = true;
        this.E = -1L;
        this.G = new com.tencent.mm.ui.chatting.w8(this);
        this.H = new com.tencent.mm.ui.chatting.x8(this);
        this.f198267J = new com.tencent.mm.ui.chatting.z8(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.K = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.19
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                if (musicPlayerEvent.f54512g.f7036b != 4) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "musicPlayerListener error");
                java.lang.String str = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
                com.tencent.mm.ui.chatting.ChattingUIFragment.this.getClass();
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.ChattingUIFragment.20
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUIFragment", "musicCheckErrorListener check error");
                if (musicCheckErrorEvent.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUIFragment", "musicCheckErrorListener, must has error.");
                    return false;
                }
                java.lang.String str = com.tencent.mm.ui.chatting.ChattingUIFragment.M;
                com.tencent.mm.ui.chatting.ChattingUIFragment.this.getClass();
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
    }
}
