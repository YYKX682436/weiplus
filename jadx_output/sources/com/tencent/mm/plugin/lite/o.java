package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r2 = com.tencent.mm.plugin.lite.p.f144149a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "copyLibs file " + r7);
        r2 = com.tencent.mm.vfs.w6.N("assets:///LiteappBaseLib/" + r7, 0, -1);
        com.tencent.mm.vfs.w6.u(r5.o());
        r8 = new com.tencent.mm.vfs.r6(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        if (r8.m() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        r8.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        com.tencent.mm.vfs.w6.R(r8.o(), r2);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "copyBundlePackage path: %s", r8.o());
        com.tencent.mm.mm7zip.SevenZipUtil.extract(com.tencent.mm.vfs.w6.i(r8.o(), false), com.tencent.mm.vfs.w6.i(r1, true));
        r8.l();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.LiteAppProcessProfileInit"
            java.lang.String r1 = com.tencent.mm.plugin.lite.logic.y2.a()
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.AssetManager r2 = r2.getAssets()
            java.lang.String r3 = "LiteappBaseLib"
            java.lang.String[] r2 = r2.list(r3)
            r3 = 0
            if (r2 == 0) goto Ld0
            r4 = -1
            com.tencent.mm.plugin.lite.o r5 = com.tencent.mm.plugin.lite.p.f144149a     // Catch: java.lang.Exception -> Lc5
            java.lang.String r5 = "LiteappBaseLib files count: %d"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lc5
            int r8 = r2.length     // Catch: java.lang.Exception -> Lc5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lc5
            r7[r3] = r8     // Catch: java.lang.Exception -> Lc5
            com.tencent.mars.xlog.Log.i(r0, r5, r7)     // Catch: java.lang.Exception -> Lc5
            boolean r5 = com.tencent.mm.vfs.w6.j(r1)     // Catch: java.lang.Exception -> Lc5
            if (r5 == 0) goto L30
            com.tencent.mm.vfs.w6.g(r1, r6)     // Catch: java.lang.Exception -> Lc5
        L30:
            com.tencent.mm.vfs.w6.u(r1)     // Catch: java.lang.Exception -> Lc5
            com.tencent.mm.vfs.r6 r5 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> Lc5
            android.content.Context r7 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> Lc5
            java.io.File r7 = r7.getCacheDir()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = "liteapp"
            r5.<init>(r7, r8)     // Catch: java.lang.Exception -> Lc5
            java.util.Iterator r2 = kotlin.jvm.internal.c.a(r2)     // Catch: java.lang.Exception -> Lc5
        L44:
            r7 = r2
            kotlin.jvm.internal.b r7 = (kotlin.jvm.internal.b) r7     // Catch: java.lang.Exception -> Lc5
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> Lc5
            if (r8 == 0) goto Ld0
            java.lang.Object r7 = r7.next()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> Lc5
            kotlin.jvm.internal.o.d(r7)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = ".7z"
            boolean r8 = r26.i0.n(r7, r8, r3)     // Catch: java.lang.Exception -> Lc5
            if (r8 == 0) goto L44
            com.tencent.mm.plugin.lite.o r2 = com.tencent.mm.plugin.lite.p.f144149a     // Catch: java.lang.Exception -> Lc5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            r2.<init>()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = "copyLibs file "
            r2.append(r8)     // Catch: java.lang.Exception -> Lc5
            r2.append(r7)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Exception -> Lc5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc5
            r2.<init>()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = "assets:///LiteappBaseLib/"
            r2.append(r8)     // Catch: java.lang.Exception -> Lc5
            r2.append(r7)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc5
            byte[] r2 = com.tencent.mm.vfs.w6.N(r2, r3, r4)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r8 = r5.o()     // Catch: java.lang.Exception -> Lc5
            com.tencent.mm.vfs.w6.u(r8)     // Catch: java.lang.Exception -> Lc5
            com.tencent.mm.vfs.r6 r8 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> Lc5
            r8.<init>(r5, r7)     // Catch: java.lang.Exception -> Lc5
            boolean r5 = r8.m()     // Catch: java.lang.Exception -> Lc5
            if (r5 == 0) goto L9e
            r8.l()     // Catch: java.lang.Exception -> Lc5
        L9e:
            java.lang.String r5 = r8.o()     // Catch: java.lang.Exception -> Lc5
            com.tencent.mm.vfs.w6.R(r5, r2)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = "copyBundlePackage path: %s"
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lc5
            java.lang.String r7 = r8.o()     // Catch: java.lang.Exception -> Lc5
            r5[r3] = r7     // Catch: java.lang.Exception -> Lc5
            com.tencent.mars.xlog.Log.i(r0, r2, r5)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = r8.o()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r2 = com.tencent.mm.vfs.w6.i(r2, r3)     // Catch: java.lang.Exception -> Lc5
            java.lang.String r1 = com.tencent.mm.vfs.w6.i(r1, r6)     // Catch: java.lang.Exception -> Lc5
            com.tencent.mm.mm7zip.SevenZipUtil.extract(r2, r1)     // Catch: java.lang.Exception -> Lc5
            r8.l()     // Catch: java.lang.Exception -> Lc5
            goto Ld0
        Lc5:
            r1 = move-exception
            com.tencent.mm.plugin.lite.o r2 = com.tencent.mm.plugin.lite.p.f144149a
            java.lang.String r2 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r2, r3)
            return r4
        Ld0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.o.a():int");
    }

    public final com.tencent.liteapp.report.WxaLiteAppStartReport b(int i17, com.tencent.liteapp.report.WxaLiteAppStartReport reportLiteApp) {
        kotlin.jvm.internal.o.g(reportLiteApp, "reportLiteApp");
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "doInit");
        synchronized (this) {
            com.tencent.mm.plugin.lite.o oVar2 = com.tencent.mm.plugin.lite.p.f144149a;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.tencent.mm.plugin.lite.p.f144150b;
            if (atomicBoolean.get()) {
                com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = reportLiteApp.I;
                if (liteAppReporter != null) {
                    liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.BASE_ENVIRONMENT_PRELOADED);
                    reportLiteApp.I.logStart(com.tencent.liteapp.gen.StartAction.LOAD_BASE_ENVIRONMENT_SUCCESS);
                }
                reportLiteApp.f46013w = true;
                reportLiteApp.f46010t = true;
                if (i17 == 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1404, 1);
                } else if (i17 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1404, 3);
                }
                reportLiteApp.f46001h = true;
                return reportLiteApp;
            }
            atomicBoolean.set(true);
            com.tencent.mm.plugin.lite.p.f144155g = com.tencent.mm.sdk.platformtools.t8.m1(com.tencent.mm.booter.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a).a(".com.tencent.mm.debug.liteapp.not.use.bundle.package"), false);
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter2 = reportLiteApp.I;
            if (liteAppReporter2 != null) {
                liteAppReporter2.logStart(com.tencent.liteapp.gen.StartAction.LOAD_BASE_ENVIRONMENT);
            }
            reportLiteApp.f46000g = true;
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter3 = reportLiteApp.I;
            if (liteAppReporter3 != null) {
                liteAppReporter3.logStart(com.tencent.liteapp.gen.StartAction.BASE_ENVIRONMENT_NOT_PRELOADED);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "real doInit");
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            kotlin.jvm.internal.o.d(stackTrace);
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                com.tencent.mm.plugin.lite.o oVar3 = com.tencent.mm.plugin.lite.p.f144149a;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", stackTraceElement.toString());
            }
            com.tencent.mm.plugin.lite.w.initLib();
            com.tencent.mm.plugin.lite.o oVar4 = com.tencent.mm.plugin.lite.p.f144149a;
            if (!com.tencent.mm.plugin.lite.p.f144151c) {
                oVar4.e(reportLiteApp);
            }
            oVar4.c(reportLiteApp);
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter4 = reportLiteApp.I;
            if (liteAppReporter4 != null) {
                liteAppReporter4.logStart(com.tencent.liteapp.gen.StartAction.LOAD_BASE_ENVIRONMENT_SUCCESS);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1404, i17);
            reportLiteApp.f46013w = false;
            reportLiteApp.f46010t = false;
            reportLiteApp.f46001h = false;
            return reportLiteApp;
        }
    }

    public final void c(com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport) {
        q93.g gVar;
        p93.d dVar;
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "start init lvcpp");
        com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(com.tencent.mm.ui.bk.C());
        com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem = false;
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("wxalitec8a16f9bf80f65dffb97cdf7760c1142", "debugPannel", com.tencent.mm.plugin.lite.jsapi.module.LiteAppDebugPannelModule.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("gyroscope", com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("motion", com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleMotion.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("nfc", com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("secure", com.tencent.mm.plugin.lite.secure.LiteAppSecureModule.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("wx", com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleWx.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("login", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.m3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("session", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.g7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("startWebView", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.s7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openUserProfile", (java.lang.Class<? extends jd.b>) y93.c.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("doGoToRecVideoList", (java.lang.Class<? extends jd.b>) y93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.l.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.h3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("sendAppMessage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.q6.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("sendTextMessage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.f7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openWeClawChatPage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.j4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("webSendAppMessage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.v7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.m7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("webShareTimeline", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.w7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderView", (java.lang.Class<? extends jd.b>) t93.u.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openChannelsFinderSetting", (java.lang.Class<? extends jd.b>) t93.i.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("preloadFinderFeed", (java.lang.Class<? extends jd.b>) t93.v.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("handleFinderJump", (java.lang.Class<? extends jd.b>) t93.f.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.google.android.gms.common.Scopes.PROFILE, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.j5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("addContact", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.k.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("preloadMiniProgramContacts", (java.lang.Class<? extends jd.b>) n93.d.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("preloadMiniProgramEnv", (java.lang.Class<? extends jd.b>) n93.e.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.cf.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.z7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("batchAddCard", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.r.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("calRqt", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.t.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("jumpToBizProfile", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.c3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderTopicView", (java.lang.Class<? extends jd.b>) t93.t.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderPostView", (java.lang.Class<? extends jd.b>) t93.p.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getFinderLivePreviewUrl", (java.lang.Class<? extends jd.b>) t93.e.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderCreateAcctView", (java.lang.Class<? extends jd.b>) t93.l.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderCreateContactHalfVC", (java.lang.Class<? extends jd.b>) t93.n.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.f.NAME, (java.lang.Class<? extends jd.b>) t93.h.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.finder.h0.NAME, (java.lang.Class<? extends jd.b>) t93.q.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.finder.g0.NAME, (java.lang.Class<? extends jd.b>) t93.j.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderSearchView", (java.lang.Class<? extends jd.b>) t93.r.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderTimeLineView", (java.lang.Class<? extends jd.b>) t93.s.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getFinderAliasInfos", (java.lang.Class<? extends jd.b>) t93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("prerenderMiniProgram", (java.lang.Class<? extends jd.b>) n93.c.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("verifiyWXPassword", (java.lang.Class<? extends jd.b>) t93.w.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("webTransfer", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.y7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("downloadGameVideo", (java.lang.Class<? extends jd.b>) u93.b.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getFinderLivePreviewMicCover", (java.lang.Class<? extends jd.b>) t93.c.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("uploadGameMediaFile", (java.lang.Class<? extends jd.b>) u93.n.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("wxalite5d5719b5b15738e645a321789ebccb5d", "getUin", com.tencent.mm.plugin.lite.jsapi.comms.y2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("startGameLifeConversation", (java.lang.Class<? extends jd.b>) u93.l.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openGameLifeChatroom", (java.lang.Class<? extends jd.b>) u93.i.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("quitGameLifeChatroom", (java.lang.Class<? extends jd.b>) u93.k.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("chatRoomAtMember", (java.lang.Class<? extends jd.b>) u93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getAccountInfo", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.n2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("setBackgroundAudioStateMV", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("extTransfer", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.k2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.contact.c0.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.h2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.finder.z0.NAME, (java.lang.Class<? extends jd.b>) t93.y.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getLiveInfo", (java.lang.Class<? extends jd.b>) t93.a0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("liveCustomBusiness", (java.lang.Class<? extends jd.b>) t93.g.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.finder.v.NAME, (java.lang.Class<? extends jd.b>) t93.b0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openYuanbaoGenImage", (java.lang.Class<? extends jd.b>) v93.d.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getAdInfoWithPosId", (java.lang.Class<? extends jd.b>) v93.b.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("reportAdWithPosId", (java.lang.Class<? extends jd.b>) v93.f.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("postDataToMiniProgram", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.y4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("closeWindow", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.b0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.finder.f0.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.p3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getMsgProofItems", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.t2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(dc1.e.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.v3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("doExposePreparation", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.h0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("chooseChatRoomMember", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.x.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("privateGetContext", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.d5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("selectBank", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.p6.class);
        if (i95.n0.c(s43.k.class) != null) {
            ((com.tencent.mm.plugin.game.luggage.e0) ((s43.k) i95.n0.c(s43.k.class))).getClass();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.NAME, z43.f.class);
            hashMap.put("bookDownloadGame", z43.h.class);
            hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.appdownload.x.NAME, z43.i.class);
            hashMap.put("getDownloadWidgetTaskInfos", z43.k.class);
            hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.NAME, z43.m.class);
            hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.NAME, z43.q.class);
            hashMap.put("jumpDownloaderWidget", z43.s.class);
            hashMap.put("launchApplication", z43.x.class);
            hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.NAME, z43.d0.class);
            hashMap.put("openGameUrlWithExtraWebView", z43.a0.class);
            hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.appdownload.l1.NAME, z43.f0.class);
            hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.pc.NAME, z43.i0.class);
            hashMap.put("startGameWebview", z43.q0.class);
            hashMap.put("startGameWebView", z43.q0.class);
            hashMap.put("openGameCenter", z43.y.class);
            hashMap.put("openGameTabHome", z43.z.class);
            ((ee0.x3) ((fe0.x3) i95.n0.c(fe0.x3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNameOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNameOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            ((ee0.x3) ((fe0.x3) i95.n0.c(fe0.x3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClassOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClassOfLiteAppJsApiOpenAdCanvas", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            hashMap.put("openAdCanvas", b64.u.class);
            hashMap.put("sendGameShareCard", z43.k0.class);
            hashMap.put("sendGameNameCard", z43.j0.class);
            hashMap.put("gameShareTimeline", z43.j.class);
            hashMap.put("showInputToolView", z43.p0.class);
            hashMap.put("initGameLiteApp", z43.o.class);
            hashMap.put("setGameTab", z43.l0.class);
            hashMap.put("handleGameTabNavigationEvent", z43.n.class);
            hashMap.put("showCloudGameUI", z43.n0.class);
            com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.Map<java.lang.String, java.lang.Class>) hashMap);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonReward", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.q1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonSingleStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.v1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenDetailVC", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.c1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenBrowseVC", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.a1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonSingleOperation", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.u1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonBoardUpdateSearchText", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.j0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonStoreStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.f2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonStoreOperation", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.d2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonDetailPageShare", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.l0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonUsePackInChat", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.g2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("setSearchTagResult", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.s1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenRewardCharts", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.h1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenSelfie", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.i1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenStoreBegReward", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.j1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenHalfScreenSendView", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.f1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonStartSelect", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.x1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonStopSelect", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.z1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("enterEmojiStore", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.i2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonGetDesc", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.q0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonGetSingleEmotionPath", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.w0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonIPPageShare", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.x0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonDesignerProfileShare", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.k0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenManageVC", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.g1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenFullScreenSearch", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.e1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonOpenChartsVC", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.b1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonIsRewardClose", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.z0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonGetEmoticonDetail", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.u0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonGetEmoticonDesigner", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.s0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonDoMoreAction", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.m0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonPackButtonDesc", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.l1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("preDownloadLiteApp", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.z4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("preloadVideo", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.c5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.g0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("editImage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.i0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("saveToPhotosAlbum", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.o6.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("sendFileMessage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.c7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.HashMap<java.lang.String, jd.b>) o93.i.b().f343732c.f343728a);
        synchronized (q93.g.class) {
            if (q93.g.f360918d == null) {
                q93.g.f360918d = new q93.g();
            }
            gVar = q93.g.f360918d;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.Map<java.lang.String, java.lang.Class>) gVar.f360919a.f360916a);
        synchronized (p93.d.class) {
            if (p93.d.f352891d == null) {
                p93.d.f352891d = new p93.d();
            }
            dVar = p93.d.f352891d;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.Map<java.lang.String, java.lang.Class>) dVar.f352892a.f352889a);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("showTingWecoinPayPanel", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.o7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("platformViewTapEvent", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.x4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getUserInfo", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.z2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("sdkCgiReport", (java.lang.Class<? extends jd.b>) w93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getImageInfo", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.r2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("changeViewStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.u.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("preloadPag", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.b5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("sendSms", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.e7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("limitedModeStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.i3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("compressImage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.f0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getLiteAppPackageInfo", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.s2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("releaseKeepAlive", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.p5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getThemeColorForImage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.x2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonStartSelectV2", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.y1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonStopSelectV2", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.a2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonEnableSendButtonV2", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.n0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getServerTime", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.u2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openWeRun", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.l4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getWeRunStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.a3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.lbs.f.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.a0.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openGameDetail", (java.lang.Class<? extends jd.b>) u93.h.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.media.k2.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.v.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("shareMediaToTimeline", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.k7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFinderMovieEditor", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.a8.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getGameCenterEntranceState", (java.lang.Class<? extends jd.b>) u93.c.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openGameCenterEntrance", (java.lang.Class<? extends jd.b>) u93.f.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getBindPhoneState", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.o2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("startBindPhone", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.p7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("nativeShareToGameLive", (java.lang.Class<? extends jd.b>) u93.e.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("recognizeQRCode", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiRecognizeQRCode.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("handleQRCode", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.b3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("fetchQRCodeInfo", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.m2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("sendMessageToSource", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.d7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("reportCustomEvent", (java.lang.Class<? extends jd.b>) r93.b.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("reportCustomCgiEvent", (java.lang.Class<? extends jd.b>) r93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openGamePluginSettingPage", (java.lang.Class<? extends jd.b>) u93.j.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("loadMoreGamePluginMessages", (java.lang.Class<? extends jd.b>) u93.d.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("requestPreviewFileInfo", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.q5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("requestPreviewFileImage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.q5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("startDownloadChatFile", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.r7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("pauseDownloadChatFile", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.v4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("queryChatFileStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.r7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("fetchW1wPersonalMsgReddot", (java.lang.Class<? extends jd.b>) z93.b.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("joinChatBotRoom", (java.lang.Class<? extends jd.b>) n93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openW1wPersonalMsgChatListPage", (java.lang.Class<? extends jd.b>) z93.c.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openW1wPersonalMsgChatPage", (java.lang.Class<? extends jd.b>) z93.d.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openBizTimelinePublish", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.r3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("changeW1wPersonalMsgSwitch", (java.lang.Class<? extends jd.b>) z93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openCTID", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.s3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openFilePicker", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.b4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.ue.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.u7.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("processImage", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.e5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonStorePersonalCenterPageRoute", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.e2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("getEmoticonPersonalCenterPageConfig", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.p2.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(me1.c.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.h4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.t.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.x3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonPostedFinish", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.o1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("bindPhone", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.s.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("emoticonPatchGetEmotionList", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.n1.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("checkVideoIsHDR", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.w.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openMessageFileToThirdApp", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.f4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("locateToChatPosition", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.j3.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openMessageFileSource", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.c4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openMessageFileToPc", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.d4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.file.c2.NAME, (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.y5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("operateSaveFile", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.t4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("querySaveFileStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.n5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("queryAddFileFavStatus", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.m5.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("operateAddFileFav", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.p4.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("addFileToFavorites", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.q.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("addScreenshotShareItem", (java.lang.Class<? extends jd.b>) x93.a.class);
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi("openShortLink", (java.lang.Class<? extends jd.b>) com.tencent.mm.plugin.lite.jsapi.comms.g4.class);
        if (i95.n0.c(q80.q.class) != null) {
            ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.lite.i.f143474d);
        }
        if (i95.n0.c(fe0.x3.class) != null) {
            ((ee0.x3) ((fe0.x3) i95.n0.c(fe0.x3.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerAdLiteAppJsApis", "com.tencent.mm.feature.sns.LiteAppJsApiService");
            d64.a aVar = d64.a.f226779a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
            try {
                if (d64.a.f226780b.compareAndSet(0, 1)) {
                    com.tencent.mars.xlog.Log.i("SnsAdJs.Register", "the ad lite app registered");
                    d64.a aVar2 = d64.a.f226779a;
                    aVar2.a();
                    aVar2.b();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdJs.Register", "the register has error, " + th6.getMessage());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ad.liteapp.register.AdLiteJsApiRegister");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerAdLiteAppJsApis", "com.tencent.mm.feature.sns.LiteAppJsApiService");
        }
        if (i95.n0.c(z30.x.class) != null) {
            ((el.e) ((z30.x) i95.n0.c(z30.x.class))).getClass();
            com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.Map<java.lang.String, java.lang.Class>) kz5.b1.e(new jz5.l("favoriteAction", el.k.class)));
        }
        if (i95.n0.c(su4.f1.class) != null) {
            ((sg0.h3) ((su4.f1) i95.n0.c(su4.f1.class))).getClass();
            com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.Map<java.lang.String, java.lang.Class>) kz5.c1.k(new jz5.l("removeMinimizeTask", cv4.r.class), new jz5.l("isTaskMinimized", cv4.l.class), new jz5.l("isMinimizeTaskEnabled", cv4.k.class), new jz5.l("addMinimizeTask", cv4.b.class), new jz5.l("getSearchData", cv4.h.class), new jz5.l("getSearchSuggestionData", cv4.i.class), new jz5.l("querySearchWeb", cv4.o.class), new jz5.l("getPermanentData", cv4.g.class), new jz5.l("removePermanentData", cv4.s.class), new jz5.l("savePermanentData", cv4.y.class), new jz5.l("getTeachSearchData", cv4.j.class), new jz5.l("reportSearchRealTimeStatistics", cv4.t.class), new jz5.l("reportSearchStatistics", cv4.u.class), new jz5.l("fetchUniformReddot", cv4.d.class), new jz5.l("fetchUniformReddotList", cv4.e.class), new jz5.l("disposeUniformReddot", cv4.c.class), new jz5.l("observeUniformReddot", cv4.n.class), new jz5.l("getExpConfig", cv4.f.class), new jz5.l("systemCapabilityAuthorizationStatus", cv4.a0.class), new jz5.l("requestSystemCapabilityAuthorization", cv4.x.class), new jz5.l("registerNativeEventMonitor", cv4.q.class), new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.le.NAME, cv4.z.class)));
        }
        if (i95.n0.c(tg0.j1.class) != null) {
            ((ux4.j) ((tg0.j1) i95.n0.c(tg0.j1.class))).getClass();
            com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.Map<java.lang.String, java.lang.Class>) kz5.c1.k(new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.i9.NAME, ux4.e.class), new jz5.l("updateSearchReddotTimeStamps", ux4.i.class), new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.me.NAME, ux4.h.class), new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.gb.NAME, ux4.f.class), new jz5.l("removePreloadWebSearchPage", ux4.g.class)));
        }
        if (i95.n0.c(pm4.t.class) != null) {
            ((lf0.d0) ((pm4.t) i95.n0.c(pm4.t.class))).getClass();
            com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi((java.util.Map<java.lang.String, java.lang.Class>) kz5.c1.k(new jz5.l("queryWebCommCgi", um4.a.class), new jz5.l("getTopStoryTabConfig", um4.f.class), new jz5.l("searchDataHasResult", um4.m.class), new jz5.l("getSearchDisplayNameList", um4.e.class), new jz5.l("getK1KData", um4.c.class), new jz5.l("openK1KWebview", um4.l.class), new jz5.l("startSearchItemDetailPage", um4.p.class), new jz5.l(be1.z.NAME, um4.d.class), new jz5.l("showNavBarShadow", um4.o.class), new jz5.l("hideNavBarShadow", um4.h.class), new jz5.l("k1kContainerCommand", um4.k.class), new jz5.l("batchGetUserIcon", um4.b.class)));
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.addJsApi(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.m.NAME, (java.lang.Class<? extends jd.b>) s93.b.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int j17 = com.tencent.mm.ui.bl.j(context);
        int c17 = com.tencent.mm.ui.bl.c(context);
        int i17 = displayMetrics.densityDpi;
        float f17 = displayMetrics.density;
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
        int i18 = com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation;
        if (i18 == 2) {
            h17 = new android.graphics.Point(h17.y, h17.x);
        }
        int i19 = h17.x;
        int i27 = h17.y;
        float f18 = 48 * f17;
        com.tencent.mm.plugin.lite.LiteAppCenter.mDisplayMetrics = displayMetrics;
        com.tencent.mm.plugin.lite.o oVar2 = com.tencent.mm.plugin.lite.p.f144149a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "SetDisplayParams w=%d h=%d screen=%d,%d, density=%f dpi=%d, statusBar=%d actionBarHeight:%f, navigationBarHeight:%d, orientation:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(h17.x), java.lang.Integer.valueOf(h17.y), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(j17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.lite.LiteAppCenter.setDisplayParams(0L, i19 / f17, i27 / f17, h17.x / f17, h17.y / f17, i17, f17, f18 / f17, j17 / f17, c17 / f17);
        wxaLiteAppStartReport.f46014x = java.lang.System.currentTimeMillis();
        com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = wxaLiteAppStartReport.I;
        java.lang.Object liteAppBaseLibLock = com.tencent.mm.plugin.lite.logic.g1.s().f143948b;
        kotlin.jvm.internal.o.f(liteAppBaseLibLock, "liteAppBaseLibLock");
        synchronized (liteAppBaseLibLock) {
            com.tencent.mm.plugin.lite.o oVar3 = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable");
            com.tencent.mm.plugin.lite.w.initLib();
            java.lang.String a17 = com.tencent.mm.plugin.lite.logic.y2.a();
            if (oVar3.a() != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable copyLibs error.");
            } else {
                com.tencent.liteapp.storage.WxaLiteAppBaselibInfo u17 = com.tencent.mm.plugin.lite.logic.g1.s().u(liteAppReporter);
                java.lang.String baseLibVersionByPath = com.tencent.mm.plugin.lite.LiteAppCenter.getBaseLibVersionByPath(a17);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable local: " + u17 + ", assetsVersion: " + baseLibVersionByPath);
                if (u17 == null) {
                    oVar3.g(liteAppReporter);
                    com.tencent.mm.plugin.lite.p.f144152d = true;
                } else if (com.tencent.mm.plugin.lite.LiteAppCenter.versionGreater(baseLibVersionByPath, com.tencent.mm.plugin.lite.LiteAppCenter.getBaseLibVersionByPath(com.tencent.mm.vfs.w6.i(u17.path, false)))) {
                    oVar3.g(liteAppReporter);
                    com.tencent.mm.plugin.lite.p.f144152d = true;
                } else {
                    com.tencent.mm.plugin.lite.p.f144152d = true;
                }
            }
        }
        if (com.tencent.mm.plugin.lite.p.f144155g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateLiteAppTable ignore.");
        } else {
            java.util.Map map = com.tencent.mm.plugin.lite.p.f144154f;
            map.put("wxalite71e155e932f19de48da8333a8f225708", "0.0.33");
            map.put(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID, com.tencent.kinda.framework.kindalite.KindaLiteDef.KINDA_LITE_INNER_VERSION);
        }
        wxaLiteAppStartReport.f46015y = java.lang.System.currentTimeMillis() - wxaLiteAppStartReport.f46014x;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "end init lvcpp");
    }

    public final void d() {
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo t17 = com.tencent.mm.plugin.lite.logic.g1.s().t(null);
        if (t17 == null) {
            com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppProcessProfileInit", "latestLiteAppBaselibInfo is null!");
            return;
        }
        if (t17.isDebug()) {
            com.tencent.mm.plugin.lite.o oVar2 = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "preload base lib using rdm version");
            com.tencent.mm.plugin.lite.LiteAppCenter.setPath(com.tencent.mm.vfs.w6.i(t17.path, false), com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE);
            return;
        }
        java.lang.String str = t17.path;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mm.plugin.lite.LiteAppCenter.setPath(com.tencent.mm.vfs.w6.i(str, false), com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE);
        } else {
            com.tencent.mm.plugin.lite.o oVar3 = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppProcessProfileInit", "baselibFile not exists!");
        }
    }

    public final void e(com.tencent.liteapp.report.WxaLiteAppStartReport reportLiteApp) {
        kotlin.jvm.internal.o.g(reportLiteApp, "reportLiteApp");
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "setupLiteApp");
        java.util.List list = com.tencent.mm.plugin.lite.w.f144511n;
        if (!com.tencent.mm.plugin.lite.LiteAppCenter.isInitialized) {
            com.tencent.mm.plugin.lite.LiteAppCenter.setWxaLiteAppCallback(new com.tencent.mm.plugin.lite.w());
            com.tencent.mm.app.q5.b().a(new com.tencent.mm.plugin.lite.q0());
            com.tencent.mm.plugin.lite.LiteAppCenter.isInitialized = true;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        zc.b bVar = new zc.b(context, "liteApp");
        bVar.f471326e = false;
        kd.c.f306594a = new com.tencent.mm.plugin.lite.j();
        reportLiteApp.f46011u = java.lang.System.currentTimeMillis();
        i95.m c17 = i95.n0.c(k12.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        h12.g gVar = (h12.g) ((k12.t) c17);
        jSONObject.put("SystemEmojiResPath", gVar.Di());
        jSONObject.put("QQSmileyDirPath", gVar.Bi());
        jSONObject.put("NewSmileyDirPath", gVar.Ai());
        jSONObject.put("EmojiPanelConfigPath", gVar.wi());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("initParams", jSONObject);
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        bVar.f471327f = kz5.b0.c(jSONObject3);
        kx5.n.h().f313322l = new com.tencent.mm.plugin.lite.k();
        if (j62.e.g().l("clicfg_liteapp_engine_group_enable", true, true, true)) {
            kx5.n.h().f313321k = new com.tencent.mm.plugin.lite.m();
        }
        zc.c.f471338a = bVar;
        android.content.Context context2 = bVar.f471322a;
        kotlin.jvm.internal.o.g(context2, "<set-?>");
        zc.c.f471339b = context2;
        zc.b bVar2 = zc.c.f471338a;
        if (bVar2 == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        java.lang.String packageName = bVar2.f471322a.getPackageName();
        kotlin.jvm.internal.o.f(packageName, "getPackageName(...)");
        zc.c.f471340c = packageName;
        zc.b bVar3 = zc.c.f471338a;
        if (bVar3 == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        kx5.h hVar = new kx5.h(bVar3.f471322a);
        ad.a aVar = new ad.a();
        java.util.HashSet hashSet = hVar.f313304b;
        if (!hashSet.contains(aVar)) {
            hashSet.add(aVar);
        }
        hVar.f313303a = bVar3.f471323b;
        hVar.f313306d.addAll(bVar3.f471325d);
        hVar.f313305c = new zc.a();
        zc.b bVar4 = zc.c.f471338a;
        if (bVar4 == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bVar4.f471326e);
        if (zc.c.f471338a == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        hVar.f313308f = bVar3.f471327f;
        kx5.n nVar = bVar3.f471324c;
        nVar.f313311a = hVar;
        nx5.b bVar5 = hVar.f313305c;
        if (bVar5 != null) {
            nx5.c.f341366a = bVar5;
        }
        if (valueOf.booleanValue()) {
            nVar.m();
        }
        reportLiteApp.f46012v = java.lang.System.currentTimeMillis() - reportLiteApp.f46011u;
        es.k.f256268a = new com.tencent.mm.plugin.lite.n();
        com.tencent.mm.plugin.lite.p.f144151c = true;
    }

    public final com.tencent.liteapp.storage.WxaLiteAppBaselibInfo f(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        java.lang.Object liteAppBaseLibLock = com.tencent.mm.plugin.lite.logic.g1.s().f143948b;
        kotlin.jvm.internal.o.f(liteAppBaseLibLock, "liteAppBaseLibLock");
        synchronized (liteAppBaseLibLock) {
            com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTableUseAsset");
            if (!com.tencent.mm.plugin.lite.p.f144152d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "hasUpdateBaseLibTable is false, ignore.");
                return null;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.lite.w.initLib();
            if (oVar.a() != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTable copyLibs error.");
                return null;
            }
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo g17 = oVar.g(liteAppReporter);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibTableUseAsset Execution time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            return g17;
        }
    }

    public final com.tencent.liteapp.storage.WxaLiteAppBaselibInfo g(com.tencent.liteapp.gen.LiteAppReporter liteAppReporter) {
        com.tencent.mm.plugin.lite.w.initLib();
        if (liteAppReporter != null) {
            liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_BASE_LIBRARY);
        }
        try {
            java.lang.String a17 = com.tencent.mm.plugin.lite.logic.y2.a();
            java.lang.String baseLibVersionByPath = com.tencent.mm.plugin.lite.LiteAppCenter.getBaseLibVersionByPath(a17);
            kotlin.jvm.internal.o.d(baseLibVersionByPath);
            java.lang.String substring = baseLibVersionByPath.substring(0, r26.n0.K(baseLibVersionByPath, '.', 0, false, 6, null));
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = new com.tencent.liteapp.storage.WxaLiteAppBaselibInfo();
            wxaLiteAppBaselibInfo.majorVersion = substring;
            wxaLiteAppBaselibInfo.path = a17;
            wxaLiteAppBaselibInfo.version = baseLibVersionByPath;
            wxaLiteAppBaselibInfo.type = "bundle";
            wxaLiteAppBaselibInfo.updateTime = java.lang.System.currentTimeMillis() / 1000;
            com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "updateBaseLibUseAsset assetsVersion: " + baseLibVersionByPath + ", bundlePath: " + a17);
            com.tencent.mm.plugin.lite.logic.g1.s().U(wxaLiteAppBaselibInfo);
            d();
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_BASE_LIBRARY_SUCCESS);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppProcessProfileInit", "Preload base lib use asset, path:" + a17);
            return wxaLiteAppBaselibInfo;
        } catch (java.lang.Exception e17) {
            if (liteAppReporter != null) {
                liteAppReporter.logStart(com.tencent.liteapp.gen.StartAction.COPY_BUILTIN_BASE_LIBRARY_FAILED);
            }
            com.tencent.mm.plugin.lite.o oVar2 = com.tencent.mm.plugin.lite.p.f144149a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppProcessProfileInit", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
