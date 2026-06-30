package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.e1.class)
@java.lang.Deprecated
/* loaded from: classes9.dex */
public class ah extends com.tencent.mm.ui.chatting.component.a implements sb5.e1 {

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f198623e;

    /* renamed from: f, reason: collision with root package name */
    public int f198624f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f198625g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f198626h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.la f198627i = null;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        uIStatusChangedEvent.f54907g.f7378a = 4;
        uIStatusChangedEvent.e();
        if (this.f198580d != null) {
            android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.ui.chatting.component.dh(this));
        }
        com.tencent.mm.autogen.events.OpenChattingUIEvent openChattingUIEvent = new com.tencent.mm.autogen.events.OpenChattingUIEvent();
        this.f198580d.x();
        openChattingUIEvent.f54592g.getClass();
        openChattingUIEvent.e();
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String x17 = this.f198580d.x();
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.J(x17, 2);
        if (!ih.d.c() || this.f198580d.f460717l.getActivity() == null) {
            return;
        }
        this.f198625g = com.tencent.matrix.lifecycle.owners.f0.f52741w;
        com.tencent.matrix.lifecycle.owners.f0.f52742x.g(this.f198580d.f460717l.getActivity().getClass().getName() + "#" + this.f198580d.f460717l.getClass().getSimpleName());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        de0.j jVar = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String x17 = this.f198580d.x();
        ((ce0.e) jVar).getClass();
        com.tencent.mm.modelsimple.g1.J(x17, 5);
        if (this.f198580d.g() instanceof com.tencent.mm.ui.chatting.variants.ChattingMainUI) {
            return;
        }
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63517c = "";
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "[onChattingExitAnimStart]");
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        uIStatusChangedEvent.f54907g.f7378a = 3;
        uIStatusChangedEvent.e();
        java.lang.String x17 = this.f198580d.x();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.ch(this, x17));
        if (ih.d.c()) {
            com.tencent.matrix.lifecycle.owners.f0.f52742x.g(this.f198625g);
        }
        if (rq1.v.f398784a.a()) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.component.bh(this), "box.HotWordSearchModel");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(intent == null);
        objArr[2] = this.f198580d.x();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult requestCode:%d, data is null:%b  rawUserName:%s ", objArr);
        if (i17 != 211) {
            if (i17 != 213) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult: not found this requestCode");
                return;
            } else {
                if (intent != null && intent.getBooleanExtra("_delete_ok_", false)) {
                    this.f198580d.d();
                    return;
                }
                return;
            }
        }
        if (i18 == -1) {
            android.net.Uri data = intent.getData();
            yb5.d dVar = this.f198580d;
            android.database.Cursor managedQuery = dVar != null ? dVar.g().managedQuery(data, null, null, null, null) : null;
            if (managedQuery.moveToFirst()) {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.EDIT", android.net.Uri.parse("content://com.android.contacts/contacts/" + managedQuery.getString(managedQuery.getColumnIndexOrThrow("_id"))));
                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(baseChattingUIFragment, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/MessBoxComponent", "doActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseChattingUIFragment.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(baseChattingUIFragment, "com/tencent/mm/ui/chatting/component/MessBoxComponent", "doActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        boolean booleanValue = this.f198580d.f460717l.getBooleanExtra("key_is_temp_session", false).booleanValue();
        this.f198626h = booleanValue;
        if (booleanValue) {
            c01.d9.e().g(new com.tencent.mm.modelsimple.h0(this.f198580d.x(), this.f198580d.f460717l.getIntExtra("key_temp_session_scene", 5), this.f198580d.f460717l.getStringExtra("key_temp_session_from"), null, 0));
        }
        if (!this.f198580d.u().k2() || this.f198580d.u().r2()) {
            this.f198626h = false;
            return;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f198580d.x());
        if (p17 == null) {
            if (this.f198626h) {
                com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4(this.f198580d.x());
                l4Var.c2(4194304);
                l4Var.f2();
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).G(l4Var);
                return;
            }
            return;
        }
        if (p17.d2(4194304)) {
            this.f198626h = true;
            return;
        }
        if (p17.w0() < r01.q3.rj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "It is a old version temp session, Set attr flag(talker : %s), %s", this.f198580d.x(), java.lang.Boolean.valueOf(((com.tencent.mm.storage.m4) c01.d9.b().r()).Z(this.f198580d.x(), 4194304, true, p17.u0())));
            this.f198626h = true;
            return;
        }
        if (this.f198626h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "It is a temp session, Set attr flag(talker : %s), %s", this.f198580d.x(), java.lang.Boolean.valueOf(((com.tencent.mm.storage.m4) c01.d9.b().r()).Z(this.f198580d.x(), 4194304, true, p17.u0())));
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
            am.mz mzVar = uIStatusChangedEvent.f54907g;
            mzVar.f7378a = 5;
            mzVar.f7379b = this.f198580d.j();
            mzVar.f7380c = this.f198580d.o();
            mzVar.f7381d = this.f198580d.m();
            uIStatusChangedEvent.e();
        }
    }

    public void m0(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        int i17;
        rt0.b bVar;
        k01.q0 q0Var;
        java.util.Map d17;
        com.tencent.wechat.mm.brand_service.g0 c17;
        if (com.tencent.mm.storage.z3.F4(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "dealWithMsgDelete isSuperUserBrandEcsTemplateMsg %d %d %d", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.getCreateTime()), java.lang.Long.valueOf(f9Var.f193932l2));
            bw.j jVar = (bw.j) i95.n0.c(bw.j.class);
            long j17 = f9Var.f193932l2;
            ((zv.o0) jVar).getClass();
            if (zv.q.f476079a.g() && (c17 = yw.a3.f466266a.c()) != null) {
                c17.a(j17);
                return;
            }
            return;
        }
        if (f9Var.isVideo()) {
            java.lang.String z07 = f9Var.z0();
            synchronized (com.tencent.mm.pluginsdk.model.c3.f189250w) {
                com.tencent.mm.pluginsdk.model.b3 b3Var = (com.tencent.mm.pluginsdk.model.b3) com.tencent.mm.pluginsdk.model.c3.f189249v.remove(z07);
                com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "remove remuxing job, filename %s, ret %B", z07, java.lang.Boolean.valueOf(b3Var != null));
                if (b3Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImportMultiVideo", "cancel job after remove remuxing job, filename %s", z07);
                    d11.n nVar = b3Var.f189241x;
                    if (nVar != null) {
                        ((d11.d) nVar).f225657b.a();
                    }
                }
            }
        }
        java.lang.String str2 = f9Var.G;
        int i18 = c01.ia.f37254a;
        java.lang.String str3 = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "msgsource", null)) != null) {
            str3 = (java.lang.String) d17.get(".msgsource.weappsourceUsername");
        }
        if (te5.e2.c(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(str3) && (q0Var = (k01.q0) i95.n0.c(k01.q0.class)) != null) {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.w0 w0Var = (com.tencent.mm.plugin.appbrand.jsapi.chattool.w0) q0Var;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                if (str3 != null && str3.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WechatChatToolRoomsService", "saveChatToolRooms ignore: roomId is empty");
                } else {
                    com.tencent.mm.plugin.appbrand.jsapi.chattool.a aVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.a) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.jsapi.chattool.a.class);
                    if (aVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WechatChatToolRoomsService", "deleteChatToolRooms ignore: storage is null");
                    } else {
                        dm.y1 y1Var = new dm.y1();
                        y1Var.field_chatRoomsId = str3;
                        boolean delete = aVar.delete(y1Var, new java.lang.String[0]);
                        if (delete) {
                            kotlin.jvm.internal.m0.c(w0Var.f80475d).remove(str3);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WechatChatToolRoomsService", "deleteChatToolRooms roomId:" + str3 + " isOk:" + delete);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WechatChatToolRoomsService", "deleteChatToolRooms ignore: not main process");
            }
        }
        c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
        nc5.a.f336188a.b(f9Var, 0);
        if (f9Var.k2()) {
            i17 = ot0.u.a(f9Var);
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.tencent.mm.modelstat.e.f71505a.getClass();
        } else {
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.tencent.mm.modelstat.e.f71505a.getClass();
            i17 = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "delete msg, id:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
        if (!str.equals("medianote")) {
            ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
        }
        if (f9Var.P0() == 1 && f9Var.A0() == 1) {
            com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
            sendMsgFailEvent.f54753g.f7461a = f9Var;
            sendMsgFailEvent.e();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(f9Var.I0() + "");
        if (ez.v0.f257777a.j(java.lang.Integer.valueOf(i17)) && (bVar = (rt0.b) ot0.q.v(f9Var.U1()).y(rt0.b.class)) != null && bVar.f399372b != 0) {
            linkedList.add(bVar.f399372b + "");
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.MessBoxComponent", "add file overwritenewmsgid %s", java.lang.Long.valueOf(bVar.f399372b));
        }
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",");
        de0.j jVar2 = (de0.j) i95.n0.c(de0.j.class);
        java.lang.String Q0 = f9Var.Q0();
        ((ce0.e) jVar2).getClass();
        com.tencent.mm.modelsimple.g1.K(Q0, 9, "deleteMessages", c18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x041d  */
    /* JADX WARN: Type inference failed for: r18v3, types: [m11.j] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3, types: [int] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(com.tencent.mm.storage.f9 r27) {
        /*
            Method dump skipped, instructions count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.ah.n0(com.tencent.mm.storage.f9):void");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        h45.g0.f278945a = 6;
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        am.mz mzVar = uIStatusChangedEvent.f54907g;
        mzVar.f7378a = 0;
        yb5.d dVar = this.f198580d;
        if (dVar != null) {
            mzVar.f7381d = dVar.m();
            mzVar.f7379b = this.f198580d.j();
            mzVar.f7380c = this.f198580d.o();
        }
        uIStatusChangedEvent.e();
        com.tencent.mm.sdk.platformtools.c3.a("keep_chatting_silent".concat(this.f198580d.x()));
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b = this.f198580d.x();
        if (!(this.f198580d.g() instanceof com.tencent.mm.ui.chatting.variants.ChattingMainUI)) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63517c = this.f198580d.x();
        }
        com.tencent.mm.ui.vb.e();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        uIStatusChangedEvent.f54907g.f7378a = 1;
        uIStatusChangedEvent.e();
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b = "";
        if (!(this.f198580d.g() instanceof com.tencent.mm.ui.chatting.variants.ChattingMainUI)) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63517c = "";
        }
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        com.tencent.mm.sdk.platformtools.c3.b("keep_chatting_silent".concat(this.f198580d.x()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r0.f356750d.remove(r3);
        r0.h();
     */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.ah.z():void");
    }
}
