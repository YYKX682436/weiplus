package com.tencent.mm.plugin.ting.notification;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ting/notification/TingBroadcastReceiver;", "Lcom/tencent/mm/plugin/ting/notification/BaseTingBroadcastReceiver;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TingBroadcastReceiver extends com.tencent.mm.plugin.ting.notification.BaseTingBroadcastReceiver {
    @Override // com.tencent.mm.plugin.ting.notification.BaseTingBroadcastReceiver
    public void a(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingBroadcastReceiver", "enter playAppId: " + i17);
        bw5.eq0 a17 = bw5.eq0.a(i17);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingBroadcastReceiver", "enter not support playAppId: " + i17);
        } else {
            if (a17 != bw5.eq0.AudioRadio) {
                wl4.w.f447104a.a(a17, null).g();
                return;
            }
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).w(context, bw5.ar0.TingScene_SystemControl);
        }
    }

    @Override // com.tencent.mm.plugin.ting.notification.BaseTingBroadcastReceiver
    public void b() {
        android.media.session.MediaController.TransportControls transportControls;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingBroadcastReceiver", "next");
        d75.b.g(tl4.n.f420324d);
        android.media.session.MediaController mediaController = tl4.p.f420327b;
        if (mediaController == null || (transportControls = mediaController.getTransportControls()) == null) {
            return;
        }
        transportControls.skipToNext();
    }

    @Override // com.tencent.mm.plugin.ting.notification.BaseTingBroadcastReceiver
    public void c() {
        android.media.session.MediaController.TransportControls transportControls;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingBroadcastReceiver", "pause");
        d75.b.g(tl4.n.f420324d);
        android.media.session.MediaController mediaController = tl4.p.f420327b;
        if (mediaController == null || (transportControls = mediaController.getTransportControls()) == null) {
            return;
        }
        transportControls.pause();
    }

    @Override // com.tencent.mm.plugin.ting.notification.BaseTingBroadcastReceiver
    public void d() {
        android.media.session.MediaController.TransportControls transportControls;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingBroadcastReceiver", "pre");
        d75.b.g(tl4.n.f420324d);
        android.media.session.MediaController mediaController = tl4.p.f420327b;
        if (mediaController == null || (transportControls = mediaController.getTransportControls()) == null) {
            return;
        }
        transportControls.skipToPrevious();
    }

    @Override // com.tencent.mm.plugin.ting.notification.BaseTingBroadcastReceiver
    public void e() {
        android.media.session.MediaController.TransportControls transportControls;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingBroadcastReceiver", "resume");
        d75.b.g(tl4.n.f420324d);
        android.media.session.MediaController mediaController = tl4.p.f420327b;
        if (mediaController == null || (transportControls = mediaController.getTransportControls()) == null) {
            return;
        }
        transportControls.play();
    }
}
