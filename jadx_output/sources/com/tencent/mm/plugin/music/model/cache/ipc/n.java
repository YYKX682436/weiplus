package com.tencent.mm.plugin.music.model.cache.ipc;

/* loaded from: classes7.dex */
public abstract class n {
    public static void a(java.lang.String str) {
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.music.model.cache.ipc.a.class);
    }

    public static java.lang.String b() {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.music.model.cache.ipc.b.class);
        if (iPCString == null) {
            return null;
        }
        return iPCString.f68406d;
    }

    public static long c() {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.music.model.cache.ipc.c.class);
        if (iPCLong == null) {
            return 0L;
        }
        return iPCLong.f68405d;
    }

    public static java.lang.String d(java.lang.String str) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.music.model.cache.ipc.d.class);
        if (iPCString == null) {
            return null;
        }
        return iPCString.f68406d;
    }

    public static com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse e(java.lang.String str) {
        return (com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.music.model.cache.ipc.e.class);
    }

    public static int f(int i17) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(i17), com.tencent.mm.plugin.music.model.cache.ipc.f.class);
        return iPCInteger == null ? i17 : iPCInteger.f68404d;
    }

    public static void g(long j17) {
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCLong(j17), com.tencent.mm.plugin.music.model.cache.ipc.h.class);
    }

    public static void h(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest iPCAudioParamRequest = new com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest();
        iPCAudioParamRequest.f150620d = str;
        iPCAudioParamRequest.f150622f = str2;
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, iPCAudioParamRequest, com.tencent.mm.plugin.music.model.cache.ipc.i.class);
    }

    public static boolean i() {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.music.model.cache.ipc.j.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }

    public static void j(java.lang.String str, int i17) {
        com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest iPCAudioParamRequest = new com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest();
        iPCAudioParamRequest.f150620d = str;
        iPCAudioParamRequest.f150621e = i17;
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, iPCAudioParamRequest, com.tencent.mm.plugin.music.model.cache.ipc.m.class);
    }

    public static void k(java.lang.String str, byte[] bArr) {
        com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest iPCAudioParamRequest = new com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest();
        iPCAudioParamRequest.f150620d = str;
        iPCAudioParamRequest.f150623g = bArr;
        com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, iPCAudioParamRequest, com.tencent.mm.plugin.music.model.cache.ipc.k.class);
    }

    public static java.lang.String l(java.lang.String str) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.music.model.cache.ipc.l.class);
        return iPCString == null ? xl3.c.b(str) : iPCString.f68406d;
    }
}
