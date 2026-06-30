package he0;

/* loaded from: classes4.dex */
public class y5 extends com.tencent.mm.sdk.event.n {
    public y5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        com.tencent.mm.plugin.sns.model.h6 oj6 = com.tencent.mm.plugin.sns.model.l4.oj();
        oj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        if (oj6.a()) {
            java.util.Date date = new java.util.Date();
            int hours = (date.getHours() * 60) + date.getMinutes();
            java.util.LinkedList linkedList = oj6.f164241d;
            if (ca4.z0.k(linkedList, hours)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  %d in %s", java.lang.Integer.valueOf(hours), linkedList.toArray());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
                return false;
            }
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsImgPreLoadingSmallImage", 1);
        int b18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsImgPreLoadingBigImage", 1);
        int c17 = ma4.a.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLineOutPreloadInterval", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_out_preload_interval, 1200);
        ma4.a.f325224h = Ni;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineOutPreloadInterval", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", " preloadingSamllImage %d preloadingBigImage %d preloadingVideo %d preloadingInterval %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(Ni));
        if (b17 > 0 || b18 > 0 || c17 > 0) {
            int i17 = Ni > 0 ? Ni : 1200;
            if (oj6.f164239b || oj6.f164240c || com.tencent.mm.sdk.platformtools.t8.H1(oj6.f164238a) < i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  isInChatting:%b, isInSnsTimeline:%b", java.lang.Boolean.valueOf(oj6.f164239b), java.lang.Boolean.valueOf(oj6.f164240c));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else if (!com.tencent.mm.plugin.sns.model.h3.H("@__weixintimtline")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: doing timeline");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else if (gi.d.h(82) && gi.i0.f272055b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: on doze mode");
                com.tencent.mm.plugin.sns.model.h3.L("@__weixintimtline");
                jx3.f.INSTANCE.idkeyStat(1540L, 82, 1L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            } else {
                gm0.j1.i();
                if (!gm0.j1.n().f273288b.h(new com.tencent.mm.plugin.sns.model.v2(), 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsPreTimelineService", "newObjectSync triggered");
                    com.tencent.mm.plugin.sns.model.h3.L("@__weixintimtline");
                }
                oj6.f164238a = com.tencent.mm.sdk.platformtools.t8.i1();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("newObjectSync", "com.tencent.mm.plugin.sns.model.SnsPreTimelineService");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsNewSyncObjectEventListener");
        return false;
    }
}
