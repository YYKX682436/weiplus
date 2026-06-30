package oy3;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350030d;

    public j(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350030d = rtosWatchLoginUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350030d;
        android.app.ProgressDialog progressDialog = rtosWatchLoginUI.f158600r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        rtosWatchLoginUI.f158600r = null;
    }
}
