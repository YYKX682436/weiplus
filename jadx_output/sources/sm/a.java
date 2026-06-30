package sm;

/* loaded from: classes10.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.m2.l(str)) {
            return "words-en.json";
        }
        if (str.equals("in")) {
            str = dm.i4.COL_ID;
        }
        return "words-" + str + ".json";
    }

    public static java.lang.String b() {
        java.lang.String str;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (c()) {
            str = "brand/2/" + a(str2);
        } else {
            str = "brand/1/" + a(str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XAgreementResManager", "getDefWordsTablePath:  targetLang:%s, isWeChatUser:%s, wordPath:%s ", str2, java.lang.String.valueOf(c()), str);
        return str;
    }

    public static boolean c() {
        int o17;
        if ((com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).o("repairer_separation_use_default_agreement", 1) != 1) && (o17 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).o("repairer_separation_agreement", -1)) != -1) {
            if (o17 == 0) {
                return false;
            }
            if (o17 == 1) {
                return true;
            }
        }
        return !(android.text.TextUtils.isEmpty(com.tencent.mm.sdk.platformtools.o4.M("mmkv_crossprocess_infos").u("mmkv_key_user_reg_ic", null)) ? com.tencent.mm.sdk.platformtools.a9.f192463a.equals("zh_CN") : "CN".equalsIgnoreCase(r0));
    }
}
