package w71;

/* loaded from: classes11.dex */
public abstract class e {
    public static final void a(java.lang.String username, boolean z17, byte[] tingItemData, long j17, java.lang.String extraInfo, yz5.l lVar) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        try {
            bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
            kotlin.jvm.internal.o.d(parseFrom);
            int i17 = rk4.j5.g(parseFrom) ? 14 : 15;
            zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
            int i18 = z17 ? 2 : 1;
            java.lang.Long l17 = 0L;
            int i19 = (int) j17;
            com.tencent.mm.plugin.finder.service.s1 s1Var = (com.tencent.mm.plugin.finder.service.s1) e6Var;
            s1Var.getClass();
            s1Var.Di(username, i18, l17.longValue(), false, i19, i17, i19, extraInfo);
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "doFollowFinder exp=" + e17);
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        }
    }

    public static final void b(java.lang.String username, yz5.l lVar) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        bw5.w wVar = new bw5.w();
        wVar.f34542d = username;
        boolean[] zArr = wVar.f34544f;
        zArr[1] = true;
        boolean z17 = false;
        if (n17 != null && n17.r2()) {
            z17 = true;
        }
        wVar.f34543e = z17;
        zArr[2] = true;
        if (lVar != null) {
            lVar.invoke(wVar);
        }
    }

    public static final void c(java.lang.String username, yz5.l lVar) {
        com.tencent.mm.modelavatar.s0 Ni;
        com.tencent.mm.modelavatar.r0 n07;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String str = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        bw5.y0 y0Var = new bw5.y0();
        y0Var.f35294d = username;
        boolean[] zArr = y0Var.f35298h;
        zArr[1] = true;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        y0Var.f35295e = c01.a2.e(username);
        zArr[2] = true;
        if (((kv.a0) i95.n0.c(kv.a0.class)) != null && (Ni = com.tencent.mm.modelavatar.d1.Ni()) != null && (n07 = Ni.n0(username)) != null) {
            str = n07.d();
        }
        y0Var.f35296f = str;
        zArr[3] = true;
        if (lVar != null) {
            lVar.invoke(y0Var);
        }
    }

    public static final void d(java.lang.String[] hashUsernames, yz5.l lVar) {
        kotlin.jvm.internal.o.g(hashUsernames, "hashUsernames");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : hashUsernames) {
            n73.e eVar = (n73.e) i95.n0.c(n73.e.class);
            com.tencent.mm.storage.z3 wi6 = eVar != null ? ((m73.q) eVar).wi(str, 2) : null;
            if (wi6 != null) {
                bw5.y0 y0Var = new bw5.y0();
                y0Var.f35294d = wi6.d1();
                boolean[] zArr = y0Var.f35298h;
                zArr[1] = true;
                y0Var.f35295e = wi6.P0();
                zArr[2] = true;
                y0Var.f35297g = str;
                zArr[4] = true;
                arrayList.add(y0Var);
            }
        }
        if (lVar != null) {
            lVar.invoke(arrayList.toArray(new bw5.y0[0]));
        }
    }

    public static final void e(java.lang.String username, yz5.l lVar) {
        java.lang.String str;
        java.lang.String headUrl;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.protocal.protobuf.FinderContact Rj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rj(username);
        bw5.d0 d0Var = new bw5.d0();
        d0Var.f26262d = username;
        boolean[] zArr = d0Var.f26266h;
        zArr[1] = true;
        boolean z17 = false;
        if (Rj != null) {
            int followFlag = Rj.getFollowFlag();
            l75.e0 e0Var = ya2.b2.O2;
            if (followFlag == ya2.b2.Q2) {
                z17 = true;
            }
        }
        d0Var.f26265g = z17;
        zArr[4] = true;
        java.lang.String str2 = "";
        if (Rj == null || (str = Rj.getNickname()) == null) {
            str = "";
        }
        d0Var.f26263e = str;
        zArr[2] = true;
        if (Rj != null && (headUrl = Rj.getHeadUrl()) != null) {
            str2 = headUrl;
        }
        d0Var.f26264f = str2;
        zArr[3] = true;
        if (lVar != null) {
            lVar.invoke(d0Var);
        }
    }

    public static final void f(yz5.l lVar) {
        bw5.s0 s0Var = new bw5.s0();
        boolean[] zArr = s0Var.f32742h;
        java.lang.Object l17 = gm0.j1.u().c().l(67591, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "lbs location is null, no cached data!");
        } else {
            try {
                kotlin.jvm.internal.o.d(str);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.String[]) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]))[0]);
                float intValue = java.lang.Integer.valueOf(r4[2]).intValue() / 1000000.0f;
                s0Var.f32738d = intValue;
                zArr[1] = true;
                s0Var.f32739e = java.lang.Integer.valueOf(r4[3]).intValue() / 1000000.0f;
                zArr[2] = true;
                s0Var.f32740f = valueOf.intValue();
                zArr[3] = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "getCurrentGPSData parse value error.", e17);
            }
        }
        if (lVar != null) {
            lVar.invoke(s0Var);
        }
    }
}
