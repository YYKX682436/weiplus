package com.tencent.mm.plugin.finder.media;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/media/FinderLiveMediaBrowserNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FinderLiveMediaBrowserNotificationReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("FinderLiveNotificationReceiver", "onReceive: action=" + intent.getAction());
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        df2.k2 k2Var = liveRoomControllerStore != null ? (df2.k2) liveRoomControllerStore.controller(df2.k2.class) : null;
        if (k2Var == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveNotificationReceiver", "onReceive - FinderLiveMediaBrowserController not available");
            return;
        }
        java.lang.String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -240155104) {
                if (hashCode == 1144817770 && action.equals("com.tencent.mm.plugin.finder.live.ACTION_PAUSE")) {
                    com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "userClickNotificationPause - Send pause command via MediaController");
                    android.support.v4.media.session.r rVar = k2Var.f230545n;
                    if (rVar != null) {
                        android.media.session.MediaController.TransportControls transportControls = ((android.support.v4.media.session.k) rVar.f8990a).f8976a.getTransportControls();
                        (android.os.Build.VERSION.SDK_INT >= 29 ? new android.support.v4.media.session.q(transportControls) : new android.support.v4.media.session.p(transportControls)).f8989a.pause();
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveNotificationReceiver", "onReceive - Called controller.pause()");
                    return;
                }
            } else if (action.equals("com.tencent.mm.plugin.finder.live.ACTION_PLAY")) {
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "userClickNotificationPlay - Send play command via MediaController");
                android.support.v4.media.session.r rVar2 = k2Var.f230545n;
                if (rVar2 != null) {
                    android.media.session.MediaController.TransportControls transportControls2 = ((android.support.v4.media.session.k) rVar2.f8990a).f8976a.getTransportControls();
                    (android.os.Build.VERSION.SDK_INT >= 29 ? new android.support.v4.media.session.q(transportControls2) : new android.support.v4.media.session.p(transportControls2)).f8989a.play();
                }
                com.tencent.mars.xlog.Log.i("FinderLiveNotificationReceiver", "onReceive - Called controller.play()");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("FinderLiveNotificationReceiver", "onReceive - Unknown action: " + intent.getAction());
    }
}
