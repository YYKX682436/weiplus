package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public long f164869a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f164870b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f164871c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f164872d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f164873e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f164874f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f164875g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f164876h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f164877i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f164878j;

    /* renamed from: k, reason: collision with root package name */
    public int f164879k;

    /* renamed from: l, reason: collision with root package name */
    public int f164880l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f164881m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f164882n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f164883o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashSet f164884p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f164885q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f164886r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f164887s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashSet f164888t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f164889u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashSet f164890v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashSet f164891w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashSet f164892x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.HashSet f164893y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f164894z;

    public l() {
        new java.util.HashSet();
        this.f164874f = new java.util.HashSet();
        new java.util.HashSet();
        this.f164875g = new java.util.HashSet();
        this.f164876h = new java.util.HashSet();
        new java.util.HashSet();
        new java.util.HashSet();
        this.f164877i = new java.util.HashSet();
        new java.util.HashSet();
        this.f164878j = new java.util.HashSet();
        new java.util.HashSet();
        new java.util.HashSet();
        this.f164879k = Integer.MAX_VALUE;
        this.f164880l = 0;
        this.f164881m = new java.util.HashSet();
        this.f164882n = new java.util.HashSet();
        this.f164883o = new java.util.HashSet();
        this.f164884p = new java.util.HashSet();
        this.f164885q = new java.util.HashSet();
        this.f164886r = new java.util.HashSet();
        this.f164887s = new java.util.HashSet();
        this.f164888t = new java.util.HashSet();
        this.f164889u = new java.util.HashSet();
        this.f164890v = new java.util.HashSet();
        this.f164891w = new java.util.HashSet();
        this.f164892x = new java.util.HashSet();
        this.f164893y = new java.util.HashSet();
        this.f164894z = new java.util.HashSet();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1
            {
                this.__eventId = 770619130;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent snsTimelineRespListNotifyEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
                if (snsTimelineRespListNotifyEvent instanceof com.tencent.mm.autogen.events.SnsTimelineRespListNotifyEvent) {
                    com.tencent.mm.plugin.sns.statistics.l lVar = com.tencent.mm.plugin.sns.statistics.l.this;
                    com.tencent.mm.plugin.sns.statistics.l.a(lVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsBrowseInfoHelper", "IListener callback -1");
                    com.tencent.mm.plugin.sns.statistics.l.a(lVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper$1");
                return false;
            }
        };
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        iListener.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    public static /* synthetic */ long a(com.tencent.mm.plugin.sns.statistics.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        lVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        return -1L;
    }

    public void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        java.lang.String localid = snsInfo.getLocalid();
        java.util.HashSet hashSet = this.f164881m;
        hashSet.add(localid);
        boolean isAd = snsInfo.isAd();
        java.util.HashSet hashSet2 = this.f164888t;
        if (isAd) {
            hashSet2.add(localid);
        }
        java.util.HashSet hashSet3 = this.f164889u;
        hashSet3.add(snsInfo.field_userName);
        int i18 = snsInfo.field_type;
        java.util.HashSet hashSet4 = this.f164890v;
        java.util.HashSet hashSet5 = this.f164891w;
        java.util.HashSet hashSet6 = this.f164894z;
        java.util.HashSet hashSet7 = this.f164886r;
        java.util.HashSet hashSet8 = this.f164887s;
        java.util.HashSet hashSet9 = this.f164893y;
        java.util.HashSet hashSet10 = this.f164884p;
        java.util.HashSet hashSet11 = this.f164892x;
        java.util.HashSet hashSet12 = this.f164885q;
        java.util.HashSet hashSet13 = this.f164882n;
        java.util.HashSet hashSet14 = this.f164883o;
        if (i18 == 1) {
            hashSet14.add(localid);
        } else if (i18 == 2) {
            hashSet13.add(localid);
        } else if (i18 != 3) {
            if (i18 == 4) {
                hashSet12.add(localid);
            } else if (i18 == 5) {
                hashSet11.add(localid);
            } else if (i18 == 15) {
                hashSet10.add(localid);
            } else if (i18 != 18) {
                if (i18 != 28) {
                    if (i18 == 42 || i18 == 47) {
                        hashSet7.add(localid);
                    } else if (i18 != 50 && i18 != 59) {
                        hashSet6.add(localid);
                    }
                }
                hashSet8.add(localid);
            } else {
                hashSet9.add(localid);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(timeLineObject.publicUserName)) {
            hashSet5.add(localid);
        } else {
            hashSet4.add(localid);
        }
        if (i17 < this.f164879k) {
            this.f164879k = i17;
            ca4.z0.T(snsInfo);
        }
        if (i17 > this.f164880l) {
            this.f164880l = i17;
            ca4.z0.T(snsInfo);
        }
        hashSet13.size();
        hashSet14.size();
        hashSet10.size();
        hashSet12.size();
        hashSet2.size();
        hashSet8.size();
        hashSet7.size();
        hashSet11.size();
        hashSet9.size();
        hashSet3.size();
        hashSet4.size();
        hashSet5.size();
        hashSet6.size();
        hashSet.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseExternalArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (z17) {
            this.f164869a = java.lang.System.currentTimeMillis();
        } else if (this.f164869a > 0) {
            java.lang.System.currentTimeMillis();
            this.f164869a = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseExternalArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    public void d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickAbum", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickAbum", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        if (z17) {
            this.f164875g.add(ca4.z0.T(snsInfo));
        } else {
            this.f164876h.add(ca4.z0.T(snsInfo));
        }
        java.util.HashSet hashSet = this.f164877i;
        hashSet.add(snsInfo.getUserName());
        hashSet.size();
        if (com.tencent.mm.plugin.sns.model.l4.sj().equals(snsInfo.getUserName())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseMyAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseMyAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseOtherAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseOtherAlbumTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickAbum", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    public void e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        java.lang.String localid = snsInfo.getLocalid();
        java.lang.String T = ca4.z0.T(snsInfo);
        yc4.b0.f460839a.b(ca4.z0.t0(snsInfo.field_snsId));
        java.util.HashSet hashSet = this.f164873e;
        if (hashSet.contains(T)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsBrowseInfoHelper", "onClickFeed localId:Td, snsId:%s", localid, T);
        hashSet.add(T);
        snsInfo.isAd();
        int i17 = snsInfo.field_type;
        if (i17 != 1 && i17 != 15 && i17 != 18 && i17 != 28 && i17 != 42 && i17 != 47 && i17 != 50 && i17 != 54 && i17 != 59 && i17 == 3) {
            com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().publicUserName);
        }
        if (snsInfo.isAd()) {
            if (snsInfo.getAdXml() == null || !snsInfo.getAdXml().isLandingPagesAd()) {
                int i18 = snsInfo.field_type;
                if (i18 == 1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenAdImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenAdImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                } else if (i18 == 15) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenAdSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenAdSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            }
        } else if (snsInfo.getTimeLine() == null || com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().canvasInfo)) {
            int i19 = snsInfo.field_type;
            if (i19 != 1) {
                if (i19 == 15) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenSightTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                } else if (i19 != 18) {
                    if (i19 != 28) {
                        if (i19 == 42) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseMusicPlayerChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                            java.lang.System.currentTimeMillis();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseMusicPlayerChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        } else if (i19 != 50) {
                            if (i19 != 54) {
                                if (i19 != 59) {
                                    if (i19 != 3) {
                                        if (i19 == 4) {
                                            c(true);
                                        } else if (i19 == 5) {
                                            c(true);
                                        }
                                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().publicUserName)) {
                                        c(true);
                                    } else {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseMPArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                                        java.lang.System.currentTimeMillis();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseMPArticleTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                                    }
                                }
                            }
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseFinderChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseFinderChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseForwardAdLongVideoTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseForwardAdLongVideoTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBrowseFullScreenImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBrowseFullScreenImageTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleForwardBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleForwardBrowseAdCanvasTimeStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    public void f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            return;
        }
        java.util.HashSet hashSet = this.f164870b;
        hashSet.add(snsInfo.getLocalid());
        hashSet.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentLikeEvent", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }

    public void g(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFavFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        this.f164874f.add(str2);
        java.util.HashSet hashSet = this.f164878j;
        hashSet.add(str);
        hashSet.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFavFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
    }
}
