package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.n.class)
/* loaded from: classes11.dex */
public class q2 extends com.tencent.mm.ui.chatting.component.a implements sb5.n, com.tencent.mm.modelbase.u0, l75.z0 {

    /* renamed from: t, reason: collision with root package name */
    public static int f199735t = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f199736e = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f199737f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f199738g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f199739h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199740i;

    /* renamed from: m, reason: collision with root package name */
    public final l75.q0 f199741m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199742n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f199743o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f199744p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.roomsdk.model.factory.a f199745q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.roomsdk.model.factory.j f199746r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f199747s;

    public q2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f199740i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChatroomMemberDataUpdatedEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.ChatroomComponent$1
            {
                this.__eventId = 1070867558;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChatroomMemberDataUpdatedEvent chatroomMemberDataUpdatedEvent) {
                com.tencent.mm.autogen.events.ChatroomMemberDataUpdatedEvent chatroomMemberDataUpdatedEvent2 = chatroomMemberDataUpdatedEvent;
                com.tencent.mm.ui.chatting.component.q2 q2Var = com.tencent.mm.ui.chatting.component.q2.this;
                q2Var.f198580d.b0();
                if (!(chatroomMemberDataUpdatedEvent2 instanceof com.tencent.mm.autogen.events.ChatroomMemberDataUpdatedEvent)) {
                    return false;
                }
                q2Var.f198580d.x();
                if (com.tencent.mm.sdk.platformtools.t8.K0(chatroomMemberDataUpdatedEvent2.f54041g.f6629a) || !chatroomMemberDataUpdatedEvent2.f54041g.f6629a.equals(q2Var.f198580d.x())) {
                    return false;
                }
                q2Var.r0();
                return false;
            }
        };
        this.f199741m = new com.tencent.mm.ui.chatting.component.h2(this);
        this.f199742n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TrackRemoveTipEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.ChatroomComponent$3
            {
                this.__eventId = -1360452258;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TrackRemoveTipEvent trackRemoveTipEvent) {
                com.tencent.mm.autogen.events.TrackRemoveTipEvent trackRemoveTipEvent2 = trackRemoveTipEvent;
                boolean z17 = trackRemoveTipEvent2 instanceof com.tencent.mm.autogen.events.TrackRemoveTipEvent;
                com.tencent.mm.ui.chatting.component.q2 q2Var = com.tencent.mm.ui.chatting.component.q2.this;
                if ((z17 && !q2Var.f198580d.x().equals(trackRemoveTipEvent2.f54901g.f6800a)) || !com.tencent.mm.storage.z3.R4(q2Var.f198580d.x())) {
                    return false;
                }
                db5.e1.s(q2Var.f198580d.g(), q2Var.f198580d.s().getString(com.tencent.mm.R.string.k1l), null);
                return false;
            }
        };
        this.f199743o = false;
        this.f199744p = 0;
        this.f199745q = null;
        this.f199747s = false;
    }

    public static com.tencent.mm.roomsdk.model.factory.a m0(com.tencent.mm.ui.chatting.component.q2 q2Var, com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18, boolean z17) {
        q2Var.getClass();
        com.tencent.mm.roomsdk.model.factory.a b17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(q2Var.f198580d.x()).b(q2Var.f198580d.x(), linkedList2, i17);
        b17.f192246b = new com.tencent.mm.ui.chatting.component.r1(q2Var, z17, i18, f9Var, linkedList, linkedList2);
        b17.f192247c = new com.tencent.mm.ui.chatting.component.u1(q2Var, z17, i18, f9Var, linkedList, linkedList2);
        if (z17) {
            b17.b();
        } else {
            b17.c(q2Var.f198580d.g(), q2Var.f198580d.s().getString(com.tencent.mm.R.string.f490573yv), q2Var.f198580d.s().getString(com.tencent.mm.R.string.i4_), true, true, new com.tencent.mm.ui.chatting.component.v1(q2Var, b17));
        }
        return b17;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        c01.d9.e().a(610, this);
        c01.d9.e().a(551, this);
        ((l75.a1) c01.d9.b().q()).a(this);
        c01.d9.b().l().add(this.f199741m);
        com.tencent.mm.roomsdk.model.factory.j jVar = this.f199746r;
        if (jVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomWatchCallbackFactory", "dead");
            gm0.j1.i();
            gm0.j1.n().f273288b.q(jVar.f192269a, jVar.f192272d);
        }
        com.tencent.mm.roomsdk.model.factory.j jVar2 = (com.tencent.mm.roomsdk.model.factory.j) ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.f198580d.x()).e(700);
        jVar2.f192270b = new com.tencent.mm.ui.chatting.component.b2(this);
        jVar2.f192271c = new com.tencent.mm.ui.chatting.component.a2(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomWatchCallbackFactory", "alive");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(jVar2.f192269a, jVar2.f192272d);
        this.f199746r = jVar2;
        this.f199740i.alive();
        this.f199742n.alive();
        if (com.tencent.mm.storage.z3.R4(this.f198580d.x()) && c01.v1.z(this.f198580d.x())) {
            this.f198580d.x();
            c01.n8.a().c(this.f198580d.x(), 30);
        }
        if (q21.d.b() != null && !this.f198580d.x().equals(((va3.v0) q21.d.b()).f434364v)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "chatting oncreate end track %s", ((va3.v0) q21.d.b()).f434364v);
            com.tencent.mm.autogen.events.ExitTrackRoomEvent exitTrackRoomEvent = new com.tencent.mm.autogen.events.ExitTrackRoomEvent();
            exitTrackRoomEvent.f54187g.f8176a = this.f198580d.x();
            exitTrackRoomEvent.e();
        }
        r0();
        if (this.f198580d.u() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomInfoDetail() talker == null");
        } else if (com.tencent.mm.storage.z3.R4(this.f198580d.x())) {
            java.lang.String x17 = this.f198580d.x();
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f199743o);
            if (f199735t == -1) {
                f199735t = 1;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomInfoDetail() username:%s, isInChatRoom:%s, sw:%s", x17, valueOf, java.lang.Integer.valueOf(f199735t));
            java.lang.String x18 = this.f198580d.x();
            if (this.f199743o) {
                if (f199735t == -1) {
                    f199735t = 1;
                }
                if (f199735t == 1) {
                    ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.ui.chatting.component.e2(this, x18), 1000L);
                }
            }
        }
        if (com.tencent.mm.storage.z3.N4(this.f198580d.x())) {
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f198580d.x());
            if (z07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail member is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail %s status:%s", this.f198580d.x(), java.lang.Integer.valueOf(z07.field_chatroomStatus));
            if (!((((long) z07.field_chatroomStatus) & 2097152) == 2097152 && com.tencent.mm.sdk.platformtools.t8.K0(z07.field_associateOpenIMRoomName))) {
                if (z07.field_openIMRoomMigrateStatus == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate migration %s", this.f198580d.x());
                    ((nn.j) i95.n0.c(nn.j.class)).Ni().b(this.f198580d.x(), z07.field_associateOpenIMRoomName);
                    java.lang.String x19 = this.f198580d.x();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkConversationsForMigration %s", x19);
                    ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.g2(this, x19));
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate getRoomInfo %s", this.f198580d.x());
            ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(this.f198580d.x()).m(this.f198580d.x()).b();
            java.lang.String x27 = this.f198580d.x();
            boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_OPEN_IM_MIGRATE_CHECK_ALL_CONVERSATION_BOOLEAN_SYNC, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "ifCheckAllConversation %s, excludeUsername %s", java.lang.Boolean.valueOf(o17), x27);
            if (o17) {
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.f2(this, x27));
                return;
            }
            return;
        }
        if (com.tencent.mm.storage.z3.q4(this.f198580d.x())) {
            jn.j Ni = ((nn.j) i95.n0.c(nn.j.class)).Ni();
            java.lang.String x28 = this.f198580d.x();
            Ni.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "setCurChatName:%s", x28);
            Ni.f300472d = x28;
            com.tencent.mm.storage.a3 z08 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f198580d.x());
            if (z08 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail member is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail %s status:%s", this.f198580d.x(), java.lang.Integer.valueOf(z08.field_chatroomStatus));
            int i17 = z08.field_openIMRoomMigrateStatus;
            if (!(i17 == 3)) {
                if (i17 == 2) {
                    jn.j Ni2 = ((nn.j) i95.n0.c(nn.j.class)).Ni();
                    java.lang.String str = z08.field_associateOpenIMRoomName;
                    java.lang.String str2 = (java.lang.String) Ni2.f300471c.get(str);
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = str == null ? "" : str;
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[1] = str2;
                    java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = Ni2.f300470b;
                    objArr[2] = java.lang.Boolean.valueOf(concurrentLinkedDeque.contains(str));
                    com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "removeMigrateTask %s %s, %s", objArr);
                    if (concurrentLinkedDeque.contains(str)) {
                        concurrentLinkedDeque.remove(str);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImGetRoomInfoDetail remove from cur room");
                    return;
                }
                return;
            }
            java.lang.String string = this.f198580d.s().getString(com.tencent.mm.R.string.b09);
            java.lang.String string2 = this.f198580d.s().getString(com.tencent.mm.R.string.b0a);
            java.lang.String string3 = this.f198580d.s().getString(com.tencent.mm.R.string.b0_);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(string);
            stringBuffer.append("<_wc_custom_link_ href=\"weixin://jump/chatroom/");
            stringBuffer.append(z08.field_associateOpenIMRoomName);
            stringBuffer.append("\">");
            stringBuffer.append(string2);
            stringBuffer.append("</_wc_custom_link_>");
            stringBuffer.append(string3);
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(0);
            f9Var.u1(this.f198580d.x());
            f9Var.r1(3);
            f9Var.d1(stringBuffer.toString());
            f9Var.e1(c01.w9.m(this.f198580d.x(), java.lang.System.currentTimeMillis() / 1000));
            f9Var.setType(10000);
            f9Var.f1(f9Var.w0());
            f9Var.X = 1;
            f9Var.f236178r = true;
            c01.w9.x(f9Var);
            z08.field_openIMRoomMigrateStatus = 4;
            boolean replace = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(z08);
            jn.j.d(z08.field_associateOpenIMRoomName, this.f198580d.x(), 2);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "insert migration finish system msg.(result:%s)", java.lang.Boolean.valueOf(replace));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        x0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        jn.j Ni = ((nn.j) i95.n0.c(nn.j.class)).Ni();
        Ni.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "setCurChatName:%s", "");
        Ni.f300472d = "";
        if (com.tencent.mm.storage.z3.q4(this.f198580d.x())) {
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f198580d.x());
            if (z07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate member is null");
                return;
            }
            if (z07.field_openIMRoomMigrateStatus == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "checkOpenImMigrate start migrate");
                ((nn.j) i95.n0.c(nn.j.class)).Ni().b(z07.field_associateOpenIMRoomName, this.f198580d.x());
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        x0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        if (this.f198580d.C()) {
            qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
            java.lang.String x17 = this.f198580d.x();
            ((py.a) iVar).getClass();
            this.f199743o = c01.v1.x(x17, true);
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        yb5.d dVar = this.f198580d;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "[onNotifyChange] mChattingContext is null!");
            return;
        }
        if (((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198754s) {
            this.f199743o = s01.r.p(((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198744f);
            return;
        }
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String x17 = this.f198580d.x();
        ((py.a) iVar).getClass();
        this.f199743o = c01.v1.x(x17, false);
    }

    public void n0(long j17, java.util.LinkedList linkedList, int i17, int i18) {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.storage.a3 z07 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f198580d.x());
        if (z07 == null) {
            db5.e1.y(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.i4r), null, this.f198580d.s().getString(com.tencent.mm.R.string.i4l), new com.tencent.mm.ui.chatting.component.i2(this));
            return;
        }
        this.f198580d.x();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.List A0 = z07.A0();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (A0 != null && A0.contains(str)) {
                linkedList2.add(str);
            }
        }
        if (linkedList2.size() == 0) {
            if (linkedList.size() == 1) {
                db5.e1.y(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.i4k), null, this.f198580d.s().getString(com.tencent.mm.R.string.i4l), new com.tencent.mm.ui.chatting.component.j2(this));
            } else {
                db5.e1.y(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.i4g), null, this.f198580d.s().getString(com.tencent.mm.R.string.i4l), new com.tencent.mm.ui.chatting.component.k2(this));
            }
            if (i18 == 1) {
                w0(pt0.f0.Li(this.f198580d.x(), j17), 5, linkedList, 0, 0, 1, "");
                return;
            }
            return;
        }
        if (i18 == 1) {
            this.f199744p = 1;
        }
        if (j17 != -1) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f198580d.x(), j17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Li.Y1())) {
                if (!((Li.F & 4096) > 0)) {
                    if (c01.id.a() - Li.getCreateTime() <= u04.d.f423477c) {
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f198580d.g(), 1, false);
                        k0Var.f211872n = new com.tencent.mm.ui.chatting.component.l2(this);
                        k0Var.f211881s = new com.tencent.mm.ui.chatting.component.o2(this, Li, linkedList, linkedList2, i17, i18);
                        k0Var.f211854d = new com.tencent.mm.ui.chatting.component.p2(this, Li, linkedList, linkedList2);
                        k0Var.v();
                        return;
                    }
                    this.f199744p = 6;
                    f9Var = Li;
                }
            }
            f9Var = Li;
        } else {
            f9Var = null;
        }
        o0(f9Var, linkedList, linkedList2, i17, i18, false);
    }

    public final void o0(com.tencent.mm.storage.f9 f9Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i17, int i18, boolean z17) {
        if (linkedList.size() == 1) {
            db5.e1.C(this.f198580d.g(), z17 ? this.f198580d.s().getString(com.tencent.mm.R.string.i4f, q0((java.lang.String) linkedList.get(0))) : this.f198580d.s().getString(com.tencent.mm.R.string.i4e, q0((java.lang.String) linkedList.get(0))), null, z17 ? this.f198580d.s().getString(com.tencent.mm.R.string.i4n) : this.f198580d.s().getString(com.tencent.mm.R.string.i4m), this.f198580d.s().getString(com.tencent.mm.R.string.f490347sg), true, new com.tencent.mm.ui.chatting.component.o1(this, z17, f9Var, linkedList, i18, linkedList2, i17), new com.tencent.mm.ui.chatting.component.p1(this, i18, f9Var, linkedList));
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.chatroom.ui.DelChatroomMemberUI.class);
        intent.putExtra("members", com.tencent.mm.sdk.platformtools.t8.c1(linkedList2, ","));
        intent.putExtra("origin_members", com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ","));
        intent.putExtra("select_record_report_opt", this.f199744p);
        intent.putExtra("RoomInfo_Id", this.f198580d.x());
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent.putExtra("local_scene", i18);
        intent.putExtra("revoke_record", z17);
        if (f9Var != null) {
            intent.putExtra("msg_id", f9Var.getMsgId());
        }
        yb5.d dVar = this.f198580d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChatroomComponent", "dealDelChatroomMemberImp", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/util/LinkedList;Ljava/util/LinkedList;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/ChatroomComponent", "dealDelChatroomMemberImp", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/util/LinkedList;Ljava/util/LinkedList;IIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " sceneType:" + m1Var.getType());
        this.f198580d.b();
        yb5.d dVar = this.f198580d;
        if (!dVar.f460714i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd fragment not foreground, return");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.U0(dVar.g()) && !v0(this.f198580d.g(), i17, i18, str)) {
            this.f198580d.b0();
            if (i17 == 0 && i18 == 0 && m1Var.getType() == 551) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "cpan[refresh top btn]");
                qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
                java.lang.String x17 = this.f198580d.x();
                ((py.a) iVar).getClass();
                this.f199743o = c01.v1.x(x17, false);
                ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).E0();
            }
        }
    }

    public final void p0() {
        sb5.f fVar = (sb5.f) this.f198580d.f460708c.a(sb5.f.class);
        boolean R4 = com.tencent.mm.storage.z3.R4(this.f198580d.x());
        java.util.Map map = this.f199737f;
        boolean z17 = false;
        if (!R4) {
            if (((com.tencent.mm.ui.chatting.component.biz.a) fVar).f198754s) {
                this.f199736e = true;
                return;
            } else {
                this.f199736e = false;
                ((java.util.HashMap) map).clear();
                return;
            }
        }
        java.lang.String x17 = this.f198580d.x();
        java.util.Map map2 = c01.v1.f37519a;
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(x17);
        if (z07 != null) {
            z17 = z07.field_isShowname > 0;
        }
        this.f199736e = z17;
        if (z17) {
            c01.v1.a(this.f198580d.x(), map);
        } else {
            ((java.util.HashMap) map).clear();
        }
    }

    public final java.lang.String q0(java.lang.String str) {
        java.lang.String str2 = null;
        if (!((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).f198754s && !this.f198580d.C()) {
            return null;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            return str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
            com.tencent.mm.storage.a3 z07 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f198580d.x());
            if (z07 != null) {
                str2 = z07.z0(n17.d1());
            }
        } else {
            str2 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = n17.w0();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(str2) ? n17.f2() : str2;
    }

    public final void r0() {
        if (this.f198580d.u() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomMemberDetail() talker == null");
        } else if (com.tencent.mm.storage.z3.R4(this.f198580d.x())) {
            this.f198580d.q().postDelayed(new com.tencent.mm.ui.chatting.component.d2(this), 1000L);
        }
    }

    public java.lang.CharSequence s0(java.lang.String str) {
        sb5.f fVar = (sb5.f) this.f198580d.f460708c.a(sb5.f.class);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(str);
        if (!((com.tencent.mm.ui.chatting.component.biz.a) fVar).f198753r && !com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return t41.c.a(n17, a17);
        }
        java.util.Map map = this.f199737f;
        if (((java.util.HashMap) map).containsKey(str)) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) map).get(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return com.tencent.mm.storage.z3.m4(str) ? t41.c.a(n17, str2) : str2;
            }
        }
        com.tencent.mm.ui.chatting.component.biz.a aVar = (com.tencent.mm.ui.chatting.component.biz.a) fVar;
        if (aVar.f198753r) {
            return aVar.f198744f.v0(str);
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return t41.c.a(n17, c01.a2.e(str));
    }

    public boolean t0() {
        com.tencent.mm.storage.a3 z07;
        return com.tencent.mm.storage.z3.N4(this.f198580d.x()) && (z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f198580d.x())) != null && (((long) z07.field_chatroomStatus) & 131072) == 131072;
    }

    public boolean u0() {
        return this.f199743o || ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) this.f198580d.f460708c.a(sb5.f.class))).P;
    }

    public boolean v0(android.app.Activity activity, int i17, int i18, java.lang.String str) {
        return com.tencent.mm.ui.pc.a(activity, i17, i18, str, 7) || com.tencent.mm.plugin.account.ui.d.a(activity, i17, i18, new android.content.Intent().setClass(activity, com.tencent.mm.ui.LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str);
    }

    public final void w0(com.tencent.mm.storage.f9 f9Var, int i17, java.util.LinkedList linkedList, int i18, int i19, int i27, java.lang.String str) {
        a14.h.a(this.f198580d.x(), linkedList != null ? linkedList.size() : 0, i18, i17, i19, i27, com.tencent.mm.sdk.platformtools.t8.E1(f9Var != null ? f9Var.Y1() : ""), str);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (!this.f199747s) {
            p0();
        }
        this.f199747s = false;
    }

    public final void x0() {
        c01.d9.e().q(610, this);
        ((l75.a1) c01.d9.b().q()).e(this);
        c01.d9.e().q(551, this);
        com.tencent.mm.roomsdk.model.factory.j jVar = this.f199746r;
        if (jVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomWatchCallbackFactory", "dead");
            gm0.j1.i();
            gm0.j1.n().f273288b.q(jVar.f192269a, jVar.f192272d);
        }
        if (gm0.j1.a()) {
            c01.d9.b().l().remove(this.f199741m);
            this.f199740i.dead();
            this.f199742n.dead();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f199747s = true;
        p0();
    }
}
