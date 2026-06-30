package kw3;

@j95.b
/* loaded from: classes9.dex */
public class p extends i95.w implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.model.t1 f313134d = null;

    /* renamed from: e, reason: collision with root package name */
    public rw3.b f313135e = null;

    /* renamed from: f, reason: collision with root package name */
    public rw3.d f313136f = null;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f313137g;

    static {
        com.tencent.mm.wallet_core.a.h("RemittanceProcess", kw3.i.class);
    }

    public p() {
        this.f313137g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.conversation.RepairerConfigConvMultiRedHint()) == 1;
    }

    public static kw3.p Ai() {
        return (kw3.p) i95.n0.c(kw3.p.class);
    }

    public static void Ui(android.content.Context context, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(context.getString(z17 ? com.tencent.mm.R.string.i0a : com.tencent.mm.R.string.i0_));
        u1Var.k(context.getResources().getColor(com.tencent.mm.R.color.aaq));
        u1Var.m(com.tencent.mm.R.string.f492294fz1);
        u1Var.l(new kw3.m());
        u1Var.q(false);
    }

    public rw3.b Bi() {
        if (Ai().f313135e == null) {
            kw3.p Ai = Ai();
            gm0.j1.i();
            Ai.f313135e = new rw3.b(gm0.j1.u().f273153f);
        }
        return Ai().f313135e;
    }

    public com.tencent.mm.plugin.remittance.model.t1 Di() {
        if (this.f313134d == null) {
            this.f313134d = new com.tencent.mm.plugin.remittance.model.t1();
        }
        return this.f313134d;
    }

    public rw3.d Ni() {
        if (Ai().f313136f == null) {
            kw3.p Ai = Ai();
            gm0.j1.i();
            Ai.f313136f = new rw3.d(gm0.j1.u().f273153f);
        }
        return Ai().f313136f;
    }

    public boolean Ri(java.lang.String str) {
        int i17;
        int i18;
        rw3.d Ni = Ni();
        Ni.getClass();
        java.util.ArrayList arrayList = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                android.database.Cursor D = Ni.f400647d.D("RemittanceRecord", rw3.d.f400645f, "talker=?", new java.lang.String[]{str}, null, null, null, 2);
                try {
                    if (D.moveToFirst()) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        do {
                            rw3.c cVar = new rw3.c();
                            cVar.convertFrom(D);
                            arrayList2.add(cVar);
                        } while (D.moveToNext());
                        D.close();
                        D.close();
                        arrayList = arrayList2;
                    } else {
                        D.close();
                        D.close();
                    }
                } finally {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", e17, "getRecordByTransferId error: %s", e17.getMessage());
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        boolean z17 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rw3.c cVar2 = (rw3.c) it.next();
                if (c01.z1.r().equals(cVar2.field_receiverName)) {
                    long c17 = (cVar2.field_invalidtime * 1000) - c01.id.c();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "remittance status: %s, %s, %s", java.lang.Integer.valueOf(cVar2.field_receiveStatus), java.lang.Long.valueOf(cVar2.field_locaMsgId), cVar2.field_talker);
                    if (c17 < 0 && ((i18 = cVar2.field_receiveStatus) == 1 || i18 == 21 || i18 == 7 || i18 == 27)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "timeout, change status");
                        cVar2.field_receiveStatus = 2;
                        Ni().replace(cVar2);
                    } else if (c17 >= 0 && ((i17 = cVar2.field_receiveStatus) == 1 || i17 == 21 || i17 == 7 || i17 == 27)) {
                        com.tencent.mm.storage.f9 Li = pt0.f0.Li(cVar2.field_talker, cVar2.field_locaMsgId);
                        if (Li.getMsgId() > 0 && (Li.F & 4) != 4 && Li.getType() != 10000 && Li.getType() != 268445456) {
                            arrayList3.add(Li);
                            if (!this.f313137g) {
                                z17 = true;
                                break;
                            }
                            z17 = true;
                        } else if (Li.getType() == 10000 || (Li.F & 4) == 4) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "is revoke msg");
                        }
                    }
                }
            }
        }
        g95.u.m(arrayList3, str, 3, 2);
        return z17;
    }

    public void Vi(java.lang.String str, com.tencent.mm.storage.f9 f9Var, rw3.c cVar) {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_update_remittace_conversation_flag, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "clicfg_android_update_remittance_conversation_flag is %s", java.lang.Boolean.valueOf(z17));
        if (!z17) {
            ((ku5.t0) ku5.t0.f312615d).h(new kw3.n(this, str), "update_remit_red_flag");
            return;
        }
        boolean Ri = Ri(str);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        if (p17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "update red flag: %s, %s", str, java.lang.Boolean.valueOf(Ri));
            p17.U1(Ri ? 1 : 0);
            if (f9Var == null && cVar != null) {
                f9Var = pt0.f0.Li(cVar.field_talker, cVar.field_locaMsgId);
            }
            if (f9Var == null || f9Var.getMsgId() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "msgInfo has delete，can notsetFlag ");
            } else {
                p17.z1(xg3.b.b(p17, 1, f9Var.getCreateTime()));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "update ret: %s", java.lang.Integer.valueOf(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str, false, true)));
        }
    }

    public final void Zi(java.lang.String str, long j17) {
        rw3.c z07 = Ni().z0(str);
        if (z07 != null) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(z07.field_talker, z07.field_locaMsgId);
            if (Li.getMsgId() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "has delete msg");
                return;
            }
            Li.o1(j17);
            pt0.f0.f358209b1.s(Li.Q0(), Li.getMsgId(), Li);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mm.app.w.INSTANCE.a(this);
        ((ku5.t0) ku5.t0.f312615d).k(new kw3.l(this), 12000L);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mm.app.w.INSTANCE.p(this);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new kw3.o(this), "check_remit_red_flag_background");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }

    public boolean wi(com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent jsApiOpenC2CTransferMsgViewEvent, boolean z17) {
        android.database.Cursor B;
        com.tencent.mm.storage.f9 f9Var;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jsApiOpenC2CTransferMsgViewEvent.f54447g.f8284c)) {
            am.wh whVar = jsApiOpenC2CTransferMsgViewEvent.f54447g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(whVar.f8283b)) {
                boolean z18 = c01.e2.J(whVar.f8284c) || com.tencent.mm.storage.z3.N4(whVar.f8284c);
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, isContact: %s, createTime: %s", java.lang.Boolean.valueOf(z18), whVar.f8285d);
                android.content.Context context = whVar.f8282a;
                if (context == null) {
                    context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                if (!z18) {
                    Ui(context, true);
                    return false;
                }
                java.lang.Long l17 = whVar.f8285d;
                if (l17.longValue() < 10000000000L) {
                    l17 = java.lang.Long.valueOf((whVar.f8285d.longValue() * 1000) - 1000);
                }
                final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                final java.lang.String str = whVar.f8284c;
                final long longValue = l17.longValue();
                final java.lang.String X8 = cj6.X8(str);
                cj6.Z8(str);
                if (cj6.Da(X8)) {
                    B = ot0.c3.l().c("getCursorAfterCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$h0
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            return ot0.z2.f348822a.L(com.tencent.mm.storage.g9.this.f193989r, X8, str, longValue);
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$s0
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                            g9Var.getClass();
                            return g9Var.f193989r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND createTime > " + longValue + " ORDER BY createTime ASC ", null);
                        }
                    });
                } else if (cj6.Pb(X8)) {
                    B = ot0.z2.f348822a.L(cj6.f193989r, X8, str, longValue);
                } else {
                    B = cj6.f193989r.B("SELECT * FROM " + X8 + " WHERE" + cj6.Z8(str) + "AND createTime > " + longValue + " ORDER BY createTime ASC ", null);
                }
                int i17 = 0;
                while (B.moveToNext() && i17 < 50) {
                    i17++;
                    f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(B);
                    ot0.q v17 = ot0.q.v(f9Var.U1());
                    if (v17 != null && whVar.f8283b.equals(v17.L0)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, found local msg, createTime: %s", whVar.f8285d);
                        break;
                    }
                }
                f9Var = null;
                B.close();
                if (f9Var != null && f9Var.getMsgId() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, localMsgId: %s, createTime: %s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.getCreateTime()));
                    j45.l.u(context, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", whVar.f8284c).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", f9Var.getMsgId()).putExtra("need_hight_item", true), null);
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "handle JsApiOpenC2CTransferMsgViewEvent, cannot find local msg");
                if (z17) {
                    Ui(context, false);
                }
                return false;
            }
        }
        return false;
    }
}
