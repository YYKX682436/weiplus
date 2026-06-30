package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class g7 {
    public g7(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.content.Context context, java.util.List msgInfoList, java.lang.String fromTalker, ot0.f3 f3Var) {
        android.content.Context context2;
        java.lang.Class<pt.k0> cls;
        java.lang.String string;
        gu.h hVar;
        java.lang.String uuid;
        l15.c cVar;
        s15.w wVar;
        if (msgInfoList == null || msgInfoList.isEmpty()) {
            return false;
        }
        if (fromTalker == null || r26.n0.N(fromTalker)) {
            return false;
        }
        com.tencent.mm.ui.chatting.x3.a();
        android.content.Context context3 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        java.lang.Class<pt.k0> cls2 = pt.k0.class;
        ot.q qVar = (ot.q) ((pt.k0) i95.n0.c(cls2));
        qVar.getClass();
        kotlin.jvm.internal.o.g(fromTalker, "fromTalker");
        kotlin.jvm.internal.o.g(msgInfoList, "msgInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgRecordFeatureService", "buildRecordXml fromTalker:" + fromTalker + " msgSize:" + msgInfoList.size());
        if (msgInfoList.isEmpty()) {
            hVar = new gu.h(gu.i.f275604e);
            context2 = context3;
            cls = cls2;
        } else {
            java.util.List F0 = kz5.n0.F0(msgInfoList, new ot.o());
            l15.c cVar2 = new l15.c();
            s15.w wVar2 = new s15.w();
            java.util.Iterator it = F0.iterator();
            int i17 = 0;
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    jz5.f0 f0Var = null;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) next;
                    s15.h hVar2 = new s15.h();
                    p15.e eVar = new p15.e();
                    java.lang.String str = f9Var.G;
                    if (str == null) {
                        str = "";
                    }
                    eVar.fromXml(str);
                    oi3.e qj6 = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(f9Var);
                    java.lang.String h17 = com.tencent.mm.sdk.platformtools.t8.h1();
                    kotlin.jvm.internal.o.d(h17);
                    java.util.Iterator it6 = it;
                    hVar2.set(hVar2.f303422d + 3, h17);
                    int i19 = qj6.f345617d;
                    int i27 = i19 + 2;
                    long j17 = 1000;
                    context2 = context3;
                    cls = cls2;
                    l15.c cVar3 = cVar2;
                    java.lang.String d17 = k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, qj6.getLong(i27) / j17);
                    kotlin.jvm.internal.o.f(d17, "formatTime(...)");
                    hVar2.T0(d17);
                    hVar2.W0(qj6.getLong(i27) / j17);
                    java.lang.String r17 = c01.z1.r();
                    if (qj6.getInteger(i19 + 9) == 0) {
                        int i28 = i19 + 3;
                        r17 = com.tencent.mm.storage.z3.R4(qj6.getString(i28)) ? qj6.getString(i19 + 11) : qj6.getString(i28);
                    }
                    hVar2.m0(new s15.i());
                    s15.i p17 = hVar2.p();
                    if (p17 != null) {
                        p17.n(qj6.getString(i19 + 3));
                    }
                    s15.i p18 = hVar2.p();
                    if (p18 != null) {
                        kotlin.jvm.internal.o.d(r17);
                        p18.p(r17);
                    }
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(r17);
                    if (n07 != null) {
                        java.lang.String d18 = n07.d();
                        if (d18 == null) {
                            d18 = "";
                        }
                        hVar2.R0(d18);
                    }
                    java.lang.String Ai = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Ai(r17, 3);
                    if (Ai == null) {
                        Ai = "";
                    }
                    s15.i p19 = hVar2.p();
                    if (p19 != null) {
                        if (com.tencent.mm.storage.z3.L4(r17)) {
                            Ai = Ai.concat("@weclaw");
                        }
                        p19.o(Ai);
                    }
                    java.lang.String Ni = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Ni(r17);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(Ni)) {
                        Ni = com.tencent.mm.contact.u.a();
                    } else {
                        kotlin.jvm.internal.o.d(Ni);
                    }
                    hVar2.S0(Ni);
                    if (com.tencent.mm.storage.z3.m4(r17)) {
                        java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(r17, true));
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                            if (a17 == null) {
                                a17 = "";
                            }
                            hVar2.Q0(a17);
                        }
                    }
                    if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(r17)) {
                        java.lang.String Vi = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(r17);
                        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(r17));
                        if (fj6 == null) {
                            fj6 = "";
                        }
                        if (kotlin.jvm.internal.o.b("3552365301", Vi)) {
                            fj6 = "@".concat(fj6);
                        }
                        hVar2.Q0(fj6);
                    }
                    p15.s q17 = eVar.q();
                    hVar2.I0((q17 == null || (uuid = q17.getUuid()) == null) ? "" : uuid);
                    hVar2.C0(qj6.getLong(i19 + 1));
                    if (c01.ja.f37270a.a(f9Var)) {
                        int i29 = i19 + 4;
                        java.lang.Class cls3 = (java.lang.Class) ((java.util.HashMap) ((jz5.n) qVar.f348328m).getValue()).get(java.lang.Integer.valueOf(qj6.getInteger(i29)));
                        if (cls3 != null) {
                            java.lang.Object newInstance = cls3.getConstructors()[0].newInstance(new java.lang.Object[0]);
                            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.feature.appmsg.record.IAppMsgRecordBuildXmlApi");
                            if (!((gu.e) newInstance).a(qj6, hVar2)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgRecordFeatureService", "buildRecordXml beforeInsertDB error type:" + qj6.getInteger(i29) + " msgId:" + qj6.getLong(i19 + 0));
                                hVar = new gu.h(gu.i.f275605f);
                                break;
                            }
                            f0Var = jz5.f0.f302826a;
                        }
                        if (f0Var == null) {
                            new ku.j().a(qj6, hVar2);
                        }
                    } else {
                        new ku.j().a(qj6, hVar2);
                    }
                    wVar2.j().add(hVar2);
                    it = it6;
                    cVar2 = cVar3;
                    i17 = i18;
                    context3 = context2;
                    cls2 = cls;
                } else {
                    context2 = context3;
                    cls = cls2;
                    l15.c cVar4 = cVar2;
                    wVar2.k(com.tencent.mm.storage.z3.R4(fromTalker) ? 1 : 0);
                    if (com.tencent.mm.storage.z3.R4(fromTalker)) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hsy);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                    } else {
                        java.lang.String l17 = c01.z1.l();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                            l17 = com.tencent.mm.contact.u.a();
                        }
                        java.lang.String Ni2 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Ni(fromTalker);
                        java.lang.String str2 = Ni2 == null ? "" : Ni2;
                        if (kotlin.jvm.internal.o.b(l17, str2)) {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cc6, l17);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                        } else {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491208cc5, l17, str2);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                        }
                    }
                    int i37 = wVar2.f303423d;
                    int i38 = i37 + 0;
                    wVar2.set(i38, string);
                    int i39 = i37 + 1;
                    wVar2.set(i39, qVar.bj(wVar2));
                    v05.b bVar = new v05.b();
                    java.lang.String string2 = wVar2.getString(i38);
                    int i47 = bVar.f368365d;
                    bVar.set(i47 + 2, string2);
                    bVar.set(i47 + 5, "view");
                    bVar.set(i47 + 3, wVar2.getString(i39));
                    bVar.set(i47 + 6, 19);
                    bVar.set(i47 + 9, "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0");
                    bVar.set(bVar.f432315e + 44, wVar2.toXml());
                    cVar4.q(bVar);
                    hVar = new gu.h(gu.i.f275603d);
                    hVar.f275601b = cVar4;
                    hVar.f275602c = wVar2;
                }
            }
        }
        if (hVar.f275600a != gu.i.f275603d || (cVar = hVar.f275601b) == null || (wVar = hVar.f275602c) == null) {
            return false;
        }
        long Ai2 = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
        long i48 = ip.c.i();
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        ((ot.q) ((pt.k0) i95.n0.c(cls))).fj(wVar, atomicLong2, atomicLong);
        if (atomicLong2.get() > Ai2) {
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            java.lang.Object[] objArr = {com.tencent.mm.sdk.platformtools.t8.f0(Ai2)};
            android.content.Context context4 = context2;
            aVar.f211729s = context4.getString(com.tencent.mm.R.string.cf8, objArr);
            aVar.f211732v = context4.getString(com.tencent.mm.R.string.l_e);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context4, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
            return false;
        }
        android.content.Context context5 = context2;
        if (atomicLong.get() > i48) {
            com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
            aVar2.f211729s = context5.getString(com.tencent.mm.R.string.f491234cf2, com.tencent.mm.sdk.platformtools.t8.f0(i48));
            aVar2.f211732v = context5.getString(com.tencent.mm.R.string.l_e);
            com.tencent.mm.ui.widget.dialog.j0 j0Var2 = new com.tencent.mm.ui.widget.dialog.j0(context5, com.tencent.mm.R.style.f494791wd);
            j0Var2.e(aVar2);
            com.tencent.mm.ui.widget.dialog.d0 d0Var2 = aVar2.f211723m;
            if (d0Var2 != null) {
                d0Var2.a(j0Var2.f211837r);
            }
            j0Var2.show();
            return false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it7 = msgInfoList.iterator();
        while (it7.hasNext()) {
            linkedList.add(java.lang.Long.valueOf(((com.tencent.mm.storage.f9) it7.next()).getMsgId()));
        }
        com.tencent.mm.ui.chatting.x3.f206228a.f206203c = new java.lang.ref.WeakReference(f3Var);
        ld5.a aVar3 = new ld5.a();
        aVar3.set(aVar3.f43702d + 1, fromTalker);
        aVar3.l(linkedList);
        aVar3.n(cVar);
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        rVar.f334120d.f334139a = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.b(fromTalker);
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context5, aVar3, rVar);
        return true;
    }
}
