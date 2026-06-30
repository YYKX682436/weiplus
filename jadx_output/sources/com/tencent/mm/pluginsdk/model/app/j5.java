package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public abstract class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.l f188948a = new kk.l(10);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f188949b = new java.util.HashMap();

    public static com.tencent.mm.pluginsdk.model.app.h5 a(java.lang.String str, java.lang.String str2, com.tencent.mm.pluginsdk.model.app.i5 i5Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token is null");
            return com.tencent.mm.pluginsdk.model.app.h5.TOKEN_EMPTY;
        }
        if (i5Var == null || !i5Var.f188938e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult tokenData null");
            return com.tencent.mm.pluginsdk.model.app.h5.TOKEN_DATA_NOT_MATCH;
        }
        java.lang.String str3 = i5Var.f188935b;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.equals(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token check success");
            return com.tencent.mm.pluginsdk.model.app.h5.OK;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenSDKTokenUtils", "checkTokenResult token check fail %s/%s", str3, str2);
        return com.tencent.mm.pluginsdk.model.app.h5.PACKAGE_NAME_INVALID;
    }
}
