package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class b2 {
    public static java.lang.String a(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        switch (i17) {
            case 1:
                return i65.a.r(context, com.tencent.mm.R.string.kr7);
            case 2:
                return i65.a.r(context, com.tencent.mm.R.string.krb);
            case 3:
                return i65.a.r(context, com.tencent.mm.R.string.krc);
            case 4:
                return i65.a.r(context, com.tencent.mm.R.string.krd);
            case 5:
                return i65.a.r(context, com.tencent.mm.R.string.kre);
            case 6:
                return i65.a.r(context, com.tencent.mm.R.string.krf);
            case 7:
                return i65.a.r(context, com.tencent.mm.R.string.krg);
            case 8:
                return i65.a.r(context, com.tencent.mm.R.string.krh);
            case 9:
                return i65.a.r(context, com.tencent.mm.R.string.kri);
            case 10:
                return i65.a.r(context, com.tencent.mm.R.string.kr8);
            case 11:
                return i65.a.r(context, com.tencent.mm.R.string.kr9);
            case 12:
                return i65.a.r(context, com.tencent.mm.R.string.kr_);
            case 13:
                return i65.a.r(context, com.tencent.mm.R.string.kra);
            default:
                return "";
        }
    }

    public static boolean b(android.content.Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra("key_pay_reslut_type", 0)) != 1000) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intExtra);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayUtil", "onActivityResult isCanFinish %s %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        return true;
    }

    public static boolean c(android.content.Intent intent) {
        int intExtra;
        if (intent == null || (intExtra = intent.getIntExtra("key_pay_reslut_type", 0)) != 1001) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intExtra);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPayUtil", "onActivityResult isCanIgnore %s %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        return true;
    }
}
