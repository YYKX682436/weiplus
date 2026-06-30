package com.tencent.mm.xlog.app;

/* loaded from: classes12.dex */
public class XLogSetup {
    public static java.lang.Boolean appendIsSync;
    public static java.lang.String cachePath;
    public static java.lang.Boolean isLogcatOpen;
    public static java.lang.String logPath;
    public static java.lang.String nameprefix;
    private static boolean setup;
    public static java.lang.Integer toolsLevel;
    public static com.tencent.mars.xlog.MMXlog xlog = new com.tencent.mars.xlog.MMXlog();
    public static boolean hasInit = false;

    public static void keep_setupXLog(boolean z17, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3) {
        if (!hasInit) {
            com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
            com.tencent.mars.comm.PlatformComm.C2Java.setCallback(new com.tencent.mars.comm.PlatformCommC2JavaCallBack());
            com.tencent.mars.comm.MarsPlatformComm.setContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.comm.NetworkSignalUtil.setMyNetworkSignalUtil(new com.tencent.mars.comm.NetworkSignalUtilImpl());
            ((ku5.t0) ku5.t0.f312615d).a(new vq5.a$$a());
            hasInit = true;
        }
        cachePath = str;
        logPath = str2;
        toolsLevel = num;
        appendIsSync = bool;
        isLogcatOpen = bool2;
        nameprefix = str3;
        if (z17 && !setup) {
            setup = true;
            fp.d0.o("wechatxlog");
            fp.d0.o(com.tencent.mars.WeChatMars.libMarsComm);
            xlog.setConsoleLogOpen(0L, isLogcatOpen.booleanValue());
            if (toolsLevel == null) {
                xlog.appenderOpen(2, 0, cachePath, logPath, nameprefix, 3);
                xlog.setMaxAliveTime(0L, 345600L);
                com.tencent.mars.xlog.LogLogic.initIPxxLogInfo();
            } else {
                xlog.appenderOpen(toolsLevel.intValue(), bool.booleanValue() ? 1 : 0, cachePath, logPath, nameprefix, 0);
                xlog.setMaxAliveTime(0L, 604800L);
            }
            com.tencent.mm.sdk.platformtools.Log.j(xlog);
            java.util.Set set = com.tencent.mm.sdk.platformtools.o4.f192893i;
            com.tencent.mars.xlog.Log.i("MMKV", "reset handler");
            com.tencent.mmkv.MMKV.registerHandler(com.tencent.mm.sdk.platformtools.n4.f192870a);
            jz5.g gVar = up.g.f429760a;
            if (!com.tencent.mm.sdk.platformtools.z.f193123s) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CsoStartup", "skip initialize because cso is not enabled");
                return;
            }
            java.lang.String mapLibraryName = java.lang.System.mapLibraryName("wechatxlog");
            com.tencent.mm.cso.log.CsoLog.startXLogEngine(mapLibraryName);
            com.tencent.mars.xlog.Log.i("MicroMsg.CsoStartup", "pending xlog engine " + mapLibraryName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$keep_setupXLog$0() {
        com.tencent.mars.comm.PlatformComm.init(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.os.Handler(android.os.Looper.getMainLooper()));
    }

    public static void realSetupXlog() {
        keep_setupXLog(true, cachePath, logPath, toolsLevel, appendIsSync, isLogcatOpen, nameprefix);
    }
}
