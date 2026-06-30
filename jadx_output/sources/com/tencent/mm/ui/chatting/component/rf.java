package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.a1.class)
/* loaded from: classes9.dex */
public class rf extends com.tencent.mm.ui.chatting.component.a implements sb5.a1, xg3.h0 {
    public java.lang.Runnable E;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199829e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f199830f;

    /* renamed from: g, reason: collision with root package name */
    public int f199831g;

    /* renamed from: h, reason: collision with root package name */
    public int f199832h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f199833i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f199834m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f199835n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f199836o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f199837p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f199838q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f199839r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199840s = false;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f199841t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f199842u = new java.util.HashSet();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f199843v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public int f199844w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f199845x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f199846y = yf5.r.f461944a.a();

    /* renamed from: z, reason: collision with root package name */
    public eg5.d f199847z = null;
    public int A = 0;
    public boolean B = false;
    public int C = Integer.MAX_VALUE;
    public g15.a D = null;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (((com.tencent.mm.ui.chatting.component.ah) ((sb5.e1) r4.f198580d.f460708c.a(sb5.e1.class))).f198624f >= 40) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m0(com.tencent.mm.ui.chatting.component.rf r4) {
        /*
            yb5.d r0 = r4.f198580d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f460708c
            java.lang.Class<sb5.j2> r1 = sb5.j2.class
            yn.e r0 = r0.a(r1)
            sb5.j2 r0 = (sb5.j2) r0
            yb5.d r1 = r4.f198580d
            com.tencent.mm.ui.chatting.manager.c r1 = r1.f460708c
            java.lang.Class<vb5.m> r2 = vb5.m.class
            yn.e r1 = r1.a(r2)
            vb5.m r1 = (vb5.m) r1
            vb5.l r1 = (vb5.l) r1
            java.util.ArrayList r1 = r1.f434863o
            int r1 = r1.size()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L26
            r1 = r2
            goto L27
        L26:
            r1 = r3
        L27:
            if (r1 == 0) goto L2f
            r0 = 4
            r4.I0(r0, r3)
            goto Lab
        L2f:
            com.tencent.mm.ui.chatting.component.sm r0 = (com.tencent.mm.ui.chatting.component.sm) r0
            boolean r0 = r0.s0()
            if (r0 != 0) goto La8
            yb5.d r0 = r4.f198580d
            java.lang.String r0 = r0.x()
            boolean r0 = c01.e2.D(r0)
            if (r0 == 0) goto L44
            goto L9c
        L44:
            yb5.d r0 = r4.f198580d
            java.lang.String r0 = r0.x()
            boolean r0 = com.tencent.mm.storage.z3.R4(r0)
            if (r0 != 0) goto L51
            goto L9c
        L51:
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.l8 r0 = r0.r()
            yb5.d r1 = r4.f198580d
            java.lang.String r1 = r1.x()
            com.tencent.mm.storage.m4 r0 = (com.tencent.mm.storage.m4) r0
            com.tencent.mm.storage.l4 r0 = r0.p(r1)
            if (r0 == 0) goto L9c
            int r0 = r0.Z0()
            r0 = r0 & r2
            if (r0 <= 0) goto L6f
            goto L9c
        L6f:
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.e8 r0 = r0.q()
            yb5.d r1 = r4.f198580d
            java.lang.String r1 = r1.x()
            com.tencent.mm.storage.k4 r0 = (com.tencent.mm.storage.k4) r0
            com.tencent.mm.storage.z3 r0 = r0.n(r1, r2)
            int r0 = r0.T
            if (r0 != r2) goto L9c
            yb5.d r0 = r4.f198580d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f460708c
            java.lang.Class<sb5.e1> r1 = sb5.e1.class
            yn.e r0 = r0.a(r1)
            sb5.e1 r0 = (sb5.e1) r0
            com.tencent.mm.ui.chatting.component.ah r0 = (com.tencent.mm.ui.chatting.component.ah) r0
            int r0 = r0.f198624f
            r1 = 40
            if (r0 < r1) goto L9c
            goto L9d
        L9c:
            r2 = r3
        L9d:
            if (r2 == 0) goto La4
            r0 = 3
            r4.I0(r0, r3)
            goto Lab
        La4:
            r4.I0(r3, r3)
            goto Lab
        La8:
            r4.I0(r2, r3)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.rf.m0(com.tencent.mm.ui.chatting.component.rf):void");
    }

    public static void n0(com.tencent.mm.ui.chatting.component.rf rfVar, int i17) {
        long j17;
        rfVar.getClass();
        com.tencent.mm.storage.f9 a17 = sd5.i.f406719a.a(rfVar.f198580d.x(), i17, ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(rfVar.f198580d.x()));
        if (a17 != null) {
            if (ic5.f.f290437c.c(a17) != null) {
                ((kc5.s) ((wg3.i) i95.n0.c(wg3.i.class))).Ni(new com.tencent.mm.plugin.msg.MsgIdTalker(a17.getMsgId(), rfVar.f198580d.x()), 0, 1);
            }
            j17 = a17.getMsgId();
        } else {
            j17 = -1;
        }
        sb5.z zVar = (sb5.z) rfVar.f198580d.f460708c.a(sb5.z.class);
        hd5.n nVar = hd5.n.ACTION_POSITION;
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "[locationByMsgId] position:%s mode:%s msgId:%s", java.lang.Integer.valueOf(i17), nVar, java.lang.Long.valueOf(j17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("MSG_POSITION", i17);
        bundle.putInt("SCENE", 2);
        bundle.putString("MSG_TALKER", kVar.K.x());
        bundle.putBoolean("IS_SMOOTH_SCROLL", true);
        if (j17 > 0) {
            bundle.putLong("MSG_ID", j17);
            bundle.putBoolean("SELECT_BY_MSG_ID", true);
        }
        ke5.f0 f0Var = kVar.Z;
        if (f0Var != null) {
            f0Var.a(nVar, false, bundle);
        }
        rfVar.v0(true);
    }

    public static void o0(com.tencent.mm.ui.chatting.component.rf rfVar, final com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        sb5.z zVar = (sb5.z) rfVar.f198580d.f460708c.a(sb5.z.class);
        sb5.y yVar = new sb5.y();
        yVar.f405597b = true;
        g15.a aVar = rfVar.D;
        if (aVar != null && aVar.k() == 15) {
            int o07 = ((com.tencent.mm.ui.chatting.component.o4) ((sb5.a0) rfVar.f198580d.f460708c.a(sb5.a0.class))).o0(rfVar.D.l(), rfVar.f198580d.x());
            yVar.f405604i.putBoolean("is_from_mediagroup_tongue", true);
            yVar.f405604i.putInt("is_from_mediagroup_unread_count", o07);
            if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di() && rfVar.f199846y && rfVar.f199847z != null) {
                ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.rf$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        c95.d dVar = c95.d.f39747a;
                        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = com.tencent.mm.plugin.msg.MsgIdTalker.this;
                        up5.x b17 = dVar.b(msgIdTalker2.f149480d, msgIdTalker2.a());
                        if (b17 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.HistoryMsgTongueComponent", "mediaGroupMarkShownTongueOnClick no data [%s]", msgIdTalker2.toString());
                            return;
                        }
                        b17.f430120f = 1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "mediaGroupMarkShownTongueOnClick[%s], update: groupId = %s", msgIdTalker2, b17.f430115a);
                        dVar.e(b17);
                        ((kc5.s) ((wg3.i) i95.n0.c(wg3.i.class))).Ni(msgIdTalker2, b17.f430119e, 1);
                    }
                }, "MediaGroup");
            }
        }
        ((com.tencent.mm.ui.chatting.adapter.k) zVar).T0(msgIdTalker.a(), msgIdTalker.f149480d, hd5.n.ACTION_POSITION, yVar);
        rfVar.v0(true);
    }

    public final boolean A0() {
        sb5.f fVar = (sb5.f) this.f198580d.f460708c.a(sb5.f.class);
        if (com.tencent.mm.storage.z3.j4(this.f198580d.x()) || com.tencent.mm.storage.z3.B3(this.f198580d.x()) || ((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0()) {
            return true;
        }
        if (!this.f198580d.u().k2()) {
            return false;
        }
        com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
        if (aVar.x0() == null) {
            return false;
        }
        if (aVar.x0().T0()) {
            ((zq1.a0) gm0.j1.s(zq1.a0.class)).getClass();
        }
        return aVar.x0().Q0();
    }

    public final void B0() {
        this.f198580d.f460717l.U0();
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).M0();
    }

    public void C0(java.lang.String str) {
        if (!r0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "try showRedHintTongue, but is empty");
            return;
        }
        this.f198580d.q().removeCallbacks(this.E);
        com.tencent.mm.sdk.platformtools.n3 q17 = this.f198580d.q();
        com.tencent.mm.ui.chatting.component.vf vfVar = new com.tencent.mm.ui.chatting.component.vf(this, str);
        this.E = vfVar;
        q17.postDelayed(vfVar, 200L);
        this.f199840s = true;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        F0();
        if (yf5.r.f461944a.a()) {
            g95.u.b(this.f198580d.x());
        } else {
            g95.u.g(this.f198580d.x());
        }
    }

    public final void E0(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, boolean z17) {
        int j76;
        int i17;
        int i18;
        if (!y0(msgIdTalker) && !q0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[tryShowAtSomeoneTongueInner] no show tongue! username:%s unreadCount:%s", this.f198580d.x(), java.lang.Integer.valueOf(this.f199831g));
            android.view.View view = this.f199829e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneTongueInner", "(Lcom/tencent/mm/plugin/msg/MsgIdTalker;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneTongueInner", "(Lcom/tencent/mm/plugin/msg/MsgIdTalker;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f199832h = 0;
            return;
        }
        if (this.f198580d.g().isDestroyed() || this.f198580d.g().isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HistoryMsgTongueComponent", "[tryShowAtSomeoneTongueInner] context is destroyed or finishing");
            return;
        }
        if (z17) {
            if (y0(null)) {
                g15.a aVar = this.D;
                if (aVar != null && aVar.k() == 15) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.HistoryMsgTongueComponent", "[tryShowAtSomeoneUnreadCountTongue] skip! isMediaGroupUnreadShown");
                } else if (this.f199829e.getVisibility() == 0 && this.f199839r && this.f199841t.isEmpty()) {
                    this.f199830f = (android.widget.TextView) this.f198580d.c(com.tencent.mm.R.id.f483663bm5);
                    int i19 = A0() ? 5 : 10;
                    if (this.f199832h != 0 && this.f199833i == 2) {
                        i19 = 1;
                    }
                    if (this.f199831g >= i19) {
                        int i27 = ((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0() ? com.tencent.mm.R.string.mdt : com.tencent.mm.R.string.b2_;
                        if (this.f199831g > 999) {
                            this.f199830f.setText(java.lang.String.format(this.f198580d.s().getString(i27), 999));
                        } else {
                            this.f199830f.setText(java.lang.String.format(this.f198580d.s().getString(i27), java.lang.Integer.valueOf(this.f199831g)));
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[tryShowAtSomeoneTongueInner] no show tongue! username:%s unreadCount:%s", this.f198580d.x(), java.lang.Integer.valueOf(this.f199831g));
                android.view.View view2 = this.f199829e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneUnreadCountTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneUnreadCountTongue", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f199832h = 0;
            }
        }
        if (this.f199829e.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[showMsgAtSomeoneTongue] has show!!!");
            return;
        }
        if (this.f199839r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[showMsgAtSomeoneTongue] has already show!!!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "[update] [tryShowAtSomeoneTongueInner] mGoBackToHistoryMsgLayout VISIBLE, msgId:%d", java.lang.Long.valueOf(msgIdTalker.f149480d));
        this.f199830f = (android.widget.TextView) this.f198580d.c(com.tencent.mm.R.id.f483663bm5);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f198580d.c(com.tencent.mm.R.id.sqh);
        if (weImageView != null) {
            weImageView.setRotation(180.0f);
            weImageView.setPadding(0, 0, 0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh));
        }
        int i28 = A0() ? 5 : 10;
        if (z17 && (i18 = this.f199831g) >= 1) {
            int i29 = this.f199834m;
            if (!(i29 == 0 || this.f199836o - (this.f199835n + (i29 * 2)) < i18)) {
                i28 = 1;
            }
        }
        if (q0()) {
            java.util.ArrayList arrayList3 = this.f199843v;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
            arrayList3.clear();
            eg5.d dVar = this.f199847z;
            if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di() && !arrayList4.isEmpty() && this.f199846y && dVar != null) {
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    java.lang.String a17 = ic5.f.f290437c.a((com.tencent.mm.storage.f9) it.next());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                        hashSet.add(a17);
                    }
                }
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) it6.next();
                    up5.x a18 = c95.d.f39747a.a(str);
                    if (a18 == null || a18.f430120f == 1 || a18.f430119e <= 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "insertMediaGroupUnreadInfo, groupId = %s, continue", str);
                    } else {
                        g15.a aVar2 = new g15.a();
                        aVar2.q(a18.f430117c);
                        aVar2.p(15);
                        aVar2.o(a18.f430118d);
                        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "insertMediaGroupUnreadInfo, groupId = %s, firstMsgId = %s, firstMsgCreateTime = %s", str, java.lang.Long.valueOf(a18.f430117c), java.lang.Long.valueOf(a18.f430118d));
                        dVar.d(aVar2);
                        dVar.c(aVar2).put("GroupId", str);
                    }
                }
            }
            u0(this.f199835n, this.f199834m);
            if (this.f199833i == 0) {
                F0();
                return;
            }
            return;
        }
        if (z17 && this.f199831g >= i28) {
            g15.a aVar3 = this.D;
            if (!(aVar3 != null && aVar3.k() == 15)) {
                int i37 = ((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0() ? com.tencent.mm.R.string.mdt : com.tencent.mm.R.string.b2_;
                if (this.f199831g > 999) {
                    this.f199830f.setText(java.lang.String.format(this.f198580d.s().getString(i37), 999));
                } else {
                    this.f199830f.setText(java.lang.String.format(this.f198580d.s().getString(i37), java.lang.Integer.valueOf(this.f199831g)));
                }
                if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0()) {
                    j76 = ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).Bi();
                    i17 = this.f199831g;
                } else if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198753r) {
                    j76 = c01.d9.b().j().h(this.f198580d.x(), ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).w0());
                    i17 = this.f199831g;
                } else {
                    j76 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).j7(this.f198580d.x());
                    i17 = this.f199831g;
                }
                this.f199829e.setOnClickListener(new com.tencent.mm.ui.chatting.component.dg(this, j76 - i17));
                if (!com.tencent.mm.storage.z3.j4(this.f198580d.x()) && this.f199831g <= this.f199834m) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "[showMsgTongue] has fold message cell");
                    return;
                }
                this.f198580d.q().removeCallbacks(this.E);
                com.tencent.mm.sdk.platformtools.n3 q17 = this.f198580d.q();
                com.tencent.mm.ui.chatting.component.tf tfVar = new com.tencent.mm.ui.chatting.component.tf(this, z17, msgIdTalker);
                this.E = tfVar;
                q17.postDelayed(tfVar, 100L);
                this.f199839r = true;
                return;
            }
        }
        long j17 = msgIdTalker.f149480d;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[tryShowAtSomeoneTongueInner] no show tongue! msgId:%d, talker:%s", java.lang.Long.valueOf(j17), msgIdTalker.a());
            android.view.View view3 = this.f199829e;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneTongueInner", "(Lcom/tencent/mm/plugin/msg/MsgIdTalker;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneTongueInner", "(Lcom/tencent/mm/plugin/msg/MsgIdTalker;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f199832h = 0;
            return;
        }
        com.tencent.mm.storage.f9 f27 = pt0.f0.f2(msgIdTalker.a(), j17);
        if ((f27 != null && f27.s2(c01.z1.r())) || (f27 != null && f27.r2())) {
            this.f199829e.setOnClickListener(new com.tencent.mm.ui.chatting.component.eg(this, msgIdTalker));
            if (!com.tencent.mm.storage.z3.j4(this.f198580d.x())) {
            }
            this.f198580d.q().removeCallbacks(this.E);
            com.tencent.mm.sdk.platformtools.n3 q172 = this.f198580d.q();
            com.tencent.mm.ui.chatting.component.tf tfVar2 = new com.tencent.mm.ui.chatting.component.tf(this, z17, msgIdTalker);
            this.E = tfVar2;
            q172.postDelayed(tfVar2, 100L);
            this.f199839r = true;
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[tryShowAtSomeoneTongueInner] no show tongue! msgId:%d, talker:%s", java.lang.Long.valueOf(j17), this.f198580d.x());
        android.view.View view4 = this.f199829e;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneTongueInner", "(Lcom/tencent/mm/plugin/msg/MsgIdTalker;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowAtSomeoneTongueInner", "(Lcom/tencent/mm/plugin/msg/MsgIdTalker;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f199832h = 0;
    }

    public void F0() {
        if (this.f199837p != 1) {
            this.f199838q = true;
            return;
        }
        try {
            G0();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HistoryMsgTongueComponent", th6, "tryShowTongue err", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0() {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.rf.G0():void");
    }

    public final void H0(g15.a aVar, boolean z17) {
        if (!y0(null)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[tryShowTopHintTongueInner] no show tongue! username:%s unreadCount:%s", this.f198580d.x(), java.lang.Integer.valueOf(this.f199831g));
            android.view.View view = this.f199829e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowTopHintTongueInner", "(Lcom/tencent/mm/plugin/xml/draft/ConvRedHint;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "tryShowTopHintTongueInner", "(Lcom/tencent/mm/plugin/xml/draft/ConvRedHint;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f199832h = 0;
            return;
        }
        if (this.f198580d.g().isDestroyed() || this.f198580d.g().isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HistoryMsgTongueComponent", "[tryShowTopHintTongueInner] context is destroyed or finishing");
            return;
        }
        if (this.f199829e.getVisibility() == 0) {
            return;
        }
        if (this.f199839r || this.f199840s) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "[tryShowTopHintTongueInner] has already show!!!");
            return;
        }
        if (z17 || this.f199833i != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "[update] [tryShowTopHintTongueInner] mGoBackToHistoryMsgLayout VISIBLE, msgId:%d, type:%s, isFirstTime:%s", java.lang.Long.valueOf(aVar.l()), java.lang.Integer.valueOf(aVar.k()), java.lang.Boolean.valueOf(z17));
            this.f199830f = (android.widget.TextView) this.f198580d.c(com.tencent.mm.R.id.f483663bm5);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f198580d.c(com.tencent.mm.R.id.sqh);
            if (weImageView != null) {
                weImageView.setRotation(0.0f);
                weImageView.setPadding(0, 0, 0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh));
            }
            if (aVar.k() == 0) {
                java.lang.String format = java.lang.String.format(this.f198580d.s().getString(((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0() ? com.tencent.mm.R.string.mdt : com.tencent.mm.R.string.b2_), java.lang.Integer.valueOf(java.lang.Math.min(this.f199845x, 999)));
                if (z17) {
                    this.f199830f.setText(format);
                    this.f199830f.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.rf$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.ui.chatting.component.rf.this.f199830f.requestLayout();
                        }
                    });
                }
                this.f199829e.setOnClickListener(new com.tencent.mm.ui.chatting.component.bg(this, aVar));
                C0(format);
                return;
            }
            java.lang.String w07 = w0(aVar);
            if (z17) {
                this.f199830f.setText(w07);
                this.f199830f.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.rf$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.ui.chatting.component.rf.this.f199830f.requestLayout();
                    }
                });
            }
            this.f199829e.setOnClickListener(new com.tencent.mm.ui.chatting.component.cg(this, aVar));
            C0(w07);
            if (aVar.k() == 15) {
                this.D = aVar;
            }
        }
    }

    public void I0(int i17, boolean z17) {
        android.view.View view;
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav;
        int i18 = A0() ? 5 : 10;
        if ((z17 || this.f199831g >= i18 || r0()) && (view = this.f199829e) != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            if (i17 == -2) {
                this.f199833i = 1;
                layoutParams.gravity = 8388661;
                if (!((com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) this.f198580d.f460708c.a(sb5.j2.class))).s0()) {
                    layoutParams.setMargins(0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf), 0, 0);
                }
            } else if (i17 == 0) {
                this.f199833i = 1;
                layoutParams.gravity = 8388661;
                layoutParams.setMargins(0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf), 0, 0);
            } else if (i17 == 1) {
                this.f199833i = 1;
                layoutParams.gravity = 8388661;
                com.tencent.mm.ui.chatting.component.sm smVar = (com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) this.f198580d.f460708c.a(sb5.j2.class));
                int height = (!smVar.s0() || (talkRoomPopupNav = smVar.f199951f) == null) ? 0 : talkRoomPopupNav.getHeight();
                if (height < 0 || height <= 0) {
                    height = 0;
                }
                layoutParams.setMargins(0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) + height, 0, 0);
            } else if (i17 == 3) {
                this.f199833i = 1;
                layoutParams.gravity = 8388661;
                layoutParams.setMargins(0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) * 3, 0, 0);
            } else if (i17 == 4) {
                this.f199833i = 1;
                layoutParams.gravity = 8388661;
                layoutParams.setMargins(0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf) + this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479725dh), 0, 0);
            } else if (i17 != 5) {
                this.f199833i = 0;
            } else {
                this.f199833i = 2;
                layoutParams.gravity = 8388693;
                android.view.View view2 = ((com.tencent.mm.ui.chatting.component.bj) ((sb5.o1) this.f198580d.f460708c.a(sb5.o1.class))).f198826e;
                layoutParams.setMargins(0, 0, 0, this.f198580d.s().getDimensionPixelSize(view2 != null && view2.getVisibility() == 0 ? com.tencent.mm.R.dimen.f479660bx : com.tencent.mm.R.dimen.f479720dd));
            }
            this.f199829e.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        this.f199837p = 0;
        this.f199833i = 0;
        this.f199832h = 0;
        this.f199839r = false;
        this.f199840s = false;
        this.f199841t.clear();
        this.f199842u.clear();
        g95.d0.f269796a.a(this.f198580d.x());
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            final java.lang.String x17 = this.f198580d.x();
            final g15.a aVar = this.D;
            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.rf$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.chatting.component.rf rfVar = com.tencent.mm.ui.chatting.component.rf.this;
                    rfVar.getClass();
                    java.util.List<up5.x> d17 = c95.d.f39747a.d(rfVar.f198580d.x());
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(d17.size());
                    java.lang.String str = x17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "mediaGroupMarkShownTongueOnExit[%s], unreadInfos size = %s", str, valueOf);
                    if (d17.isEmpty()) {
                        return;
                    }
                    for (up5.x xVar : d17) {
                        g15.a aVar2 = aVar;
                        if (aVar2 != null && aVar2.l() == xVar.f430117c) {
                            ((kc5.s) ((wg3.i) i95.n0.c(wg3.i.class))).Ni(new com.tencent.mm.plugin.msg.MsgIdTalker(xVar.f430117c, str), xVar.f430119e, 2);
                        }
                        xVar.f430120f = 1;
                        xVar.f430119e = 0;
                        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "mediaGroupMarkShownTongueOnExit[%s], update: groupId = %s, firstMsgId = %s", str, xVar.f430115a, java.lang.Long.valueOf(xVar.f430117c));
                        c95.d.f39747a.e(xVar);
                    }
                }
            }, "MediaGroup");
        }
    }

    public void J0(int i17) {
        if (this.f199829e == null || this.f199830f == null) {
            return;
        }
        g15.a aVar = (g15.a) kz5.n0.Z(this.f199847z.f252843c);
        if ((aVar != null && aVar.k() == 0) && i17 < this.C && i17 > 0) {
            this.C = i17;
            int i18 = ((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0() ? com.tencent.mm.R.string.mdt : com.tencent.mm.R.string.b2_;
            if (!this.B) {
                if (i17 > 999) {
                    this.f199830f.setText(java.lang.String.format(this.f198580d.s().getString(i18), 999));
                } else {
                    this.f199830f.setText(java.lang.String.format(this.f198580d.s().getString(i18), java.lang.Integer.valueOf(i17)));
                }
            }
        }
        if (((g15.a) kz5.n0.Z(this.f199847z.f252843c)) != this.D) {
            g15.a aVar2 = (g15.a) kz5.n0.Z(this.f199847z.f252843c);
            this.D = aVar2;
            if (aVar2.k() != 0 && !this.B) {
                this.f199830f.setText(w0(this.D));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "set click action, msgId: %s, type: %s", java.lang.Long.valueOf(this.D.l()), java.lang.Integer.valueOf(this.D.k()));
            this.f199829e.setOnClickListener(new com.tencent.mm.ui.chatting.component.yf(this));
            return;
        }
        g15.a aVar3 = (g15.a) kz5.n0.Z(this.f199847z.f252843c);
        g15.a aVar4 = this.D;
        if (aVar3 == aVar4 && aVar4 != null && aVar4.k() == 15) {
            this.f199830f.setText(w0(this.D));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        android.view.View c17 = this.f198580d.c(com.tencent.mm.R.id.f483662bm4);
        this.f199829e = c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "onChattingInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int p07 = p0(false);
        this.f199831g = p07;
        this.f199844w = p07;
        this.f199845x = p07;
        boolean z17 = this.f199846y;
        if (z17) {
            eg5.d dVar = new eg5.d(this.f198580d.x(), this.f199831g >= (A0() ? 5 : 10) ? ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().S6(this.f198580d.x(), this.f199831g - 1) : null);
            this.f199847z = dVar;
            this.C = Integer.MAX_VALUE;
            this.D = null;
            if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di() && z17) {
                java.util.List<up5.x> d17 = c95.d.f39747a.d(this.f198580d.x());
                com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "initMediaGroupUnreadInfo, unreadInfos size = %s", java.lang.Integer.valueOf(d17.size()));
                if (!d17.isEmpty()) {
                    for (up5.x xVar : d17) {
                        g15.a aVar = new g15.a();
                        aVar.q(xVar.f430117c);
                        aVar.p(15);
                        aVar.o(xVar.f430118d);
                        dVar.d(aVar);
                        dVar.c(aVar).put("GroupId", xVar.f430115a);
                    }
                }
            }
            g95.d0.f269796a.a(this.f198580d.x());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "[onChattingInit] mUnreadMessageCount:%s", java.lang.Integer.valueOf(this.f199831g));
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0088 A[SYNTHETIC] */
    @Override // xg3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(xg3.m0 r17, xg3.l0 r18) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.rf.c0(xg3.m0, xg3.l0):void");
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.View view2;
        this.f199834m = i18;
        this.f199835n = i17;
        this.f199836o = i19;
        if (this.f199831g > 0 || r0()) {
            if (this.f199839r && i19 - (i18 + i17) < this.f199831g && (view2 = this.f199829e) != null && view2.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "onScroll dismissMsgTongue mUnreadMessage[%d] [%d,%d]", java.lang.Integer.valueOf(this.f199831g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                v0(true);
                B0();
            } else if (!this.f199839r && i19 - (i17 + 1) >= this.f199844w && this.f199829e != null && !r0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "summerbadcr jacks onScroll dismissMsgTongue mUnreadMessage[%d] [%d,%d]", java.lang.Integer.valueOf(this.f199831g), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
                v0(true);
                B0();
            } else if (this.f199846y && this.f199829e != null && r0()) {
                int i28 = this.f199844w - (i19 - (i17 + 1));
                this.f199845x = i28;
                J0(i28);
            }
        }
        u0(this.f199835n, this.f199834m);
        t0(this.f199835n, this.f199834m, this.f199836o);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0 || i17 == 1) {
            t0(this.f199835n, this.f199834m, this.f199836o);
        }
    }

