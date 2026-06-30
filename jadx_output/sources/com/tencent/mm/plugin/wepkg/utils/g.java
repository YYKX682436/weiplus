package com.tencent.mm.plugin.wepkg.utils;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f188492a = new com.tencent.mm.plugin.wepkg.utils.b(this);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f188493b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f188494c;

    public g() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f188493b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SendEntranceStateEvent>(a0Var) { // from class: com.tencent.mm.plugin.wepkg.utils.WepkgListener$2
            {
                this.__eventId = -625487945;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SendEntranceStateEvent sendEntranceStateEvent) {
                boolean z17 = sendEntranceStateEvent.f54750g.f7182a;
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgListener", "sendEntranceStateListener isInFindEntrance:%b", java.lang.Boolean.valueOf(z17));
                if (!z17) {
                    return false;
                }
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WEPKG_ENTRANCE_TRIGGER_DOWNLOAD_TIME_LONG;
                if (com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) <= 60) {
                    return false;
                }
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                com.tencent.mm.plugin.wepkg.utils.g.a(com.tencent.mm.plugin.wepkg.utils.g.this, 2);
                return false;
            }
        };
        this.f188494c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WepkgNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.wepkg.utils.WepkgListener$3
            {
                this.__eventId = -1170682909;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent) {
                wz4.e D0;
                com.tencent.mm.plugin.wepkg.model.WepkgVersion e17;
                boolean z17;
                com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent2 = wepkgNotifyEvent;
                boolean a17 = com.tencent.mm.plugin.game.commlib.i.a();
                am.t20 t20Var = wepkgNotifyEvent2.f54992g;
                switch (t20Var.f7969a) {
                    case 0:
                        if (!a17) {
                            m43.c.b().a("wepkg_download_retry", new com.tencent.mm.plugin.wepkg.utils.d(this));
                        }
                        return false;
                    case 1:
                        if (!a17) {
                            java.lang.String str = t20Var.f7970b;
                            int i17 = t20Var.f7973e;
                            int i18 = t20Var.f7974f;
                            java.util.HashSet hashSet = new java.util.HashSet();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                if (i18 == 0) {
                                    hashSet.add(str);
                                } else if (i18 == 1 && com.tencent.mm.plugin.wepkg.model.o0.d(str) != null) {
                                    hashSet.add(str);
                                }
                            }
                            com.tencent.mm.plugin.wepkg.version.f.b(hashSet, 1, i17, false);
                        }
                        return false;
                    case 2:
                        if (!a17) {
                            wz4.f L0 = wz4.f.L0();
                            java.lang.String str2 = wepkgNotifyEvent2.f54992g.f7970b;
                            t20Var.f7971c = L0.f450803d && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && (D0 = L0.D0(str2)) != null && D0.field_bigPackageReady && D0.field_preloadFilesReady;
                        }
                        return false;
                    case 3:
                        if (com.tencent.mm.sdk.platformtools.x2.n()) {
                            com.tencent.mm.plugin.wepkg.model.i c17 = com.tencent.mm.plugin.wepkg.model.i.c();
                            synchronized (c17) {
                                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WEPKG_EXPIRED_TIME_LONG;
                                if (com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c18.m(u3Var, 0L))).longValue()) > 86400) {
                                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg in one day");
                                    m43.c.b().a("wepkg_expired_clean", new com.tencent.mm.plugin.wepkg.model.d(c17));
                                }
                            }
                        }
                        return false;
                    case 4:
                        if (!a17 && (e17 = com.tencent.mm.plugin.wepkg.model.o0.e(t20Var.f7970b)) != null) {
                            am.t20 t20Var2 = wepkgNotifyEvent2.f54992g;
                            int i19 = e17.f188393z;
                            t20Var2.f7972d = i19;
                            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgListener", "total download count:%s", java.lang.Integer.valueOf(i19));
                        }
                        return false;
                    case 5:
                        if (!a17) {
                            com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
                            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WEPKG_FRONT_TRIGGER_DOWNLOAD_TIME_LONG;
                            if (com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c19.m(u3Var2, 0L))).longValue()) > 60) {
                                gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                                z17 = com.tencent.mm.plugin.wepkg.utils.g.a(com.tencent.mm.plugin.wepkg.utils.g.this, 1);
                            } else {
                                z17 = false;
                            }
                            if (!z17) {
                                com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
                                com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_WEPKG_CHECK_DOWNLOAD_TIME_LONG;
                                if (com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c27.m(u3Var3, 0L))).longValue()) > 1800) {
                                    gm0.j1.u().c().x(u3Var3, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                                    com.tencent.mm.autogen.events.WepkgNotifyEvent wepkgNotifyEvent3 = new com.tencent.mm.autogen.events.WepkgNotifyEvent();
                                    wepkgNotifyEvent3.f54992g.f7969a = 0;
                                    wepkgNotifyEvent3.e();
                                }
                            }
                        }
                        return false;
                    case 6:
                        if (com.tencent.mm.sdk.platformtools.t8.K0(t20Var.f7970b)) {
                            com.tencent.mm.plugin.wepkg.model.i c28 = com.tencent.mm.plugin.wepkg.model.i.c();
                            c28.getClass();
                            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                                com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.e(c28, 7));
                            } else {
                                c28.g(null, 0, 7);
                            }
                        } else {
                            com.tencent.mm.plugin.wepkg.model.i.c().e(wepkgNotifyEvent2.f54992g.f7970b, 2, 7);
                        }
                        return false;
                    case 7:
                        ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                        com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(null, com.tencent.mm.plugin.wepkg.utils.f.class, null);
                        return false;
                    case 8:
                        int i27 = t20Var.f7975g;
                        java.util.List list = t20Var.f7976h;
                        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                            if (i27 == 0) {
                                com.tencent.mm.plugin.wepkg.version.f.a(list, 4);
                            } else if (i27 == 1) {
                                com.tencent.mm.plugin.wepkg.version.f.a(list, 3);
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            }
        };
    }

    public static boolean a(com.tencent.mm.plugin.wepkg.utils.g gVar, int i17) {
        java.util.HashSet hashSet;
        gVar.getClass();
        if (com.tencent.mm.plugin.game.commlib.i.a()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgListener", "triggerDownload downloadTriggerType:%d", java.lang.Integer.valueOf(i17));
        wz4.f L0 = wz4.f.L0();
        if (L0.f450803d && i17 != -1) {
            java.util.HashSet hashSet2 = new java.util.HashSet();
            android.database.Cursor rawQuery = L0.rawQuery(java.lang.String.format("select distinct %s from %s where %s=?", "pkgId", "WepkgVersion", "downloadTriggerType"), java.lang.String.valueOf(i17));
            if (rawQuery != null) {
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                }
                do {
                    java.lang.String string = rawQuery.getString(0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        hashSet2.add(string);
                    }
                } while (rawQuery.moveToNext());
                rawQuery.close();
            }
            java.util.HashSet hashSet3 = new java.util.HashSet();
            android.database.Cursor rawQuery2 = L0.rawQuery(java.lang.String.format("select distinct %s from %s where (%s=0 or %s=0) and %s=? and %s<?", "pkgId", "WepkgVersion", "bigPackageReady", "preloadFilesReady", "downloadTriggerType", "packageDownloadCount"), java.lang.String.valueOf(i17), "1");
            if (rawQuery2 != null) {
                if (!rawQuery2.moveToFirst()) {
                    rawQuery2.close();
                }
                do {
                    java.lang.String string2 = rawQuery2.getString(0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                        hashSet3.add(string2);
                    }
                } while (rawQuery2.moveToNext());
                rawQuery2.close();
            }
            java.util.HashSet hashSet4 = new java.util.HashSet();
            android.database.Cursor rawQuery3 = L0.rawQuery(java.lang.String.format("select distinct %s from %s where %s=0 and %s<?", "pkgId", "WepkgPreloadFiles", "completeDownload", "fileDownloadCount"), "1");
            if (rawQuery3 != null) {
                if (!rawQuery3.moveToFirst()) {
                    rawQuery3.close();
                }
                do {
                    java.lang.String string3 = rawQuery3.getString(0);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                        hashSet4.add(string3);
                    }
                } while (rawQuery3.moveToNext());
                rawQuery3.close();
            }
            hashSet3.addAll(hashSet4);
            hashSet2.retainAll(hashSet3);
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgVersionStorage", "trigger Predownload size:%d, List:%s", java.lang.Integer.valueOf(hashSet2.size()), hashSet2.toString());
            hashSet = hashSet2;
        } else {
            hashSet = null;
        }
        if (hashSet == null || hashSet.size() == 0) {
            return false;
        }
        com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.utils.e(gVar, new java.util.ArrayList(hashSet)));
        return true;
    }
}
