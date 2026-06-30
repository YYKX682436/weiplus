package com.tencent.mm.plugin.profile;

/* loaded from: classes9.dex */
public abstract class s1 {
    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.storage.z3.M4(str)) {
            return c01.e2.a0() ? context.getString(com.tencent.mm.R.string.f490422uj) : context.getString(com.tencent.mm.R.string.f490423uk);
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            return context.getString(com.tencent.mm.R.string.f490420uh);
        }
        return android.text.TextUtils.isEmpty(str) ? false : str.equals(c01.z1.r()) ? context.getString(com.tencent.mm.R.string.f490420uh) : context.getString(com.tencent.mm.R.string.f490421ui);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.storage.z3.M4(str)) {
            return c01.e2.a0() ? "WeChat" : "Weixin";
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.a9.f192463a;
        return (!yp5.a.f464409a.a() && com.tencent.mm.storage.z3.M4(str)) ? c01.je.r("OfficialAliasName") : str2;
    }

    public static android.text.SpannableString c(android.content.Context context, java.lang.String str, android.text.SpannableString spannableString) {
        return com.tencent.mm.storage.z3.M4(str) ? c01.e2.a0() ? new android.text.SpannableString(context.getString(com.tencent.mm.R.string.f489700a)) : new android.text.SpannableString(context.getString(com.tencent.mm.R.string.f489701b)) : spannableString;
    }

    public static boolean d(java.lang.String str) {
        com.tencent.mm.storage.f9 D5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D5(str, 9223372036854775806L);
        return (D5 == null || D5.getMsgId() == 0) ? false : true;
    }

    public static void e(android.content.Context context, int i17, int i18) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtils", "launchCreatorSetting: context is null");
            return;
        }
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        if (l1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtils", "launchCreatorSetting: BizPersonalCenterPluginAppHelper service is null");
        } else {
            l1Var.Ui(new com.tencent.mm.plugin.profile.r1(i17, l1Var, i18, context));
        }
    }
}
