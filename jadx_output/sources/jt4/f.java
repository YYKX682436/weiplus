package jt4;

/* loaded from: classes9.dex */
public abstract class f {
    public static java.lang.String a(android.content.Context context, java.lang.String... strArr) {
        java.lang.String string = context.getString(com.tencent.mm.R.string.l0g);
        if (strArr == null || strArr.length <= 0) {
            return string;
        }
        for (java.lang.String str : strArr) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return str;
            }
        }
        return string;
    }

    public static boolean b(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, com.tencent.mm.modelbase.m1 m1Var, int i17, java.lang.String str, int i18, java.lang.String str2) {
        if (i18 == 0) {
            str2 = str;
        } else {
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "finalRetCode: %s, finalRetMsg: %s", java.lang.Integer.valueOf(i17), str2);
        if (i17 != 269293577) {
            return np5.t.a(walletBaseUI, m1Var, 1000, i17, str2);
        }
        db5.e1.G(walletBaseUI, str, "", false, new jt4.d());
        return true;
    }

    public static boolean c(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, r45.ka5 ka5Var) {
        if (ka5Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "no popItem");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(ka5Var.f378561d)) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ka5Var.f378563f) && !com.tencent.mm.sdk.platformtools.t8.K0(ka5Var.f378562e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "show guide info 1");
            db5.e1.C(walletBaseUI, ka5Var.f378561d, "", ka5Var.f378563f, ka5Var.f378562e, false, new jt4.a(ka5Var, walletBaseUI, null), new jt4.b(ka5Var, walletBaseUI));
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(ka5Var.f378562e)) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "show guide info 2");
            db5.e1.E(walletBaseUI, ka5Var.f378561d, "", ka5Var.f378562e, false, new jt4.c(ka5Var, walletBaseUI));
        }
        return true;
    }

    public static void d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, com.tencent.mm.wallet_core.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ECardUtil", "start open ecard process, scene: %s, token==null%s, eCardType: %s, extraData: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str)), str2, str3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_open_scene", i17);
        bundle.putString("key_open_token", str);
        bundle.putString("key_ecard_type", str2);
        bundle.putString("key_open_extra_data", str3);
        com.tencent.mm.wallet_core.a.j((android.app.Activity) context, kt4.r.class, bundle, gVar);
    }
}
