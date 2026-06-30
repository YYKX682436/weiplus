package oy3;

/* loaded from: classes13.dex */
public final class i implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350029d;

    public i(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350029d = rtosWatchLoginUI;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "handler msg " + msg.what);
        int i17 = msg.what;
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350029d;
        switch (i17) {
            case 1001:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350020d, 0);
                return true;
            case 1002:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350021e, 0);
                return true;
            case 1003:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350022f, 0);
                return true;
            case 1004:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350023g, msg.arg1);
                return true;
            case 1005:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350024h, 0);
                return true;
            case 1006:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350025i, 0);
                return true;
            case 1007:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350026m, 0);
                return true;
            case 1008:
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.T6(rtosWatchLoginUI, oy3.h.f350027n, 0);
                return true;
            default:
                return true;
        }
    }
}
