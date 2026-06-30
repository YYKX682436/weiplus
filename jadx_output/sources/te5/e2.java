package te5;

/* loaded from: classes9.dex */
public abstract class e2 {
    public static final boolean a(java.lang.String str, java.lang.String str2) {
        return b(str, str2) || c(str2);
    }

    public static final boolean b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        kotlin.jvm.internal.o.d(str2);
        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null);
        int a17 = k01.d.a(str);
        return (a17 == 3 || a17 == 4) ? kz5.n0.O(f07, str) : kz5.n0.O(f07, str) && f07.contains(c01.z1.r());
    }

    public static final boolean c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || ((k01.q0) i95.n0.c(k01.q0.class)) == null) {
            return false;
        }
        return (!(str != null && str.length() == 0) && str != null) ? r26.n0.B(str, "allPage", false) : false;
    }

    public static final java.lang.String d(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        return ((et.k2) ((ft.n4) i95.n0.c(ft.n4.class))).wi(f9Var.G);
    }

    public static final boolean e(ot0.q qVar) {
        com.tencent.mm.modelmulti.WxaInfo g17;
        return (qVar == null || (g17 = g(qVar)) == null || g17.f71266i != 1) ? false : true;
    }

    public static final com.tencent.mm.modelmulti.WxaInfo f(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        w11.m2 m2Var = com.tencent.mm.modelmulti.WxaInfo.f71260n;
        com.tencent.mm.modelmulti.WxaInfo b17 = m2Var.b(msgInfo.j());
        if (b17 != null) {
            return b17;
        }
        java.lang.String str = msgInfo.G;
        if (str != null) {
            if (str.length() > 0) {
                p15.e eVar = new p15.e();
                eVar.fromXml(str);
                return m2Var.a(eVar.t());
            }
        }
        return null;
    }

    public static final com.tencent.mm.modelmulti.WxaInfo g(ot0.q qVar) {
        if (qVar == null) {
            return null;
        }
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        p15.x xVar = aVar != null ? aVar.P : null;
        if (xVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaInfo", "from, msgSrcWxaInfo is null");
            return null;
        }
        java.lang.String appId = xVar.getAppId();
        if (appId == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaInfo", "from, appId is null");
            return null;
        }
        java.lang.String nickname = xVar.getNickname();
        if (nickname == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaInfo", "from, nickname is null");
            return null;
        }
        java.lang.String iconUrl = xVar.getIconUrl();
        if (iconUrl == null) {
            iconUrl = "";
        }
        return new com.tencent.mm.modelmulti.WxaInfo(appId, nickname, iconUrl, xVar.j(), xVar.l(), xVar.n(), xVar.o());
    }
}
