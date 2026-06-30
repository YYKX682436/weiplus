package rg4;

/* loaded from: classes7.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String concat = ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Di().concat("mbpkgs/");
        switch (appId.hashCode()) {
            case -1811583232:
                if (!appId.equals("wx2f3fb5db9f226462")) {
                    return "";
                }
                return concat + appId + ".wspkg";
            case -702916869:
                if (!appId.equals("wx9e221f7828fa7482")) {
                    return "";
                }
                return concat + appId + ".wspkg";
            case 190545547:
                if (!appId.equals("wxe208ce76dfa39515")) {
                    return "";
                }
                return concat + appId + ".wspkg";
            case 1502683169:
                if (!appId.equals("wx4edd479d258d7f25")) {
                    return "";
                }
                return concat + "basic.wspkg";
            default:
                return "";
        }
    }

    public final java.lang.String b() {
        cl0.g gVar;
        xg4.m mVar = xg4.m.f454446a;
        xg4.p pVar = xg4.m.f454447b;
        jc3.x J1 = pVar != null ? pVar.J1() : null;
        if (J1 == null) {
            com.tencent.mars.xlog.Log.i("MagicLiveCardFileUtil", "biz runtime fileSystem null");
            return ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj("MagicLiveCard");
        }
        java.lang.String e17 = J1.e();
        if (e17.length() > 0) {
            gVar = new cl0.g(e17);
        } else {
            com.tencent.mars.xlog.Log.i("MagicLiveCardFileUtil", "jsonObject null");
            gVar = null;
        }
        java.lang.String optString = gVar != null ? gVar.optString("version", "") : null;
        return optString == null ? "" : optString;
    }

    public final java.lang.String c(jc3.x xVar) {
        if (xVar != null) {
            java.lang.String d17 = xVar.d();
            if (d17.length() > 0) {
                return r26.i0.A(d17, "MD5_", false, 2, null) ? r26.n0.m0(d17, "MD5_", d17) : d17;
            }
        }
        return "";
    }
}
