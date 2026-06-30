package com.tencent.mm.plugin.magicbrush;

@j95.b
/* loaded from: classes7.dex */
public final class s7 extends i95.w implements com.tencent.mm.plugin.magicbrush.s4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f148121d = jz5.h.b(com.tencent.mm.plugin.magicbrush.r7.f148114d);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$entryConfigChangeListener$1 f148122e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.q7 f148123f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f148124g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f148125h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$preCleanFileEvent$1 f148126i;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$entryConfigChangeListener$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$preCleanFileEvent$1] */
    public s7() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f148122e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ConfigUpdatedEvent>(a0Var) { // from class: com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$entryConfigChangeListener$1
            {
                this.__eventId = 320120113;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent) {
                com.tencent.mm.autogen.events.ConfigUpdatedEvent event = configUpdatedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!kotlin.jvm.internal.o.b(event.f54072g.f7126a, "clicfg_magic_high_level_pkg")) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MagicPkgFeatureService", "ConfigUpdatedEvent");
                com.tencent.mm.plugin.magicbrush.s7.this.Ui().getClass();
                return false;
            }
        };
        this.f148123f = new com.tencent.mm.plugin.magicbrush.q7(this);
        this.f148124g = new java.util.HashMap();
        this.f148125h = new java.util.concurrent.ConcurrentHashMap();
        this.f148126i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent>(a0Var) { // from class: com.tencent.mm.plugin.magicbrush.MagicPkgFeatureService$preCleanFileEvent$1
            {
                this.__eventId = 1489935310;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent) {
                java.lang.String str;
                com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent event = beforeAggressiveCleanCacheEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.p0 p0Var = event.f53999g;
                boolean z17 = (p0Var.f7589a & 1) != 0;
                com.tencent.mars.xlog.Log.i("MagicPkgFeatureService", "hy: received clean event, flag is " + p0Var.f7589a + ", is system " + z17);
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MagicPkgFeatureService", "hy: try clean up pkg managements.");
                    com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
                    com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent.CleanUpPkgImplsEvent cleanUpPkgImplsEvent = new com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent.CleanUpPkgImplsEvent();
                    ((com.tencent.mm.plugin.magicbrush.m5) d4Var).getClass();
                    if (com.tencent.mm.plugin.magicbrush.a5.f147838c && (str = com.tencent.mm.plugin.magicbrush.a5.f147843h) != null) {
                        com.tencent.mm.ipcinvoker.extension.l.a(str, cleanUpPkgImplsEvent, com.tencent.mm.plugin.magicbrush.l5.class, null);
                    }
                    ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).getClass();
                    java.util.Iterator it = ((java.util.ArrayList) jc3.u0.f299000e).iterator();
                    while (it.hasNext()) {
                        jc3.t a17 = ue3.c.f426892a.a((java.lang.String) it.next(), null);
                        if (a17 != null) {
                            ((ue3.f) a17).a();
                        }
                    }
                }
                return false;
            }
        };
    }

    public void Ai() {
        fe3.d.f261540a.a();
    }

    public void Bi(java.lang.String pkgId) {
        char c17;
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        fe3.d dVar = fe3.d.f261540a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "doCleanMagicPkg start");
        java.util.List<com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo> e17 = fe3.j.b().e();
        if (e17 != null) {
            char c18 = 1;
            if (!e17.isEmpty()) {
                for (com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo : e17) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(wxaMagicPkgInfo.f147858d)) {
                        c17 = c18;
                    } else {
                        java.lang.String pkgId2 = wxaMagicPkgInfo.f147858d;
                        kotlin.jvm.internal.o.f(pkgId2, "pkgId");
                        synchronized (dVar) {
                            java.lang.String str = null;
                            jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgSyncSTORAGE", null);
                            if (wi6 != null) {
                                java.lang.Object[] b17 = ((ue3.f) wi6).b("MagicPkgClean" + pkgId2);
                                java.lang.Object obj = b17[0];
                                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
                                lc3.z zVar = (lc3.z) obj;
                                if (zVar == lc3.x.f317934a) {
                                    java.lang.Object obj2 = b17[c18];
                                    kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                                    str = (java.lang.String) obj2;
                                }
                                long parseLong = str != null ? java.lang.Long.parseLong(str) : 0L;
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                long j17 = currentTimeMillis - parseLong;
                                com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "bizStillValid:%s,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s", pkgId2, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(zVar.f317944a), zVar.f317945b);
                                if (j17 < 1209600000) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "bizStillValid %s It's not time to clean,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s", pkgId2, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(zVar.f317944a), zVar.f317945b);
                                    i18 = 1;
                                    i17 = 0;
                                } else {
                                    i17 = 0;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "bizStillValid %s could clean,currentTime:%d,lastTime:%d,duration:%d,errNo:%d,errMsg:%s", pkgId2, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(zVar.f317944a), zVar.f317945b);
                                }
                            } else {
                                i17 = 0;
                            }
                            i18 = i17;
                        }
                        if (i18 == 0) {
                            java.lang.String d17 = fe3.l.d(wxaMagicPkgInfo.f147858d);
                            if (d17 != null) {
                                java.lang.String i19 = com.tencent.mm.vfs.w6.i(d17, true);
                                kotlin.jvm.internal.o.d(i19);
                                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(i19));
                                if (r6Var.m()) {
                                    com.tencent.mm.vfs.r6[] G = r6Var.G();
                                    if (G != null) {
                                        int length = G.length;
                                        for (int i27 = i17; i27 < length; i27++) {
                                            com.tencent.mm.vfs.r6 r6Var2 = G[i27];
                                            com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "local path:%s,pkg patchId:%s", r6Var2.u(), wxaMagicPkgInfo.f147865n);
                                            if (!kotlin.jvm.internal.o.b(r6Var2.u(), com.tencent.mm.vfs.w6.i(wxaMagicPkgInfo.f147861g, true)) && !kotlin.jvm.internal.o.b(r6Var2.u(), com.tencent.mm.vfs.w6.i(wxaMagicPkgInfo.f147862h, true))) {
                                                com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "delete old version folder.");
                                                com.tencent.mm.vfs.w6.f(r6Var2.u());
                                                com.tencent.mm.vfs.w6.h(r6Var2.u());
                                            }
                                        }
                                    } else {
                                        c17 = 1;
                                        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "files is empty");
                                    }
                                } else {
                                    c17 = 1;
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s dir not exist", wxaMagicPkgInfo.f147858d);
                                }
                                c18 = c17;
                            }
                            c17 = 1;
                            c18 = c17;
                        } else {
                            c17 = 1;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "pkgId %s is busy now", wxaMagicPkgInfo.f147858d);
                    c18 = c17;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "doCleanMagicPkg end");
    }

    public java.lang.String Di() {
        java.lang.String b17 = fe3.l.b();
        kotlin.jvm.internal.o.f(b17, "getMagicDebugPkgRoot(...)");
        return b17;
    }

    public com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo Ni(java.lang.String pkgId) {
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        java.lang.String lowerCase = pkgId.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo c17 = com.tencent.mm.sdk.platformtools.x2.n() ? fe3.j.b().c(lowerCase) : fe3.j.b().d(lowerCase);
        if (c17 != null) {
            synchronized (fe3.d.f261540a) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi("MagicPkgSyncSTORAGE", null);
                if (wi6 != null) {
                    lc3.z g17 = ((ue3.f) wi6).g("MagicPkgClean".concat(lowerCase), java.lang.String.valueOf(currentTimeMillis), "String");
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCleaner", "registBiz:%s,currentTime:%d,errNo:%d,errMsg:%s", lowerCase, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(g17.f317944a), g17.f317945b);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MagicPkgCleaner", "registBiz:%s,fail mmkv is nil", lowerCase);
                }
            }
        } else if (kotlin.jvm.internal.o.b(lowerCase, "magicemo")) {
            return com.tencent.mm.sdk.platformtools.x2.n() ? fe3.j.b().c(lowerCase) : (com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(lowerCase), com.tencent.mm.plugin.magicbrush.o7.class);
        }
        return c17;
    }

    public java.lang.String Ri() {
        fe3.j.b().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgLogic", "getMagicPkgVersion:%s", fe3.j.f261555b);
        java.lang.String str = fe3.j.f261555b;
        kotlin.jvm.internal.o.f(str, "getMagicPkgVersion(...)");
        return str;
    }

    public final com.tencent.mm.plugin.magicbrush.pkg.MagicPkgCheckerListener Ui() {
        return (com.tencent.mm.plugin.magicbrush.pkg.MagicPkgCheckerListener) ((jz5.n) this.f148121d).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:8:0x0027, B:10:0x0050, B:12:0x005d, B:15:0x00cc, B:19:0x00d8, B:20:0x00e1, B:21:0x0066, B:22:0x006c, B:24:0x0076, B:27:0x0086, B:29:0x008c, B:31:0x0090, B:33:0x0097, B:34:0x0099, B:36:0x00c0), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8 A[Catch: all -> 0x00e4, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:8:0x0027, B:10:0x0050, B:12:0x005d, B:15:0x00cc, B:19:0x00d8, B:20:0x00e1, B:21:0x0066, B:22:0x006c, B:24:0x0076, B:27:0x0086, B:29:0x008c, B:31:0x0090, B:33:0x0097, B:34:0x0099, B:36:0x00c0), top: B:3:0x000d }] */
    /* JADX WARN: Type inference failed for: r12v3, types: [fe3.a] */
    /* JADX WARN: Type inference failed for: r12v6, types: [fe3.a] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [jc3.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized jc3.x Vi(java.lang.String r11, android.os.Parcelable r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.magicbrush.s7.Vi(java.lang.String, android.os.Parcelable):jc3.x");
    }

    public void Zi(java.lang.String pkgId, java.lang.String url, java.lang.String signature, java.lang.String op6) {
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(signature, "signature");
        kotlin.jvm.internal.o.g(op6, "op");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            fe3.j.b().g(pkgId, url, signature, op6);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pkgId", pkgId);
        bundle.putString("url", url);
        bundle.putString("signature", signature);
        bundle.putString("op", op6);
        com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.magicbrush.p7.class);
    }

    public void aj(java.lang.String pkgId) {
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        java.lang.String lowerCase = pkgId.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        Ui().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCheckerListener", "registerMagicPkg pkgId:%s", lowerCase);
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        if (L == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicPkgCheckerListener", "getMultiDefault failed, sp is null.");
            return;
        }
        java.util.Set stringSet = L.getStringSet("MagicPkgPreLoadPkgId", new java.util.HashSet());
        if (!stringSet.contains(lowerCase)) {
            stringSet.add(lowerCase);
            L.putStringSet("MagicPkgPreLoadPkgId", stringSet);
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.magicbrush.pkg.MagicPkgCheckerListener.f148102d;
        if (copyOnWriteArraySet.contains(lowerCase)) {
            return;
        }
        copyOnWriteArraySet.add(lowerCase);
    }

    public void bj(java.lang.String bizName, com.tencent.mm.plugin.magicbrush.u7 impl) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(impl, "impl");
        this.f148125h.put(bizName, impl);
    }

    public void cj(java.lang.String pkgId) {
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        java.lang.String lowerCase = pkgId.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        Ui().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgCheckerListener", "unregisterMagicPkg pkgId:%s", lowerCase);
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        if (L == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicPkgCheckerListener", "getMultiDefault failed, sp is null.");
            return;
        }
        java.util.Set stringSet = L.getStringSet("MagicPkgPreLoadPkgId", new java.util.HashSet());
        if (stringSet.contains(lowerCase)) {
            stringSet.remove(lowerCase);
            L.putStringSet("MagicPkgPreLoadPkgId", stringSet);
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.magicbrush.pkg.MagicPkgCheckerListener.f148102d;
        if (copyOnWriteArraySet.contains(lowerCase)) {
            copyOnWriteArraySet.remove(lowerCase);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MagicPkgFeatureService", "onAccountInitialized call alive");
            Ui().alive();
            alive();
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(this.f148123f);
            alive();
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MagicPkgFeatureService", "onAccountReleased call dead");
            Ui().dead();
            dead();
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.f148123f);
            dead();
        }
    }

    public boolean wi(java.lang.String pkgId, java.lang.String baseId, boolean z17, jc3.m0 m0Var) {
        kotlin.jvm.internal.o.g(pkgId, "pkgId");
        kotlin.jvm.internal.o.g(baseId, "baseId");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return fe3.j.b().a(pkgId, baseId, z17, m0Var);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("pkgId", pkgId);
        bundle.putString("baseId", baseId);
        bundle.putBoolean("isAutoCheck", z17);
        return ((com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.magicbrush.m7.class)).f68400d;
    }
}
