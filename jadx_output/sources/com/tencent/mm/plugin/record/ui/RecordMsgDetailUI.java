package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class RecordMsgDetailUI extends com.tencent.mm.plugin.record.ui.RecordMsgBaseUI {
    public static final /* synthetic */ int M = 0;
    public com.tencent.mm.plugin.record.ui.l2 G;
    public boolean H;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f155278w;

    /* renamed from: v, reason: collision with root package name */
    public r45.ul5 f155277v = null;

    /* renamed from: x, reason: collision with root package name */
    public long f155279x = -1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f155280y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f155281z = null;
    public boolean A = true;
    public boolean B = false;
    public java.lang.String C = "";
    public java.lang.String D = "";
    public java.lang.String E = "";
    public com.tencent.mm.ui.widget.dialog.u3 F = null;
    public final com.tencent.mm.plugin.record.ui.w I = new com.tencent.mm.plugin.record.ui.w(new java.lang.ref.WeakReference(this), new com.tencent.mm.sdk.coroutines.LifecycleScope("ForwardRecordMsgDataLogic", this, 1));

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f155276J = new com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);
    public final com.tencent.mm.modelcdntran.c1 K = new com.tencent.mm.modelcdntran.c1() { // from class: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$a
        @Override // com.tencent.mm.modelcdntran.c1
        public final void a(int i17, com.tencent.mm.modelcdntran.d1 d1Var) {
            int i18 = com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.M;
            com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI = com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.this;
            recordMsgDetailUI.getClass();
            if (d1Var.f70919o == recordMsgDetailUI.f155279x && i17 == 1) {
                com.tencent.mm.plugin.record.ui.h0 h0Var = recordMsgDetailUI.f155267n;
                h0Var.f155401g.post(h0Var.f155414w);
            }
        }
    };
    public final tt.j L = new com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$b(this);

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 477570721;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent revokeHistoryInjoinRoomMsgEvent) {
            com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent revokeHistoryInjoinRoomMsgEvent2 = revokeHistoryInjoinRoomMsgEvent;
            if (!(revokeHistoryInjoinRoomMsgEvent2 instanceof com.tencent.mm.autogen.events.RevokeHistoryInjoinRoomMsgEvent) || !com.tencent.mm.sdk.platformtools.t8.B0(revokeHistoryInjoinRoomMsgEvent2.f54712g.f6281a, com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.this.f155279x)) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgDetailUI", "msg(%s) history revoked", java.lang.Long.valueOf(com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.this.f155279x));
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.record.ui.m0(this));
            return true;
        }
    }

    public static void i7(com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI) {
        recordMsgDetailUI.getClass();
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f334118b = 1001;
        xd5.a aVar = new xd5.a();
        long j17 = recordMsgDetailUI.f155279x;
        int i17 = aVar.f43702d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(j17));
        aVar.set(i17 + 1, recordMsgDetailUI.f155278w.Q0());
        l15.c cVar = new l15.c();
        cVar.fromXml(recordMsgDetailUI.f155278w.U1());
        aVar.n(cVar);
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(recordMsgDetailUI, aVar, rVar);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public com.tencent.mm.plugin.record.ui.h0 a7() {
        if (getIntent().getIntExtra("from_scene", 0) == 3) {
            return new com.tencent.mm.plugin.record.ui.q(this, new com.tencent.mm.plugin.record.ui.r(this.I));
        }
        com.tencent.mm.plugin.record.ui.x xVar = new com.tencent.mm.plugin.record.ui.x(this, new com.tencent.mm.plugin.record.ui.z());
        xVar.f155597x = getIntent().getIntExtra("from_scene", 0);
        xVar.f155412u = getIntent().getStringExtra("msgUsername");
        xVar.f155398d = getIntent().getIntExtra("chatTypeForAppbrand", -1);
        xVar.f155399e = getIntent().getStringExtra("preChatName");
        java.lang.String stringExtra = getIntent().getStringExtra("serverMsgID");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("prePublishId");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                stringExtra = stringExtra2.replace("msg_", "");
            }
        }
        xVar.f155413v = stringExtra;
        return xVar;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String b7() {
        return this.E;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String c7() {
        return this.D;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public java.lang.String d7() {
        return this.C;
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void e7() {
        this.f155279x = getIntent().getLongExtra("message_id", -1L);
        this.f155280y = getIntent().getStringExtra("message_talker");
        this.f155281z = getIntent().getStringExtra("record_xml");
        this.A = getIntent().getBooleanExtra("record_show_share", true);
        this.B = getIntent().getBooleanExtra("big_appmsg", false);
        this.H = getIntent().getBooleanExtra("record_nest", false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("pre_username"))) {
            getIntent().getStringExtra("msgUsername");
        }
        getIntent().getStringExtra("serverMsgID");
        this.f155277v = bt3.g2.A(this.f155281z);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f155280y, this.f155279x);
        this.f155278w = Li;
        ot0.q v17 = ot0.q.v(Li.U1());
        if (v17 != null && this.f155277v == null) {
            this.f155277v = bt3.g2.A(v17.f348663h0);
        }
        r45.ul5 ul5Var = this.f155277v;
        if (ul5Var != null) {
            if (j7(ul5Var) != null) {
                this.C = j7(this.f155277v);
            } else {
                this.C = this.f155277v.f387463d;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(this.f155277v.f387465f)) {
                this.D = ((r45.gp0) this.f155277v.f387465f.getFirst()).M1;
                this.E = ((r45.gp0) this.f155277v.f387465f.getLast()).M1;
            }
        } else if (this.f155278w != null && v17 != null) {
            this.C = v17.f348654f;
            this.F = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), true, 0, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgDetailUI", "loading");
        }
        r45.ul5 ul5Var2 = this.f155277v;
        if (ul5Var2 != null) {
            com.tencent.mm.plugin.record.ui.w wVar = this.I;
            wVar.getClass();
            pm0.v.O("ForwardRecordMsgDataLogic", new com.tencent.mm.plugin.record.ui.v(ul5Var2, true, wVar));
            k7();
            return;
        }
        g7();
        setBackBtn(new com.tencent.mm.plugin.record.ui.n0(this));
        if (!this.B || com.tencent.mm.pluginsdk.model.app.u5.wi().J0(this.f155279x, this.f155278w.Q0()) == null) {
            return;
        }
        com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(this.f155280y, this.f155279x);
        c01.d9.e().g(new bt3.l0(this.f155279x, Li2.Q0(), Li2.I0(), v17 != null ? v17.f348666i : 0, new com.tencent.mm.plugin.record.ui.o0(this), true));
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void f7(int i17, int i18, android.content.Intent intent) {
        if (-1 != i18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgDetailUI", "processResult %d", java.lang.Integer.valueOf(i18));
            return;
        }
        if (1001 != i17) {
            if (1002 == i17 && intent.getBooleanExtra("kfavorite", false)) {
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                com.tencent.mm.pluginsdk.model.a2.l(doFavoriteEvent, intent);
                am.c4 c4Var = doFavoriteEvent.f54090g;
                c4Var.f6323i = this;
                c4Var.f6327m = 8;
                doFavoriteEvent.e();
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but toUser is null");
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f155280y, this.f155279x);
        if (Li.getMsgId() != this.f155279x) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but message info is null");
        } else {
            gm0.j1.e().j(new com.tencent.mm.plugin.record.ui.v0(this, stringExtra, stringExtra2, Li, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null)));
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
    public void h7() {
        boolean booleanExtra = getIntent().getBooleanExtra("show_jump_chat", false);
        if (this.A || booleanExtra) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.record.ui.t0(this, booleanExtra));
        }
    }

    public final java.lang.String j7(r45.ul5 ul5Var) {
        java.lang.String str = null;
        if (ul5Var == null) {
            return null;
        }
        java.util.Iterator it = ul5Var.f387465f.iterator();
        java.lang.String str2 = null;
        boolean z17 = false;
        java.lang.String str3 = null;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            r45.ip0 ip0Var = gp0Var.J1.f376353d;
            if (ip0Var.f377237o != null) {
                str2 = getContext().getString(com.tencent.mm.R.string.hsy);
                z17 = true;
            } else if (ip0Var.f377231f != null) {
                if (str == null) {
                    str = gp0Var.K1;
                } else {
                    java.lang.String str4 = gp0Var.K1;
                    if (str != str4) {
                        str3 = str4;
                    }
                }
            }
        }
        return (str == null || str3 != null || z17) ? (str == null || str3 == null || str.equals(str3) || z17) ? str2 : getContext().getString(com.tencent.mm.R.string.f491208cc5, str, str3) : getContext().getString(com.tencent.mm.R.string.cc6, str);
    }

    public void k7() {
        com.tencent.mm.plugin.record.ui.y yVar = new com.tencent.mm.plugin.record.ui.y();
        r45.ul5 ul5Var = this.f155277v;
        if (ul5Var != null) {
            yVar.f155342a = ul5Var.f387465f;
        }
        yVar.f155603c = this.f155279x;
        yVar.f155606f = this.f155280y;
        yVar.f155604d = this.f155278w;
        yVar.f155605e = this.f155281z;
        yVar.f155343b = new bt3.g3();
        com.tencent.mm.storage.f9 f9Var = this.f155278w;
        if (f9Var != null && !this.H && f9Var.W0() != null) {
            try {
                yVar.f155343b.parseFrom(this.f155278w.W0().getBytes(java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecordMsgDetailUI", e17, "", new java.lang.Object[0]);
            }
        }
        super.e7();
        this.f155267n.h(yVar);
        com.tencent.mm.plugin.record.ui.l2 l2Var = new com.tencent.mm.plugin.record.ui.l2(this, this.f155267n, yVar);
        this.G = l2Var;
        com.tencent.mm.plugin.record.ui.h0 h0Var = this.f155267n;
        h0Var.f155410s = l2Var;
        if (h0Var instanceof com.tencent.mm.plugin.record.ui.x) {
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).y0((com.tencent.mm.plugin.record.ui.x) this.f155267n);
        }
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).wi(this.K);
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155276J.alive();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.RecordMsgDetailUI);
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        tt.j listener = this.L;
        ((ot.w) l0Var).getClass();
        kotlin.jvm.internal.o.g(listener, "listener");
        jz5.g gVar = ot.w.f348340m;
        ((java.util.HashSet) ((jz5.n) ot.w.f348340m).getValue()).add(new d75.c(listener));
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.storage.f9 f9Var;
        super.onDestroy();
        this.f155276J.dead();
        if (this.f155267n instanceof com.tencent.mm.plugin.record.ui.x) {
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0((com.tencent.mm.plugin.record.ui.x) this.f155267n);
        }
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(this.K);
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).getClass();
        com.tencent.mm.modelcdntran.b1 bj6 = com.tencent.mm.modelcdntran.s1.bj();
        if (bj6 != null) {
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) bj6.f70888h).getValue(), null, new com.tencent.mm.modelcdntran.u0(bj6, null), 1, null);
        }
        pt.l0 l0Var = (pt.l0) i95.n0.c(pt.l0.class);
        tt.j listener = this.L;
        ((ot.w) l0Var).getClass();
        kotlin.jvm.internal.o.g(listener, "listener");
        jz5.g gVar = ot.w.f348340m;
        ((java.util.HashSet) ((jz5.n) ot.w.f348340m).getValue()).remove(new d75.c(listener));
        com.tencent.mm.plugin.record.ui.l2 l2Var = this.G;
        if (l2Var != null) {
            byte[] e17 = l2Var.e();
            if (this.H || (f9Var = this.f155278w) == null || e17 == null || e17.length <= 0) {
                return;
            }
            f9Var.D1(new java.lang.String(e17, java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(this.f155279x, this.f155278w);
        }
    }

    @Override // com.tencent.mm.plugin.record.ui.RecordMsgBaseUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.record.ui.l2 l2Var = this.G;
        if (l2Var != null) {
            l2Var.f155445d = false;
        }
    }
}
