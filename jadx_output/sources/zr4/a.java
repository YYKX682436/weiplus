package zr4;

/* loaded from: classes9.dex */
public abstract class a {
    public static as4.b a(com.tencent.mm.plugin.wallet_core.model.Authen authen, com.tencent.mm.plugin.wallet_core.model.Orders orders, boolean z17) {
        java.lang.String str;
        if (authen == null || orders == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "empty authen or orders");
            return null;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = authen.f179557v;
        if (payInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "get reqKey from payInfo");
            str = payInfo.f192114m;
        } else {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "get reqKey from orders");
            str = orders.f179675e;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "empty reqKey!");
            return new as4.b(authen, orders, z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "authen reqKey: %s", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "authen go new split cgi");
        return str.startsWith("sns_aa_") ? new as4.a(authen, orders, z17) : str.startsWith("sns_tf_") ? new as4.m(authen, orders, z17) : str.startsWith("sns_ff_") ? new as4.e(authen, orders, z17) : str.startsWith("ts_") ? new as4.g(authen, orders, z17) : str.startsWith("sns_") ? new as4.j(authen, orders, z17) : str.startsWith("offline_") ? new as4.h(authen, orders, z17) : str.startsWith("up_") ? new as4.n(authen, orders, z17) : str.startsWith("seb_ff_") ? new as4.i(authen, orders, z17) : str.startsWith("tax_") ? new as4.l(authen, orders, z17) : str.startsWith("dc_") ? new as4.d(authen, orders, z17) : new as4.b(authen, orders, z17);
    }

    public static as4.c b(com.tencent.mm.plugin.wallet_core.model.Authen authen, com.tencent.mm.plugin.wallet_core.model.Orders orders, boolean z17) {
        boolean z18;
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo;
        boolean z19 = false;
        if (vr4.f1.wi().Ai().f14004m == null || (payInfo = authen.f179557v) == null || z17) {
            z18 = false;
        } else {
            int i17 = payInfo.f192109e;
            z18 = true;
            if (i17 == 31 || i17 == 32 || i17 == 33 || i17 == 42 || i17 == 37 || i17 == 56) {
                z18 = false;
                z19 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "isLqtSns: %s, isLqtTs: %s, isBalance: %s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        return z19 ? new as4.k(authen, orders, z17) : z18 ? new as4.f(authen, orders, z17) : new as4.c(authen, orders, z17);
    }

    public static ds4.b c(at4.z0 z0Var, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        boolean z17;
        boolean z18 = false;
        if (vr4.f1.wi().Ai().f14004m == null || z0Var.f14035n == null || !z0Var.f14026e.equals(vr4.f1.wi().Ai().f14004m.field_bankcardType)) {
            z17 = false;
        } else {
            int i17 = z0Var.f14035n.f192109e;
            z17 = true;
            if (i17 == 31 || i17 == 32 || i17 == 33 || i17 == 42 || i17 == 37 || i17 == 56) {
                z17 = false;
                z18 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "isLqtSns: %s, isLqtTs: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        return z18 ? new ds4.i(z0Var, orders) : z17 ? new ds4.e(z0Var, orders) : new ds4.b(z0Var, orders);
    }

    public static ds4.g d(at4.z0 z0Var, com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        java.lang.String str;
        if (z0Var == null || orders == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiManager", "empty verify or orders");
            return null;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = z0Var.f14035n;
        if (payInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "get reqKey from payInfo");
            str = payInfo.f192114m;
        } else {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "get reqKey from orders");
            str = orders.f179675e;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "empty reqKey!");
            return new ds4.g(z0Var, orders);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "verify reqKey: %s", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiManager", "verify go new split cgi");
        return str.startsWith("sns_aa_") ? new ds4.a(z0Var, orders) : str.startsWith("sns_tf_") ? new ds4.l(z0Var, orders) : str.startsWith("sns_ff_") ? new ds4.d(z0Var, orders) : str.startsWith("ts_") ? new ds4.f(z0Var, orders) : str.startsWith("sns_") ? new ds4.j(z0Var, orders) : str.startsWith("up_") ? new ds4.m(z0Var, orders) : str.startsWith("seb_ff_") ? new ds4.h(z0Var, orders) : str.startsWith("tax_") ? new ds4.k(z0Var, orders) : str.startsWith("dc_") ? new ds4.c(z0Var, orders) : new ds4.g(z0Var, orders);
    }
}
