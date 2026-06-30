package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.x0.class)
/* loaded from: classes11.dex */
public class le extends com.tencent.mm.ui.chatting.component.a implements sb5.x0 {
    public static final java.lang.Long G = 604800000L;
    public final com.tencent.mm.sdk.event.IListener D;
    public final android.view.View.OnClickListener E;
    public final java.lang.Runnable F;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199413e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f199414f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.core.widget.NestedScrollView f199415g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f199416h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f199417i;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f199418m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f199419n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f199420o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f199421p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f199422q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f199423r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f199424s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.g0 f199425t;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.ke f199427v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.ke f199428w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Thread f199429x;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f199426u = null;

    /* renamed from: y, reason: collision with root package name */
    public rn.h f199430y = null;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f199431z = new java.util.ArrayList();
    public boolean A = false;
    public final com.tencent.mm.ui.chatting.component.ee B = new com.tencent.mm.ui.chatting.component.wd(this);
    public final com.tencent.mm.ui.chatting.component.ee C = new com.tencent.mm.ui.chatting.component.xd(this);

    public le() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyGroupToolsEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.GroupToolsComponet$3
            {
                this.__eventId = -1721696603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyGroupToolsEvent notifyGroupToolsEvent) {
                com.tencent.mm.autogen.events.NotifyGroupToolsEvent notifyGroupToolsEvent2 = notifyGroupToolsEvent;
                if (notifyGroupToolsEvent2 != null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    am.rl rlVar = notifyGroupToolsEvent2.f54546g;
                    java.lang.String str = rlVar.f7825a;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "NotifyGroupToolsEvent %s", objArr);
                    com.tencent.mm.ui.chatting.component.le leVar = com.tencent.mm.ui.chatting.component.le.this;
                    if (com.tencent.mm.sdk.platformtools.t8.D0(leVar.f198580d.x(), rlVar.f7825a)) {
                        com.tencent.mm.ui.chatting.view.g0 g0Var = leVar.f199425t;
                        if (g0Var != null) {
                            g0Var.b();
                        }
                        leVar.q0(true);
                    }
                }
                return true;
            }
        };
        this.E = new com.tencent.mm.ui.chatting.component.yd(this);
        this.F = new com.tencent.mm.ui.chatting.component.sd(this);
    }

    public static void m0(com.tencent.mm.ui.chatting.component.le leVar) {
        if (com.tencent.mm.storage.z3.n4(leVar.f198580d.x())) {
            db5.e1.E(leVar.f198580d.g(), leVar.f198580d.g().getString(com.tencent.mm.R.string.ftc), "", leVar.f198580d.g().getString(com.tencent.mm.R.string.l_e), false, new com.tencent.mm.ui.chatting.component.td(leVar));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(leVar.f198580d.g(), "com.tencent.mm.plugin.aa.ui.LaunchAAUI");
        intent.putExtra("enter_scene", 7);
        intent.putExtra("chatroom_name", leVar.f198580d.x());
        android.app.Activity g17 = leVar.f198580d.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "gotoAAPay", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "gotoAAPay", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void n0(com.tencent.mm.ui.chatting.component.le leVar) {
        leVar.getClass();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(leVar.f198580d.g());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "gotoRoomLiveEntrance");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity g17 = leVar.f198580d.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 25, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), leVar.f198580d.g());
        if (a17) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g18 = leVar.f198580d.g();
            ((sb0.f) jVar2).getClass();
            boolean a18 = j35.u.a(g18, "android.permission.RECORD_AUDIO", 25, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.tencent.mm.sdk.platformtools.z3(), leVar.f198580d.g());
            if (!a18 || iq.b.g(leVar.f198580d.g()) || iq.b.C(leVar.f198580d.g()) || iq.b.v(leVar.f198580d.g()) || iq.b.e(leVar.f198580d.g()) || gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_MODE_INT_SYNC, 0) != 1) {
                return;
            }
            android.app.Activity g19 = leVar.f198580d.g();
            android.view.LayoutInflater.from(g19);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) g19, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.tencent.mm.ui.chatting.component.ud udVar = new com.tencent.mm.ui.chatting.component.ud(leVar, g19);
            com.tencent.mm.ui.chatting.component.vd vdVar = new com.tencent.mm.ui.chatting.component.vd(leVar);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f228381y = null;
                h4Var.f228382z = null;
            }
            arrayList.clear();
            db5.g4 g4Var = new db5.g4(g19);
            udVar.onCreateMMMenu(g4Var);
            if (g4Var.z()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                return;
            }
            k0Var.f211872n = udVar;
            k0Var.f211881s = vdVar;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
    }

    public static void o0(com.tencent.mm.ui.chatting.component.le leVar, com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem, java.lang.String str, boolean z17) {
        leVar.getClass();
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = groupToolItem.f63682d;
        if (z17) {
            b1Var.f317022f = groupToolItem.f63683e;
        } else {
            b1Var.f317022f = "";
        }
        b1Var.f317032k = me1.a.CTRL_INDEX;
        b1Var.f317042t = leVar.f198580d.x();
        b1Var.f317043u = leVar.f198580d.x();
        b1Var.f317034l = str;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(leVar.f198580d.g(), b1Var);
    }

    public static void p0(com.tencent.mm.ui.chatting.component.le leVar, com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem, boolean z17) {
        java.lang.String str;
        leVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomaa@app.origin")) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ftd);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomlive@app.origin")) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490401ty);
        } else {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(groupToolItem.f63682d);
            str = Bi == null ? "" : Bi.field_nickname;
        }
        java.lang.String x17 = leVar.f198580d.x();
        java.lang.String str2 = groupToolItem.f63682d;
        int i17 = c01.e2.T(x17) ? 2 : c01.e2.V(x17) ? 1 : 0;
        com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct chatRoomToolPanelOperateLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatRoomToolPanelOperateLogStruct();
        chatRoomToolPanelOperateLogStruct.f55653d = chatRoomToolPanelOperateLogStruct.b("roomusrname", x17, true);
        chatRoomToolPanelOperateLogStruct.f55654e = 2L;
        chatRoomToolPanelOperateLogStruct.f55657h = i17;
        chatRoomToolPanelOperateLogStruct.f55658i = chatRoomToolPanelOperateLogStruct.b("appid", str2, true);
        chatRoomToolPanelOperateLogStruct.f55659j = chatRoomToolPanelOperateLogStruct.b("appname", str, true);
        chatRoomToolPanelOperateLogStruct.f55660k = z17 ? 1L : 0L;
        chatRoomToolPanelOperateLogStruct.k();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        java.lang.String x17 = this.f198580d.x();
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            this.A = false;
        } else if (com.tencent.mm.storage.z3.N4(x17) && c01.e2.V(x17)) {
            this.A = true;
        } else {
            this.A = false;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        android.view.View view = this.f199413e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingExitAnimStart");
        this.D.dead();
    }

    public final void q0(boolean z17) {
        rn.h y07 = ((nn.j) i95.n0.c(nn.j.class)).Di().y0(this.f198580d.x());
        this.f199430y = y07;
        if (y07 == null) {
            rn.h hVar = new rn.h();
            hVar.field_chatroomname = this.f198580d.x();
            boolean insert = ((nn.j) i95.n0.c(nn.j.class)).Di().insert(hVar);
            if (insert) {
                this.f199430y = ((nn.j) i95.n0.c(nn.j.class)).Di().y0(this.f198580d.x());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "getGroupTools insert GroupTools: result(%s)", java.lang.Boolean.valueOf(insert));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "getGroupTools start:%s queryRecentUse:%s state:%s", this.f198580d.x(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f199430y.field_queryState));
        if (z17) {
            if (this.f199430y.field_queryState == 1) {
                java.util.ArrayList arrayList = this.f199431z;
                arrayList.clear();
                arrayList.addAll(this.f199430y.f397605u);
                java.util.Collections.sort(arrayList, new com.tencent.mm.ui.chatting.component.nd(this));
                r0();
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.chatting.component.od(this), 5000L);
            java.lang.Thread thread = new java.lang.Thread(this.F);
            this.f199429x = thread;
            thread.start();
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.chatting.component.pd(this), 200L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0386 A[LOOP:0: B:52:0x037d->B:54:0x0386, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a4 A[LOOP:1: B:57:0x039e->B:59:0x03a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.le.r0():void");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingResume");
        this.D.dead();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingPause");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingEnterAnimStart: user %s hashCode:%s", this.f198580d.x(), java.lang.Integer.valueOf(hashCode()));
    }
}
