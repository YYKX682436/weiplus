package sn2;

/* loaded from: classes10.dex */
public final class f extends android.support.v4.media.session.v {

    /* renamed from: f, reason: collision with root package name */
    public final sn2.g f410131f;

    public f(sn2.g service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f410131f = service;
    }

    @Override // android.support.v4.media.session.v
    public void b(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        sn2.c cVar = sn2.c.f410120e;
        boolean b17 = kotlin.jvm.internal.o.b(str, "NOTIFY_PLAYING");
        sn2.g gVar = this.f410131f;
        if (b17) {
            com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService finderLiveMediaBrowserService = (com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService) gVar;
            finderLiveMediaBrowserService.h();
            finderLiveMediaBrowserService.i(3);
            com.tencent.mars.xlog.Log.i(finderLiveMediaBrowserService.f120851n, "notifyPlaying - Playing state updated");
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "NOTIFY_PAUSED")) {
            com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService finderLiveMediaBrowserService2 = (com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService) gVar;
            finderLiveMediaBrowserService2.h();
            finderLiveMediaBrowserService2.i(2);
            com.tencent.mars.xlog.Log.i(finderLiveMediaBrowserService2.f120851n, "notifyPaused - Paused state updated");
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "SHOW_CONTROLS")) {
            ((com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService) gVar).f(true);
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "HIDE_CONTROLS")) {
            ((com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService) gVar).f(false);
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "UPDATE_LIVE_INFO")) {
            com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService finderLiveMediaBrowserService3 = (com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService) gVar;
            finderLiveMediaBrowserService3.h();
            android.support.v4.media.session.k0 k0Var = finderLiveMediaBrowserService3.f120853p;
            if (k0Var == null) {
                kotlin.jvm.internal.o.o("stateBuilder");
                throw null;
            }
            finderLiveMediaBrowserService3.i(k0Var.a().f8952d);
            com.tencent.mars.xlog.Log.i(finderLiveMediaBrowserService3.f120851n, "notifyLiveInfoChanged - Live info updated");
        }
    }

    @Override // android.support.v4.media.session.v
    public void d() {
        l(false);
    }

    @Override // android.support.v4.media.session.v
    public void e() {
        l(true);
    }

    public final void l(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserCallback", "updatePlayingState - User clicked button and target play state: " + z17);
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        df2.k2 k2Var = liveRoomControllerStore != null ? (df2.k2) liveRoomControllerStore.controller(df2.k2.class) : null;
        if (k2Var == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveMediaBrowserCallback", "updatePlayingState - Controller not available");
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "handleUserPauseCommand - User requested pause");
            mn0.b0 Z6 = k2Var.Z6();
            if (Z6 == null) {
                com.tencent.mars.xlog.Log.w("FinderLiveMediaBrowserController", "handleUserPauseCommand - CDN player not available");
                return;
            }
            k2Var.f230548q = true;
            mn0.b0.M(Z6, false, 1, null);
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "handleUserPauseCommand - Player paused, pausedByMediaSessionOrNotificationAction set to true");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - User requested play");
        if (((mm2.c1) k2Var.business(mm2.c1.class)).U7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - Live has finished, ignore play command and keep paused state");
            k2Var.g7();
            return;
        }
        if (pm0.v.z(((mm2.c1) k2Var.business(mm2.c1.class)).f328807g2, 524288)) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - Anchor has paused live, ignore play command and keep paused state");
            k2Var.g7();
            return;
        }
        mn0.b0 Z62 = k2Var.Z6();
        if (Z62 == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveMediaBrowserController", "handleUserPlayCommand - CDN player not available");
            return;
        }
        k2Var.f230548q = false;
        ((mn0.y) Z62).y();
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "handleUserPlayCommand - Player resumed, pausedByMediaSessionOrNotificationAction cleared");
    }
}
