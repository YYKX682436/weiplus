package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class h0 implements com.tencent.mm.vfs.v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.h0 f212964a = new com.tencent.mm.vfs.h0();

    @Override // com.tencent.mm.vfs.v5
    public final void a(java.lang.String id6, com.tencent.mm.vfs.FileSystem fileSystem, int i17, java.util.Map p17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(fileSystem, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(p17, "p");
        java.lang.Object obj = p17.get("op");
        java.lang.String str2 = (java.lang.String) com.tencent.mm.vfs.j0.f213009b.get(obj);
        if (str2 == null) {
            str2 = java.lang.String.valueOf(obj);
        }
        java.lang.Object obj2 = p17.get("result");
        java.lang.String str3 = (java.lang.String) com.tencent.mm.vfs.j0.f213010c.get(obj2);
        if (str3 == null) {
            str3 = java.lang.String.valueOf(obj2);
        }
        java.lang.Object obj3 = p17.get(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        java.lang.Object obj4 = p17.get("targetFS");
        java.lang.Object obj5 = p17.get("targetPath");
        if (obj4 == null) {
            str = "[" + id6 + "] (" + str2 + ") " + obj3 + " : " + str3;
        } else {
            str = "[" + id6 + "] (" + str2 + ") " + obj3 + " -> " + obj5 + '(' + obj4 + ") : " + str3;
        }
        if (!kotlin.jvm.internal.o.b(p17.get("result"), 2)) {
            com.tencent.mars.xlog.Log.i("VFS.AccessLog", str);
            return;
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError("Operation rejected: " + str);
        if (!com.tencent.mm.vfs.i0.f212989a) {
            if (z65.c.a()) {
                throw assertionError;
            }
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (com.tencent.mm.vfs.e8.j("vfs_db_protect_assert") > 0) {
            throw assertionError;
        }
        com.tencent.mars.xlog.Log.printErrStackTrace("VFS.AccessLog", assertionError, "", new java.lang.Object[0]);
    }
}
