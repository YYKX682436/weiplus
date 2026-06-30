package ss4;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ss4.p0 f412124a = new ss4.p0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f412125b = kz5.c1.k(new jz5.l(ss4.n0.f412105d, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/querywechatwallet", 2672, "/cgi-bin/mmpay-bin/pa/wx_querywechatwallet", 27364)), new jz5.l(ss4.n0.f412106e, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/setuserwallet", 1663, "/cgi-bin/mmpay-bin/pa/wx_setuserwallet", 28505)), new jz5.l(ss4.n0.f412107f, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/queryuserwallet", 1631, "/cgi-bin/mmpay-bin/pa/wx_queryuserwallet", 28177)), new jz5.l(ss4.n0.f412108g, new ss4.o0("/cgi-bin/mmpay-bin/payibgquickgetoverseawallet", 2540, "/cgi-bin/mmpay-bin/pa/wx_payibgquickgetoverseawallet", 25851)), new jz5.l(ss4.n0.f412109h, new ss4.o0("/cgi-bin/mmpay-bin/payibggetoverseawallet", fe1.i.CTRL_INDEX, "/cgi-bin/mmpay-bin/pa/wx_payibggetoverseawallet", 27939)), new jz5.l(ss4.n0.f412110i, new ss4.o0("/cgi-bin/mmpay-bin/tenpay/bindquerynew", com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.CTRL_INDEX, "/cgi-bin/mmpay-bin/pa/wx_bindquerynew", 29650)));

    public final int a(ss4.n0 n0Var, int i17) {
        ss4.o0 o0Var = (ss4.o0) f412125b.get(n0Var);
        if (o0Var == null) {
            return i17;
        }
        boolean l17 = j62.e.g().l("clicfg_android_wallet_cgi_route_change", false, false, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCgiRouteConfig", "[isNewRouteEnabled] enable: " + l17);
        int i18 = l17 ? o0Var.f412119d : o0Var.f412117b;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCgiRouteConfig", "[getFuncId] key: " + n0Var + ", funcId: " + i18);
        return i18;
    }

    public final java.lang.String b(ss4.n0 n0Var, java.lang.String fallbackUri) {
        kotlin.jvm.internal.o.g(fallbackUri, "fallbackUri");
        ss4.o0 o0Var = (ss4.o0) f412125b.get(n0Var);
        if (o0Var == null) {
            return fallbackUri;
        }
        boolean l17 = j62.e.g().l("clicfg_android_wallet_cgi_route_change", false, false, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCgiRouteConfig", "[isNewRouteEnabled] enable: " + l17);
        java.lang.String str = l17 ? o0Var.f412118c : o0Var.f412116a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCgiRouteConfig", "[getUri] key: " + n0Var + ", uri: " + str);
        return str;
    }
}
