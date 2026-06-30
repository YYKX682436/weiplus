package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f143694a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f143695b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f143696c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f143697d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f143698e;

    public o(java.lang.String fileId, java.lang.String aesKey, java.lang.String fileName, java.lang.String md52) {
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(md52, "md5");
        this.f143694a = fileId;
        this.f143695b = aesKey;
        this.f143696c = fileName;
        this.f143697d = md52;
        com.tencent.mm.vfs.r6 r6Var = com.tencent.mm.plugin.lite.jsapi.comms.q.f143720g;
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(fileId, false, true);
        com.tencent.mm.vfs.z7 z7Var = r6Var == null ? com.tencent.mm.vfs.z7.f213276i : r6Var.f213166d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str = z7Var.f213279f;
            z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str + '/' + l17, z7Var.f213280g, z7Var.f213281h);
        }
        java.lang.String z7Var2 = z7Var.toString();
        kotlin.jvm.internal.o.f(z7Var2, "getPath(...)");
        this.f143698e = z7Var2;
    }
}
