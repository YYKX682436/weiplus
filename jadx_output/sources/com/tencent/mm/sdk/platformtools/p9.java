package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class p9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.m9 f192935a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f192936b;

    static {
        com.tencent.mm.sdk.platformtools.m9 m9Var = new com.tencent.mm.sdk.platformtools.m9();
        f192935a = m9Var;
        f192936b = false;
        m9Var.f192868b = new com.tencent.mm.sdk.platformtools.o9();
    }

    public static boolean a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        char charAt = str.charAt(str.length() - 1);
        char charAt2 = str2.charAt(0);
        if (charAt == ' ' || charAt2 == ' ' || charAt == '\n' || charAt2 == '\n' || c(charAt) || c(charAt2)) {
            return false;
        }
        if (charAt == '-' || charAt == '/' || charAt == '\\') {
            return false;
        }
        if ((charAt2 == '-' || charAt2 == '/' || charAt2 == '\\') || d(charAt2)) {
            return false;
        }
        if (!d(charAt)) {
            if (b(charAt) || java.lang.Character.isDigit(charAt)) {
                if (str.charAt(str.length() - 1) == 'n' && str.length() > 1 && str.charAt(str.length() + (-2)) == '\\') {
                    return false;
                }
                if ((str.charAt(str.length() - 1) == 's' && str.length() > 1 && str.charAt(str.length() + (-2)) == '%') && !b(charAt2)) {
                    return false;
                }
            } else if (!b(charAt2) && !java.lang.Character.isDigit(charAt2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(char c17) {
        return (c17 >= 'a' && c17 <= 'z') || (c17 >= 'A' && c17 <= 'Z');
    }

    public static boolean c(char c17) {
        return c17 == 65292 || c17 == 12290 || c17 == 65281 || c17 == 65311 || c17 == 65306 || c17 == 65307 || c17 == 12289 || c17 == 12300 || c17 == 12301;
    }

    public static boolean d(char c17) {
        return c17 == '.' || c17 == ',' || c17 == '?' || c17 == '!' || c17 == ';' || c17 == ':';
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.Object obj;
        java.lang.String str2;
        com.tencent.mm.sdk.platformtools.m9 m9Var = f192935a;
        m9Var.getClass();
        if (str == null) {
            str2 = null;
        } else if (str.length() == 0) {
            str2 = "";
        } else {
            try {
                obj = com.tencent.mm.sdk.platformtools.m9.a(str, m9Var.f192867a);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeChatBrands", th6, "compute place holders error: " + th6.getMessage() + ", input = " + str, new java.lang.Object[0]);
                obj = str;
            }
            str2 = obj instanceof java.lang.String ? (java.lang.String) obj : (java.lang.String) m9Var.f192868b.apply((java.util.List) obj);
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            if (str2.contains("帐") || str2.contains("帳")) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("string value [%s] is wrong", str2));
            }
        }
        return str2;
    }
}
