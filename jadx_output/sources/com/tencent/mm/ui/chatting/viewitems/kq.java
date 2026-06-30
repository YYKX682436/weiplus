package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes11.dex */
public class kq extends com.tencent.mm.ui.chatting.b6 {
    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        boolean g17 = ip.l.g(f9Var.j());
        int i17 = com.tencent.mm.R.string.aqg;
        yb5.d dVar2 = this.f198492d;
        if (g17) {
            if (!iq.b.v(dVar2.g())) {
                iq.b.s(dVar2.g());
                if (!iq.b.e(dVar2.g()) && !iq.b.m(dVar2.g(), true, null) && !iq.b.n(dVar2.g(), true) && !iq.b.q(dVar2.g(), true)) {
                    com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
                    voipCheckIsDeviceUsingEvent.e();
                    java.lang.String Q0 = erVar.c().Q0();
                    am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
                    if (Q0.equals(w00Var.f8248d) || !(w00Var.f8246b || w00Var.f8247c)) {
                        com.tencent.mm.autogen.events.TalkRoomServerEvent talkRoomServerEvent = new com.tencent.mm.autogen.events.TalkRoomServerEvent();
                        talkRoomServerEvent.f54883g.f7583a = true;
                        talkRoomServerEvent.e();
                        if (x51.t1.b(talkRoomServerEvent.f54884h.f7671a)) {
                            b(erVar);
                        } else {
                            db5.e1.A(dVar2.g(), dVar2.g().getString(com.tencent.mm.R.string.joc), "", dVar2.g().getString(com.tencent.mm.R.string.f490507x1), dVar2.g().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.chatting.viewitems.iq(this, erVar), new com.tencent.mm.ui.chatting.viewitems.jq(this));
                        }
                    } else {
                        if (!w00Var.f8245a) {
                            i17 = com.tencent.mm.R.string.aqh;
                        }
                        dp.a.makeText(dVar2.g(), i17, 0).show();
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoipClickListener", "voip is running, can't do this");
                    }
                }
            }
        } else if (ip.l.h(f9Var.j()) && !iq.b.v(dVar2.g())) {
            iq.b.s(dVar2.g());
            if (!iq.b.e(dVar2.g()) && !iq.b.l(dVar2.g(), true) && !iq.b.q(dVar2.g(), true)) {
                com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent2 = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
                voipCheckIsDeviceUsingEvent2.e();
                java.lang.String Q02 = erVar.c().Q0();
                am.w00 w00Var2 = voipCheckIsDeviceUsingEvent2.f54943g;
                if (Q02.equals(w00Var2.f8248d) || !(w00Var2.f8246b || w00Var2.f8247c)) {
                    erVar.c().r1(6);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(erVar.c().getMsgId(), erVar.c());
                    com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar2.f460708c.a(sb5.s0.class));
                    jbVar.getClass();
                    try {
                        if (jbVar.f199263e.K0()) {
                            jbVar.f199263e.setBottomPanelVisibility(8);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
                    am.y00 y00Var = voipEvent.f54945g;
                    y00Var.f8415b = 5;
                    y00Var.f8418e = erVar.c().Q0();
                    y00Var.f8417d = dVar2.g();
                    y00Var.f8419f = 4;
                    voipEvent.e();
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = 3;
                    objArr[1] = 2;
                    objArr[2] = java.lang.Integer.valueOf((erVar.c().G == null || erVar.c().G.length() <= 0) ? 1 : 3);
                    long msgId = erVar.c().getMsgId();
                    com.tencent.mm.plugin.voip.model.j0 j0Var = com.tencent.mm.plugin.voip.model.j0.f176682a;
                    p75.i0 i18 = dm.sb.f239930y.i();
                    i18.f352657d = dm.sb.B.i(java.lang.Long.valueOf(msgId));
                    i18.f352656c = "MicroMsg.SDK.BaseVoIPBubbleInfo";
                    dm.sb i19 = j0Var.i(i18.a());
                    java.lang.Long valueOf = i19 != null ? java.lang.Long.valueOf(i19.Q0()) : null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "getRoomIdByMsgId: msgId " + msgId);
                    objArr[3] = java.lang.Long.valueOf(valueOf != null ? valueOf.longValue() : 0L);
                    g0Var.d(11033, objArr);
                } else {
                    if (!w00Var2.f8245a) {
                        i17 = com.tencent.mm.R.string.aqh;
                    }
                    dp.a.makeText(dVar2.g(), i17, 0).show();
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoipClickListener", "voip is running, can't do this");
                }
            }
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
    }

    public final void b(com.tencent.mm.ui.chatting.viewitems.er erVar) {
        erVar.c().r1(6);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(erVar.c().getMsgId(), erVar.c());
        yb5.d dVar = this.f198492d;
        com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class));
        jbVar.getClass();
        try {
            if (jbVar.f199263e.K0()) {
                jbVar.f199263e.setBottomPanelVisibility(8);
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        am.y00 y00Var = voipEvent.f54945g;
        y00Var.f8415b = 5;
        y00Var.f8418e = erVar.c().Q0();
        y00Var.f8417d = dVar.g();
        y00Var.f8419f = 2;
        voipEvent.e();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = 3;
        objArr[1] = 1;
        objArr[2] = java.lang.Integer.valueOf((erVar.c().G == null || erVar.c().G.length() <= 0) ? 1 : 3);
        g0Var.d(11033, objArr);
    }
}
