package oy3;

/* loaded from: classes13.dex */
public final class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350045d;

    public u(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350045d = rtosWatchLoginUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.ProgressDialog progressDialog = this.f350045d.f158600r;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }
}
