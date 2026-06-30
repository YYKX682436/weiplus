package oy3;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350047d;

    public w(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350047d = rtosWatchLoginUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350047d;
        db5.t7.i(rtosWatchLoginUI, rtosWatchLoginUI.getResources().getString(com.tencent.mm.R.string.l3i), com.tencent.mm.R.raw.icons_filled_done);
    }
}
