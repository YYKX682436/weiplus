package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class q3 {
    public q3(kotlin.jvm.internal.i iVar) {
    }

    public static final boolean a(com.tencent.mm.ui.chatting.viewitems.q3 q3Var, ot0.q qVar, yb5.d dVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        boolean z18;
        q3Var.getClass();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1293L, 34L, 1L);
        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = (com.tencent.mm.pluginsdk.ui.tools.h0) qVar.y(com.tencent.mm.pluginsdk.ui.tools.h0.class);
        if (h0Var != null) {
            java.lang.String appId = h0Var.f191665b;
            kotlin.jvm.internal.o.f(appId, "appId");
            java.lang.String str5 = h0Var.f191666c;
            if (str5 == null) {
                str5 = "";
            }
            java.lang.String str6 = h0Var.f191667d;
            if (str6 == null) {
                str6 = "";
            }
            java.lang.String str7 = h0Var.f191669f;
            java.lang.String str8 = str7 != null ? str7 : "";
            boolean z19 = h0Var.f191670g;
            z17 = h0Var.f191674k;
            str4 = str8;
            str = appId;
            str2 = str5;
            str3 = str6;
            z18 = z19;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            z17 = false;
            z18 = false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (!(!(com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348674k) ^ true) || ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Lj(str))) {
            g0Var.C(1293L, 84L, 1L);
            return false;
        }
        g0Var.C(1293L, 83L, 1L);
        q80.d0 d0Var = new q80.d0();
        d0Var.f360649a = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            d0Var.f360650b = str2;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            d0Var.f360651c = str3;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            d0Var.f360654f = str4;
        }
        d0Var.f360652d = java.lang.Boolean.valueOf(z18);
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = dVar.D() ? com.tencent.liteapp.gen.LiteAppOpenScene.GROUP_CHAT : com.tencent.liteapp.gen.LiteAppOpenScene.SINGLE_CHAT;
        if (z17) {
            cl0.g gVar = new cl0.g();
            gVar.o("shareImageCardFlag", 1);
            liteAppReferrerInfo.extraData = gVar;
        }
        d0Var.f360674z = liteAppReferrerInfo;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(dVar.g(), d0Var, new com.tencent.mm.ui.chatting.viewitems.o3(db5.e1.Q(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.f490573yv), dVar.g().getString(com.tencent.mm.R.string.f490604zq), true, true, com.tencent.mm.ui.chatting.viewitems.p3.f205229d), dVar));
        return true;
    }

    public final z01.g b(com.tencent.mm.storage.f9 f9Var, yb5.d ui6) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        z01.g gVar = new z01.g();
        if (f9Var == null) {
            return gVar;
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        z05.c cVar2 = k17 != null ? (z05.c) k17.getCustom(k17.f432315e + 64) : null;
        if (cVar2 == null) {
            return gVar;
        }
        java.lang.String l17 = cVar2.l();
        gVar.f469021o = l17 != null ? l17 : "";
        gVar.b();
        java.lang.String q17 = cVar2.q();
        if (q17 != null) {
            if (q17.length() > 0) {
                gVar.f469015f = q17;
            }
        }
        java.lang.String str = gVar.f469014e;
        gVar.f469013d = kotlin.jvm.internal.o.b(str, "photo") ? z01.f.f469004d : kotlin.jvm.internal.o.b(str, "video") ? z01.f.f469005e : z01.f.f469006f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o7k));
        if (gVar.f469019m.length() > 0) {
            sb6.append(" · ");
            sb6.append(gVar.f469019m);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        gVar.f469018i = sb7;
        android.app.Activity g17 = ui6.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        gVar.f469026t = m11.b1.Di().m0(f9Var, f9Var.z0(), i65.a.g(g17), false);
        return gVar;
    }
}
