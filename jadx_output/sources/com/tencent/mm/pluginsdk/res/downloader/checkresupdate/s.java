package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes8.dex */
public abstract class s {
    public static final java.lang.String a(int i17, int i18) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().b(i17, i18);
        }
        try {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) uk0.a.d(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateIPCUtils$QueryArgs(i17, i18), com.tencent.mm.pluginsdk.res.downloader.checkresupdate.r.f189634a);
            if (iPCString != null) {
                return iPCString.f68406d;
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CheckResUpdateIPCUtils", "getCachedFilePath(" + i17 + ',' + i18 + "), get exception:" + e17);
            return null;
        }
    }
}
