package x51;

/* loaded from: classes8.dex */
public abstract class q0 {
    public static boolean a(android.content.Context context, java.lang.String str) {
        android.accounts.Account[] b17 = b(context);
        if (b17 != null && b17.length != 0) {
            for (android.accounts.Account account : b17) {
                if (account.name.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static android.accounts.Account[] b(android.content.Context context) {
        try {
            return android.accounts.AccountManager.get(context).getAccountsByType("com.tencent.mm.account");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAccountManager", "get all accounts failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAccountManager", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String c(android.content.Context context) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAccountManager", "getCurrentAccountName MMCore.acc Not Ready");
            return "";
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(4, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = c01.z1.c();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = c01.z1.r();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.storage.z3.y3(str)) {
                    str = "";
                }
            }
        }
        try {
            return java.util.regex.Pattern.compile("[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#¥￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(str).replaceAll("_").trim();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAccountManager", "stringFilter failed, %s, %s", str, e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAccountManager", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static boolean d(android.content.Context context) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(null);
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAccountManager", "null context");
            return false;
        }
        try {
            android.accounts.Account[] b17 = b(context);
            if (b17 != null && b17.length != 0) {
                android.accounts.AccountManager accountManager = android.accounts.AccountManager.get(context);
                for (android.accounts.Account account : b17) {
                    if (K0) {
                        accountManager.removeAccount(account, null, null);
                    } else if (account.name.equals(null)) {
                        accountManager.removeAccount(account, null, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMAccountManager", "remove account success: " + ((java.lang.String) null));
                    }
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMAccountManager", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMAccountManager", "exception in removeAccount() " + e17.getMessage());
            return false;
        }
    }
}
