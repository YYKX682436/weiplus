package d83;

/* loaded from: classes15.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f226959b;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.ilink.CloudSession f226963f;

    /* renamed from: a, reason: collision with root package name */
    public static final d83.e0 f226958a = new d83.e0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f226960c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static kotlinx.coroutines.y0 f226961d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f226962e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f226964g = jz5.h.b(d83.d0.f226955d);

    /* renamed from: h, reason: collision with root package name */
    public static final d83.y f226965h = new d83.y();

    public final void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.WeChatMars.loadDependentLibrariesAll();
        fp.d0.n("ilink2");
        fp.d0.n("ilink_network");
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "initILink, process:" + bm5.f1.a());
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("ILinkCache");
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "initILink dir: %s", c17);
        int logLevel = com.tencent.mars.xlog.Log.getLogLevel();
        com.tencent.ilink.network.IlinkLogLevel ilinkLogLevel = logLevel != 0 ? logLevel != 1 ? logLevel != 2 ? logLevel != 3 ? logLevel != 4 ? logLevel != 5 ? com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelNone : com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelFatal : com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelError : com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelWarn : com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelInfo : com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelDebug : com.tencent.ilink.network.IlinkLogLevel.kIlinkLogLevelVerbose;
        com.tencent.ilink.base.IlinkLogMode ilinkLogMode = (com.tencent.mm.sdk.platformtools.s9.f192974b || com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a()) ? com.tencent.ilink.base.IlinkLogMode.kIlinkLogModeSync : com.tencent.ilink.base.IlinkLogMode.kIlinkLogModeAsync;
        com.tencent.ilink.IlinkLogManager.getInstance().init(com.tencent.ilink.base.IlinkLogConfig.newBuilder().setLevel(ilinkLogLevel).setCustomLog(true).setLogMode(ilinkLogMode).setEnableConsole(false).setEnableFilter(false).setConfigXlog(false).build());
        com.tencent.ilink.IlinkLogManager.getInstance().open("", null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "WeChatEnvironment = false " + com.tencent.mm.sdk.platformtools.s9.f192974b + ' ' + com.tencent.mm.sdk.platformtools.s9.f192975c + ' ' + z65.c.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "XLOG level = " + com.tencent.mars.xlog.Log.getLogLevel() + ", ZLOG level = " + ilinkLogLevel + " mode = " + ilinkLogMode);
        com.tencent.ilink.network.IlinkStartConfig appVersion = com.tencent.ilink.network.IlinkStartConfig.newBuilder().setFileDir(c17).setAppVersion(o45.wf.f343029g);
        java.lang.String str = wo.q.f447780a;
        kotlin.jvm.internal.o.f(str, "DEVICE_TYPE(...)");
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.ilink.IlinkContext.getInstance().init(appVersion.setWechatDevicetype(new com.tencent.mm.protobuf.g(bytes, 0, bytes.length)).setDebugNet(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ilink.RepairerConfigILinkEnableDebugNet())).setEnableCdnDnsLimit(false).build());
        com.tencent.mm.app.w.INSTANCE.a(f226965h);
        ((com.tencent.mm.plugin.ilink.net_change.a) ((jz5.n) f226964g).getValue()).a();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ILinkInitMgr", "initILink: mainProcess, set cloud proxy callback");
            com.tencent.ilink.CloudSession cloudSession = com.tencent.ilink.IlinkContext.getInstance().getCloudSession();
            f226963f = cloudSession;
            kotlin.jvm.internal.o.d(cloudSession);
            cloudSession.config("wechat");
            com.tencent.ilink.CloudSession cloudSession2 = f226963f;
            kotlin.jvm.internal.o.d(cloudSession2);
            cloudSession2.subscribeSendCloudCgiRequestEvent("ILinkInitMgr.initILink", d83.b0.f226952a);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkInitMgr", "finished init ilink cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
