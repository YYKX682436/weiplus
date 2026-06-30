package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static long f180853a;

    public static java.lang.String a(int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("EnterScene", i17);
            return jSONObject.toString();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static void b(android.app.Activity activity, int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10932, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }

    public static void c(android.app.Activity activity, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, com.tencent.mm.plugin.wallet_core.model.Orders orders, int i17) {
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || payInfo == null || orders == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10725, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(payInfo.f192109e), java.lang.Integer.valueOf((int) (orders.f179678h * 100.0d)), orders.f179681m);
    }

    public static void d(android.app.Activity activity, android.os.Bundle bundle, int i17) {
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(activity);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || g17 == null || !g17.s()) {
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || bundle == null || !bundle.getBoolean("key_is_bind_reg_process", false)) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10932, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bundle.getInt("key_bind_scene", 0)));
            return;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = (com.tencent.mm.pluginsdk.wallet.PayInfo) bundle.getParcelable("key_pay_info");
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) bundle.getParcelable("key_orders");
        if (payInfo == null || orders == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10725, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(payInfo.f192109e), java.lang.Integer.valueOf((int) (orders.f179678h * 100.0d)), orders.f179681m);
    }

    public static void e() {
        f180853a = java.lang.System.currentTimeMillis();
    }
}
