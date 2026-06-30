package oy3;

/* loaded from: classes13.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350049d;

    public y(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350049d = rtosWatchLoginUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350049d;
        rtosWatchLoginUI.f158600r = db5.e1.Q(rtosWatchLoginUI, null, rtosWatchLoginUI.getString(com.tencent.mm.R.string.ggc), true, true, new oy3.x(this.f350049d));
    }
}
