package oy3;

/* loaded from: classes13.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350046d;

    public v(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350046d = rtosWatchLoginUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350046d;
        rtosWatchLoginUI.f158600r = db5.e1.Q(rtosWatchLoginUI, null, rtosWatchLoginUI.getString(com.tencent.mm.R.string.gic), true, true, new oy3.u(this.f350046d));
    }
}
