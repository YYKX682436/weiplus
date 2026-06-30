package go5;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go5.e f274136d;

    public i(go5.e eVar) {
        this.f274136d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = null;
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            j0Var = db5.e1.y(context, context.getString(com.tencent.mm.R.string.f493472kc5), null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490454vi), new go5.h(this.f274136d));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoIPMPAudioCapturer", e17, "failed to show alert", new java.lang.Object[0]);
        }
        if (j0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPAudioCapturer", "new dialog failed");
            return;
        }
        j0Var.setCancelable(false);
        j0Var.setCanceledOnTouchOutside(false);
        j0Var.show();
    }
}
