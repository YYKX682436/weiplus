package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static r.a f192732a = new com.tencent.mm.sdk.platformtools.i1$$a();

    public static android.net.Uri a(android.content.Context context, com.tencent.mm.vfs.r6 r6Var) {
        if (((java.lang.Boolean) f192732a.apply(r6Var.o())).booleanValue()) {
            return b(context, r6Var);
        }
        throw new java.lang.IllegalArgumentException("Path cannot be exported: " + r6Var);
    }

    public static android.net.Uri b(android.content.Context context, com.tencent.mm.vfs.r6 r6Var) {
        if (com.tencent.mm.sdk.platformtools.s9.f192975c && !c(r6Var.o())) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("WorkProfiles", com.tencent.mm.sdk.platformtools.c7.c(context));
            linkedHashMap.put("DATA_ROOT", lp0.b.e());
            ap.a.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "UriFile", new java.lang.Throwable(), linkedHashMap, "shareUnExportablePath", r6Var.o());
        }
        try {
            return com.tencent.mm.vfs.VFSFileProvider.getUriForFile(context.getPackageName() + ".external.fileprovider", r6Var);
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.w("MicroMsg.VFSFileOp", e17.getMessage());
            return null;
        }
    }

    public static boolean c(java.lang.String str) {
        if (((java.lang.Boolean) f192732a.apply(str)).booleanValue()) {
            return true;
        }
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        java.lang.String str2 = "/data/data/" + com.tencent.mm.sdk.platformtools.x2.f193072b + "/";
        if (!str.startsWith(str2)) {
            return false;
        }
        return ((java.lang.Boolean) f192732a.apply(str.replace(str2, lp0.b.X()))).booleanValue();
    }

    public static void d(android.content.Context context, android.content.Intent intent, android.net.Uri uri, java.lang.String str, boolean z17) {
        java.lang.String scheme = uri.getScheme();
        if (scheme == null || scheme.isEmpty() || scheme.equals("file") || scheme.equals("wcf")) {
            f(context, intent, new com.tencent.mm.vfs.r6(uri.getPath()), str, z17);
            return;
        }
        intent.setDataAndType(uri, str);
        intent.addFlags(1);
        if (z17) {
            intent.addFlags(2);
        }
    }

    public static void e(android.content.Context context, android.content.Intent intent, com.tencent.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2, boolean z17) {
        android.net.Uri b17 = b(context, r6Var);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (b17 != null && !android.text.TextUtils.isEmpty(str)) {
            b17 = b17.buildUpon().appendQueryParameter("displayName", str).build();
        }
        intent.setDataAndType(b17, str2).addFlags(z17 ? 3 : 1);
    }

    public static void f(android.content.Context context, android.content.Intent intent, com.tencent.mm.vfs.r6 r6Var, java.lang.String str, boolean z17) {
        e(context, intent, r6Var, null, str, z17);
    }
}
