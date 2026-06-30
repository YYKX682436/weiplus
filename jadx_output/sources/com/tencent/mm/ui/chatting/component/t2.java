package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class t2 extends com.tencent.mm.ui.chatting.component.a implements yn.e, xg3.h0 {
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        android.database.Cursor f17;
        boolean m07 = m0();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingAutoTranslationComponent", "onChattingEnterAnimEnd() called isSupportChat:" + m07 + " talker:" + this.f198580d.u().d1() + ' ');
        if (m07) {
            go.d dVar = go.d.f273696a;
            go.d.f273700e = this.f198580d.x();
            go.d.f273699d = 0;
            final java.lang.String x17 = this.f198580d.x();
            n0(x17);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
            this.f198580d.h().b(hd5.n.ACTION_UPDATE, false);
            if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.autotranslation.RepairerConfigClearAutoTranslationSysTip()) == 1) {
                final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                cj6.getClass();
                if (android.text.TextUtils.isEmpty(x17)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getLimitNonSys fail, argument is invalid");
                    f17 = null;
                } else {
                    final java.lang.String X8 = cj6.X8(x17);
                    if (cj6.Da(X8)) {
                        final int i17 = 100;
                        f17 = ot0.c3.l().c("getLimitSysMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$j1
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                java.lang.String str = X8;
                                java.lang.String str2 = x17;
                                int i18 = i17;
                                ot0.z2 z2Var = ot0.z2.f348822a;
                                com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                                return z2Var.I0(g9Var.f193989r, str, str2, i18, java.util.Arrays.asList(g9Var.D8()));
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$k1
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                                g9Var.getClass();
                                return g9Var.f193989r.f("select * from " + X8 + " where" + g9Var.Z8(x17) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND isSend=0 order by createTime ASC limit " + i17, null, 2);
                            }
                        });
                    } else if (cj6.Pb(X8)) {
                        f17 = ot0.z2.f348822a.I0(cj6.f193989r, X8, x17, 100, java.util.Arrays.asList(cj6.D8()));
                    } else {
                        f17 = cj6.f193989r.f("select * from " + X8 + " where" + cj6.Z8(x17) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND isSend=0 order by createTime ASC limit 100", null, 2);
                    }
                }
                while (f17.moveToNext()) {
                    try {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.convertFrom(f17);
                        java.lang.String j17 = f9Var.j();
                        if (j17 != null && j17.contains("tmpl_type_auto_translation_sys_tip")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AutoTranslationSysTipHelper", "removeSysTip talkerMap:" + x17 + ", msg: " + f9Var.getMsgId());
                            c01.w9.f(f9Var.getMsgId(), x17);
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            vz5.b.a(f17, th6);
                            throw th7;
                        }
                    }
                }
                vz5.b.a(f17, null);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        go.d dVar = go.d.f273696a;
        go.d.f273699d = 0;
        if (dVar.c(go.d.f273700e) == 1) {
            dVar.e().A(go.d.f273700e, 0);
        }
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        boolean z17;
        if (l0Var != null) {
            java.lang.String x17 = this.f198580d.x();
            java.lang.String talker = l0Var.f454410a;
            if (kotlin.jvm.internal.o.b(talker, x17) && m0()) {
                java.util.ArrayList msgList = l0Var.f454412c;
                kotlin.jvm.internal.o.f(msgList, "msgList");
                if (!msgList.isEmpty()) {
                    java.util.Iterator it = msgList.iterator();
                    while (it.hasNext()) {
                        if (((com.tencent.mm.storage.f9) it.next()).A0() == 0) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    java.lang.String str = l0Var.f454411b;
                    if (kotlin.jvm.internal.o.b(str, "insert") || kotlin.jvm.internal.o.b(str, "delete")) {
                        kotlin.jvm.internal.o.f(talker, "talker");
                        n0(talker);
                        go.d dVar = go.d.f273696a;
                        kotlin.jvm.internal.o.f(talker, "talker");
                        if (dVar.c(talker) == 2) {
                            kotlin.jvm.internal.o.f(msgList, "msgList");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj : msgList) {
                                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
                                if (f9Var.A0() == 0 && f9Var.getType() == 1 && com.tencent.mm.plugin.record.ui.l2.c(f9Var.j())) {
                                    arrayList.add(obj);
                                }
                            }
                            go.d dVar2 = go.d.f273696a;
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                dVar2.f((com.tencent.mm.storage.f9) it6.next());
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean m0() {
        return (com.tencent.mm.storage.z3.O4(this.f198580d.x()) && !this.f198580d.u().k2()) || com.tencent.mm.storage.z3.R4(this.f198580d.x());
    }

    public final void n0(java.lang.String talker) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mm.storage.f9 f9Var;
        java.util.List B5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().B5(talker, false, 5);
        kotlin.jvm.internal.o.d(B5);
        java.util.Iterator it = B5.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (com.tencent.mm.plugin.record.ui.l2.c(((com.tencent.mm.storage.f9) obj).j())) {
                    break;
                }
            }
        }
        com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) obj;
        if (f9Var2 == null) {
            return;
        }
        long msgId = f9Var2.getMsgId();
        go.d dVar = go.d.f273696a;
        kotlin.jvm.internal.o.g(talker, "talker");
        go.d.f273697b.put(talker, java.lang.Long.valueOf(msgId));
        java.util.ArrayList arrayList = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).I.f152065o;
        kotlin.jvm.internal.o.f(arrayList, "getDataMap(...)");
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it6.next();
                if (((rd5.d) obj2).f394254d.f445300b.getMsgId() == msgId) {
                    break;
                }
            }
        }
        rd5.d dVar2 = (rd5.d) obj2;
        java.lang.Object obj3 = (dVar2 == null || (f9Var = dVar2.f394254d.f445300b) == null) ? null : f9Var.f193927g2;
        com.tencent.mm.ui.chatting.viewitems.un unVar = obj3 instanceof com.tencent.mm.ui.chatting.viewitems.un ? (com.tencent.mm.ui.chatting.viewitems.un) obj3 : null;
        if (unVar == null) {
            return;
        }
        unVar.f205716e = go.d.f273696a.c(talker);
    }
}
