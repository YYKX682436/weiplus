package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.i.class)
/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.ui.chatting.component.a implements sb5.i, xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f199329e = true;

    /* renamed from: f, reason: collision with root package name */
    public final vh0.m1 f199330f = new com.tencent.mm.ui.chatting.component.m0(this);

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f199331g = new com.tencent.mm.ui.chatting.component.n0(this);

    /* renamed from: h, reason: collision with root package name */
    public long f199332h = 0;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        this.f198580d.f460717l.removeOptionMenu(5);
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        if (n1Var != null) {
            vh0.m1 listener = this.f199330f;
            kotlin.jvm.internal.o.g(listener, "listener");
            ((vh0.f3) n1Var).f436861h.remove(listener);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
    }

    @Override // yn.d
    public void O() {
        if (com.tencent.mm.storage.z3.L3(this.f198580d.x())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", this.f198580d.x());
            hashMap.put("enter_sessionid", this.f198580d.f460722q);
            hashMap.put("enter_type", java.lang.Integer.valueOf(this.f198580d.k()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_chat_close", "view_clk", hashMap, 34004);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        if (com.tencent.mm.storage.z3.L3(this.f198580d.x())) {
            final android.app.Activity context = this.f198580d.g();
            final int intExtra = this.f198580d.n().getIntExtra("chat_from_scene", 0);
            final vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
            switch (intExtra) {
                case 12:
                case 14:
                case 15:
                case 16:
                    java.lang.String x17 = this.f198580d.x();
                    com.tencent.mm.ui.chatting.component.o0 o0Var = new com.tencent.mm.ui.chatting.component.o0(this);
                    ((vh0.f3) n1Var).getClass();
                    kotlin.jvm.internal.o.g(context, "context");
                    if (!com.tencent.mm.app.c6.MATCH_MM.matches(context)) {
                        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, j3.f.a(new jz5.l("chatbotUsername", x17)), vh0.c3.class, null);
                        break;
                    } else {
                        vh0.f3.mj(o0Var, x17);
                        break;
                    }
            }
            if ((this.f198580d.l() != null) == true) {
                ((vh0.f3) n1Var).Vi(context, intExtra, this.f198580d.x());
            } else {
                int k17 = this.f198580d.k();
                yb5.d dVar = this.f198580d;
                ((vh0.f3) n1Var).bj(context, dVar.x(), vh0.l2.a(k17), dVar.f460722q, new vh0.i1() { // from class: com.tencent.mm.ui.chatting.component.k0$$a
                    @Override // vh0.i1
                    public final void onResult(java.lang.Object obj) {
                        com.tencent.mm.ui.chatting.component.k0 k0Var = com.tencent.mm.ui.chatting.component.k0.this;
                        k0Var.getClass();
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            k0Var.f198580d.d();
                        } else {
                            ((vh0.f3) n1Var).Vi(context, intExtra, k0Var.f198580d.x());
                        }
                    }
                });
            }
            int k18 = this.f198580d.k();
            java.lang.String str = this.f198580d.f460722q;
            java.util.HashMap hashMap = new java.util.HashMap();
            iy1.c cVar = iy1.c.MainUI;
            hashMap.put("page_id", 50175);
            hashMap.put("page_name", "chatting_yuanbao_single");
            hashMap.put("chat_name", this.f198580d.x());
            hashMap.put("enter_sessionid", str);
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k18)));
            hashMap.put("if_friend", java.lang.Integer.valueOf(this.f198580d.u().r2() ? 1 : 0));
            hashMap.put("screen_mode", java.lang.Integer.valueOf((this.f198580d.l() != null ? 1 : 0) ^ 1));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("session_in", hashMap, 34004);
        }
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        int i17;
        if (this.f198580d.u() == null || !com.tencent.mm.storage.z3.L3(this.f198580d.u().d1()) || !this.f198580d.u().d1().equals("wxid_wi_1d142z0zdj03") || m0Var == null || l0Var == null || l0Var.f454410a == null || (arrayList = l0Var.f454412c) == null || arrayList.isEmpty()) {
            return;
        }
        java.lang.String str = l0Var.f454411b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotComponent", "notifyInfo.func = %s", str);
        int i18 = 2;
        int i19 = 1;
        if ("insert".equals(str) || "update".equals(str)) {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                int A0 = f9Var.A0();
                if (A0 != 0) {
                    if (A0 == i19 && f9Var.P0() == i18 && f9Var.T0() != null && com.tencent.mm.storage.z3.L3(f9Var.T0()) && f9Var.T0().equals(this.f198580d.x())) {
                        i17++;
                        int k17 = this.f198580d.k();
                        java.lang.String str2 = this.f198580d.f460722q;
                        ot0.q v17 = ot0.q.v(f9Var.j());
                        int i27 = v17 == null ? 0 : v17.f348666i;
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("chat_name", this.f198580d.x());
                        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
                        hashMap.put("enter_sessionid", str2);
                        hashMap.put("msgid", java.lang.Long.valueOf(f9Var.I0()));
                        hashMap.put("msgtype", java.lang.Integer.valueOf(f9Var.getType()));
                        hashMap.put("submsgtype", java.lang.Integer.valueOf(i27));
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("send_msg", hashMap, 34003);
                    }
                } else if (com.tencent.mm.storage.z3.L3(f9Var.y0())) {
                    i17--;
                    int k18 = this.f198580d.k();
                    java.lang.String str3 = this.f198580d.f460722q;
                    ot0.q v18 = ot0.q.v(f9Var.j());
                    int i28 = v18 == null ? 0 : v18.f348666i;
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("chat_name", this.f198580d.x());
                    hashMap2.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k18)));
                    hashMap2.put("enter_sessionid", str3);
                    hashMap2.put("msgid", java.lang.Long.valueOf(f9Var.I0()));
                    hashMap2.put("msgtype", java.lang.Integer.valueOf(f9Var.getType()));
                    hashMap2.put("submsgtype", java.lang.Integer.valueOf(i28));
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("receive_msg", hashMap2, 34003);
                }
                i18 = 2;
                i19 = 1;
            }
        } else {
            i17 = 0;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f199331g;
        n3Var.removeMessages(1);
        if (i17 <= 0) {
            n3Var.removeMessages(2);
            n3Var.removeMessages(1);
            m0(false);
            return;
        }
        ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).getClass();
        int i29 = 30;
        try {
            i29 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("TypingDurationSecond", 30);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotConfigService", th6, "[-] Fail to get dynamic config.", new java.lang.Object[0]);
        }
        n3Var.sendEmptyMessageDelayed(1, i29 * 1000);
        n3Var.sendEmptyMessageDelayed(2, 200L);
    }

    @Override // yn.d
    public boolean d0(int i17, android.view.KeyEvent keyEvent) {
        yb5.d dVar;
        if (i17 == 4 && (dVar = this.f198580d) != null && "wxid_wi_1d142z0zdj03".equals(dVar.x())) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_chat_left_slide_close", "view_clk", bm5.i0.a(new java.util.HashMap(16), new m3.d("chat_name", dVar.x()), new m3.d("enter_sessionid", dVar.f460722q), new m3.d("enter_type", java.lang.Integer.valueOf(vh0.l2.a(dVar.k())))), 34004);
        }
        return false;
    }

    public final void m0(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotComponent", "resetChattingTitle, isOverTime = %s, tick = %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(this.f199332h));
        ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) this.f198580d.f460708c.a(sb5.z0.class))).C();
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatBotComponent", "Unexpected thread, report may be wrong!");
        }
        if (this.f199332h == 0) {
            return;
        }
        this.f199332h = 0L;
        int k17 = this.f198580d.k();
        java.lang.String str = this.f198580d.f460722q;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", this.f198580d.x());
        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
        hashMap.put("enter_sessionid", str);
        hashMap.put("view_id", "yuanbao_chat");
        hashMap.put("end_reason", java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("input_cancel", hashMap, 34004);
    }

    public void n0() {
        yb5.d dVar = this.f198580d;
        if (dVar == null || dVar.f460717l == null) {
            return;
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.weclaw.RepairerConfigWeClawShowStatus()) != 0) {
            if (this.f199329e) {
                this.f198580d.f460717l.setMMSubTitle((java.lang.String) null);
            } else {
                yb5.d dVar2 = this.f198580d;
                dVar2.f460717l.setMMSubTitle(dVar2.g().getString(com.tencent.mm.R.string.o_3));
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        vh0.n1 n1Var;
        if (com.tencent.mm.storage.z3.L4(this.f198580d.x())) {
            ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.H);
            if ((j62.e.g().c(new com.tencent.mm.repairer.config.weclaw.RepairerConfigWeClawShowStatus()) != 0) && (n1Var = (vh0.n1) i95.n0.c(vh0.n1.class)) != null) {
                java.lang.String x17 = this.f198580d.x();
                vh0.f3 f3Var = (vh0.f3) n1Var;
                java.lang.Boolean bool = (java.lang.Boolean) f3Var.f436860g.get(x17);
                this.f199329e = bool == null ? true : bool.booleanValue();
                vh0.m1 listener = this.f199330f;
                kotlin.jvm.internal.o.g(listener, "listener");
                f3Var.f436861h.add(listener);
                if (x17.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus: username empty, skip");
                } else {
                    kotlinx.coroutines.l.d(f3Var.f436858e, null, null, new vh0.r2(x17, f3Var, null), 3, null);
                }
            }
        }
    }
}
