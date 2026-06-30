package li3;

@j95.b
/* loaded from: classes9.dex */
public class g extends i95.w implements h45.s {
    public java.lang.String Ai() {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String str = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPaySevice", "wechat user lang is null");
            return null;
        }
        if (c01.e2.a0()) {
            if (f17.equalsIgnoreCase("zh_CN")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_cn, "支付与服务", true);
            } else if (f17.equalsIgnoreCase("zh_HK")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_hk, "支付與服務", true);
            } else if (f17.equalsIgnoreCase("zh_TW")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_tw, "支付與服務", true);
            } else if (f17.equalsIgnoreCase("en")) {
                str = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_wechatuser_pay_entry_name_en, "Pay and Services", true);
            }
            return com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mtm) : str;
        }
        if (f17.equalsIgnoreCase("zh_CN")) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_cn, "", true);
        }
        if (f17.equalsIgnoreCase("zh_HK")) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_hk, "", true);
        }
        if (f17.equalsIgnoreCase("zh_TW")) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_tw, "", true);
        }
        if (!f17.equalsIgnoreCase("en")) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mtm);
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_weixinuser_pay_entry_name_en, "Pay and Services", true);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mtm) : Zi;
    }

    public boolean Bi() {
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().y();
    }

    public r45.x57 Di(java.lang.String str) {
        byte[] bArr;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("native");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "hk payurl native param is %s", queryParameter);
        java.lang.String replace = queryParameter.replace(".", "+").replace("_", "/").replace("-", "=");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "hk payurl native param after replace is %s", replace);
        try {
            bArr = android.util.Base64.decode(replace, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxPaySevice", e17, "", new java.lang.Object[0]);
            bArr = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "hk payurl native param base64decode null");
            return null;
        }
        r45.x57 x57Var = new r45.x57();
        try {
            x57Var.parseFrom(bArr);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxPaySevice", "parse nativeInfo exp, " + e18.getLocalizedMessage());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(x57Var.f389803d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "attach is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "attach is %s, android supprt version is %s", x57Var.f389803d, java.lang.Integer.valueOf(x57Var.f389805f));
        if (o45.wf.f343029g >= x57Var.f389805f) {
            return x57Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "client version small than min version");
        return null;
    }

    public void Ni(java.lang.String str, r45.i67 i67Var) {
        r45.j67 wi6;
        if (!"gh_f0a92aa7146c".equals(str) || (wi6 = wi(str)) == null || wi6.f377616e.size() == 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= wi6.f377616e.size()) {
                i17 = -1;
                break;
            } else if (((r45.i67) wi6.f377616e.get(i17)).f376769d.equals(i67Var.f376769d)) {
                break;
            } else {
                i17++;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "remove pay plugin top msg, index is %s", java.lang.Integer.valueOf(i17));
        if (i17 != -1) {
            wi6.f377616e.remove(i17);
        }
        java.lang.String str2 = "";
        if (wi6.f377616e.size() == 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, "");
            return;
        }
        try {
            str2 = new java.lang.String(wi6.toByteArray(), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPaySevice", "save dataString exp, " + e17.getLocalizedMessage());
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, str2);
    }

    public void Ri(android.app.Activity activity, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "reportLocation %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ((ku5.t0) ku5.t0.f312615d).j(new li3.e(this, i17, i18), "wxpay_report_location");
    }

    public void Ui(int i17) {
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new ss4.e0(null, i17));
    }

    public r45.j67 wi(java.lang.String str) {
        if (!"gh_f0a92aa7146c".equals(str)) {
            return null;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_revert_payplugin_topmsg, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPaySevice", "revert payplugin topmsg abtest is open, return null");
            return null;
        }
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC, "");
        r45.j67 j67Var = new r45.j67();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        try {
            j67Var.parseFrom(str2.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxPaySevice", "parse cacheString exp, " + e17.getLocalizedMessage());
        }
        return j67Var;
    }
}
