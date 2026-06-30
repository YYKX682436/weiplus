package oy3;

/* loaded from: classes13.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350040e;

    public q(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI, java.lang.String str) {
        this.f350039d = rtosWatchLoginUI;
        this.f350040e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350039d;
        android.widget.TextView textView = rtosWatchLoginUI.f158592g;
        if (textView != null) {
            textView.setText(this.f350040e);
        }
        rtosWatchLoginUI.A = true;
        rtosWatchLoginUI.Z6();
    }
}
