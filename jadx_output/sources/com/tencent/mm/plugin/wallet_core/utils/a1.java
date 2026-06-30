package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public abstract class a1 {
    public static void a(org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData() json is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneUtil", "parseLuckyMoneySnsPayData()");
        int optInt = jSONObject.optInt("is_open_sns_pay", 0);
        int optInt2 = jSONObject.optInt("can_open_sns_pay", 0);
        int optInt3 = jSONObject.optInt("is_white_user", 0);
        java.lang.String str4 = "";
        if (optInt2 == 1) {
            str = jSONObject.optString("open_sns_pay_title");
            str2 = jSONObject.optString("open_sns_pay_wording");
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_OPEN_SNS_PAY_TITLE_STRING_SYNC, str);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_OPEN_SNS_PAY_WORDING_STRING_SYNC, str2);
        } else {
            str = "";
            str2 = str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneUtil", "is_open_sns_pay:" + optInt + ", can_open_sns_pay:" + optInt2 + ", is_white_user:" + optInt3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("open_sns_pay_title:");
        sb6.append(str);
        sb6.append(", open_sns_pay_wording:");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneUtil", sb6.toString());
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_IS_OPEN_SNS_PAY_INT_SYNC, java.lang.Integer.valueOf(optInt));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_CAN_OPEN_SNS_PAY_INT_SYNC, java.lang.Integer.valueOf(optInt2));
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_IS_WHITE_USER_INT_SYNC, java.lang.Integer.valueOf(optInt3));
        if (optInt3 == 1) {
            str4 = jSONObject.optString("set_sns_pay_title");
            str3 = jSONObject.optString("set_sns_pay_wording");
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_SET_SNS_PAY_TITLE_STRING_SYNC, str4);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEWYEAR_2016_HONGBAO_SET_SNS_PAY_WORDING_STRING_SYNC, str3);
        } else {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletNetSceneUtil", "set_sns_pay_title:" + str4 + ", set_sns_pay_wording:" + str3);
        gm0.j1.i();
        gm0.j1.u().c().i(true);
    }
}
