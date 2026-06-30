package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public abstract class j1 {
    public static void a(int i17, java.lang.String str, java.lang.String str2, int i18, com.tencent.mm.pluginsdk.model.app.f5 f5Var, int i19) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return;
        }
        int i27 = 2;
        if (i18 == 2) {
            i27 = 1;
        } else if (i18 != 5 && i18 != 27) {
            i27 = 0;
        }
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = str == null ? "" : str;
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            java.util.Objects.toString(f5Var);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24194, java.lang.Integer.valueOf(i17), str4, str3, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(f5Var.f188899d), java.lang.Integer.valueOf(i19));
    }

    public static java.lang.String b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtilities", "buildSourceUrl fail, invalid arguments");
            return null;
        }
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        if (o17 == null || o17.length() == 0) {
            o17 = "zh_CN";
        } else if (o17.equals("en")) {
            o17 = "en_US";
        }
        return context.getString(com.tencent.mm.R.string.hf_, str, java.lang.Integer.valueOf(o45.wf.f343029g), o17, wo.q.f447780a, str2);
    }

    public static java.lang.String c(android.app.Activity activity) {
        java.lang.String str;
        android.net.Uri referrer;
        android.content.ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppUtilities", "get calling activity, %s", str);
        } else {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                java.lang.Object a17 = new yo.b(activity, "mReferrer", null).a();
                if (a17 != null) {
                    str = (java.lang.String) a17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppUtilities", "get referrer, %s", str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppUtilities", e17, "get mReferrer error", new java.lang.Object[0]);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) || (referrer = activity.getReferrer()) == null) {
            return str;
        }
        java.lang.String authority = referrer.getAuthority();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppUtilities", "get referrer, %s", authority);
        return authority;
    }

    public static java.lang.String d(android.content.Context context, java.lang.String str) {
        android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str, false);
        if (a17 != null && a17.length != 0) {
            return kk.k.g(a17[0].toByteArray());
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppUtilities", "signs is null");
        return null;
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str.toLowerCase());
        stringBuffer.append("mMHc ItnStR");
        return kk.k.g(stringBuffer.toString().getBytes());
    }

    public static boolean f(android.content.Context context, java.lang.String str) {
        return ik1.b.a(context, str) != null;
    }

    public static void g(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_KEY, com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_VALUE_MSG);
        }
    }

    public static void h(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, "wechat");
        }
    }

    public static void i(android.os.Bundle bundle, java.lang.String str) {
        if (bundle != null) {
            bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY, "wechat");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_LAUNCH_PARAM_KEY, str);
        }
    }
}
