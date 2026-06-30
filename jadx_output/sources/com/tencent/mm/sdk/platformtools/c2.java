package com.tencent.mm.sdk.platformtools;

/* loaded from: classes4.dex */
public abstract class c2 {
    public static boolean a(android.content.Intent intent) {
        if (intent != null) {
            try {
                intent.hasExtra(java.lang.String.format("%s_wx", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IntentUtil", e17, "", new java.lang.Object[0]);
                return false;
            }
        }
        return true;
    }

    public static boolean b(android.os.Bundle bundle, java.lang.String str, boolean z17) {
        if (bundle == null) {
            return z17;
        }
        try {
            return bundle.getBoolean(str, z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getBooleanExtra exception:%s", e17.getMessage());
            return z17;
        }
    }

    public static boolean c(android.content.Intent intent, java.lang.String str, boolean z17) {
        if (intent == null) {
            return z17;
        }
        try {
            return intent.getBooleanExtra(str, z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getBooleanExtra exception:%s", e17.getMessage());
            return z17;
        }
    }

    public static byte[] d(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getByteArrayExtra(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getByteArrayExtra exception:%s", e17.getMessage());
            return null;
        }
    }

    public static android.os.Bundle e(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getExtras();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getExtras exception:%s", e17.getMessage());
            return null;
        }
    }

    public static int f(android.os.Bundle bundle, java.lang.String str, int i17) {
        if (bundle == null) {
            return i17;
        }
        try {
            return bundle.getInt(str, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", e17.getMessage());
            return i17;
        }
    }

    public static int g(android.content.Intent intent, java.lang.String str, int i17) {
        if (intent == null) {
            return i17;
        }
        try {
            return intent.getIntExtra(str, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", e17.getMessage());
            return i17;
        }
    }

    public static long h(android.os.Bundle bundle, java.lang.String str, long j17) {
        if (bundle == null) {
            return j17;
        }
        try {
            return bundle.getLong(str, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", e17.getMessage());
            return j17;
        }
    }

    public static long i(android.content.Intent intent, java.lang.String str, long j17) {
        if (intent == null) {
            return j17;
        }
        try {
            return intent.getLongExtra(str, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", e17.getMessage());
            return j17;
        }
    }

    public static android.os.Parcelable j(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getParcelableExtra(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getParcelableExtra exception:%s", e17.getMessage());
            return null;
        }
    }

    public static java.lang.String k(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", e17.getMessage());
            return null;
        }
    }

    public static java.lang.String l(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringExtra(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", e17.getMessage());
            return null;
        }
    }

    public static void m(android.content.Intent intent, java.lang.String str, boolean z17) {
        try {
            intent.putExtra(str, z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IntentUtil", e17, "", new java.lang.Object[0]);
        }
    }
}
