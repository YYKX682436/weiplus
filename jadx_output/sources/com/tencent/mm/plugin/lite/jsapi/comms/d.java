package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f143542a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f143543b;

    public static void a(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.lite.jsapi.comms.b bVar) {
        java.lang.String f17 = com.tencent.mm.plugin.lite.logic.y2.f(str, "bundle", null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f17);
        sb6.append("MMVideo_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes()));
        sb6.append(".mp4");
        f143543b = sb6.toString();
        f143542a = "MMVideo_" + com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_GameVideoDownloadUI";
        oVar.field_mediaId = f143542a;
        oVar.M1 = str2;
        oVar.H1 = 0;
        oVar.Z = 3;
        oVar.f241809y0 = 4;
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(f143543b));
        oVar.field_fullpath = f143543b;
        oVar.f241815c2 = new com.tencent.mm.plugin.lite.jsapi.comms.a(currentTimeMillis, str2, bVar);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.lite.jsapi.comms.c(oVar), 0L);
    }
}
