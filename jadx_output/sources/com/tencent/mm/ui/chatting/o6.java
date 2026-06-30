package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class o6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.o6 f202065a = new com.tencent.mm.ui.chatting.o6();

    public final bw5.lp0 a(com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        if (qVar == null) {
            return null;
        }
        com.tencent.mm.pluginsdk.ui.tools.i0 i0Var = (com.tencent.mm.pluginsdk.ui.tools.i0) qVar.y(com.tencent.mm.pluginsdk.ui.tools.i0.class);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(new bw5.v70());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append("_msg");
        lp0Var.g(sb6.toString());
        if (i0Var.f191706r > 0) {
            lp0Var.j(rk4.l5.c(i0Var.f191707s));
            if (lp0Var.d() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMusicPlayHelper", "getTingItem listenItem parse failed");
                return null;
            }
        } else {
            e(lp0Var, qVar, i0Var);
        }
        return lp0Var;
    }

    public final void b(com.tencent.mm.storage.f9 msgInfo, bw5.o50 item, java.lang.String str) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String Q0 = msgInfo.Q0();
        java.lang.String v17 = com.tencent.mm.ui.chatting.viewitems.a0.v(msgInfo, com.tencent.mm.storage.z3.R4(msgInfo.Q0()), false);
        ((o40.e) i95.n0.c(o40.e.class)).getClass();
        int i17 = item.f30964n;
        if (i17 == 19 || i17 == 28) {
            o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            byte[] byteArray = item.toByteArray();
            wy2.g gVar = (wy2.g) eVar;
            gVar.getClass();
            x40.h wi6 = gVar.wi();
            java.util.HashMap hashMap = new java.util.HashMap();
            wi6.getClass();
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new x40.b(wi6, hashMap, context, byteArray, null), 3, null);
            return;
        }
        if (i17 == 7 || i17 == 9) {
            i95.m c17 = i95.n0.c(o40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            o40.e.g8((o40.e) c17, context2, item.toByteArray(), false, null, 8, null);
            return;
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Chat;
        if (Q0 == null) {
            Q0 = "";
        }
        il4.e eVar2 = new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, Q0, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33553403, null);
        java.util.Map map = eVar2.f292122s.f292132d;
        java.lang.String str2 = eVar2.f292114k;
        if (str2 != null) {
            map.put("chat", str2);
        }
        if (v17 != null) {
            map.put("sourceuser", v17);
        }
        map.put("msgid", java.lang.String.valueOf(msgInfo.I0()));
        if (!(str == null || r26.n0.N(str))) {
            map.put("baseidissharedfrom3rd", 1);
        }
        qk.f9.c(aj6, context3, item, ar0Var, eVar2, null, 16, null);
    }

    public final boolean c(ot0.q content, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        il4.a aVar = (il4.a) content.y(il4.a.class);
        if (aVar == null) {
            return false;
        }
        bw5.o50 v17 = il4.d.v(aVar.f292093c);
        if (v17 != null) {
            b(msgInfo, v17, content.f348646d);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingMusicPlayHelper", "goToCategory categoryItem parse failed");
        return true;
    }

    public final void d(android.content.Context context, com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        bw5.lp0 a17 = a(f9Var, qVar);
        if (a17 == null) {
            return;
        }
        java.lang.String v17 = com.tencent.mm.ui.chatting.viewitems.a0.v(f9Var, com.tencent.mm.storage.z3.R4(f9Var != null ? f9Var.Q0() : null), false);
        i95.m c17 = i95.n0.c(qk.k6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        qk.k6 k6Var = (qk.k6) c17;
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        kotlin.jvm.internal.o.d(context2);
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Chat;
        il4.e eVar = new il4.e(null, 0, 1300, false, null, null, 0, 0, false, false, f9Var != null ? f9Var.Q0() : null, null, null, null, null, null, false, false, null, null, false, null, false, bw5.x2.BizAudioEnterScene_ChatListen, false, 25164787, null);
        java.util.Map map = eVar.f292122s.f292132d;
        java.lang.String str = eVar.f292114k;
        if (str != null) {
            map.put("chat", str);
        }
        if (v17 != null) {
            map.put("sourceuser", v17);
        }
        map.put("msgid", java.lang.String.valueOf(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null));
        if (qVar != null) {
            java.lang.String str2 = qVar.f348646d;
            if (!(str2 == null || r26.n0.N(str2))) {
                map.put("baseidissharedfrom3rd", 1);
            }
        }
        qk.k6.I1(k6Var, context2, true, a17, eVar, null, null, ar0Var, null, null, null, null, 1968, null);
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(a17, ar0Var);
    }

    public final void e(bw5.lp0 lp0Var, ot0.q qVar, com.tencent.mm.pluginsdk.ui.tools.i0 i0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMusicPlayHelper", "parseListenItemFromAppMsg content: " + qVar + ", piece: " + i0Var);
        if (qVar == null || i0Var == null) {
            return;
        }
        int i17 = i0Var.f191706r;
        if (i17 == 0) {
            i17 = 1;
        }
        bw5.v70 d17 = lp0Var.d();
        d17.y(i17);
        bw5.z90 z90Var = new bw5.z90();
        java.lang.String str = qVar.f348654f;
        if (!(str == null || r26.n0.N(str))) {
            z90Var.E(qVar.f348654f);
        }
        java.lang.String str2 = qVar.f348658g;
        if (!(str2 == null || r26.n0.N(str2))) {
            z90Var.C(qVar.f348658g);
        }
        java.lang.String str3 = qVar.f348674k;
        if (!(str3 == null || r26.n0.N(str3))) {
            z90Var.B(qVar.f348674k);
        }
        java.lang.String str4 = qVar.V;
        if (!(str4 == null || r26.n0.N(str4))) {
            z90Var.z(qVar.V);
        }
        java.lang.String str5 = qVar.f348646d;
        if (!(str5 == null || r26.n0.N(str5))) {
            z90Var.y(qVar.f348646d);
        }
        java.lang.String str6 = i0Var.f191690b;
        if (!(str6 == null || r26.n0.N(str6))) {
            z90Var.r(i0Var.f191690b);
        }
        java.lang.String str7 = i0Var.f191691c;
        if (!(str7 == null || r26.n0.N(str7))) {
            z90Var.x(i0Var.f191691c);
        }
        java.lang.String str8 = i0Var.f191696h;
        if (!(str8 == null || r26.n0.N(str8))) {
            z90Var.C(i0Var.f191696h);
        }
        java.lang.String str9 = i0Var.f191704p;
        if (!(str9 == null || r26.n0.N(str9))) {
            z90Var.A(i0Var.f191704p);
        }
        java.lang.String str10 = i0Var.f191700l;
        if (!(str10 == null || r26.n0.N(str10))) {
            z90Var.w(i0Var.f191700l);
        }
        java.lang.String str11 = i0Var.f191697i;
        if (!(str11 == null || r26.n0.N(str11))) {
            z90Var.q(i0Var.f191697i);
        }
        if (!(java.lang.Integer.valueOf(i0Var.f191702n) == null)) {
            z90Var.s(i0Var.f191702n);
        }
        java.lang.String str12 = i0Var.f191698j;
        if (!(str12 == null || r26.n0.N(str12))) {
            z90Var.u(i0Var.f191698j);
        }
        java.lang.String str13 = i0Var.f191701m;
        if (!(str13 == null || r26.n0.N(str13))) {
            z90Var.t(i0Var.f191701m);
        }
        d17.w(z90Var);
        d17.p(d17.j().l());
        d17.x(d17.j().o());
        d17.q(d17.j().c());
        d17.r(d17.j().f35898u);
        d17.t(true);
        lp0Var.j(d17);
    }
}