    public final int p0(boolean z17) {
        if (((com.tencent.mm.ui.chatting.component.h3) ((sb5.s) this.f198580d.f460708c.a(sb5.s.class))).u()) {
            return ((com.tencent.mm.plugin.finder.service.v1) ((zy2.g6) i95.n0.c(zy2.g6.class))).wi(this.f198580d.x());
        }
        if (((com.tencent.mm.ui.chatting.component.h4) ((sb5.x) this.f198580d.f460708c.a(sb5.x.class))).t()) {
            return ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ui(this.f198580d.x());
        }
        if (((com.tencent.mm.ui.chatting.component.u7) ((sb5.h0) this.f198580d.f460708c.a(sb5.h0.class))).G()) {
            return ((ki4.a0) ((bi4.x0) i95.n0.c(bi4.x0.class))).wi(this.f198580d.x());
        }
        if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) this.f198580d.f460708c.a(sb5.g.class))).n0()) {
            ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).getClass();
            if (!zv.q.f476079a.g()) {
                return 0;
            }
            com.tencent.wechat.mm.brand_service.g0 c17 = yw.a3.f466266a.c();
            return (int) (c17 != null ? c17.e() : 0L);
        }
        if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).G0()) {
            return yq1.u0.Di().D0(this.f198580d.x());
        }
        if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).H0()) {
            return yq1.u0.Vi().D0(this.f198580d.x());
        }
        if (((com.tencent.mm.ui.chatting.component.b9) ((sb5.j0) this.f198580d.f460708c.a(sb5.j0.class))).s()) {
            return ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).aj(this.f198580d.x());
        }
        com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class));
        if (aVar.f198753r && z17) {
            return aVar.f198761z;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f198580d.x());
        if (p17 == null) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "[calcUnreadMessageCount] %s", java.lang.Integer.valueOf(p17.d1()));
        return p17.d1();
    }

    public final boolean q0() {
        return (this.f199843v.isEmpty() || this.f199847z == null || !((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) ? false : true;
    }

    public final boolean r0() {
        eg5.d dVar;
        return this.f199846y && (dVar = this.f199847z) != null && (dVar.f252843c.isEmpty() ^ true);
    }

    public final void s0(boolean z17, boolean z18) {
        android.view.View view;
        if (this.f199841t.isEmpty() || z18) {
            int p07 = p0(true);
            this.f199831g = p07;
            if (p07 <= 0 && (view = this.f199829e) != null && view.getVisibility() == 0) {
                v0(true);
            }
            if (!z17) {
                E0(com.tencent.mm.plugin.msg.MsgIdTalker.f149479g, true);
                return;
            }
            this.f198580d.q().removeCallbacks(this.E);
            com.tencent.mm.sdk.platformtools.n3 q17 = this.f198580d.q();
            com.tencent.mm.ui.chatting.component.ag agVar = new com.tencent.mm.ui.chatting.component.ag(this);
            this.E = agVar;
            q17.postDelayed(agVar, 100L);
        }
    }

    public final void t0(int i17, int i18, int i19) {
        sb5.z zVar;
        com.tencent.mm.storage.f9 item;
        java.util.ArrayList arrayList = this.f199841t;
        if (arrayList.isEmpty()) {
            return;
        }
        if ((this.f199832h != 2 && !this.f199839r) || r0() || (zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class)) == null) {
            return;
        }
        for (int i27 = 0; i27 < i18; i27++) {
            int i28 = (i17 - 1) + i27;
            if (i28 >= 0 && (item = ((com.tencent.mm.ui.chatting.adapter.k) zVar).getItem(i28)) != null && arrayList.contains(new com.tencent.mm.plugin.msg.MsgIdTalker(item.getMsgId(), item.Q0()))) {
                if (i27 == 0 || i18 - 1 == i27) {
                    android.view.View f17 = this.f198580d.f(i27);
                    if (f17 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "onScroll, msgView is null");
                    } else if (1.0f > g95.d0.f269796a.c(f17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "onScroll, fix expose");
                    }
                }
                arrayList.remove(new com.tencent.mm.plugin.msg.MsgIdTalker(item.getMsgId(), item.Q0()));
            }
        }
        if (this.f199832h == 2 || this.f199839r) {
            if (arrayList.isEmpty()) {
                v0(true);
            } else {
                E0((com.tencent.mm.plugin.msg.MsgIdTalker) arrayList.get(0), false);
            }
        }
    }

    public final void u0(int i17, int i18) {
        eg5.d dVar;
        sb5.z zVar;
        java.util.List list;
        if (!this.f199846y || (dVar = this.f199847z) == null) {
            return;
        }
        if (((dVar.f252843c.isEmpty() ^ true) || (((java.util.ArrayList) dVar.f252844d).isEmpty() ^ true)) && (zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class)) != null) {
            for (int i19 = 0; i19 < i18; i19++) {
                int i27 = (i17 - 1) + i19;
                if (i27 >= 0) {
                    eg5.d dVar2 = this.f199847z;
                    if ((dVar2.f252843c.isEmpty() ^ true) || (((java.util.ArrayList) dVar2.f252844d).isEmpty() ^ true)) {
                        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
                        rd5.d dVar3 = (rd5.d) kz5.n0.a0(kVar.I.f152065o, i27);
                        if (dVar3 instanceof qd5.i) {
                            we5.s0 s0Var = ((qd5.i) dVar3).f361911o;
                            if (s0Var == null || (list = s0Var.f445387a) == null) {
                                list = kz5.p0.f313996d;
                            }
                            int i28 = 0;
                            while (true) {
                                if (i28 < list.size()) {
                                    com.tencent.mm.storage.f9 f9Var = ((rd5.d) list.get(i28)).f394254d.f445300b;
                                    if (this.f199847z.b(f9Var.getMsgId())) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "remove fold topConvRedHints: %s", java.lang.Long.valueOf(f9Var.getMsgId()));
                                        this.f199847z.e(f9Var.getMsgId());
                                        break;
                                    }
                                    i28++;
                                }
                            }
                        } else if (dVar3 != null) {
                            com.tencent.mm.storage.f9 f9Var2 = dVar3.f394254d.f445300b;
                            if (this.f199847z.b(f9Var2.getMsgId()) || this.f199847z.a(f9Var2.getMsgId())) {
                                if (i19 == 0 || i18 - 1 == i19) {
                                    android.view.View f17 = this.f198580d.f(i19);
                                    if (f17 == null) {
                                        com.tencent.mars.xlog.Log.w("MicroMsg.HistoryMsgTongueComponent", "onScroll, msgView is null");
                                    } else if (1.0f > g95.d0.f269796a.c(f17) && kVar.getCount() != i27 + 1) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "onScroll, fix expose, %s", java.lang.Long.valueOf(f9Var2.getMsgId()));
                                    }
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.HistoryMsgTongueComponent", "remove topConvRedHints: %s", java.lang.Long.valueOf(f9Var2.getMsgId()));
                                this.f199847z.e(f9Var2.getMsgId());
                            }
                        }
                    }
                }
            }
            if (!this.f199847z.f252843c.isEmpty()) {
                H0((g15.a) kz5.n0.Z(this.f199847z.f252843c), false);
            } else if (this.f199833i != 2) {
                v0(true);
            }
        }
    }

    public void v0(boolean z17) {
        android.view.View view = this.f199829e;
        if (view == null) {
            return;
        }
        if (!z17 && this.f199833i == 2) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.gravity = 8388693;
            layoutParams.setMargins(0, 0, 0, this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479660bx));
            return;
        }
        if (this.f199832h == 1) {
            this.f199832h = 0;
        }
        if (!r0()) {
            this.f199831g = -1;
            this.f199844w = -1;
        }
        this.f199839r = false;
        this.f199840s = false;
        if (this.f199829e.getVisibility() == 0) {
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, this.f199829e.getWidth(), 0.0f, 0.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setInterpolator(android.view.animation.AnimationUtils.loadInterpolator(this.f198580d.g(), android.R.anim.accelerate_interpolator));
            this.B = true;
            translateAnimation.setAnimationListener(new com.tencent.mm.ui.chatting.component.xf(this));
            this.f199829e.startAnimation(translateAnimation);
        }
        android.view.View view2 = this.f199829e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "dismissMsgTongue", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent", "dismissMsgTongue", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String w0(g15.a aVar) {
        if (aVar.k() != 15) {
            return eg5.n.f252856a.a(this.f198580d.g(), aVar.k());
        }
        android.app.Activity context = this.f198580d.g();
        int k17 = aVar.k();
        int o07 = ((com.tencent.mm.ui.chatting.component.o4) ((sb5.a0) this.f198580d.f460708c.a(sb5.a0.class))).o0(aVar.l(), this.f198580d.x());
        kotlin.jvm.internal.o.g(context, "context");
        if (k17 != 15) {
            return "";
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.b2_, java.lang.Integer.valueOf(o07));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void x0() {
        java.util.ArrayList arrayList = this.f199841t;
        arrayList.clear();
        g95.c0 c0Var = g95.d0.f269796a;
        java.lang.String x17 = this.f198580d.x();
        java.lang.String string = c0Var.b().getString(this.f198580d.x(), "");
        java.lang.Iterable iterable = kz5.p0.f313996d;
        if (string != null) {
            if (!(string.length() > 0)) {
                string = null;
            }
            if (string != null) {
                java.util.List g17 = new r26.t(",").g(string, 0);
                if (!g17.isEmpty()) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            iterable = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                java.util.List S0 = kz5.n0.S0(iterable);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(S0, 10));
                java.util.Iterator it = S0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it.next())));
                }
                iterable = kz5.n0.Q(arrayList2);
            }
        }
        java.util.HashSet hashSet = this.f199842u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(hashSet);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (!arrayList3.contains(new com.tencent.mm.plugin.msg.MsgIdTalker(((java.lang.Number) obj).longValue(), x17))) {
                arrayList4.add(obj);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            arrayList5.add(new com.tencent.mm.plugin.msg.MsgIdTalker(((java.lang.Number) it6.next()).longValue(), x17));
        }
        arrayList.addAll(arrayList5);
        hashSet.addAll(arrayList);
    }

    public final boolean y0(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        return !(com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.x()) || ((msgIdTalker != null && !this.f198580d.x().equals(msgIdTalker.a())) || this.f198580d.G() || com.tencent.mm.storage.z3.l4(this.f198580d.x()) || c01.e2.G(this.f198580d.x()) || com.tencent.mm.storage.z3.R3(this.f198580d.x()) || com.tencent.mm.storage.z3.t4(this.f198580d.x()))) || this.f198580d.C() || A0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
    }
}
